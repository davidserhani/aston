package com.interfacePratice;

public class Person implements Printable {

	private String name = new String("David");
	private int age = 33;
	@Override
	public void printAll() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}

}
