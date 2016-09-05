package com.example.activityjumping;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActivityC extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i("xiaoxu", "C====onCreate");
		super.onCreate(savedInstanceState);
		LinearLayout layout = new LinearLayout(this);
		TextView txt = new TextView(this);
		txt.setText("ActivityC");
		layout.addView(txt);
		this.setContentView(layout);
		
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i("xiaoxu", "C====onStart");
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i("xiaoxu", "C====onResume");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("xiaoxu", "C====onPause");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i("xiaoxu", "C====onStop");
	}
	
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i("xiaoxu", "C====onRestart");
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("xiaoxu", "C====onDestroy");
	}
}
