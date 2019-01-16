package com.formation.test;

import com.formation.domain.CCamion;
import com.formation.domain.CVoiture;

public class CMain {

	public static void main(String[] args) {
		
		CVoiture voiture = null;
		CCamion camion = null;
		
		if(args.length == 4) {
			voiture = new CVoiture(args[0], Integer.parseInt(args[1]));
			camion = new CCamion(args[2], Integer.parseInt(args[3]));
		} else {
			voiture = new CVoiture();
			camion = new CCamion();
		}
		
		voiture.afficher();
		camion.afficher();
		

	}

}
