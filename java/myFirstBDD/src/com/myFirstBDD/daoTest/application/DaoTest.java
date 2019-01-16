package com.myFirstBDD.daoTest.application;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.myFirstBDD.daoTest.dao.CongeDAO;
import com.myFirstBDD.daoTest.dao.CongeDAOImpl;
import com.myFirstBDD.daoTest.dao.EmployeDAO;
import com.myFirstBDD.daoTest.dao.EmployeDaoImpl;
import com.myFirstBDD.daoTest.domain.Conge;
import com.myFirstBDD.daoTest.domain.Employe;
import com.myFirstBDD.singleton.GlobalConnection;

public class DaoTest {
	private static java.sql.Date converter(java.util.Date jud){
		return new java.sql.Date(jud.getTime());
	}

	public static void main(String[] args) throws SQLException, ParseException {
		EmployeDAO employeDao = new EmployeDaoImpl(GlobalConnection.getInstance());
		
//		System.out.println("inserting records into the table ...");
//		
//		employeDao.insertEmploye(new Employe(3, "Vador", "Dark", "darkvador", "force"));

		employeDao.removeEmploye(12);
		employeDao.removeEmploye(13);
		
		Employe emp = new Employe();
		emp.setNom("Kent");
		emp.setPrenom("Clark");
		emp.setLogin("Batman");
		emp.setPassword("robin");
		emp = employeDao.insertEmploye(emp);
		
		List<Employe> employes = employeDao.getAllEmploye();
		System.out.println("\n---------------");
		for (Employe employe : employes) {
			System.out.print("\t" + employe.getId() + "\t |");
			System.out.print("\t" + employe.getNom() + "\t |");
			System.out.print("\t" + employe.getPrenom() + "\t |");
			System.out.println("\n");
		}
		
		emp.setNom("Kentucky");
		System.out.println("====>"+emp);
		employeDao.updateEmploye(emp);
		
		employes = employeDao.getAllEmploye();
		System.out.println("\n---------------");
		for (Employe employe : employes) {
			System.out.print("\t" + employe.getId() + "\t |");
			System.out.print("\t" + employe.getNom() + "\t |");
			System.out.print("\t" + employe.getPrenom() + "\t |");
			System.out.println("\n");
		}
		
		CongeDAO congeDAO = new CongeDAOImpl(GlobalConnection.getInstance());
		congeDAO.removeConge(1);
		congeDAO.removeConge(2);
		SimpleDateFormat dateformat3 = new SimpleDateFormat("yyyy/MM/dd");
		Date debut = dateformat3.parse("2018/12/01");
		Date fin = dateformat3.parse("2019/06/01");
		Conge cp = new Conge();
		cp.setDebut(converter(debut));
		cp.setEmpID(1);
		cp.setEtat("vacances");
		cp.setFin(converter(fin));
		congeDAO.insertConge(cp);
		
		List<Conge> conges = congeDAO.getAllConge();
		System.out.println("\n---------------");
		for (Conge c : conges) {
			System.out.print("\t" + c.getId() + "\t |");
			System.out.print("\t" + c.getDebut() + "\t |");
			System.out.print("\t" + c.getFin() + "\t |");
			System.out.print("\t" + employeDao.getEmploye(c.getEmpID()) + "\t |");
			System.out.println("\n");
		}
	}

}
