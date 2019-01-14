package com.training.domain;

import com.training.behaviorImpl.FireballSpecialImpl;
import com.training.behaviorImpl.JumpMoveImpl;
import com.training.behaviorImpl.PunchAttackImpl;

public class StreetFighter extends Hero {

	public StreetFighter(String name, String team) {
		super(name, team);
		moveBehavior = new JumpMoveImpl();
		attackBehavior = new PunchAttackImpl();
		specialBehavior = new FireballSpecialImpl();
	}

	@Override
	public void show() {
		System.out.println("I'm " + name + " the street Fighter");
	}

}
