package com.formation.domain;

public abstract class CVehicule {
	
	protected String m_strMarque;
	protected double m_fVitesseMax;
	protected double m_fPoidsTotal;
	protected CChassis m_Chassis = null;
	protected CMoteur m_Moteur = null;
	
	public CVehicule() {}

	public CVehicule(String m_strMarque, int m_nPuissanceMoteur) {
		this(m_strMarque, m_nPuissanceMoteur, 120, 100);
	}
	
	public CVehicule(String m_strMarque, int m_nPuissanceMoteur,double m_fPoidsChassis, double m_fPoidsMoteur) {
		this.m_strMarque = m_strMarque;
		this.m_Moteur = new CMoteur(m_nPuissanceMoteur, m_fPoidsMoteur);
		this.m_Chassis = new CChassis(m_fPoidsChassis);
		calculerPoidsTotal();
		calculerVitesseMax();
	}
	
	public abstract void finalize();
	public abstract void rouler();
	public abstract void afficher();
	public abstract double calculerVitesseMax();
	
	public String getMarque() {
		return m_strMarque;
	}
	
	public double getVitesseMax() {
		return m_fVitesseMax;
	}
	
	public double getPoidsTotal() {
		return m_fPoidsTotal;
	}
	
	protected double calculerPoidsTotal() {
		return m_fPoidsTotal = m_Moteur.getPoids() + m_Chassis.getPoids();
	}
	
}
