package com.kingsoft;

import com.kingsoft.BatteryPoweredMotor.BatteryPoweredMotor1;
import com.kingsoft.myInterface.BatteryPoweredMotor;
import com.kingsoft.proxyAop.DynaProxy;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BatteryPoweredMotor motor1 = (BatteryPoweredMotor)new DynaProxy().bind(new BatteryPoweredMotor1());
		motor1.getHorsepower();
		motor1.getTimeToRecharge();
	}

}
