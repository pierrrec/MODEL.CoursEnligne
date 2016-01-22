package com.itpariseiffel.b3.modelcoursel.beans;

public class Cours {

	private int code_cours;
	private int num_prof;
	private String titre_cours;
	private int numero_document;
	private int code_filiere;

	/**
	 * Default constructor
	 */
	public Cours(){
		
	}
	
	/**Constructor with parameters
	 * 
	 * @param code_cours
	 * @param num_prof
	 * @param titre_cours
	 * @param numero_document
	 * @param code_filiere
	 */
	
	public Cours(int code_cours, int num_prof, String titre_cours, int numero_document, int code_filiere) {
		super();
		this.code_cours = code_cours;
		this.num_prof = num_prof;
		this.titre_cours = titre_cours;
		this.numero_document = numero_document;
		this.code_filiere = code_filiere;
	}
	
	/**
	 * @return the code_filiere
	 */
	public int getCode_filiere() {
		return code_filiere;
	}

	/**
	 * @param code_filiere
	 * 			the code_filiere to set
	 */
	public void setCode_filiere(int code_filiere) {
		this.code_filiere = code_filiere;
	}

	/**
	 * @return the code_cours
	 */
	public int getCode_cours() {
		return code_cours;
	}
	/**
	 * @param code_cours
	 * 					the code_cours to set
	 */
	public void setCode_cours(int code_cours) {
		this.code_cours = code_cours;
	}
	/**
	 * @return the num_prof
	 */
	public int getNum_prof() {
		return num_prof;
	}
	/**
	 * @param num_prof
	 * 		the num_prof to set
	 */
	public void setNum_prof(int num_prof) {
		this.num_prof = num_prof;
	}
	/**
	 * @return the titre_cours
	 */
	public String getTitre_cours() {
		return titre_cours;
	}
	/**
	 * @param titre_cours
	 * 		the titre_cours to set
	 */
	public void setTitre_cours(String titre_cours) {
		this.titre_cours = titre_cours;
	}
	
	/**
	 * @return the numero_document
	 */
	public int getNumero_document(){
		return numero_document;
	}
	/**
	 * @param numero_document
	 * 		the numero_document to set
	 */
	public void setNumero_document(int numero_document){
		this.numero_document = numero_document;
	}

}
