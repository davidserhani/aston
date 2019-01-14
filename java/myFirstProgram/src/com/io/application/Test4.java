package com.io.application;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test4 {

	public static void main(String[] args) {
		
		Worker w = new Worker(1001, "Billy Zoe", 4000.50);
		
		try {
			FileOutputStream fos = new FileOutputStream("./worker.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(w);
			oos.flush();
			oos.close();
		} catch (IOException e) {
			System.out.println("Exception : " + e.toString());
		}
		System.exit(0);;

	}

}
