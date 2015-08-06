package com.exam.usinguicontrols;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class AtyUsingDatePicker extends Activity {
	private Button btnSelectDate;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_datepicker);
		btnSelectDate=(Button) findViewById(R.id.btnSelectDate);
		btnSelectDate.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				new DatePickerDialog(AtyUsingDatePicker.this, new DatePickerDialog.OnDateSetListener() {
					
					@Override
					public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
						//最后呈现到按钮上
						btnSelectDate.setText(String.format("%d:%d:%d",year,monthOfYear,dayOfMonth ));
						
					}
				}, 2015, 6, 20).show();
			}
		});
	}
}
