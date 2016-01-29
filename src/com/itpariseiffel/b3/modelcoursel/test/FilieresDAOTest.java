/**
 * 
 */
package com.itpariseiffel.b3.modelcoursel.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.itpariseiffel.b3.modelcoursel.beans.Filieres;
import com.itpariseiffel.b3.modelcoursel.dao.FilieresDAO;


/**
 * @author Deen
 *
 */
public class FilieresDAOTest {

	/**
	 * Test method for {@link com.itpariseiffel.b3.modelcoursel.dao.FilieresDAO#FilieresDAO()}.
	 */
	@Test
	public void testFilieresDAO() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.itpariseiffel.b3.modelcoursel.dao.FilieresDAO#getFiliere(int)}.
	 */
	@Test
	public void testGetFiliere() throws SQLException {
		FilieresDAO  filieresDAOTest = new FilieresDAO();
		Filieres filieresTest = filieresDAOTest.getFiliere(1);
		assertEquals(1,filieresTest.getCode_filiere());
	}

	/**
	 * Test method for {@link com.itpariseiffel.b3.modelcoursel.dao.FilieresDAO#getFilieresAll()}.
	 */
	@Test
	public void testGetFilieresAll() throws SQLException {
		FilieresDAO filieresDAOTest = new FilieresDAO();
		filieresDAOTest.getFilieresAll();
	}

	/**
	 * Test method for {@link com.itpariseiffel.b3.modelcoursel.dao.FilieresDAO#insertFiliere(com.itpariseiffel.b3.modelcoursel.beans.Filieres)}.
	 */
	@Test
	public void testInsertFiliere() throws SQLException {
		Filieres filiere_new = new Filieres(14,"");
		FilieresDAO filieresTest = new FilieresDAO();
		int result = filieresTest.insertFiliere(filiere_new);
		assertEquals(1,result);
	}

	/**
	 * Test method for {@link com.itpariseiffel.b3.modelcoursel.dao.FilieresDAO#updateFiliere(com.itpariseiffel.b3.modelcoursel.beans.Filieres)}.
	 */
	@Test
	public void testUpdateFiliere() {
		
	}

	/**
	 * Test method for {@link com.itpariseiffel.b3.modelcoursel.dao.FilieresDAO#deleteFiliere(int)}.
	 */
	@Test
	public void testDeleteFiliere() throws SQLException {
		FilieresDAO  filieresDAOTest = new FilieresDAO();
		Filieres filieresTest = filieresDAOTest.deleteFiliere(1);
		assertEquals(1,filieresTest.getCode_filiere());
	}

}
