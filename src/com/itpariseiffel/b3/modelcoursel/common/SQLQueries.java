package com.itpariseiffel.b3.modelcoursel.common;

public class SQLQueries {
	
	/**
	 * SQL Queries of table COURS
	 */
	
	public static final String GET_COURS_QUERY = "SELECT * FROM Cours WHERE code_cours= ";
	public static final String GET_COURS_ALL_QUERY = "SELECT * FROM Cours";
	public static final String INSERT_COURS_QUERY = "INSERT INTO Cours values (?,?,?,?,?)";
	public static final String UPDATE_COURS_QUERY = "UPDATE Cours SET num_prof=?, titre_cours=?, numero_document=?, code_filiere=? WHERE code_cours=";
	public static final String DELETE_COURS_QUERY = "DELETE FROM Cours WHERE code_cours=";
	
	/**
	 *  SQL QUeries of table DOCUMENTS
	 */

	public static final String GET_DOCUMENTS_QUERY = "SELECT * FROM Documents WHERE numero_document=";
	public static final String GET_DOCUMENTS_ALL_QUERY = "SELECT * FROM Documents";
	public static final String INSERT_DOCUMENTS_QUERY = "INSERT INTO Documents values (?,?)";
	public static final String UPDATE_DOCUMENTS_QUERY = "UPDATE Documents SET titre_document=? WHERE numero_document=";
	public static final String DELETE_DOCUMENTS_QUERY = "DELETE FROM Documents WHERE numero_document=";
	
	/**
	 * SQL Queries of table ETUDIANTS
	 */

	public static final String GET_ETUDIANTS_QUERY = "SELECT * FROM Etudiants WHERE numero_etudiant=";
	public static final String GET_ETUDIANTS_ALL_QUERY = "SELECT * FROM Etudiants";
	public static final String INSERT_ETUDIANTS_QUERY = "INSERT INTO Etudiants values (?,?,?,?,?,?,?)";
	public static final String UPDATE_ETUDIANTS_QUERY = "UPDATE Etudiants SET code_filiere=?, nom_etudiant=?,"
	+ "prenom_etudiant=?, tel_etudiant=?, nationalite_etudiant=?, adresse_etudiant=? WHERE numero_etudiant=";
	public static final String DELETE_ETUDIANTS_QUERY = "DELETE FROM Etudiants WHERE numero_etudiant=";

	/**
	 * SQL Queries of table FILIERES
	 */
	
	public static final String GET_FILIERES_QUERY = "SELECT * FROM Filieres WHERE code_filiere=";
	public static final String GET_FILIERES_ALL_QUERY = "SELECT * FROM Filieres";
	public static final String INSERT_FILIERES_QUERY = "INSERT INTO Filiere values (?,?)";
	public static final String UPDATE_FILIERES_QUERY = "UPDATE Filieres SET nom_filiere=? WHERE code_filiere=";
	public static final String DELETE_FILIERES_QUERY = "DELETE FROM Filieres WHERE code_filiere=";
	
	/**
	 * SQL Queries of table PROFESSEURS
	 */
	
	public static final String GET_PROFESSEURS_QUERY = "SELECT * FROM Professeurs WHERE num_prof=";
	public static final String GET_PROFESSEURS_ALL_QUERY = "SELECT * FROM Professeurs";
	public static final String INSERT_PROFESSEURS_QUERY = "INSERT INTO Professeurs values (?,?,?,?,?)";
	public static final String UPDATE_PROFESSEURS_QUERY = "UPDATE Professeurs SET nom_prof=?, prenom_prof=?,"
			+ "tel_prof=?, adresse_prof=? WHERE num_prof=";
	public static final String DELETE_PROFESSEURS_QUERY = "DELETE FROM Professeurs WHERE num_prof=";

}
