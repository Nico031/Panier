package fr.afpa.panier.dao.pojo;

/**
 * SousFamille est la classe qui represente une sous-famille elastique
 * 
 * @version 1.0
 * @date 29 mars 2019
 * @author nico
 *
 */
public class SousFamille {

	/**
	 * id sousfam
	 */
	private int id;

	/**
	 * intitule de la sousfam
	 */
	private String intitule_ssFamille;

	/**
	 * Constructeur sans parametre
	 */

	public SousFamille() {

	}

	/**
	 * Constructeur avec l'intitule
	 */

	public SousFamille(String ssFam) {
		this.intitule_ssFamille = ssFam;

	}

	/**
	 * Constructeur avec id + intitule
	 */

	public SousFamille(int id, String ssFam) {
		this.id = id;
		this.intitule_ssFamille = ssFam;

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
	 * @return intitule_ssFamille
	 */
	public String getIntitule_ssFamille() {
		return intitule_ssFamille;
	}

	/**
	 * @param intitule_ssFamille the intitule_ssFamille to set
	 */
	public void setIntitule_ssFamille(String intitule_ssFamille) {
		this.intitule_ssFamille = intitule_ssFamille;
	}

	public String toString() {
		return this.id + " - " + this.intitule_ssFamille + " - ";

	}

}
