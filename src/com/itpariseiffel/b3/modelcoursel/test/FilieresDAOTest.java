
package com.itpariseiffel.b3.modelcoursel.test;

import com.itpariseiffel.b3.modelcoursel.beans.Filieres;
import com.itpariseiffel.b3.modelcoursel.dao.FilieresDAO;

public class FilieresDAOTest {

	public void testGetCours() throws Exception {
		FilieresDAO  filieresDAOTest = new FilieresDAO();
		Filieres coursTest = filieresDAOTest.getFiliere(1);
		assertEquals(1,coursTest.getCode_filiere());
		}
}
