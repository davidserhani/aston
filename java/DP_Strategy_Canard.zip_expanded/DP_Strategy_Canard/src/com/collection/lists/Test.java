package com.collection.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> insects = new ArrayList<>();
		insects.add("mosquito");
		insects.add("butterfly");
		insects.add("fly");
		insects.add("bee");
		
		int count = 0;
		for(String bug : insects) {
			System.out.println("insect " + count++ + " " + bug);
		}
		
		System.out.println("================");
		
		Collections.sort(insects);		
		count = 0;
		for(String bug : insects) {
			System.out.println("insect " + count++ + " " + bug);
		}
		
		System.out.println("===============");
		
		List<Person> persons = new ArrayList<>();
		Person p1 = new Person("David", "Serhani", 33);
		Person p2 = new Person("Franky", "Vincent", 60);
		Person p3 = new Person("Vincent", "Lagaf", 50);
		Person p4 = new Person("Patrick", "Sebastien", 12);		
		
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		
		System.out.println("Natural order : ");
		for(Person person : persons) {
			System.out.println(person.getLastName() + ", " + person.getFirstName() + " (" + person.getAge() + ")");
		}
		
		System.out.println("===============");
		
		Collections.sort(persons);
		for(Person person : persons) {
			System.out.println(person.getLastName() + ", " + person.getFirstName() + " (" + person.getAge() + ")");
		}
	}
}
