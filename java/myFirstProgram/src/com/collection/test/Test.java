package com.collection.test;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		String chaine1 = "Hello";
		String chaine2 = "Hello";
		String chaine3 = new String("Hello");
		System.out.println(chaine1 == chaine2);
		System.out.println(chaine1.equals(chaine2));
		System.out.println(chaine3);
		System.out.println(chaine3 == chaine1);
		Set<String> names = new HashSet<String>();
		names.add("david");
		names.add("david");
		for(String name : names) {
			System.out.println(name);
		}
	}
		
}
