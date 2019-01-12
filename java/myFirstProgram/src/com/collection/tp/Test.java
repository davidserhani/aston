package com.collection.tp;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person("David", "Serhani", 33);
		Person p2 = new Person("david", "Serhani", 33);
		Person p3 = new Person("David", "serani", 33);
		Person p4 = new Person("David", "Serhani", 34);
		Person p5 = new Person("David", "Serhani", 33);

		System.out.println("p1 == p5 : " + (p1 == p5));
		System.out.println("p1.equals(p5) : " + p1.equals(p5));
		System.out.println("p1 == p3 : " + (p1 == p3));
		System.out.println("p1.equals(p3) : " + p1.equals(p3));
		

	}

}
