package com.interfacePratice;

public class Stock implements Printable {
	private String symbolz = new String("€£$");
	private int shares = 100;
	private int currentPrice = 4000;
	
	@Override
	public void printAll() {
		System.out.println(symbolz + " " + shares + " shares at " + currentPrice);
		System.out.println("Value : " + currentPrice * shares);
	}

	public void sell() {
		System.out.println(symbolz + " sold");
	}

}
