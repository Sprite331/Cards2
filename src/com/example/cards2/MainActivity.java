package com.example.cards2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	public static int count = 2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Context contextt = this;

		//View someView = inflater.inflate(R.layout.get_param, view, false);
		
		final Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	LinearLayout linearLayout = (LinearLayout)findViewById(R.id.mainn);
        		TextView valueTV = new TextView(contextt);
        	    valueTV.setText("Card #"+count);
        	    valueTV.setId(count);
        		linearLayout.addView(valueTV, 0);
        		count++;
            }
        });
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
