package com.exam.usinguicontrols;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

public class AtyUsingTimePicker extends Activity {
	private Button btnSelectTime;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_timepicker);
		
		btnSelectTime=(Button) findViewById(R.id.btnSelectTime);
		btnSelectTime.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				new TimePickerDialog(AtyUsingTimePicker.this, new TimePickerDialog.OnTimeSetListener() {
					
					@Override
					public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
						btnSelectTime.setText(String.format("%s:%s",TimeFormat(hourOfDay) ,TimeFormat(minute)));
					}
				}, 10, 25, true).show();
			}
		});
	}
	public String TimeFormat(int value){
		return value>=10?""+value:"0"+value;
	}
}
