package com.myFirstProgram;

public class Person {
	int age;
	char sex;
	double high;

	public Person() {
		age = 43;
		sex = 'M';
		high = 1.80;
	}

	@Override
	public String toString() {
		return "Person [age= " + age + ", sex= " + sex + ", high= " + high + "]";
	}

	public Person(int age, char sex, double high) {
		this.age = age;
		if (sex == 'M' || sex == 'F') {
			this.sex = sex;
		} else {
			System.out.println("Wrong input for the sex");
		}
		this.sex = sex;
		this.high = high;
	}
	
	public Person(int age, int sex, double high) {
		this.age = age;
		switch (sex) {
		case 0:
			this.sex = 'F';
			break;
		case 1:
			this.sex = 'M';
		default:
			System.out.println("Wrong input for the sex");
			break;
		}
	}

}
