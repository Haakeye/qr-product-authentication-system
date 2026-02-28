package com.example.fake_product;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class Verfication extends Activity {
	
	Button b1;
	String username,qrvalue;
	TextView t1,t2;
	String result;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_verfication);
		b1=(Button)findViewById(R.id.button1);
		t1 = (TextView)findViewById(R.id.textView1);
		t2 = (TextView)findViewById(R.id.textView2);
		
		qrvalue=getIntent().getStringExtra("qrvalue");
		username=getIntent().getStringExtra("username");
		//Toast.makeText(getApplicationContext(), username, Toast.LENGTH_LONG).show();
		//Toast.makeText(getApplicationContext(), qrvalue, Toast.LENGTH_LONG).show();
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				
				ActiveTask1 task1=new ActiveTask1();
				task1.execute();	
			}
		});
	}
	private class ActiveTask1 extends AsyncTask<String,Void,Void> {

		String res=null;
			@Override
			protected void onPreExecute() {
				Toast.makeText(getApplicationContext(), "Please wait.... Verification Is going on", Toast.LENGTH_LONG).show();
				
			}

			@Override
			protected Void doInBackground(String... params) {
			res=Callservice.verificationservice(qrvalue,"verify");
				return null;
				
			}
		
		protected void onPostExecute(Void result) {
		
			if(res.equals("success")) {			
				Toast.makeText(getApplicationContext(), "Real Product"+qrvalue, Toast.LENGTH_LONG).show();
				t2.setText(qrvalue+" " +"  product its an real product");
				
			}
			else{
				Toast.makeText(getApplicationContext(), "Fake Product"+qrvalue, Toast.LENGTH_LONG).show();
				t2.setText(qrvalue+ " " +" product its an Fake product");
			}
		}
		}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.verfication, menu);
		return true;
	}

}
