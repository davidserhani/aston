package com.myFirstProgram;

public class Fish extends Animal {
	
	private String type = "kind";
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Fish(String name) {
		super();
		this.name = name;
	}

	@Override
	void move() {
		System.out.println("I swim !");

	}

	@Override
	public String toString() {
		return "I'm a " + name + " ...a " + type + " one !" ;
	}

}
