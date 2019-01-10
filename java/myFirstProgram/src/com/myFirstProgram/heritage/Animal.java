package com.myFirstProgram.heritage;

abstract public class Animal {
	protected int weight;
	protected String color;
	
	public abstract void eat();
	public abstract void drink();
	protected void move() {
		System.out.println("i run !");
	}
	public abstract void shout();
	
	@Override
	public String toString() {
		return "Animal : " + getClass().getSimpleName() + " [weight=" + weight + ", color=" + color + "]";
	}
	
}
