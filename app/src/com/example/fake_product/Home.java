package com.example.fake_product;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Home extends Activity {
	
	Button r,d,u;
	Intent i;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		r = (Button)findViewById(R.id.button1);
		d = (Button)findViewById(R.id.button2);
		u = (Button)findViewById(R.id.button3);
		
		r.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				i = new Intent(getApplicationContext(), Retailor.class);
				startActivity(i);
				
			}
		});
		
		d.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				i = new Intent(getApplicationContext(), Distributor.class);
				startActivity(i);
				
			}
		});
		
		u.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				i = new Intent(getApplicationContext(), User.class);
				startActivity(i);
				
			}
		});

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

}
