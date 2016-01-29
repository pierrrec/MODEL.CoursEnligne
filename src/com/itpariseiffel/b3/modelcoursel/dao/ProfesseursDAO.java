package com.itpariseiffel.b3.modelcoursel.dao;

import java.sql.*;
import java.util.ArrayList;

import com.itpariseiffel.b3.modelcoursel.beans.*;
import com.itpariseiffel.b3.modelcoursel.connection.*;
import com.itpariseiffel.b3.modelcoursel.common.*;

public class ProfesseursDAO {

	/**
	 * Attributes
	 */
	private Connection connection;
	private Statement statement;

	/**
	 * Constructor
	 */
	
	public ProfesseursDAO(){
		
	}
	
	/**
	 * Retrieves a Professeur from the database and then creates a Professeur object
	 * to represent it
	 * 
	 * @param professeurId
	 *            The identifying number of the Professeur to retrieve from the
	 *            database
	 * @return A Professeur object with all its attributes from the database
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	
	public Professeurs getProfesseur(int professeurId) throws SQLException {
		String query = SQLQueries.GET_PROFESSEURS_QUERY + professeurId;
		ResultSet rs = null;
		Professeurs professeur = null;
		try {
			connection = Connector.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			if (rs.next()) {
				professeur = new Professeurs();
				professeur.setNum_prof(rs.getInt("num_prof"));
				professeur.setNom_prof(rs.getString("nom_prof"));
				professeur.setPrenom_prof(rs.getString("prenom_prof"));
				professeur.setTel_prof(rs.getInt("tel_prof"));
				professeur.setAdresse_prof(rs.getString("adresse_prof"));
			}
		} finally {
			if (statement != null)
				statement.close();
			if (rs != null)
				rs.close();
			connection.close();
		}
		return professeur;
	}

	/**
	 * Retrieves all Professeurs from the database and then puts them all in a list
	 * 
	 * @return A list of Professeurs objects with all their attributes from the
	 *         database
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	public ArrayList<Professeurs> getProfesseursAll() throws SQLException {
		String query = SQLQueries.GET_PROFESSEURS_ALL_QUERY;
		ResultSet rs = null;
		ArrayList<Professeurs> professeursAll = new ArrayList<Professeurs>();
		try {
			connection = Connector.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				Professeurs professeur = new Professeurs();
				professeur.setNum_prof(rs.getInt("num_prof"));
				professeur.setNom_prof(rs.getString("nom_prof"));
				professeur.setPrenom_prof(rs.getString("prenom_prof"));
				professeur.setTel_prof(rs.getInt("tel_prof"));
				professeur.setAdresse_prof(rs.getString("adresse_prof"));
				professeursAll.add(professeur);
			}
		} finally {
			if (statement != null)
				statement.close();
			if (rs != null)
				rs.close();
			connection.close();
		}
		return professeursAll;
	}

	/**
	 * Inserts a new Professeur into the database
	 * 
	 * @param professeur_new
	 *            The Professeur to add to the database
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	public int insertProfesseur(Professeurs professeur_new) throws SQLException {
		int nbrInsert = 0;
		PreparedStatement req = null;
		String query = SQLQueries.INSERT_PROFESSEURS_QUERY;
		try {
			connection = Connector.getConnection();
			req = connection.prepareStatement(query);
			req.setInt(1, professeur_new.getNum_prof());
			req.setString(2, professeur_new.getNom_prof());
			req.setString(3, professeur_new.getPrenom_prof());
			req.setInt(4, professeur_new.getTel_prof());
			req.setString(5, professeur_new.getAdresse_prof());
			nbrInsert = statement.executeUpdate(query);
			System.out.println("Professeur ajouté.");
			
		} finally {
			if (req != null)
				req.close();
			connection.close();
			nbrInsert = 0;
		}
		return nbrInsert;
	}

	/**
	 * Updates a Professeur already in the database
	 * 
	 * @param professeur_modifiee
	 *            The updated Professeur to send to the database
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	public int updateProfesseur(Professeurs professeur_modifie) throws SQLException {
		int nbrInsert = 0;
		PreparedStatement req;
		String query = SQLQueries.UPDATE_PROFESSEURS_QUERY + professeur_modifie.getNum_prof();
		try {
			connection = Connector.getConnection();
			req = connection.prepareStatement(query);
			req.setString(1, professeur_modifie.getNom_prof());
			req.setString(2, professeur_modifie.getPrenom_prof());
			req.setInt(3, professeur_modifie.getTel_prof());
			req.setString(4, professeur_modifie.getAdresse_prof());
			nbrInsert = statement.executeUpdate(query);
			System.out.println("Professeur modifié.");
			
		} finally {
			if (statement != null)
				statement.close();
			connection.close();
			nbrInsert = 0;
		}
		return nbrInsert;
	}

	/**
	 * Deletes a Professeur from the database
	 * 
	 * @param ProfesseurId
	 *            The identifying number of the Professeur to delete
	 * @return 
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	public Professeurs deleteProfesseur(int ProfesseurId) throws SQLException {
		String query = SQLQueries.DELETE_PROFESSEURS_QUERY + ProfesseurId;
		ResultSet rs = null;
		Professeurs professeur = null;
		try {
			connection = Connector.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			if (rs.next()) {
				professeur = new Professeurs();
				professeur.setNum_prof(rs.getInt("num_prof"));
			}
		} finally {
			if (statement != null)
				statement.close();
			if (rs != null)
				rs.close();
			connection.close();
		}
		return professeur;
	}
}
