package com.myFirstProgram.heritage;

public class Wolf extends Canin {
	
	private String skillz = "i got nice teeths";
	
	public String getSkillz() {
		return skillz;
	}

	public void setSkillz(String skillz) {
		this.skillz = skillz;
	}



	public Wolf(int weight, String color) {
		super();
		this.weight = weight;
		this.color= color;
	}
	
	

	@Override
	public void eat() {
		System.out.println("i eat lil kids !");

	}

	@Override
	public void drink() {
		System.out.println("i drink blood !");

	}

	public void move() {
		System.out.println("i run en meute");
	}

	@Override
	public void shout() {
		System.out.println("AOUUUUUUU");

	}

}
