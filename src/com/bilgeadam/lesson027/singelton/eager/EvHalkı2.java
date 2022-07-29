package com.bilgeadam.lesson027.singelton.eager;

import com.bilgeadam.lesson027.singelton.lazy.Robot;

public class EvHalkı2 extends Thread {

	public void robotCagır() {

		System.out.println(Robot.getRobot().hashCode());

	}

	@Override
	public void run() {

		try {
			Thread.sleep(1000);

			Robot2.getRobot().calıs();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
