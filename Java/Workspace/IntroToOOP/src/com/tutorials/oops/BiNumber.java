package com.tutorials.oops;

public class BiNumber {

	public static int numbers; // Initialize variables
	public static int number1;
	public static int number2;

	BiNumber() { // Create the constructors
		this(2, 3);
	}

	BiNumber(int number1, int number2) { // Create the constructors
		this.number1 = number1;
		this.number2 = number2;
	}

	public int getNumber1() { // Getters and setters for number1 and number2
		return number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiNumber numbers = new BiNumber(2, 3);
	}

}
