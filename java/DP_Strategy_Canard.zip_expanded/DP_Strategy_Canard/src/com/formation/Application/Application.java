package com.formation.Application;

import com.formation.comportement.impl.Coincoin;
import com.formation.domain.Canard;
import com.formation.domain.Colvert;
import com.formation.domain.Duck;
import com.formation.domain.Leurre;

public class Application {

	public static void main(String[] args) {
		System.out.println("*** colvert ****");
		Canard colvert = new Colvert();
		colvert.afficher();
		colvert.nager();
		colvert.effectuerVol();
		colvert.effectuerCancan();
		System.out.println("*** Changement de comportement dynamiquement ****");
		colvert.setComportementCancan(new Coincoin());
		colvert.effectuerCancan();
		
		System.out.println("*** leurre ****");
		Canard leurre = new Leurre();
		leurre.afficher();
		leurre.nager();
		leurre.effectuerVol();
		leurre.effectuerCancan();
		
		System.out.println("*** Duck ***");
		Canard daffy = new Duck();
		daffy.afficher();
		daffy.effectuerCancan();
		daffy.effectuerMigration();
		
	}

}
