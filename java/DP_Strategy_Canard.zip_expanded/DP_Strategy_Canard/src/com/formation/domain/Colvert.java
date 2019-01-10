package com.formation.domain;

import com.formation.comportement.impl.Cancan;
import com.formation.comportement.impl.VolerAvecDesAiles;

public class Colvert extends Canard {
	
	
 // C'est dans son constructeur que je lui attribue ses comportements
	public Colvert() {
		comportementCancan = new Cancan();
		comportementVol = new VolerAvecDesAiles();
	}

	@Override()
	public void afficher() {
		System.out.println("Je suis un Colvert");
		
	}

	

}
