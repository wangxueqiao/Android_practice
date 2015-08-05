package com.exam.l010usinglistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class CustomListView extends Activity {
	private ListView lv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.custom_listview);

		lv = (ListView) findViewById(R.id.lv);
		
		//原来是lv.setAdapter(adapter).但是因为BaseAdapter内部类搬运出来单独形成一个类的CustomListviewAdapter
		lv.setAdapter(new CustomListviewAdapter(this));

	}
/*
 * 有三个卡通图片显示的是自定义列表！！！！！！
 * */
	
}
