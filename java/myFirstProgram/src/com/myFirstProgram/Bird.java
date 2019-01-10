package com.myFirstProgram;

public class Bird extends Animal {
	private int wings = 2;
	

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

	public Bird(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "I'm a " + name + " and i got " + wings + " wings";
	}

	@Override
	void move() {
		System.out.println("i fly !");;
	}

}
