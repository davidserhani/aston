package com.training.domain;

import com.training.behavior.AttackBehavior;
import com.training.behavior.MoveBehavior;
import com.training.behavior.SpecialBehavior;

public abstract class Hero {
	
	protected String name;
	protected String team;
	
	public Hero(String name,String team) {
		this.name = name;
		this.team = team;
	}
	
	MoveBehavior moveBehavior;
	AttackBehavior attackBehavior;
	SpecialBehavior specialBehavior;
	
	public void doAttack() {
		this.attackBehavior.attack();
	}
	public void doMove() {
		this.moveBehavior.move();
	}
	public void doSpecial() {
		this.specialBehavior.special();
	}
	
	public abstract void show();
}
