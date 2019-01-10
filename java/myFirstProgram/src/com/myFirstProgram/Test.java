package com.myFirstProgram;

public class Test {

	public static void main(String[] args) {
//		TP1
		System.out.println("TP1 :");
		CheckNumber number = new CheckNumber();
		System.out.println(number.add());
		System.out.println(number.minus());
		System.out.println(number.times());
		System.out.println(number.divide());
		System.out.print("\n");
		System.out.println("<--------------------------------------------------------------------->");
		System.out.print("\n");
//		TP2
		System.out.println("TP2 ");
		Account account = new Account();
		account.setPrincipal(200000);
		account.setInterestRate(1.5);
		account.setTime(20);
		System.out.println(account.interest());
		System.out.print("\n");
		System.out.println("<--------------------------------------------------------------------->");
		System.out.print("\n");
//		TP3
		Person pers1 = new Person();
		System.out.println(pers1);
		Person pers2 = new Person(33, 'M', 1.68);
		System.out.println(pers2);
		Person pers3 = new Person(18, 'A', 1.70);
		Person pers4 =  new Person(20, 10, 1.75);
		System.out.print("\n");
		System.out.println("<--------------------------------------------------------------------->");
		System.out.print("\n");
//		test
		Animal flipper = new Fish("dolphin");
		System.out.println(flipper);
		String name = flipper.name;
		System.out.println(name);
		flipper.move();
		Animal levingston = new Bird("gull");
		System.out.println(levingston);
		String name2 = levingston.name;
		System.out.println(name2);
		levingston.move();
		int x = 0;
		for (int i = 0; i < 10; i++) {
			x += 1;
			System.out.println("x vaut : " + x);
			if ( x > 5) {
				x = 0;
			}
		}
		
		System.out.print("\n");
		System.out.println("<--------------------------------------------------------------------->");
		System.out.print("\n");
//		TP tableaux
		int[] myTab1 = new int[5];
		for(int i = 0; i < 5; i++) {
			myTab1[i] = 10 + i;
		}
		for(int element: myTab1) {
			System.out.println(element);
		}
		int[] myTab2 = {5, 8, 6, 0, 7};
		for (int i = 0; i < myTab2.length; i++) {
			int element = myTab2[i];
			System.out.println("Valeur de l'élément " + i + " de mon tableau est : " + element);	
		}
		int[][] matrice = {
				{0, 1, 4, 3},
				{5, 7, 9, 11, 13, 15, 17}
		};
		for(int i = 0; i < matrice.length; i++) {
			for(int j = 0; j < matrice[i].length; j++) {
				System.out.print(matrice[i][j] + ",");
			}
			System.out.print("\n");
		}
	}

	

}
