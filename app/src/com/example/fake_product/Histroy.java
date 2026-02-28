package com.example.fake_product;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class Histroy extends ListActivity {
	
	
	String list;
	String item;
	String username;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_grocerieslist);
		
		list=getIntent().getStringExtra("list");
		username=getIntent().getStringExtra("username");
		Toast.makeText(getApplicationContext(), username, Toast.LENGTH_LONG).show();
		
		String[] eventnames = list.split("@");		
		setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_histroy,eventnames));
		ListView listview = getListView();
		listview.setTextFilterEnabled(true);
		listview.setOnItemClickListener(new OnItemClickListener() {
			@SuppressWarnings("unused")
			@Override
			public void onItemClick(AdapterView<?> arg0, View view, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				item = ((TextView)view).getText().toString();	
				String[] parts=item.split("\n");
				String groceries=parts[0].replace("Qrvalue ", "");
				String[] groceries1=parts[0].split("-");				
				String rate=parts[1].replace("Username: ", "");
				String quantity=parts[2].replace("Currentdate: ", "");				
				Intent inn=new Intent(getApplicationContext(),Ownership.class);
				inn.putExtra("username", username);
				startActivity(inn);				
			}
		});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.histroy, menu);
		return true;
	}

}
