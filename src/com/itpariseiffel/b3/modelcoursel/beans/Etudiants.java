package com.itpariseiffel.b3.modelcoursel.beans;

public class Etudiants {
	
	private int numero_etudiant;
	private int code_filiere;
	private String nom_etudiant;
	private String prenom_etudiant;
	private int tel_etudiant;
	private String nationalite_etudiant;
	private String adresse_etudiant;
	
	/**
	 * Default constructor
	 */

	public Etudiants(){
		
	}

	
	/**Constructor with parameters
	 * 
	 * @param numero_etudiant
	 * @param code_filiere
	 * @param nom_etudiant
	 * @param prenom_etudiant
	 * @param tel_etudiant
	 * @param nationalite_etudiant
	 * @param adresse_etudiant
	 */

	public Etudiants(int numero_etudiant, int code_filiere, String nom_etudiant, String prenom_etudiant,
			int tel_etudiant, String nationalite_etudiant, String adresse_etudiant) {
		super();
		this.numero_etudiant = numero_etudiant;
		this.code_filiere = code_filiere;
		this.nom_etudiant = nom_etudiant;
		this.prenom_etudiant = prenom_etudiant;
		this.tel_etudiant = tel_etudiant;
		this.nationalite_etudiant = nationalite_etudiant;
		this.adresse_etudiant = adresse_etudiant;
	}


	/**
	 * @return the numero_etudiant
	 */
	public int getNumero_etudiant() {
		return numero_etudiant;
	}


	/**
	 * @param numero_etudiant
	 * 							the numero_etudiant to set
	 */
	public void setNumero_etudiant(int numero_etudiant) {
		this.numero_etudiant = numero_etudiant;
	}


	/**
	 * @return the code_filiere
	 */
	public int getCode_filiere() {
		return code_filiere;
	}


	/**
	 * @param code_filiere
	 * 						the code_filiere to set
	 */
	public void setCode_filiere(int code_filiere) {
		this.code_filiere = code_filiere;
	}


	/**
	 * @return the nom_etudiant
	 */
	public String getNom_etudiant() {
		return nom_etudiant;
	}


	/**
	 * @param nom_etudiant
	 * 						the nom_etudiant to set
	 */
	public void setNom_etudiant(String nom_etudiant) {
		this.nom_etudiant = nom_etudiant;
	}


	/**
	 * @return the prenom_etudiant
	 */
	public String getPrenom_etudiant() {
		return prenom_etudiant;
	}


	/**
	 * @param prenom_etudiant
	 * 							the prenom_etudiant to set
	 */
	public void setPrenom_etudiant(String prenom_etudiant) {
		this.prenom_etudiant = prenom_etudiant;
	}


	/**
	 * @return the tel_etudiant
	 */
	public int getTel_etudiant() {
		return tel_etudiant;
	}


	/**
	 * @param tel_etudiant
	 * 						the tel_etudiant to set
	 */
	public void setTel_etudiant(int tel_etudiant) {
		this.tel_etudiant = tel_etudiant;
	}


	/**
	 * @return the nationalite_etudiant
	 */
	public String getNationalite_etudiant() {
		return nationalite_etudiant;
	}


	/**
	 * @param nationalite_etudiant
	 * 								the nationalite_etudiant to set
	 */
	public void setNationalite_etudiant(String nationalite_etudiant) {
		this.nationalite_etudiant = nationalite_etudiant;
	}


	/**
	 * @return the adresse_etudiant
	 */
	public String getAdresse_etudiant() {
		return adresse_etudiant;
	}


	/**
	 * @param adresse_etudiant
	 * 							the adresse_etudiant to set
	 */
	public void setAdresse_etudiant(String adresse_etudiant) {
		this.adresse_etudiant = adresse_etudiant;
	}	
	
	
	
	
}

