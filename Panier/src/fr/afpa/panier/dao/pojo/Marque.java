package fr.afpa.panier.dao.pojo;

/**
 * Marque est la classe qui represente une marque
 * 
 * @version 1.0
 * @date 29 mars 2019
 * @author nico
 *
 */
public class Marque {

	/**
	 * id marque
	 */
	private int id;

	/**
	 * nom de la marque
	 */
	private String nomMarque;

	/**
	 * Constructeur sans parametre
	 */
	public Marque() {

	}

	/**
	 * Constructeur avec le nom de la marque
	 */
	public Marque(String marque) {
		this.nomMarque = marque;

	}

	/**
	 * Constructeur avec id + nom de la marque
	 */
	public Marque(int id, String marque) {
		this.id = id;
		this.nomMarque = marque;

	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return nomMarque
	 */
	public String getNomMarque() {
		return nomMarque;
	}

	/**
	 * @param nomMarque the nomMarque to set
	 */
	public void setNomMarque(String nomMarque) {
		this.nomMarque = nomMarque;
	}

	public String toString() {
		return this.id + " - " + this.nomMarque + " - ";
	}
}
