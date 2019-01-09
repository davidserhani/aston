package com.myFirstProgram;

public class Test {

	public static void main(String[] args) {
//		TP1
		System.out.println("TP1 :");
		CheckNumber number = new CheckNumber();
		System.out.println(number.add());
		System.out.println(number.minus());
		System.out.println(number.times());
		System.out.println(number.divide());
		System.out.print("\n");
		System.out.println("<--------------------------------------------------------------------->");
		System.out.print("\n");
//		TP2
		System.out.println("TP2 ");
		Account account = new Account();
		account.setPrincipal(200000);
		account.setInterestRate(1.5);
		account.setTime(20);
		System.out.println(account.interest());
		System.out.print("\n");
		System.out.println("<--------------------------------------------------------------------->");
		System.out.print("\n");
//		TP3
		Person pers1 = new Person();
		System.out.println(pers1);
		Person pers2 = new Person(33, 'M', 1.68);
		System.out.println(pers2);
		Person pers3 = new Person(18, 'A', 1.70);
		Person pers4 =  new Person(20, 10, 1.75);
		System.out.print("\n");
		System.out.println("<--------------------------------------------------------------------->");
		System.out.print("\n");
	}

}
