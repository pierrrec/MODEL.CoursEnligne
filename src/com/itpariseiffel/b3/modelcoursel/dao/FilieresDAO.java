package com.itpariseiffel.b3.modelcoursel.dao;

import java.sql.*;
import java.util.ArrayList;

import com.itpariseiffel.b3.modelcoursel.beans.*;
import com.itpariseiffel.b3.modelcoursel.connection.*;
import com.itpariseiffel.b3.modelcoursel.common.*;

public class FilieresDAO {

	/**
	 * Attributes
	 */
	private Connection connection;
	private Statement statement;

	/**
	 * Constructor
	 */
	
	public FilieresDAO(){
		
	}
	
	/**
	 * Retrieves a Filiere from the database and then creates a Filiere object
	 * to represent it
	 * 
	 * @param filiereId
	 *            The identifying number of the filiere to retrieve from the
	 *            database
	 * @return A Filiere object with all its attributes from the database
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	
	public Filieres getFiliere(int filiereId) throws SQLException {
		String query = SQLQueries.GET_FILIERES_QUERY + filiereId;
		ResultSet rs = null;
		Filieres filiere = null;
		try {
			connection = Connector.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			if (rs.next()) {
				filiere = new Filieres();
				filiere.setCode_filiere(rs.getInt("code_filiere"));
				filiere.setNom_filiere(rs.getString("nom_filiere"));
			}
		} finally {
			if (statement != null)
				statement.close();
			if (rs != null)
				rs.close();
			connection.close();
		}
		return filiere;
	}

	/**
	 * Retrieves all Filieres from the database and then puts them all in a list
	 * 
	 * @return A list of Filieres objects with all their attributes from the
	 *         database
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	public ArrayList<Filieres> getFilieresAll() throws SQLException {
		String query = SQLQueries.GET_FILIERES_ALL_QUERY;
		ResultSet rs = null;
		ArrayList<Filieres> filieresAll = new ArrayList<Filieres>();
		try {
			connection = Connector.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				Filieres filiere = new Filieres();
				filiere.setCode_filiere(rs.getInt("code_filiere"));
				filiere.setNom_filiere(rs.getString("nom_filiere"));
				filieresAll.add(filiere);
			}
		} finally {
			if (statement != null)
				statement.close();
			if (rs != null)
				rs.close();
			connection.close();
		}
		return filieresAll;
	}

	/**
	 * Inserts a new Filiere into the database
	 * 
	 * @param filiere_new
	 *            The filiere to add to the database
	 * @return 
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	public int insertFiliere(Filieres filiere_new) throws SQLException {
		int nbrInsert = 0;
		PreparedStatement req = null;
		String query = SQLQueries.INSERT_FILIERES_QUERY;
		try {
			connection = Connector.getConnection();
			req = connection.prepareStatement(query);
			req.setInt(1, filiere_new.getCode_filiere());
			req.setString(2, filiere_new.getNom_filiere());
			nbrInsert = statement.executeUpdate(query);
			System.out.println("Filière ajoutée.");
		} finally {
			if (req != null)
				req.close();
			connection.close();
			nbrInsert = 0;
		}
		return nbrInsert;
	}

	/**
	 * Updates a Filiere already in the database
	 * 
	 * @param filiere_modifiee
	 *            The updated Filiere to send to the database
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	public void updateFiliere(Filieres filiere_modifiee) throws SQLException {
		PreparedStatement req;
		String query = SQLQueries.UPDATE_FILIERES_QUERY + filiere_modifiee.getCode_filiere();
		try {
			connection = Connector.getConnection();
			req = connection.prepareStatement(query);
			req.setString(1, filiere_modifiee.getNom_filiere());
			statement.executeUpdate(query);
			System.out.println("Filière modifiée.");
		} finally {
			if (statement != null)
				statement.close();
			connection.close();
		}
	}

	/**
	 * Deletes a Filiere from the database
	 * 
	 * @param FiliereId
	 *            The identifying number of the Filiere to delete
	 * @return 
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	public Filieres deleteFiliere(int filiereId) throws SQLException {
		String query = SQLQueries.DELETE_FILIERES_QUERY + filiereId;
		ResultSet rs = null;
		Filieres filieres = null;
		try {
			connection = Connector.getConnection();
			statement = connection.createStatement();
			rs = statement.executeUpdate(query);
			System.out.println("Filière supprimée.");
		} finally {
			if (statement != null)
				statement.close();
			if (rs != null)
				rs.close();
			connection.close();
		}
		return filieres;
	}
	
}
