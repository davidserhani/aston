package com.heritage;

public class SoftwareBook extends Book {
	String softwareName;
	String softwareVersion;
	
	
	
	public SoftwareBook() {
		super("Steve", "Handbook", 50, 350, 13);
		softwareName = "MacOs";
		softwareVersion = "Mojave";
	}

	public void showDetails() {
		show();
		System.out.println("\t -- Software Books info --");
		System.out.println("\t Software Name : " + softwareName);
		System.out.println("\t Software Version : " + softwareVersion);
	}
	
	public void show() {
	
		super.show();
		System.out.println("\t -- Software Books info --");
		System.out.println("\t Software Name : " + softwareName);
		System.out.println("\t Software Version : " + softwareVersion);
	}
}
