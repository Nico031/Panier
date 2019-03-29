package fr.afpa.panier.beans;

import java.io.Serializable;

/**
 * LigneFilter est la classe qui represente une ligne de filtre
 * 
 * @version 1.0
 * @date 29 mars 2019
 * @author nico
 *
 */
public class LigneFiltre implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	private int id;

	/**
	 * intitule
	 */
	private String intitule;

	/**
	 * etat checked ou pas de la ligne
	 */
	private boolean checked;

	/**
	 * Constructeur ligne de filtre
	 * 
	 * @param id
	 * @param intitule
	 * @param checked
	 */
	public LigneFiltre(int id, String intitule, boolean checked) {
		super();
		this.id = id;
		this.intitule = intitule;
		this.checked = checked;
	}

	/**
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return intitule
	 */
	public String getIntitule() {
		return intitule;
	}

	/**
	 * Setter : mise a jour de la ligne de filtre
	 * 
	 * @param intitule
	 */
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	/**
	 * 
	 * @return checked
	 */
	public boolean isChecked() {
		return checked;
	}

	/**
	 * @param checked
	 */
	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	/**
	 * Methode qui verifie si la ligne est checked
	 * 
	 * @return
	 */
	public String getValueChecked() {

		if (checked == false) {
			return "";
		} else {
			return "checked";

		}
	}

	@Override
	public String toString() {
		return this.id + " - " + this.intitule + " - " + this.checked;
	}

}
