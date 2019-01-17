package com.myFirstBDD.daoTest.domain;

import java.util.Date;

public class Conge {
	
	private int id;
	private int empID;
	private Date debut;
	private Date fin;
	private String etat;
	
	public Conge() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public Date getDebut() {
		return debut;
	}

	public void setDebut(Date debut) {
		this.debut = debut;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	@Override
	public String toString() {
		return "Conge [id=" + id + ", empID=" + empID + ", debut=" + debut + ", fin=" + fin + ", etat=" + etat + "]";
	}

	public Conge(int id, int empID, Date debut, Date fin, String etat) {
		super();
		this.id = id;
		this.empID = empID;
		this.debut = debut;
		this.fin = fin;
		this.etat = etat;
	}
	
	
	
}
