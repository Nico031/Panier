package fr.afpa.panier.dao.pojo;

/**
 * Couleur est la classe qui represente une couleur
 * 
 * @version 1.0
 * @date 29 mars 2019
 * @author nico
 *
 */
public class Couleur {

	/**
	 * id de la couleur
	 */
	private int idCouleur;

	/**
	 * nom de la couleur
	 */
	private String nomCouleur;

	/**
	 * Constructeur sans parametre
	 */
	public Couleur() {

	}

	/**
	 * Constructeur avec le nom de la couleur
	 * 
	 * @param couleur
	 */
	public Couleur(String couleur) {
		this.nomCouleur = couleur;
	}

	/**
	 * Constructeur avec id et nom de la couleur
	 * 
	 * @param id
	 * @param couleur
	 */
	public Couleur(int id, String couleur) {
		this.idCouleur = id;
		this.nomCouleur = couleur;
	}

	/**
	 * Getter
	 * 
	 * @return idCouleur
	 */
	public int getIdCouleur() {
		return idCouleur;
	}

	/**
	 * Setter : mis a jour de l'id
	 * 
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.idCouleur = id;
	}

	/**
	 * Getter
	 * 
	 * @return nomCouleur
	 */
	public String getNomCouleur() {
		return nomCouleur;
	}

	/**
	 * Setter : mise a our du nom de la couleur
	 * 
	 * @param nomCouleur
	 */
	public void setNomCouleur(String nomCouleur) {
		this.nomCouleur = nomCouleur;
	}

	/**
	 * methode pour afficher id et nom couleur
	 */
	public String toString() {
		return this.idCouleur + " - " + this.nomCouleur + " - ";
	}

}
