package com.example.fake_product;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Ownership extends Activity {
	
	TextView text;
	String username;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ownership);
		
		text = (TextView)findViewById(R.id.textView1);
		Button log= (Button)findViewById(R.id.button1);
		
		username = getIntent().getStringExtra(username);
		Toast.makeText(getApplicationContext(), username, Toast.LENGTH_LONG).show();
		
		
		log.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent in = new Intent(getApplicationContext(), Home.class);
				
				startActivity(in);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ownership, menu);
		return true;
	}

}
