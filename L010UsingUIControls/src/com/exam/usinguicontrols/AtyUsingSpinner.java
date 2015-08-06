package com.exam.usinguicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AtyUsingSpinner extends Activity {
	private Spinner spinner;
	private ArrayAdapter<String> adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_spinner);
		
		spinner=(Spinner) findViewById(R.id.spinner);
		adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item);
		adapter.add("Hello");
		adapter.add("wawa");
		adapter.add("dede");
		
		//ArrayAdapter是SpinnerAdapter的子类，所以可以直接用ArrayAdapter adapter
		spinner.setAdapter(adapter);
	}
}
