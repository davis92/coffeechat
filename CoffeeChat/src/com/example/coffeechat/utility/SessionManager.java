package com.example.coffeechat.utility;

import java.util.HashMap; //this pulls the facebook hash

import com.example.coffeechat.utility.String;

import android.content.Context; 

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;

public class SessionManager {
	public static boolean flag = true;
	public static final String TAG = "SessionManager";
	// Shared Preferences
	public SharedPreferences pref;
	// Editor for Shared preferences
	public Editor editor;
	// Context
	public Context _context;
	// Shared pref mode
	public int public_MODE = 0;
	// Sharedpref file name
	public static final String PREF_NAME = "CoffeeChat";
	// All Shared Preferences Keys
	public static final String IS_LOGIN = "IsLoggedIn";
	// User name (make variable public to access from outside)
	public static final String USER_ID = "userid";
	public static final String USER_NAME = "USER_NAME";
	public static final String USER_EAILID = "USER_EAILID";
	public static final String USER_PHONE = "USER_PHONE";
	/*
	 * // Email address (make variable public to access from outside) public
	 * static final String KEY_EMAIL = "email";
	 */
	// Constructor
	public static final String USER_TOKEN = "userToken";
	public static final String FACEBOOK_ID = "facebookid";

	public static final String PROFLR_IS_CALLED = "profileCalled";
	public static final String USER_NAME_AGE = "profileAGE";
	public static final String USER_NAME_ABOUT = "profileABOUT";

	public static final String isFindCalledGetMatched = "isFindCalledGetMatched";
	public static final String MATCHEDUSERFACEBOOKID = "matcheduserfacebookid";
	public static final String INVITEACTIONSUCESS = "inviteactionsucess";
	public static final String IMAGEINDEXForLIKEDISLIKE = "ImagelikeDIslike";
	public static final String LASRUPDATEDATA = "lastupdatedate";
	public static final String IMAGECHANGE = "ImageChange";
	public static final String isMatchedUserCalled = "ismatchedUserCalled";

	public void SetIsMatchedUserCalled(boolean bFlag) {
		editor.putBoolean(isMatchedUserCalled, bFlag);
		editor.commit();
	}

	public boolean isMatchedUserCalled() {
		return pref.getBoolean(isMatchedUserCalled, false);
	}

	public static final String IS_FIRSTSCREEN = "is_firstscreen";

	//Settings page

	public static final String USERLOWERAGEPREFRENCE = "userlowerageprefrence";
	public static final String USERHEIGHERAGEPREFRENCE = "userheigherageprefrence";
	public static final String USERradius = "userradius";
	public static final String DISTANCEUNIT = "distanceunit";
	public static final String radius = "radius";


	public void setLastMessage(String key, String lastMessage) {
		editor.putString(key, lastMessage);
		// allows them to change settings and save them,
		editor.commit();
	}

	public String getLastMessage(String key) {
		return pref.getString(key, null);
	}

	public void setDistance(int distance) {
		editor.putInt(radius, distance);
		// commit changes
		editor.commit();
	}

	public int getDistance() {
		return pref.getInt(radius, 0);
	}

	public void setUserradius(String radius) {
		editor.putString(USERradius, radius);
		// commit changes
		editor.commit();
	}

	public String getUserradius() {
		return pref.getString(USERradius, null);
	}

	public void setDISTANCEUNIT(String distanceUnit) {
		editor.putString(DISTANCEUNIT, distanceUnit);
		// commit changes
		editor.commit();
	}

	public String getDISTANCEUNIT() {
		return pref.getString(DISTANCEUNIT, "Km");
	}

	// setting screen

	public void setLastUpdate(String lastupdatatime) {
		editor.putString(LASRUPDATEDATA, lastupdatatime);
		// commit changes
		editor.commit();
	}

	public String getLastUpdatedTime() {
		return pref.getString(LASRUPDATEDATA, null);
	}

	public void setImageIndexForLikeDislike(int imageIdex) {
		editor.putInt(IMAGEINDEXForLIKEDISLIKE, imageIdex);
		// commit changes
		editor.commit();
	}

	//

	public int getImageIndexForLikeDislike() {
		return pref.getInt(IMAGEINDEXForLIKEDISLIKE, 0);
	}

	public void setFirstScreen(boolean bFlag) {
		editor.putBoolean(IS_FIRSTSCREEN, bFlag);
		editor.commit();
	}

	public void setIsGetMatchedCall(boolean isfindmatchedCalled) {
		editor.putBoolean(isFindCalledGetMatched, isfindmatchedCalled);
		editor.commit();
	}

	public boolean isFindMatchedCalled() {
		return pref.getBoolean(isFindCalledGetMatched, false);
	}

	public boolean isFirstScreen() {

		return pref.getBoolean(IS_FIRSTSCREEN, false);

	}

	public void setUserAge(String UserToken) {
		editor.putString(USER_NAME_AGE, UserToken);
		// commit changes
		editor.commit();
	}

	public void setUserAbout(String UserToken) {
		editor.putString(USER_NAME_ABOUT, UserToken);
		// commit changes
		editor.commit();
	}

	public String getUserAge() {
		return pref.getString(USER_NAME_AGE, "not found");
	}

	public String getUserAbout() {
		return pref.getString(USER_NAME_ABOUT, "not found");
	}

	public void setUserToken(String UserToken) {
		editor.putString(USER_TOKEN, UserToken);
		// commit changes
		editor.commit();
	}

	public void setProFileIsCallde(boolean iscalled) {
		editor.putBoolean(PROFLR_IS_CALLED, iscalled);
		// commit changes
		editor.commit();
	}

	public void setFacebookId(String facebookId) {
		editor.putString(FACEBOOK_ID, facebookId);
		// commit changes
		editor.commit();
	}

	public void setMatchedUserFacebookId(String facebookId) {
		editor.putString(MATCHEDUSERFACEBOOKID, facebookId);
		// commit changes
		editor.commit();
	}

	public String getFacebookId() {

		return pref.getString(FACEBOOK_ID, "");

	}

	public String getMatchedUserFacebookId() {

		return pref.getString(MATCHEDUSERFACEBOOKID, "");

	}

	public String getUserToken() {
		return pref.getString(USER_TOKEN, "");
	}

	public boolean getProFileIsCallde() {
		return pref.getBoolean(PROFLR_IS_CALLED, false);
	}

	public SessionManager(Context context) {
		this._context = context;
		pref = _context.getSharedPreferences(PREF_NAME, public_MODE);
		editor = pref.edit();
	}

	public void setUserName(String useName) {
		Log.i(TAG, "setUserName.....");
		Log.i(TAG, "setUserName  useName " + useName);

		editor.putString(USER_NAME, useName);
		editor.commit();
		Log.i(TAG, "" + pref.getString(USER_NAME, null));

	}

	public void setUserPhoneNo(String usePhone) {
		Log.i(TAG, "setUserName.....");
		Log.i(TAG, "setUserName  useName " + usePhone);
		// Storing login value as TRUE
		// editor.putBoolean(IS_LOGIN, true);
		editor.putString(USER_PHONE, usePhone);
		// commit changes
		editor.commit();
		Log.i(TAG, "" + pref.getString(USER_PHONE, null));

	}

	public void setUserEmailId(String useId) {
		Log.i(TAG, "setUserEmailId.....");
		Log.i(TAG, "setUserEmailId  useEmailId " + useId);
		// Storing login value as TRUE
		// editor.putBoolean(IS_LOGIN, true);
		editor.putString(USER_EAILID, useId);
		// commit changes
		editor.commit();
		Log.i(TAG, "" + pref.getString(USER_EAILID, null));

	}

	public void setUserId(String useEmailId) {
		Log.i(TAG, "setUserEmailId.....");
		Log.i(TAG, "setUserName  useEmailId " + useEmailId);
		editor.putString(USER_ID, useEmailId);
		// commit changes
		editor.commit();
		Log.i(TAG, "" + pref.getString(USER_ID, null));

	}

// login session
	
	public void createLoginSession(/* String userId */) {
		Log.i(TAG, "createLoginSession.....");
		// Storing login value as TRUE
		editor.putBoolean(IS_LOGIN, true);
		// editor.putString(USER_ID, userId);
		// commit changes
		editor.commit();
		Log.i(TAG, "" + pref.getString(USER_ID, null));
		Log.i(TAG, "session created....");
	}


	public void checkLogin() {
		Log.i(TAG, "checkLogin......");
		// Check login status
		if (!this.isLoggedIn()) {
			Log.i(TAG, "user not logedin......");
			flag = false; // does not work it goes in with login
		}

	}

	
	public HashMap<String, String> getUserDetails() {
		Log.i(TAG, "getUserDetails.....");
		HashMap<String, String> user = new HashMap<String, String>();
		// user name
		Log.i(TAG, "user id= " + pref.getString(USER_ID, null));
		user.put(USER_ID, pref.getString(USER_ID, null));

		return user;
	}

	public HashMap<String, String> getUserId() {
		Log.i(TAG, "getUserId.....");
		HashMap<String, String> user = new HashMap<String, String>();
		// user name
		Log.i(TAG, "getUserId= " + pref.getString(USER_ID, null));
		user.put(USER_ID, pref.getString(USER_ID, null));

		return user;
	}
	
	public HashMap<String, String> getUserName() {
		Log.i(TAG, "getUserName.....");
		HashMap<String, String> user = new HashMap<String, String>();
		// user name
		Log.i(TAG, "getUserName= " + pref.getString(USER_NAME, null));
		user.put(USER_NAME, pref.getString(USER_NAME, null));

		return user;
	}

	public HashMap<String, String> getUserEmailId() {
		Log.i(TAG, "getUserEmailId.....");
		HashMap<String, String> user = new HashMap<String, String>();
		// user name
		Log.i(TAG, "getUserEmailId= " + pref.getString(USER_EAILID, null));
		user.put(USER_EAILID, pref.getString(USER_EAILID, null));


		return user;
	}

	public HashMap<String, String> getUserPhone() {
		Log.i(TAG, "getUserPhone.....");
		HashMap<String, String> user = new HashMap<String, String>();

		Log.i(TAG, "getUserPhone= " + pref.getString(USER_PHONE, null));
		user.put(USER_PHONE, pref.getString(USER_PHONE, null));

		return user;
	}

	/**
	 * Clear session details
	 * */
	public void logoutUser() {
		flag = true;
		Log.i(TAG, " logoutUser..........");
		editor.clear();
		editor.commit();
	}

	// Get Login State
	public boolean isLoggedIn() {
		return pref.getBoolean(IS_LOGIN, false);
	}
}

