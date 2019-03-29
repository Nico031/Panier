package fr.afpa.panier.dao.pojo;

import java.io.Serializable;

/**
 * Client est la classe qui represente un client
 * 
 * @version 1.0
 * @date 29 mars 2019
 * @author nico
 *
 */
public class Client implements Serializable {

	private static final long serialVersionUID = 7264858985910445091L;

	/**
	 * identifiant du client
	 */
	private String identifiant;

	/**
	 * mot de passe du client
	 * 
	 */
	private String password;

	/**
	 * Constructeur sans parametres
	 */

	public Client() {
		super();
	}

	/**
	 * Constructeur avec identifiant et mdp
	 *
	 */
	public Client(String ident, String mdp) {
		super();
		this.identifiant = ident;
		this.password = mdp;
	}

	/**
	 * Getter
	 * @return identifiant
	 */
	public String getIdentifiant() {
		return identifiant;
	}

	/**
	 * Setter : Mise a jour du client
	 * @param identifiant
	 */
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	/**
	 * Getter
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Setter : mise a jour du mot de passe
	 * 
	 * @param motDePasse
	 */
	public void setPassword(String motDePasse) {
		password = motDePasse;
	}

	/**
	 * methode pour verifier l'identite du client
	 * 
	 * @return
	 */
	public boolean validate() {

		if (this.identifiant.equals("lana") && this.password.equals("travail!")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Methode por afficher l'identifiant du client et son mot de passe
	 */
	public String toString() {
		return "Ident = " + this.getIdentifiant() + "  Pass = " + this.getPassword();
	}

}
