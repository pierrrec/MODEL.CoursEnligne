package com.itpariseiffel.b3.modelcoursel.test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import org.junit.Test;

import com.itpariseiffel.b3.modelcoursel.beans.Cours;
import com.itpariseiffel.b3.modelcoursel.dao.CoursDAO;

public class CoursDAOTest {

	@Test
	public void testGetCours() throws SQLException {
		CoursDAO  coursDAOTest = new CoursDAO();
		Cours coursTest = coursDAOTest.getCours(1);
		assertEquals(1,coursTest.getCode_cours());
	}

	@Test
	public void testGetCoursAll() throws Exception {
		CoursDAO coursDAOTest = new CoursDAO();
		coursDAOTest.getCoursAll();
	}

	@Test
	public void testInsertCours() throws Exception {
		Cours cours_new = new Cours(14,1,"",1,1);
		CoursDAO coursTest = new CoursDAO();
		int result = coursTest.insertCours(cours_new);
		assertEquals(1,result);
	}

	@Test
	public void testUpdateCours() {
		
	}

	@Test
	public void testDeleteCours() throws SQLException {
		CoursDAO  coursDAOTest = new CoursDAO();
		Cours coursTest = coursDAOTest.deleteCours(1);
		assertEquals(1,coursTest.getCode_cours());
	}

}
