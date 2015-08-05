package com.exam.l010usinglistview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemClickListener {
	private ListView lv;
	private ArrayAdapter<ListCellData> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// android.R是指使用系统自带的资源(本例使用的是自定义的列表项)。而上面的R.layout是指我们工程里面自己创建的资源
		adapter = new ArrayAdapter<ListCellData>(this,
				android.R.layout.simple_list_item_1);

		// 使用自定义的列表项
		// adapter=new ArrayAdapter<String>(this, R.layout.list_cell);

		lv = (ListView) findViewById(R.id.listView);
		lv.setAdapter(adapter);

		/*
		 * adapter.add("Hello"); adapter.add("World");
		 */
		adapter.add(new ListCellData("小明", "男", 19));
		adapter.add(new ListCellData("小花", "女", 11));

		// 对每一个列表项进行监听
		lv.setOnItemClickListener(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {

		ListCellData data = adapter.getItem(position);
		Toast.makeText(
				this,
				String.format("名字：%s 性别：%s 年龄:%d", data.getUserName(),
						data.getSex(), data.getAge()), Toast.LENGTH_SHORT)
				.show();
	}

}
