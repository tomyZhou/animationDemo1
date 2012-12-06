package com.tomyzhou.animationdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

/**
 *  第一种使用动画的方式 ：
 *  	1.通过xml文件定义好动画
 *  	2.在java代码里面，通过AnimationUtil.loadAnimation(this,R.anim.anim)来获得定义好的动画
 *  	3.将动画赋给某个控件 view.setAnimation(anim)
 * @author Administrator
 *
 */
public class TestAnimation extends Activity implements OnClickListener {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.anim);
		Button btn = (Button) findViewById(R.id.button);
		btn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Animation anim = AnimationUtils.loadAnimation(this,
				R.anim.anim);
		findViewById(R.id.textview).startAnimation(anim);
	}
}