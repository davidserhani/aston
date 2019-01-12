package com.formation.domain;

import com.formation.comportement.impl.Coincoin;
import com.formation.comportement.impl.MigrerSeul;
import com.formation.comportement.impl.NePasVoler;

public class Picsou extends Canard {

	public Picsou() {
		comportementCancan = new Coincoin();
		comportementVol = new NePasVoler();
		comportementMigration =  new MigrerSeul();
	}
	
	@Override
	public void afficher() {
		System.out.println("Je suis Picsou");
		
	}

}
