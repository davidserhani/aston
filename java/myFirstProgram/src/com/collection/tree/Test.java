package com.collection.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	
	static final Comparator<Person> AGE_ORDER = new Comparator<Person>() {

		public int compare(Person p1, Person p2) {
//			return p1.getAge().compareTo(p2.getAge());
			
//			first step: comparator test
			int diffAge = p1.getAge().compareTo(p2.getAge());
			if(diffAge != 0) return diffAge;
			int diffName = 0;
			
//			second step: equals test
			if(p1.getLastName().equals(p2.getLastName())) {
				if(!p1.getFirstName().equals(p2.getFirstName()))
					diffName = p1.getFirstName().compareTo(p2.getFirstName());
			} else {
				diffName = p1.getLastName().compareTo(p2.getLastName());
			}
			
			return diffName;
		}
		

	};

	public static void main(String[] args) {

		Person[] pers1 = new Person[4];
		pers1[0] = new Person(1, "Wayne", "Bruce", 33);
		pers1[1] = new Person(2, "Kent", "Clark", 40);
		pers1[2] = new Person(3, "Luthor", "Lex", 29);
		pers1[3] = new Person(4, "Dent", "Harvey", 50);

		System.out.println("===== Natural Order =====");

		for (Person p : pers1) {
			System.out.println(p);
		}

		System.out.println("===== Order by Name =====");
//		Arrays.sort(pers1);
		Arrays.sort(pers1, AGE_ORDER);
		for (Person p : pers1) {
			System.out.println(p);
		}

		List<Person> pers2 = new ArrayList<>();
		pers2.add(new Person(1, "Wayne", "Bruce", 33));
		pers2.add(new Person(2, "Kent", "Clark", 40));
		pers2.add(new Person(3, "Luthor", "Lex", 29));
		pers2.add(new Person(4, "Dent", "Harvey", 50));

		System.out.println("===== Natural Order =====");

		for (Person p : pers2) {
			System.out.println(p);
		}
		
		System.out.println("===== Order by Name =====");
//		Collections.sort(pers2);
		Collections.sort(pers2, AGE_ORDER);
		for (Person p : pers2) {
			System.out.println(p);
		}
		
//		Set<Person> pers3 = new TreeSet<>();
		Set<Person> pers3 = new TreeSet<>(AGE_ORDER);
		
		pers3.add(new Person(1, "Wayne", "Bruce", 33));
		pers3.add(new Person(2, "Kent", "Clark", 40));
		pers3.add(new Person(3, "Luthor", "Lex", 29));
		pers3.add(new Person(4, "Dent", "Harvey", 50));
		pers3.add(new Person(5, "Vincent", "Francky", 40));
		
		System.out.println("===== Natural Order =====");

		for (Person p : pers3) {
			System.out.println(p);
		}
		
		
	}

}
