package com.exam.drawviewfingerdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class DrawView extends View {
	private float currentX=40;
	private float currentY=50;
	//定义并创建画笔
	Paint p = new Paint();
	public DrawView(Context context){
		super(context);
	}
	public DrawView(Context context,AttributeSet set){
		super(context, set);
	}
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		//设置画笔的颜色
		p.setColor(Color.RED);
		
		//绘制一个小圆（作为小球）
		canvas.drawCircle(currentX, currentY, 15, p);
		
	}
	
	//为该组件的触碰事件重写事件处理方法
	@Override
	public boolean onTouchEvent(MotionEvent event) {

		//修改currentX和currentY的两个属性
		currentX=event.getX();
		currentY=event.getY();
		
		//通知当前组件重绘自己
		invalidate();
		
		//返回true表明该处理方法已处理该事件
		return true;
		}
}
