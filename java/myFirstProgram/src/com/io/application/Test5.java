package com.io.application;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test5 {

	public static void main(String[] args) {
		
		Worker w = new Worker();
		FileInputStream fis;
		try {
			fis = new FileInputStream("./worker.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			w = (Worker) ois.readObject();
			w.show();
			ois.close();
		} catch (IOException e) {
			System.out.println("Exception: " + e.toString());
		} catch (ClassNotFoundException ex) {
			System.out.println("Exception: " + ex.toString());
		}
	}

}
