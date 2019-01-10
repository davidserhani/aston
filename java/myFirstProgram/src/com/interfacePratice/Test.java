package com.interfacePratice;

public class Test {

	public static void main(String[] args) {
		
		Person p = new Person();
		Stock s = new Stock();
		
		p.printAll();
		s.printAll();
		
		System.out.println("=============");
		
		Printable pr;
		pr = p;
		if(pr instanceof Stock) ((Stock) pr).sell();
		pr.printAll();
		pr = s;
		
		pr.printAll();
		if(pr instanceof Stock) ((Stock) pr).sell();

	}

}
