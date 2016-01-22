package com.itpariseiffel.b3.modelcoursel.beans;

public class Professeurs {

	private int num_prof;
	private String nom_prof;
	private String prenom_prof;
	private int tel_prof;
	private String adresse_prof;
	
	/**
	 * Default constructor
	 */
	public Professeurs(){
		
	}
	
	/*** Constructor with parameters
	 * 
	 * @param num_prof
	 * @param nom_prof
	 * @param prenom_prof
	 * @param tel_prof
	 * @param adresse_prof
	 */

	public Professeurs(int num_prof, String nom_prof, String prenom_prof, int tel_prof, String adresse_prof) {
		super();
		this.num_prof = num_prof;
		this.nom_prof = nom_prof;
		this.prenom_prof = prenom_prof;
		this.tel_prof = tel_prof;
		this.adresse_prof = adresse_prof;
	}

	/**
	 * @return the num_prof
	 */
	public int getNum_prof() {
		return num_prof;
	}

	/**
	 * @param num_prof the num_prof to set
	 */
	public void setNum_prof(int num_prof) {
		this.num_prof = num_prof;
	}

	/**
	 * @return the nom_prof
	 */
	public String getNom_prof() {
		return nom_prof;
	}

	/**
	 * @param nom_prof the nom_prof to set
	 */
	public void setNom_prof(String nom_prof) {
		this.nom_prof = nom_prof;
	}

	/**
	 * @return the prenom_prof
	 */
	public String getPrenom_prof() {
		return prenom_prof;
	}

	/**
	 * @param prenom_prof the prenom_prof to set
	 */
	public void setPrenom_prof(String prenom_prof) {
		this.prenom_prof = prenom_prof;
	}

	/**
	 * @return the tel_prof
	 */
	public int getTel_prof() {
		return tel_prof;
	}

	/**
	 * @param tel_prof the tel_prof to set
	 */
	public void setTel_prof(int tel_prof) {
		this.tel_prof = tel_prof;
	}

	/**
	 * @return the adresse_prof
	 */
	public String getAdresse_prof() {
		return adresse_prof;
	}

	/**
	 * @param adresse_prof the adresse_prof to set
	 */
	public void setAdresse_prof(String adresse_prof) {
		this.adresse_prof = adresse_prof;
	}
	
	
	
	
}
