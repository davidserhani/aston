package com.training.application;

import com.training.domain.Hero;
import com.training.domain.StreetFighter;

public class App {

	public static void main(String[] args) {
		Hero streetFighter = new StreetFighter("Ryu", "Capcom");
		streetFighter.show();
		streetFighter.doMove();
		streetFighter.doAttack();
		streetFighter.doSpecial();
		
		System.out.println("==============");
		
	}

}
