package com.itpariseiffel.b3.modelcoursel.dao;

import java.sql.*;
import java.util.ArrayList;

import com.itpariseiffel.b3.modelcoursel.beans.*;
import com.itpariseiffel.b3.modelcoursel.connection.*;
import com.itpariseiffel.b3.modelcoursel.common.*;

public class CoursDAO {

	/**
	 * Attributes
	 */
	private Connection connection;
	private Statement statement;

	/**
	 * Constructor
	 */
	
	public CoursDAO(){
		
	}
	
	/**
	 * Retrieves a Cours from the database and then creates a Cours object
	 * to represent it
	 * 
	 * @param code_cours
	 *            The identifying number of the Cours to retrieve from the
	 *            database
	 * @return A Cours object with all its attributes from the database
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	
	public Cours getCours(int code_cours) throws SQLException {
		String query = SQLQueries.GET_COURS_QUERY + code_cours;
		ResultSet rs = null;
		Cours cours = null;
		try {
			connection = Connector.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			if (rs.next()) {
				cours = new Cours();
				cours.setCode_cours(rs.getInt("code_cours"));
				cours.setNum_prof(rs.getInt("num_prof"));
				cours.setTitre_cours(rs.getString("titre_cours"));
				cours.setNumero_document(rs.getInt("numero_document"));
				cours.setCode_filiere(rs.getInt("code_filiere"));
			}
		} finally {
			if (statement != null)
				statement.close();
			if (rs != null)
				rs.close();
			connection.close();
		}
		return cours;
	}

	/**
	 * Retrieves all Cours from the database and then puts them all in a list
	 * 
	 * @return A list of Cours objects with all their attributes from the
	 *         database
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	public ArrayList<Cours> getCoursAll() throws SQLException {
		String query = SQLQueries.GET_COURS_ALL_QUERY;
		ResultSet rs = null;
		ArrayList<Cours> coursAll = new ArrayList<Cours>();
		try {
			connection = Connector.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				Cours cours = new Cours();
				cours.setCode_cours(rs.getInt("code_cours"));
				cours.setNum_prof(rs.getInt("num_prof"));
				cours.setTitre_cours(rs.getString("titre_cours"));
				cours.setNumero_document(rs.getInt("numero_document"));
				cours.setCode_filiere(rs.getInt("code_filiere"));
				coursAll.add(cours);
			}
		} finally {
			if (statement != null)
				statement.close();
			if (rs != null)
				rs.close();
			connection.close();
		}
		return coursAll;
	}

	/**
	 * Inserts a new Cours into the database
	 * 
	 * @param cours
	 *            The cours to add to the database
	 * @return 
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	public int insertCours(Cours cours) throws SQLException {
		int nbrInsert = 0;
		PreparedStatement req = null;
		String query = SQLQueries.INSERT_COURS_QUERY;
		try {
			connection = Connector.getConnection();
			req = connection.prepareStatement(query);
			req.setInt(1, cours.getCode_cours());
			req.setInt(2, cours.getNum_prof());
			req.setString(3, cours.getTitre_cours());
			req.setInt(4, cours.getNumero_document());
			req.setInt(5, cours.getCode_filiere());
			nbrInsert = statement.executeUpdate(query);
			System.out.println("Cours ajouté.");
		} finally {
			if (req != null)
				req.close();
			connection.close();
			nbrInsert = 0;
		}
		return nbrInsert;
	}

	/**
	 * Updates a Cours already in the database
	 * 
	 * @param cours
	 *            The updated cours to send to the database
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	public void updateCours(Cours cours) throws SQLException {
		PreparedStatement req;
		String query = SQLQueries.UPDATE_COURS_QUERY + cours.getCode_cours();
		try {
			connection = Connector.getConnection();
			req = connection.prepareStatement(query);
			req.setInt(1, cours.getNum_prof());
			req.setString(2, cours.getTitre_cours());
			req.setInt(3, cours.getNumero_document());
			req.setInt(3, cours.getCode_filiere());
			statement.executeUpdate(query);
			System.out.println("Cours modifié.");
		} finally {
			if (statement != null)
				statement.close();
			connection.close();
		}
	}

	/**
	 * Deletes a Cours from the database
	 * 
	 * @param coursId
	 *            The identifying number of the cours to delete
	 * @return 
	 * @throws SQLException
	 *             SQL Exception in case it didn't work properly
	 */
	public Cours deleteCours(int coursId) throws SQLException {
		String query = SQLQueries.DELETE_COURS_QUERY + coursId;
		ResultSet rs = null;
		Cours cours = null;
		try {
			connection = Connector.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			if (rs.next()) {
				cours = new Cours();
				cours.setCode_cours(rs.getInt("code_cours"));
				System.out.println("Cours supprimé.");
			}
		} finally {
			if (statement != null)
				statement.close();
			if (rs != null)
				rs.close();
			connection.close();
		}
		return cours;
	}
}
