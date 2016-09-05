package com.example.activityjumping;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActivityB extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i("xiaoxu", "B====onCreate");
		super.onCreate(savedInstanceState);
		LinearLayout layout = new LinearLayout(this);
		TextView txt = new TextView(this);
		txt.setText("ActivityB");
		layout.addView(txt);
		this.setContentView(layout);
		Intent intent = new Intent(ActivityB.this, ActivityC.class);
		startActivity(intent);
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i("xiaoxu", "B====onStart");
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i("xiaoxu", "B====onResume");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("xiaoxu", "B====onPause");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i("xiaoxu", "B====onStop");
	}
	
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i("xiaoxu", "B====onRestart");
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("xiaoxu", "B====onDestroy");
	}
}
