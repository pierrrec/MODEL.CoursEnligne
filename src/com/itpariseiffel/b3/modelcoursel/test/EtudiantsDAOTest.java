package com.itpariseiffel.b3.modelcoursel.test;

import com.itpariseiffel.b3.modelcoursel.beans.Etudiants;
import com.itpariseiffel.b3.modelcoursel.dao.EtudiantsDAO;
import static org.junit.Assert.*;

import org.junit.Test;

public class EtudiantsDAOTest {

	@Test
	public void testGetEtudiants() throws Exception {
		EtudiantsDAO  etudiantsDAOTest = new EtudiantsDAO();
		Etudiants etudiantsTest = etudiantsDAOTest.getEtudiant(1);
		assertEquals(1,etudiantsTest.getNumero_etudiant());
		
	}
	
	@Test
	public void testGetEtudiantsAll() throws Exception {
		EtudiantsDAO  etudiantsDAOTest = new EtudiantsDAO();
		Etudiants etudiantsTest = etudiantsDAOTest.getEtudiant(1);
		assertEquals(1,etudiantsTest.getNumero_etudiant());
		
	}
	
	@Test
	public void testInsertEtudiants() throws Exception {
		EtudiantsDAO  etudiantsDAOTest = new EtudiantsDAO();
		Etudiants etudiantsTest = etudiantsDAOTest.getEtudiant(1);
		assertEquals(1,etudiantsTest.getNumero_etudiant());
	}
	
	@Test
	public void testUpdateEtudiants() throws Exception {
		EtudiantsDAO  etudiantsDAOTest = new EtudiantsDAO();
		Etudiants etudiantsTest = etudiantsDAOTest.getEtudiant(1);
		assertEquals(1,etudiantsTest.getNumero_etudiant());
		
	}
	
	@Test
	public void testDeleteEtudiants() throws Exception {
		EtudiantsDAO  etudiantsDAOTest = new EtudiantsDAO();
		Etudiants etudiantsTest = etudiantsDAOTest.getEtudiant(1);
		assertEquals(1,etudiantsTest.getNumero_etudiant());
		
	}
}
