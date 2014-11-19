package com.example.coffeechat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.android.slidingmenu.MainActivity;
import com.example.coffeechat.utility.SessionManager;
import com.example.coffeechat.R;

public class SplashScreen extends Activity 

{
	public static boolean mDebugLog = true;
	public static String mDebugTag = "LoginUsingActivityActivity";
	public boolean _active = true;

	public int _splashTime = 800; //how long it takes for screen to stay in loading mode.

	void logDebug(String msg) 
	
	{
		if (mDebugLog) {
			Log.d(mDebugTag, msg);
		}
	} 

	@Override //this part to the end is non-group generated code. We know what it does but needed help putting it into code.
	
	protected void onCreate(Bundle savedInstanceState) 
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashactivity);

		Thread splashTread = new Thread() {
			@Override
			public void run() {
				try {
					int waited = 0;
					while (_active && (waited < _splashTime)) {
						sleep(100);
						if (_active) {
							waited += 100;
						}
					}
				} catch (InterruptedException e) {

				} finally {
					try {

						SessionManager mSessionManager = new SessionManager(
								SplashActivity.this);
						logDebug("onCreate mSessionManager " + mSessionManager);
						if (mSessionManager.isLoggedIn()) {
							logDebug("onCreate user is logedind  "
									+ mSessionManager);

							Intent mIntent = new Intent(SplashActivity.this,
									MainActivity.class);

							startActivity(mIntent);
							finish();


						} else {
							logDebug("onCreate  user not loged in ");

							Intent mIntent = new Intent(SplashActivity.this,
									LoginUsingFacebook.class);

							startActivity(mIntent);
							finish();
						}

					} catch (Exception e2) {
						
						logDebug("onCreate  Exception " + e2);

					}
				}
			}
		};
		splashTread.start();

	}
}


