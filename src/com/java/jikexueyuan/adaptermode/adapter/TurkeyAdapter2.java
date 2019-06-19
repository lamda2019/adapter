package com.java.jikexueyuan.adaptermode.adapter;

import com.java.jikexueyuan.adaptermode.duck.Duck;
import com.java.jikexueyuan.adaptermode.turkey.WildTurkey;

public class TurkeyAdapter2 extends WildTurkey implements Duck {

	@Override
	//实现Duck接口的方法
	public void quack() {
		//继承WildTurkey的方法
		super.gobble();
	}
	@Override
	//实现Duck接口的方法
	public void fly() {
		//继承WildTurkey的方法
		super.fly();
		super.fly();
		super.fly();
	}
}

