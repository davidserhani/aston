package com.formation.comportement.impl;

import com.formation.comportement.ComportementVol;

public class NePasVoler implements ComportementVol {

	@Override
	public void voler() {
		System.out.println("Je ne vole pas");
		
	}

}
