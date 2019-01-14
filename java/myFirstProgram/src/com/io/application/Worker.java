package com.io.application;

import java.io.Serializable;

public class Worker implements Serializable {
	
	private int w_code;
	private String w_name;
	private double w_salary;
	
	public Worker() {}
	
	public Worker(int code, String name, double sal) {
		w_code = code;
		w_name = name;
		w_salary = sal;
	}
	
	public void  show() {
		System.out.println("Worker Code " + w_code);
		System.out.println("Worker Name " + w_name);
		System.out.println("Worker Salary " + w_salary);
	}
}
