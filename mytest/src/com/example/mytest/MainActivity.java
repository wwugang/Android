package com.example.mytest;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		FragmentManager fm = getFragmentManager();
		FragmentTransaction transaction = fm.beginTransaction();
		FriendsFragment friends = new FriendsFragment();
		transaction.replace(R.id.hello, friends);
		transaction.commit();
		}

	public void click(View v) {
		FragmentManager fm = getFragmentManager();
		FragmentTransaction transaction = fm.beginTransaction();

		
		switch (v.getId()) {
		case R.id.chat:
			ChatFragment chat = new ChatFragment();
			transaction.replace(R.id.hello, chat);
			transaction.commit();
			
			break;
		case R.id.friends:
			FriendsFragment friends = new FriendsFragment();
			transaction.replace(R.id.hello, friends);
			transaction.commit();
             
			break;
		case R.id.status:
			StatusFragment status = new StatusFragment();
			transaction.replace(R.id.hello, status);
			transaction.commit();
			break;

		}
	}
}
