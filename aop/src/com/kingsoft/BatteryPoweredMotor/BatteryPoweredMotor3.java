package com.kingsoft.BatteryPoweredMotor;

import com.kingsoft.myInterface.BatteryPoweredMotor;

public class BatteryPoweredMotor3 implements BatteryPoweredMotor {
	private final int Horsepower = 300;
	private final int TimeToRecharge = 48;

	public int getHorsepower() {
		return Horsepower;
	}

	public int getTimeToRecharge() {
		return TimeToRecharge;
	}

}
