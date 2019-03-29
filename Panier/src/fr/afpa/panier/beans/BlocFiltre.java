package fr.afpa.panier.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * BlocFiltre est la classe qui represente un conteneur de lignes de filtre
 * 
 * @version 1.0
 * @date 29 mars 2019
 * @author nico
 *
 */
public class BlocFiltre implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * nom du filtre
	 */
	private String libelle;

	/**
	 * liste de lignes de filtre
	 */
	private List<LigneFiltre> listLigneFiltre = new ArrayList(); // si on n'instancie pas => null pointer exception

	/**
	 * Constructeur avec le libelle
	 * 
	 * @param libelle
	 * 
	 */
	public BlocFiltre(String libelle) {
		super();
		this.libelle = libelle;
	}

	/**
	 * Constructeur
	 * 
	 * @param libelle
	 * @param listLigneFiltre
	 */
	public BlocFiltre(String libelle, List<LigneFiltre> listLigneFiltre) {
		super();
		this.libelle = libelle;
		this.listLigneFiltre = listLigneFiltre;
	}

	/**
	 * 
	 * @return libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * etter : mise a jour du libelle du filtre
	 * 
	 * @param libelle
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return this.libelle;
	}

	/**
	 * 
	 * @return listLigneFiltre
	 */
	public List<LigneFiltre> getListLigneFiltre() {
		return listLigneFiltre;
	}

	/**
	 * Setter : mise a jour des lignes de filtre
	 * 
	 * @param listLigneFiltre
	 */
	public void setListLigneFiltre(List<LigneFiltre> listLigneFiltre) {
		this.listLigneFiltre = listLigneFiltre;
	}

	/**
	 * methode pour ajouter des lignes filtre au bloc
	 * 
	 * @param listLF
	 */
	public void add(LigneFiltre listLF) {

		this.listLigneFiltre.add(listLF);

	}

}
