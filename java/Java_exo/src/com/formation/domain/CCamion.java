package com.formation.domain;

public class CCamion extends CVehicule {

	static int m_nNbreCamion = 0;
	
	public CCamion() {
		super("Iveco", 55);
		m_nNbreCamion++;
	}

	public CCamion(String m_strMarque, int m_nPuissanceMoteur) {
		super(m_strMarque, m_nPuissanceMoteur, 120, 100);
	}	
	
	public CCamion(String m_strMarque, int m_nPuissanceMoteur,double m_fPoidsChassis, double m_fPoidsMoteur) {
		super(m_strMarque, m_nPuissanceMoteur, m_fPoidsChassis, m_fPoidsMoteur);
	}
	@Override
	public void finalize() {
		m_nNbreCamion--;
	}

	@Override
	public void rouler() {
		System.out.println("Ca roule pour le camion de marque " + m_strMarque);

	}

	@Override
	public void afficher() {
		System.out.println("CCamion [m_strMarque = " + m_strMarque + ", m_fVitesseMax = " + m_fVitesseMax + ", m_fPoidsTotal = "
				+ m_fPoidsTotal + ", m_nNbreCamion = " + m_nNbreCamion);
		m_Chassis.afficher();
		m_Moteur.afficher();
	}

	@Override
	public double calculerVitesseMax() {
		return m_fVitesseMax = m_fPoidsTotal * m_Moteur.getPuissance() / 700;
	}

}
