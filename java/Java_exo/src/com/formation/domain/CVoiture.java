package com.formation.domain;

public class CVoiture extends CVehicule {
	
	static int m_nNbreVoiture = 0;
	
	public CVoiture() {
		super("Renault", 55);
		m_nNbreVoiture++;
	}

	public CVoiture(String m_strMarque, int m_nPuissanceMoteur) {
		super(m_strMarque, m_nPuissanceMoteur, 120, 100);
	}	
	
	public CVoiture(String m_strMarque, int m_nPuissanceMoteur,double m_fPoidsChassis, double m_fPoidsMoteur) {
		super(m_strMarque, m_nPuissanceMoteur, m_fPoidsChassis, m_fPoidsMoteur);
	}
	
	@Override
	public void afficher() {
		System.out.println("CVoiture [m_strMarque = " + m_strMarque + ", m_fVitesseMax = " + m_fVitesseMax + ", m_fPoidsTotal = "
				+ m_fPoidsTotal + ", m_nNbreVoiture = " + m_nNbreVoiture);
		m_Chassis.afficher();
		m_Moteur.afficher();
	}
	
	@Override
	public void rouler() {
		System.out.println("Ca roule pour la voiture de marque " + m_strMarque);
	}

	@Override
	public double calculerVitesseMax() {
		return m_fVitesseMax = m_fPoidsTotal * m_Moteur.getPuissance() / 500;
	}
	
	@Override
	public void finalize() {
		m_nNbreVoiture--;	
	}


	
}
