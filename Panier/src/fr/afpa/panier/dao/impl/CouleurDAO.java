package fr.afpa.panier.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.afpa.panier.dao.pojo.Couleur;
import fr.afpa.panier.dao2.ConnectBDD;
import fr.afpa.panier.dao2.DAO;

/**
 * 
 * @version 1.0
 * @date 29 mars 2019
 * @author nico
 *
 */

public class CouleurDAO implements DAO<Couleur> {

	@Override
	public Couleur create(Couleur obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Couleur delete(Couleur obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Couleur update(Couleur obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Couleur find(int id) {

		Couleur couleur = null;
		String requete = ("SELECT * FROM couleur WHERE id = " + id);

		try {

			// connexion a la bdd
			Statement stmt = ConnectBDD.getConnect().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);

			// execution de la requete
			ResultSet result = stmt.executeQuery(requete);

			// s'il y a un resultat, je cree l'objet couleur avec les donnees trouvees
			if (result.first()) {
				couleur = new Couleur(id, result.getString("nom_couleur"));

			}
			// puis fermeture de la connexion
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return couleur;

	}

	@Override
	public List<Couleur> findAll() {

		ArrayList<Couleur> listeCouleur = new ArrayList<Couleur>();

		String requete = "SELECT id FROM couleur ORDER BY id";

		try {

			// connexion a la BDD
			Statement stmt = ConnectBDD.getConnect().createStatement();

			// execution de la requete
			ResultSet result = stmt.executeQuery(requete);

			// tant que que le curseur peut aller a la ligne suivante de la table temporaire
			// issue du SELECT
			while (result.next()) {
				// j'ajoute a la liste mon objet obtenu via le find
				listeCouleur.add(this.find(result.getInt("id")));

			}
			// puis fermeture de la connexion
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listeCouleur;

	}

}