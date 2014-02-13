package com.kingsoft.BatteryPoweredMotor;

import com.kingsoft.myInterface.BatteryPoweredMotor;

public class BatteryPoweredMotor2 implements BatteryPoweredMotor {
	private final int Horsepower = 200;
	private final int TimeToRecharge = 24;

	public int getHorsepower() {
		return Horsepower;
	}

	public int getTimeToRecharge() {
		return TimeToRecharge;
	}

}
