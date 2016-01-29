package com.itpariseiffel.b3.modelcoursel.test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import org.junit.Test;

import com.itpariseiffel.b3.modelcoursel.beans.Professeurs;
import com.itpariseiffel.b3.modelcoursel.dao.ProfesseursDAO;

public class ProfesseursDAOTest {

	@Test
	public void testGetProfesseur() throws SQLException {
		ProfesseursDAO  professeursDAOTest = new ProfesseursDAO();
		Professeurs professeursTest = professeursDAOTest.getProfesseur(1);
		assertEquals(1,professeursTest.getNum_prof());
	}

	@Test
	public void testGetProfesseursAll() throws SQLException {
		ProfesseursDAO professeursDAOTest = new ProfesseursDAO();
		professeursDAOTest.getProfesseursAll();
	}

	@Test
	public void testInsertProfesseur() throws SQLException {
		Professeurs  professeursNew = new Professeurs(12,"Agueh","Max",4356,"12 rue du Saxe 75015");
		ProfesseursDAO professeursTest = new ProfesseursDAO();
		int result = professeursTest.insertProfesseur(professeursNew);
		assertEquals(1,result);	
		}

	@Test
	public void testUpdateProfesseur() throws SQLException {
		
	}

	@Test
	public void testDeleteProfesseur() throws SQLException {
		ProfesseursDAO  professeursDAOTest = new ProfesseursDAO();
		Professeurs professeursTest = professeursDAOTest.deleteProfesseur(1);
		assertEquals(1,professeursTest.getNum_prof());
	}

}
