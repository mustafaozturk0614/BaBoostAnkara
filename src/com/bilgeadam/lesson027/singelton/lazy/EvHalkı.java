package com.bilgeadam.lesson027.singelton.lazy;

public class EvHalkı extends Thread {

	public void robotCagır() {

		System.out.println(Robot.getRobot().hashCode());

	}

	@Override
	public void run() {

		try {
			Thread.sleep(1000);

			Robot.getRobot().calıs();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
