package com.asmusj.onemessage;

import android.app.Application;

import com.parse.Parse;

public class onemessageapplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, "yFkIajcgQrCQUGSbOztPsXDko2pKeXDsOBYpcfmZ",
				"MBs5Yv9AONDel4l9CV8hgQvObrWUNgF6I4qD3LEh");
	}

}
