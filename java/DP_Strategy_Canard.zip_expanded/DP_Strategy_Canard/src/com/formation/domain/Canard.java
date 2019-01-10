package com.formation.domain;

import com.formation.comportement.ComportementCancan;
import com.formation.comportement.ComportementMigration;
import com.formation.comportement.ComportementVol;

public abstract class Canard {
	
	ComportementVol comportementVol;
	ComportementCancan comportementCancan;
	ComportementMigration comportementMigration;
	
	public void effectuerMigration() {
		this.comportementMigration.migrer();
	}
	
	public  void effectuerCancan() {
		this.comportementCancan.cancaner();
	}
	
	public  void effectuerVol() {
		this.comportementVol.voler();
	}
	
	public  void nager(){
		System.out.println("Je nage comme tous les canards");
	}
	
	public abstract void afficher();
	
	public void setComportementVol(ComportementVol comportementVol) {
		this.comportementVol = comportementVol;
	}
	
	public void setComportementCancan(ComportementCancan comportementCancan) {
		this.comportementCancan = comportementCancan;
	}
	
	public void setComportementMigre(ComportementMigration comportementMigration) {
		this.comportementMigration = comportementMigration;
	}

}
