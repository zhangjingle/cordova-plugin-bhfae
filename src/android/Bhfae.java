package com.bhfae;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by bhfae on 2018/4/11.
 */

public class Bhfae extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("showToast")){
            String message = args.getString(0);
            this.showToast(message);
            return true;
        }
        if (action.equals("getAppVersion")){
            this.getAppVersion(callbackContext);
            return true;
        }
        return false;
    }
    private void showToast(String message){
        Toast.makeText(cordova.getActivity().getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    private void getAppVersion(CallbackContext callbackContext){
        Context context = cordova.getActivity().getApplicationContext();
        PackageManager packageManager = context.getPackageManager();
        String versionName = "";
        try {
            versionName = packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
        }
        callbackContext.success(versionName);
    }
}
