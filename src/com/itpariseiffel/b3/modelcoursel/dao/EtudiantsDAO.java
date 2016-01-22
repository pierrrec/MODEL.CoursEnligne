package com.itpariseiffel.b3.modelcoursel.dao;

import java.sql.*;
import java.util.ArrayList;

import com.itpariseiffel.b3.modelcoursel.beans.*;
import com.itpariseiffel.b3.modelcoursel.connection.*;
import com.itpariseiffel.b3.modelcoursel.common.*;

public class EtudiantsDAO {

	/**
	 * Attributes
	 */
	private Connection connection;
	private Statement statement;

	/**
	 * Constructor
	 */
	
	public EtudiantsDAO(){
		
	}
	
	/**
	 * Retrieves an Etudiant from the database and then creates an Etudiant object
	 * to represent it
	 * 
	 * @param etudiantId
	 *            The identifying number of the etudiant to retrieve from the
	 *            database
	 * @return An Etudiant object with all its attributes from the database
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	
	public Etudiants getEtudiant(int etudiantId) throws SQLException {
		String query = SQLQueries.GET_ETUDIANTS_QUERY + etudiantId;
		ResultSet rs = null;
		Etudiants etudiant = null;
		try {
			connection = Connector.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			if (rs.next()) {
				etudiant = new Etudiants();
				etudiant.setNumero_etudiant(rs.getInt("numero_etudiant"));
				etudiant.setCode_filiere(rs.getInt("code_filiere"));
				etudiant.setNom_etudiant(rs.getString("nom_etudiant"));
				etudiant.setPrenom_etudiant(rs.getString("prenom_etudiant"));
				etudiant.setTel_etudiant(rs.getInt("tel_etudiant"));
				etudiant.setAdresse_etudiant(rs.getString("adresse_etudiant"));
			}
		} finally {
			if (statement != null)
				statement.close();
			if (rs != null)
				rs.close();
			connection.close();
		}
		return etudiant;
	}

	/**
	 * Retrieves all Etudiants from the database and then puts them all in a list
	 * 
	 * @return A list of Etudiants objects with all their attributes from the
	 *         database
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	public ArrayList<Etudiants> getEtudiantsAll() throws SQLException {
		String query = SQLQueries.GET_ETUDIANTS_ALL_QUERY;
		ResultSet rs = null;
		ArrayList<Etudiants> etudiantsAll = new ArrayList<Etudiants>();
		try {
			connection = Connector.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				Etudiants etudiant = new Etudiants();
				etudiant.setNumero_etudiant(rs.getInt("numero_etudiant"));
				etudiant.setCode_filiere(rs.getInt("code_filiere"));
				etudiant.setNom_etudiant(rs.getString("nom_etudiant"));
				etudiant.setPrenom_etudiant(rs.getString("prenom_etudiant"));
				etudiant.setTel_etudiant(rs.getInt("tel_etudiant"));
				etudiant.setAdresse_etudiant(rs.getString("adresse_etudiant"));
				etudiantsAll.add(etudiant);
			}
		} finally {
			if (statement != null)
				statement.close();
			if (rs != null)
				rs.close();
			connection.close();
		}
		return etudiantsAll;
	}

	/**
	 * Inserts a new Etudiant into the database
	 * 
	 * @param etudiant_new
	 *            The etudiant to add to the database
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	public void insertEtudiant(Etudiants etudiant_new) throws SQLException {
		PreparedStatement req = null;
		String query = SQLQueries.INSERT_ETUDIANTS_QUERY;
		try {
			connection = Connector.getConnection();
			req = connection.prepareStatement(query);
			req.setInt(1, etudiant_new.getNumero_etudiant());
			req.setInt(2, etudiant_new.getCode_filiere());
			req.setString(3, etudiant_new.getNom_etudiant());
			req.setString(4, etudiant_new.getPrenom_etudiant());
			req.setInt(5, etudiant_new.getTel_etudiant());
			req.setString(6, etudiant_new.getNationalite_etudiant());
			req.setString(7, etudiant_new.getAdresse_etudiant());
			statement.executeUpdate(query);
			System.out.println("Etudiant ajouté.");
		} finally {
			if (req != null)
				req.close();
			connection.close();
		}
	}

	/**
	 * Updates an Etudiant already in the database
	 * 
	 * @param etudiant_modifie
	 *            The updated Etudiant to send to the database
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	public void updateEtudiant(Etudiants etudiant_modifie) throws SQLException {
		PreparedStatement req;
		String query = SQLQueries.UPDATE_ETUDIANTS_QUERY + etudiant_modifie.getNumero_etudiant();
		try {
			connection = Connector.getConnection();
			req = connection.prepareStatement(query);
			req.setInt(1, etudiant_modifie.getCode_filiere());
			req.setString(2, etudiant_modifie.getNom_etudiant());
			req.setString(3, etudiant_modifie.getPrenom_etudiant());
			req.setInt(4, etudiant_modifie.getTel_etudiant());
			req.setString(5, etudiant_modifie.getNationalite_etudiant());
			req.setString(6, etudiant_modifie.getAdresse_etudiant());
			statement.executeUpdate(query);
			System.out.println("Etudiant modifié.");
		} finally {
			if (statement != null)
				statement.close();
			connection.close();
		}
	}

	/**
	 * Deletes an Etudiant from the database
	 * 
	 * @param EtudiantId
	 *            The identifying number of the etudiant to delete
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	public void deleteEtudiant(int etudiantId) throws SQLException {
		String query = SQLQueries.DELETE_ETUDIANTS_QUERY + etudiantId;
		try {
			connection = Connector.getConnection();
			statement = connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("Etudiant supprimé.");
		} finally {
			if (statement != null)
				statement.close();
			connection.close();
		}
	}
}
