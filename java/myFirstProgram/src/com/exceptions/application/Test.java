package com.exceptions.application;

public class Test {

	public static void main(String[] args) throws MyException {
		int num1 = 0, num2 = 5;
//		int num3 = num2 / num1;
//		System.out.println("num3 = " + num3);
		System.out.println("=============");
		
		int num3 = 0;
		try {
			num3 = num2 / num1;
			System.out.println("num3 = " + num3);
		} catch (ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("Division by zero is performed ");
		}

		int[] array = {0, 0};
		int result = 0;
		num1 = 100;
		num2 = 1;
		try {
			result = num1 / num2;
			System.out.println("num1 / num2 : " + num1 / array[2]);
			System.out.println("result is : " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error ... Division by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error ... Out of bounds");
		} catch (Exception e) {
			System.out.println("other Error ... ");
		}
		System.out.println("=============");
		
		MyExceptionDemo myExDemo = new MyExceptionDemo();
		
		try {
			myExDemo.calculate(12, 1);
			myExDemo.calculate(15, 7);
		} catch (MyException e) {
			System.out.println("Caught " + e);
		}
		
	}
	

}
