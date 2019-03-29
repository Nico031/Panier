package fr.afpa.panier.dao.pojo;

/**
 * Elastique est la classe qui represente un elastique : rencontre d'un produit
 * et d'une couleur
 * 
 * @version 1.0
 * @date 29 mars 2019
 * @author nico
 *
 */
public class Elastique extends Produit {

	/**
	 * stock
	 */
	private int stock;

	/**
	 * prix unitaire
	 */
	private float prix;

	/**
	 * couleur
	 */
	protected Couleur couleur;

	/**
	 * produit
	 */
	protected Produit produit;

	/**
	 * Constructeur elastique
	 * 
	 * @param prod
	 * @param couleur
	 * @param stck
	 * @param f
	 */
	public Elastique(Produit prod, Couleur couleur, int stck, float f) {

		this.produit = prod;
		this.couleur = couleur;
		this.stock = stck;
		this.prix = f;

	}

	/**
	 * Getter
	 * 
	 * @return stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * Setter : mise a jour du stock
	 * 
	 * @param stock
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	/**
	 * Getter
	 * 
	 * @return prix
	 */
	public float getPrix() {
		return prix;
	}

	/**
	 * Setter : mise a jour du prix unitaire
	 * 
	 * @param prix the prix to set
	 */
	public void setPrix(float prix) {
		this.prix = prix;
	}

	/**
	 * methode pour afficher l'intitule de l'elastique, sa couleur, son stock et son
	 * prix unitaire
	 */
	public String toString() {

		return this.produit.getIntituleProduit() + " - " + this.couleur.getNomCouleur() + " - " + this.stock + " - "
				+ this.prix;

	}

}
