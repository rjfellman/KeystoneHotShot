package com.keystone.android;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class Jobs extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        String[] jobsArray = new String[10]; //put this in a preferences class
        //For testing...
        //jobsArray[0] = "Rhetech 1";
        //jobsArray[1] = "Rhetech 2";
        
        setListAdapter(new ArrayAdapter<String>(this, R.layout.jobs, jobsArray));
        
        ListView lv = getListView();
  	  	lv.setTextFilterEnabled(true);

  	  	lv.setOnItemClickListener(new OnItemClickListener() {
  	    public void onItemClick(AdapterView<?> parent, View view,
  	        int position, long id) {
  	    	//view the jobs details
  	    }
  	  });
    }
}