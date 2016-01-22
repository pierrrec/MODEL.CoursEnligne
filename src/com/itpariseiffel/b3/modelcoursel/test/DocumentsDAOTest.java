package com.itpariseiffel.b3.modelcoursel.test;

import com.itpariseiffel.b3.modelcoursel.dao.DocumentsDAO;
import com.itpariseiffel.b3.modelcoursel.beans.Documents;

public class DocumentsDAOTest {
	
	public void testGetDocuments() throws Exception {
		DocumentsDAO  documentsDAOTest = new DocumentsDAO();
		Documents documentsTest = documentsDAOTest.getDocuments(1);
		assertEquals(2,documentsTest.getNumero_document());
		}
	
	/**TO FINISH*/

	private void assertEquals(int i, int numero_document) {
		// TODO Auto-generated method stub
		
	}


}
