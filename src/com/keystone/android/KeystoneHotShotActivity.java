package com.keystone.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KeystoneHotShotActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final Context context = this;
        
        Button viewJobs, viewTemplates, billOfMaterials, estimates;
        viewJobs = (Button) findViewById(R.id.button1);
        viewTemplates = (Button) findViewById(R.id.button2);
        billOfMaterials = (Button) findViewById(R.id.button3);
        estimates = (Button) findViewById(R.id.button4);
        
        viewJobs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
        		
         		Intent intent;
         		intent = new Intent(context, Jobs.class);
                startActivity(intent);
            }
        });
        
        viewTemplates.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
        		
         		Intent intent;
         		intent = new Intent(context, Templates.class);
                startActivity(intent);
            }
        });
        
        billOfMaterials.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
        		
         		Intent intent;
         		intent = new Intent(context, Materials.class);
                startActivity(intent);
            }
        });
        
        estimates.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
        		
         		Intent intent;
         		intent = new Intent(context, Estimates.class);
                startActivity(intent);
            }
        });
    }
}