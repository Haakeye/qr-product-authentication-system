package com.example.fake_product;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class RDhome extends Activity {
	
	Button qr,his;
	Intent in;
	String username;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rdhome);
		
		qr = (Button)findViewById(R.id.button1);
		his = (Button)findViewById(R.id.button2);
		
		username = getIntent().getStringExtra("username");
		Toast.makeText(getApplicationContext(), username, Toast.LENGTH_LONG).show();
		
		his.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				in = new Intent(getApplicationContext(),Qrscan.class);
				in.putExtra("username", username);
				startActivity(in);
				
			}
		});
		
		qr.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				in = new Intent(getApplicationContext(),Scanhistroy.class);
				in.putExtra("username", username);
				startActivity(in);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.rdhome, menu);
		return true;
	}

}
