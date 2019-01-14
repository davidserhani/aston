package com.io.application;

import java.io.File;
import java.io.IOException;

public class Test {
	
	public static void main(String[] args) {
		
		File file = new File("./newFile.txt");
		try {
			if (file.createNewFile())
				System.out.println("File created !");
			else {
				System.out.println("File already exists .");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
