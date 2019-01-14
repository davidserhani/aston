package com.training.behaviorImpl;

import com.training.behavior.MoveBehavior;

public class RunMoveImpl implements MoveBehavior {

	@Override
	public void move() {
		System.out.println("I'm running");
	}

}
