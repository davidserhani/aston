package com.formation.domain;

public class CChassis {

	private double m_fPoidsChassis;
	
	public double getPoids() {
		return m_fPoidsChassis;
	}
	
	public void setPoids(double poids) {
		this.m_fPoidsChassis = poids;
	}

	public CChassis() {

	}

	public CChassis(double m_fPoidsChassis) {
		super();
		this.m_fPoidsChassis = m_fPoidsChassis;
	}

	public void afficher() {
		System.out.println("CChassis [m_fPoidsChassis=" + m_fPoidsChassis + "]");
	}
	
}
