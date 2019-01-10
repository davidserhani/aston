package com.myFirstProgram.heritage;

public class Dog extends Canin {

	
	public Dog(int weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}

	@Override
	public void eat() {
		System.out.println("i eat croquettes !");

	}

	@Override
	public void drink() {
		System.out.println("i drink water");
	}

	@Override
	public void shout() {
		System.out.println("Woof");

	}

}
