package com.kingsoft.myImplements;

import com.kingsoft.myInterface.SolarPoweredMotor;

public class Motor3 implements SolarPoweredMotor {

	private final int Horsepower = 100;
	private final int LumensToOperate = 24;

	public int getHorsepower() {
		return Horsepower;
	}

	public int getLumensToOperate() {
		return LumensToOperate;
	}
}
