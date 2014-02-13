package com.kingsoft.myImplements;

import com.kingsoft.myInterface.BatteryPoweredMotor;
import com.kingsoft.myInterface.SolarPoweredMotor;

public class Motor4 implements SolarPoweredMotor, BatteryPoweredMotor {

	private final int Horsepower = 100;
	private final int TimeToRecharge = 12;
	private final int LumensToOperate = 24;

	public int getHorsepower() {
		return Horsepower;
	}

	public int getLumensToOperate() {
		return LumensToOperate;
	}

	public int getTimeToRecharge() {
		return TimeToRecharge;
	}
}
