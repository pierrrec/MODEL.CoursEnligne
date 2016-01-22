package com.itpariseiffel.b3.modelcoursel.beans;

public class Documents {
	
	private int numero_document;
	private String titre_document;
	
	/***
	 * Default constructor
	 */
	
	public Documents(){
		
	}
	
	/**Constructor with parameters
	 * 
	 * @param numero_document
	 * @param titre_document
	 */

	public Documents(int numero_document, String titre_document) {
		super();
		this.numero_document = numero_document;
		this.titre_document = titre_document;
	}

	/**
	 * @return the numero_document
	 */
	public int getNumero_document() {
		return numero_document;
	}

	/**
	 * @param numero_document
	 * 						the numero_document to set
	 */
	public void setNumero_document(int numero_document) {
		this.numero_document = numero_document;
	}

	/**
	 * @return the titre_document
	 */
	public String getTitre_document() {
		return titre_document;
	}

	/**
	 * @param titre_document
	 * 						the titre_document to set
	 */
	public void setTitre_document(String titre_document) {
		this.titre_document = titre_document;
	}
	
	

}
