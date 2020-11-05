package com.tutorials.oops;

public class MotorBike {
	// state
	private int speed; // create instance variable // private - cannot be accessed outside class

	MotorBike() {

	}

	MotorBike(int speed) { // Uses a constructor. Needs the same name as the object
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed; // encapsulation. validations on what can go into obj
		} // validates that you set something above 0.
	}
	/*
	 * System.out.println(speed); System.out.println(this.speed); // the default
	 * value for a member variable is 0 this.speed = speed; }
	 */

	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

	// behavior
	void start() {
		System.out.println("Bike started");
	}

}
