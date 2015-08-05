package com.exam.l010usinglistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomListviewAdapter extends BaseAdapter {
	private Context context=null;
	//对context的对象的引用做一个保存
	public CustomListviewAdapter(Context context) {
		this.context=context;
	}
	public Context getContext() {
		return context;
	}

	/*
	 * private String[] data = new String[] { "eoe1", "eoe2", "eoe3", "eoe4",
	 * "eoe5", "eoe6", "eoe7", "eoe8", "eoe9", "eoe10", "eoe11", "eoe12",
	 * "eoe13", "eoe14", "eoe15"};
	 */
	private CustomListCellData[] data = new CustomListCellData[] {
			new CustomListCellData("imag1", "dec imag1", R.drawable.imag1),
			new CustomListCellData("imag2", "dec imag2", R.drawable.image2),
			new CustomListCellData("imag3", "dec imag3", R.drawable.image3), };

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		/*
		 * //listview里面呈现几个，就会执行几次getView().因为它要取得。
		 * System.out.println("<<<<<<<<<<<<<<<<<<<<");
		 * 
		 * TextView tv; //convertView是回收的对象,提高效率 if(convertView!=null){
		 * tv=(TextView) convertView; }else{ tv = new
		 * TextView(CustomListView.this); }
		 * 
		 * 
		 * tv.setTextSize(50); tv.setText(getItem(position));
		 * 
		 * return tv;
		 */

		// 创建列表项布局的一个优化机制
		LinearLayout ll = null;
		if (convertView != null) {
			ll = (LinearLayout) convertView;
		} else {
			// 使用一个资源去创建一个布局
			// 创建一个布局解释器让它去解释一个ID
			
			//getContext()就是由外界传过来的
			ll = (LinearLayout) LayoutInflater.from(getContext())
					.inflate(R.layout.custom_listcell, null);
		}

		// 给内部的子对象进行重新的赋值

		// 得到列表项数据
		CustomListCellData data = getItem(position);

		ImageView icon = (ImageView) ll.findViewById(R.id.icon);
		TextView name = (TextView) ll.findViewById(R.id.name);
		TextView dec = (TextView) ll.findViewById(R.id.dec);

		// 把data里面的值传过来
		icon.setImageResource(data.iconId);
		name.setText(data.name);
		dec.setText(data.dec);
		return ll;

	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public CustomListCellData getItem(int position) {
		return data[position];
	}

	@Override
	public int getCount() {
		return data.length;
	}

}
