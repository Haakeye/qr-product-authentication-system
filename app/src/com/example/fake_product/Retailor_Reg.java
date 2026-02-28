package com.example.fake_product;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.telephony.gsm.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class Retailor_Reg extends Activity {
	
	
	 EditText user,pass,phno,mail;
	 Button reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retailor__reg);
        
         user = (EditText)findViewById(R.id.editText1);
         pass = (EditText)findViewById(R.id.editText2);
         phno = (EditText)findViewById(R.id.editText3);
         mail = (EditText)findViewById(R.id.editText4);
        reg = (Button)findViewById(R.id.button1);
        
        reg.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				ActiveTask1 task1=new ActiveTask1();
				task1.execute();
				
			}
		});
        
    }
    
    private class ActiveTask1 extends AsyncTask<String,Void,Void> {
		String s1=user.getText().toString();
		String s2=pass.getText().toString();
		String s3=phno.getText().toString();
		String s4=mail.getText().toString();
		@SuppressWarnings("unused")
		String res=null;
		@Override
		protected void onPreExecute() {
			
			Toast.makeText(getApplicationContext(), "Please wait......", Toast.LENGTH_LONG).show();
			
		}

		@Override
		protected Void doInBackground(String... params) {
			res=Callservice.registerService(s1,s2,s3,s4,"Register");			
			return null;		
		}
	
	protected void onPostExecute(Void result) {		
		Intent intent=new Intent(getBaseContext(),Retailor.class);
		startActivity(intent);		
		try
    	{
    		SmsManager sms=SmsManager.getDefault();
    		sms.sendTextMessage(s3, null, "Your Account Has successfully Registered", null, null);
    		Toast.makeText(getApplicationContext(), "SMS Sent Successfully", Toast.LENGTH_LONG).show();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    		Toast.makeText(getApplicationContext(), "SMS Sent Failed", Toast.LENGTH_LONG).show();
    	}
		
				}	
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.retailor__reg, menu);
		return true;
	}

}
