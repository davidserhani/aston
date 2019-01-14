package com.training.behaviorImpl;

import com.training.behavior.AttackBehavior;

public class PunchAttackImpl implements AttackBehavior {

	@Override
	public void attack() {
		System.out.println("Sho-riu-ken");
	}

}
