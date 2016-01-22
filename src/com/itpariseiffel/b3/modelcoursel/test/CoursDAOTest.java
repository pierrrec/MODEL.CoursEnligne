package com.itpariseiffel.b3.modelcoursel.test;

import com.itpariseiffel.b3.modelcoursel.dao.CoursDAO;
import com.itpariseiffel.b3.modelcoursel.beans.Cours;
import junit.framework.*;

public class CoursDAOTest extends TestCase {
	
	public void testGetCours() throws Exception {
		CoursDAO  coursDAOTest = new CoursDAO();
		Cours coursTest = coursDAOTest.getCours(1);
		assertEquals(1,coursTest.getCode_cours());
		}

		
}
