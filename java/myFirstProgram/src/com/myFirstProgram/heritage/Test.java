package com.myFirstProgram.heritage;

public class Test {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Animal garou = new Wolf(10, "black & white");
		System.out.println(garou);
		garou.drink();
		garou.move();
		Animal milou = new Dog(3, "white");
		System.out.println(milou);
		milou.eat();
		milou.move();
		milou.shout();
	}

}
