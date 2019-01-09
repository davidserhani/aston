package com.myFirstProgram;

public class Account {
	// Data members of the class
	int principal;
	double interestRate;
	int time;
	
	public int getPrincipal() {
		return principal;
	}

	public void setPrincipal(int principal) {
		this.principal = principal;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double d) {
		this.interestRate = d;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public Account() {
		super();
		this.principal = 100000;
		this.interestRate = 1.0;
		this.time = 10;
	}

	public double interest() {
		double result = (principal * interestRate * time) / 100;
		return result;
	}
	

	
}
