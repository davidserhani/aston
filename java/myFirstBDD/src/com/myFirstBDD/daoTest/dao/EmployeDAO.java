package com.myFirstBDD.daoTest.dao;

import java.util.List;

import com.myFirstBDD.daoTest.domain.Employe;

public interface EmployeDAO {
	
	public Employe insertEmploye(Employe employe);
	public void updateEmploye(Employe employe);
	public void removeEmploye(int empID);
	public Employe getEmploye(int empID);
	public Employe login(String login, String password);
	public List<Employe> getAllEmploye();
}
