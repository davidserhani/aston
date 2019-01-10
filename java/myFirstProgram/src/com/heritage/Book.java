package com.heritage;

public class Book {
	private String author;
	private String title;
	private int price;
	private int pages;
	private int stock;
	
	public Book() {
		author = "Steve";
		title = "Handbook";
		price = 50;
		pages = 350;
		stock = 13;
	}
	
	
	
	public Book(String author, String title, int price, int pages, int stock) {
		this.author = author;
		this.title = title;
		this.price = price;
		this.pages = pages;
		this.stock = stock;
	}



	public void show() {
		System.out.println(" ");
		System.out.println("\t -- Books information --");
		System.out.println("\t Books Author : " + author);
		System.out.println("\t Book Title : " + title);
		System.out.println("\t Book Price : " + price);
		System.out.println("\t Number of pages : " + pages);
		System.out.println("\t Book Stock : " + stock);
		System.out.println(" ");
	}
}
