package com.kingsoft.myImplements;

import com.kingsoft.myInterface.BatteryPoweredMotor;

public class Motor2 implements BatteryPoweredMotor {
	private final int Horsepower = 100;
	private final int TimeToRecharge = 12;

	public int getHorsepower() {
		return Horsepower;
	}

	public int getTimeToRecharge() {
		return TimeToRecharge;
	}

}
