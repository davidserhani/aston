package com.formation.domain;

import com.formation.comportement.impl.CancanMuet;
import com.formation.comportement.impl.Coincoin;
import com.formation.comportement.impl.NePasVoler;
import com.formation.comportement.impl.VolerAvecDesAiles;

public class Mandarin extends Canard {

	 // C'est dans son constructeur que je lui attribue ses comportements
	public Mandarin() {
		comportementCancan = new Coincoin();
		comportementVol = new VolerAvecDesAiles();
	}
	
	@Override
	public void afficher() {
		System.out.println("Je suis un Mandarin");
		
	}

	

}
