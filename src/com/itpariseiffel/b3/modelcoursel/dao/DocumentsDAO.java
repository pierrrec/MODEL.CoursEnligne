package com.itpariseiffel.b3.modelcoursel.dao;

import java.sql.*;
import java.util.ArrayList;

import com.itpariseiffel.b3.modelcoursel.beans.*;
import com.itpariseiffel.b3.modelcoursel.connection.*;
import com.itpariseiffel.b3.modelcoursel.common.*;

public class DocumentsDAO {

	/**
	 * Attributes
	 */
	
	private Connection connection;
	private Statement statement;
	
	/**
	 * Contructor
	 */
	
	public DocumentsDAO() {
		
	}
	/**
	 * Retrieves a Document from the database and then creates a Document object
	 * to represent it
	 * 
	 * @param numero_document
	 *            The identifying number of the Document to retrieve from the
	 *            database
	 * @return A Document object with all its attributes from the database
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	
	public Documents getDocuments(int documentId) throws SQLException {
		String query = SQLQueries.GET_DOCUMENTS_QUERY + documentId;
		ResultSet rs = null;
		Documents documents = null;
		try {
			connection = Connector.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			if (rs.next()) {
				documents = new Documents();
				documents.setNumero_document(rs.getInt("numero_document"));
				documents.setTitre_document(rs.getString("titre_document"));
			}
		} finally {
			if (statement != null)
				statement.close();
			if (rs != null)
				rs.close();
			connection.close();
		}
		return documents;
	}
	
	/**
	 * Retrieves all Documents from the database and then puts them all in a list
	 * 
	 * @return A list of Documents objects with all their attributes from the
	 *         database
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	public ArrayList<Documents> getDocumentsAll() throws SQLException {
		String query = SQLQueries.GET_DOCUMENTS_ALL_QUERY;
		ResultSet rs = null;
		ArrayList<Documents> documentsAll = new ArrayList<Documents>();
		try {
			connection = Connector.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				Documents documents = new Documents();
				documents.setNumero_document(rs.getInt("numero_document"));
				documents.setTitre_document(rs.getString("titre_document"));
				documentsAll.add(documents);
			}
		} finally {
			if (statement != null)
				statement.close();
			if (rs != null)
				rs.close();
			connection.close();
		}
		return documentsAll;
	}

	/**
	 * Inserts a new Document into the database
	 * 
	 * @param document
	 *            The document to add to the database
	 * @return 
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	public int insertDocuments(Documents documents) throws SQLException {
		int nbrInsert = 0;
		PreparedStatement req = null;
		String query = SQLQueries.INSERT_DOCUMENTS_QUERY;
		try {
			connection = Connector.getConnection();
			req = connection.prepareStatement(query);
			req.setInt(1, documents.getNumero_document());
			req.setString(2, documents.getTitre_document());
			nbrInsert = statement.executeUpdate(query);
			System.out.println("Document ajouté.");
		} finally {
			if (req != null)
				req.close();
			connection.close();
			nbrInsert = 0;
		}
		return nbrInsert;
	}

	/**
	 * Updates a Document already in the database
	 * 
	 * @param document
	 *            The updated document to send to the database
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	public void updateDocuments(Documents document) throws SQLException {
		PreparedStatement req;
		String query = SQLQueries.UPDATE_DOCUMENTS_QUERY + document.getNumero_document();
		try {
			connection = Connector.getConnection();
			req = connection.prepareStatement(query);
			req.setInt(1, document.getNumero_document());
			req.setString(2, document.getTitre_document());
			statement.executeUpdate(query);
			System.out.println("Document modifié.");
		} finally {
			if (statement != null)
				statement.close();
			connection.close();
		}
	}

	/**
	 * Deletes a Document from the database
	 * 
	 * @param documentId
	 *            The identifying number of the document to delete
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	public Documents deleteDocuments(int documentId) throws SQLException {
		String query = SQLQueries.DELETE_DOCUMENTS_QUERY + documentId;
		ResultSet rs = null;
		Documents documents = null;
		try {
			connection = Connector.getConnection();
			statement = connection.createStatement();
			rs = statement.executeUpdate(query);
			if (rs.next()) {
				documents = new Documents();
				documents.setNumero_document(rs.getInt("numero_document"));
				System.out.println("document supprimé.");
			}
		} finally {
			if (statement != null)
				statement.close();
			if (rs != null)
				rs.close();
			connection.close();
		}
		return documents;
	}
	
	
}
