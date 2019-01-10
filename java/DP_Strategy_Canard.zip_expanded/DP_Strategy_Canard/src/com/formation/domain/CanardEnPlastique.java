package com.formation.domain;

import com.formation.comportement.impl.CancanMuet;
import com.formation.comportement.impl.NePasVoler;

public class CanardEnPlastique extends Canard {

	 // C'est dans son constructeur que je lui attribue ses comportements
		public CanardEnPlastique() {
			comportementCancan = new CancanMuet();
			comportementVol = new NePasVoler();
		}
	
	@Override
	public void afficher() {
		System.out.println("Je suis un CanardEnPlastique");
		
	}

	

}
