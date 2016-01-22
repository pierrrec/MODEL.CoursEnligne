package com.itpariseiffel.b3.modelcoursel.beans;

public class Filieres {

	private int code_filiere;
	private String nom_filiere;
	
	/**
	 * Default constructor
	 */
	
	public Filieres(){
		
	}
	
	/**Constructor with parameters
	 * 
	 * @param code_filiere
	 * @param nom_filiere
	 */

	public Filieres(int code_filiere, String nom_filiere) {
		super();
		this.code_filiere = code_filiere;
		this.nom_filiere = nom_filiere;
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
	 * @return the nom_filiere
	 */
	public String getNom_filiere() {
		return nom_filiere;
	}

	/**
	 * @param nom_filiere
	 * 						the nom_filiere to set
	 */
	public void setNom_filiere(String nom_filiere) {
		this.nom_filiere = nom_filiere;
	}
	
	
}

