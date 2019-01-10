package com.formation.domain;

import com.formation.comportement.impl.Coincoin;
import com.formation.comportement.impl.MigrerSeul;
import com.formation.comportement.impl.NePasVoler;

public class Duck extends Canard {

	public Duck() {
		comportementCancan = new Coincoin();
		comportementMigration = new MigrerSeul();
		comportementVol = new NePasVoler();
	}
	
	@Override
	public void afficher() {
		System.out.println("Je suis Daffy Duck");	
	}

}
