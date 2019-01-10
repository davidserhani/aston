package com.formation.comportement.impl;

import com.formation.comportement.ComportementMigration;

public class MigrerSeul implements ComportementMigration {

	@Override
	public void migrer() {
		System.out.println("Je migre en S.O.L.O");
	}

}
