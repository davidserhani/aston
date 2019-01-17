package com.myFirstBDD.daoTest.dao;

import java.sql.SQLException;
import java.util.List;

import com.myFirstBDD.daoTest.domain.Conge;

public interface CongeDAO {
	
	public Conge insertConge(Conge cp);
	public List<Conge> getAllConge() throws SQLException;
	void removeConge(int empID);
	
}
