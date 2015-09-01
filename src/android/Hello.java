package com.acme.hello;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Hello extends CordovaPlugin{
	@Override
	public boolean execute(String action, JSONArray data,CallbackContext callback) throws JSONException{
		if(action.equlas("greet")){
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