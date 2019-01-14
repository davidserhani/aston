package com.exceptions.application;

public class MyExceptionDemo {
	
	public void calculate(int a, int b) throws MyException{
		int sum;
		System.out.println("add method( " + a + ", " + b + " )" );
		sum = a + b;
		if (sum > 20)
			throw new MyException("My exception caught :  the sum exceeds 20 ...");
		System.out.println("The value of the sum of two numbers is : " + sum);
	}
}
