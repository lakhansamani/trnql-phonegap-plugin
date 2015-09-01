package com.acme.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Hello extends CordovaPlugin{
	@Override
	public boolean execute(String action, JSONArray data,CallbackContext callback) throws JSONException{
		if(action.equals("greet")){
			String name=data.getString(0);
			String message="Hello, "+name;
			callback.success(message);
			return true;
		}
		else{
			return false;
		}
	}
}