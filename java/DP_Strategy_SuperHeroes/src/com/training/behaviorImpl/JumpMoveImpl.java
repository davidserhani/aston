package com.training.behaviorImpl;

import com.training.behavior.MoveBehavior;

public class JumpMoveImpl implements MoveBehavior {

	@Override
	public void move() {
		System.out.println("I'm jumping");
	}

}
