package com.tomyzhou.animationdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.CycleInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.TextView;

/**
 * 第二种方式使用动画：真接在代码里面定义动画
 * 
 * @author Administrator
 *
 */
public class TestAnimation2 extends Activity implements OnClickListener {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.anim);
		Button btn = (Button) findViewById(R.id.button);
		btn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		RotateAnimation anim = null;
		anim = new RotateAnimation(0.0f, +360.0f);
		//anim.setInterpolator(new AccelerateDecelerateInterpolator());
		anim.setInterpolator(new CycleInterpolator(3.0f));
		anim.setDuration(3000);
		findViewById(R.id.textview).startAnimation(anim);
	}
}