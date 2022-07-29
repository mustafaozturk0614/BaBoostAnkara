package com.bilgeadam.lesson027.singelton.enumSingelton;

import com.bilgeadam.lesson027.singelton.lazy.Robot;

public class EvHalkı3 extends Thread {

	public void robotCagır() {

		System.out.println(Robot.getRobot().hashCode());

	}

	@Override
	public void run() {

		try {
			Thread.sleep(1000);

			Robot3.ROBOT.calıs();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
