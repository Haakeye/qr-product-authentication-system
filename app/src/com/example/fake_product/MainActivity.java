package com.example.fake_product;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	ImageView img;
	private final static int timeout = 5000;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        img = (ImageView)findViewById(R.id.imageView1);
        
        Animation ani = AnimationUtils.loadAnimation(this, R.anim.left);
        img.startAnimation(ani);
        
        new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent in =  new Intent(getApplicationContext(), Home.class);
				startActivity(in);
				finish();
				
				
			}
		},timeout);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

