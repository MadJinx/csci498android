package com.example.lunchlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class LunchListActivity extends FragmentActivity implements LunchFragment.OnRestaurantListener {
	public final static String ID_EXTRA = "com.example.lunchlist._ID";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lunch_list_activity);
		LunchFragment lunch = 
				(LunchFragment)getSupportFragmentManager().findFragmentById(R.id.lunch);
		lunch.setOnRestaurantListener(this);
	}
	
	public void onRestaurantSelected(long id) {
		if (findViewById(R.id.details)==null) {
			Intent i = new Intent(this, DetailForm.class);
			i.putExtra(ID_EXTRA, String.valueOf(id));
			startActivity(i);
		}
		else {
			// ummm... do something!
		}
	}
}