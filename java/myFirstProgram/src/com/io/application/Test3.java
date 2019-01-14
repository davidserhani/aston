package com.io.application;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) {
		
		FileOutputStream fop = null;
		File file;
		String content = "This is the text content";
		
		
		try {
			file = new File("./newfile2.txt");
			fop = new FileOutputStream(file);
			if(!file.exists())
				file.createNewFile();
			byte[] contentInBytes = content.getBytes();
			fop.write(contentInBytes);
			fop.close();
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fop != null)
					fop.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
