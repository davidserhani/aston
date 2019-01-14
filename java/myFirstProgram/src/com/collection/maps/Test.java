package com.collection.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		
//		Map<Integer, String> months = new Hashtable<>();
//		Map<Integer, String> months = new LinkedHashMap<>();
		Map<Integer, String> months = new HashMap<>();
		months.put(new Integer(1), "January");
		months.put(new Integer(2), "February");
		months.put(new Integer(3), "March");
		months.put(new Integer(4), "April");
		months.put(new Integer(5), "May");
		months.put(new Integer(6), "June");
		months.put(new Integer(7), "July");
		months.put(new Integer(8), "August");
		months.put(new Integer(9), "September");
		months.put(new Integer(10), "October");
		months.put(new Integer(11), "November");
		months.put(new Integer(12), "December");
		
		for(Iterator<Integer> it = months.keySet().iterator(); it.hasNext();) {
			Integer key = it.next();
			System.out.println("key = " + key + " value = " + months.get(key));
		}
		System.out.println("===========");
		for(String month: months.values()) {
			System.out.println(month);
		}
		Collection<String> year = months.values();
		for (String month : year) {
			System.out.println(month);
		}
		System.out.println("===========");
		for(Entry<Integer, String> entry: months.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		
	}

}
