package com.itpariseiffel.b3.modelcoursel.test;

import com.itpariseiffel.b3.modelcoursel.beans.Etudiants;
import com.itpariseiffel.b3.modelcoursel.dao.EtudiantsDAO;

public class EtudiantsDAOTest {

	public void testGetEtudiants() throws Exception {
		EtudiantsDAO  etudiantsDAOTest = new EtudiantsDAO();
		Etudiants etudiantsTest = etudiantsDAOTest.getEtudiant(1);
		assertEquals(1,etudiantsTest.getNumero_etudiant());
		
	}

}
