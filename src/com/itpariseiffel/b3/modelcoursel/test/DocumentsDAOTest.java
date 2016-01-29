package com.itpariseiffel.b3.modelcoursel.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.itpariseiffel.b3.modelcoursel.beans.Documents;
import com.itpariseiffel.b3.modelcoursel.dao.DocumentsDAO;

public class DocumentsDAOTest {


	@Test
	public void testGetDocuments()throws SQLException {
		DocumentsDAO  documentsDAOTest = new DocumentsDAO();
		Documents documentsTest = documentsDAOTest.getDocuments(1);
		assertEquals(1,documentsTest.getNumero_document());
	}

	@Test
	public void testGetDocumentsAll() throws SQLException {
		DocumentsDAO documentsDAOTest = new DocumentsDAO();
		documentsDAOTest.getDocumentsAll();
	}

	@Test
	public void testInsertDocuments() throws SQLException {
		Documents documents_new = new Documents(10,"");
		DocumentsDAO documentsTest = new DocumentsDAO();
		int result = documentsTest.insertDocuments(documents_new);
		assertEquals(1,result);
	}

	@Test
	public void testUpdateDocuments() {
		
	}

	@Test
	public void testDeleteDocuments() throws SQLException {
		DocumentsDAO  documentsDAOTest = new DocumentsDAO();
		Documents documentsTest = documentsDAOTest.deleteDocuments(1);
		assertEquals(1,documentsTest.getNumero_document());
	}

}
