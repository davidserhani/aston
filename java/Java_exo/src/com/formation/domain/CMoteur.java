package com.formation.domain;

public class CMoteur {

	private int m_nPuissanceMoteur;
	private double m_fPoidsMoteur;
	
	public double getPoids() {
		return m_fPoidsMoteur;
	}
	
	public int getPuissance() {
		return m_nPuissanceMoteur;
	}

	public void setM_fPoidsMoteur(double m_fPoidsMoteur) {
		this.m_fPoidsMoteur = m_fPoidsMoteur;
	}

	public void setPuissance(int power) {
		this.m_nPuissanceMoteur = power;
	}
	public CMoteur() {

	}

	public CMoteur(int m_nPuissanceMoteur, double m_fPoidsMoteur) {
		super();
		this.m_nPuissanceMoteur = m_nPuissanceMoteur;
		this.m_fPoidsMoteur = m_fPoidsMoteur;
	}

	
	public void afficher() {
		System.out.println("CMoteur [m_nPuissanceMoteur=" + m_nPuissanceMoteur + ", m_fPoidsMoteur=" + m_fPoidsMoteur + "]");
	}
	
	
	
}
