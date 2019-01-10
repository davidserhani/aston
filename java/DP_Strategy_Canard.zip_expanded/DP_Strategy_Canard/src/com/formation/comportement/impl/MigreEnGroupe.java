package com.formation.comportement.impl;

import com.formation.comportement.ComportementMigration;

public class MigreEnGroupe implements ComportementMigration {

	@Override
	public void migrer() {
		System.out.println("Je migre en équipe !");

	}

}
