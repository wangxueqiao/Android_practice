package com.exam.usinguicontrols;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class AtyUsingCheckBox extends Activity {
	private CheckBox cbNoodles;
	private CheckBox cbLamb;
	private CheckBox cbSteak;
	private CheckBox cbBread;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_checkbox);
		
		cbNoodles=(CheckBox) findViewById(R.id.cbNoodles);
		cbLamb=(CheckBox) findViewById(R.id.cbLamb);
		cbSteak=(CheckBox) findViewById(R.id.cbSteak);
		cbBread=(CheckBox) findViewById(R.id.cbBread);
		
		findViewById(R.id.btnSubmit).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String str = "中午你点的餐有：\n";
				if(cbNoodles.isChecked()){
					str+="Noodles \n";
				}
				if (cbLamb.isChecked()) {
					str+="Lamb \n";
				}
				if (cbSteak.isChecked()) {
					str+="Steak \n";
				}
				if (cbBread.isChecked()) {
					str+="Bread \n";
				}
				new AlertDialog.Builder(AtyUsingCheckBox.this).setTitle("结果").setMessage(str).setPositiveButton("关闭", null).show();
			}
		});
		
	}
}
