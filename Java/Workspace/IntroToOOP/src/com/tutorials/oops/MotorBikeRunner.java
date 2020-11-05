package com.tutorials.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(230);
		MotorBike huffy = new MotorBike();

		ducati.start();
		honda.start();

		ducati.setSpeed(100);// showing how state of object can change across duration
		// System.out.println(ducati.getSpeed());

		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);

		ducati.decreaseSpeed(40);
		honda.decreaseSpeed(60);


		// honda.setSpeed(80);
		System.out.println("Honda Speed: " + honda.getSpeed());
		System.out.println("Ducati Speed: " + ducati.getSpeed());
	}

}
