package fr.afpa.panier.services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import fr.afpa.panier.beans.BlocFiltre;
import fr.afpa.panier.beans.LigneFiltre;
import fr.afpa.panier.dao.impl.CouleurDAO;
import fr.afpa.panier.dao.impl.FamilleDAO;
import fr.afpa.panier.dao.impl.MarqueDAO;
import fr.afpa.panier.dao.impl.SousFamilleDAO;
import fr.afpa.panier.dao.pojo.Couleur;
import fr.afpa.panier.dao.pojo.Famille;
import fr.afpa.panier.dao.pojo.Marque;
import fr.afpa.panier.dao.pojo.SousFamille;

/**
 * Classe regroupant les 3 filtres : famille, ss-famille, marque et qui les
 * remplit de lignes de filtres
 * 
 * @author HP
 *
 */

public class ServiceFiltre implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// attribut liste de blocs filtres static car on a qu'une seule liste de bloc
	private static List<BlocFiltre> listBlocFiltre = new ArrayList<BlocFiltre>();	// il faut instancier sinon nullpointerexcep

	// on est en static => pas de constructeur
	

	// methode qui initialise la liste de blocs composes des listes de lignes dans
	// les blocs
	public static void init() {
		
		//si je n'ai pas de blocs => j'ajoute les blocs
		//ou je remets ma liste a�vide et j'ajoute les blocs sinon l'affichage se double a� chaque actualisation de la page
		listBlocFiltre = new ArrayList<BlocFiltre>();
		
		// prépa du bloc filtre
		BlocFiltre blocFiltre1 = new BlocFiltre("Famille");

		// remplir le bloc avec les lignes de filtres
		// on instancie objet DAO pour utiliser la méthode findAll()
		FamilleDAO familleDAO = new FamilleDAO();

		// on recup la vraie liste des familles dans une liste
		List<Famille> listeFamille = familleDAO.findAll();

		// ajout des lignes dans le bloc filtre
		// pour chaque famille de la liste, je la met dans un objet ligneFamille et
		// l'ajoute à mon bloc

		for (Famille famille : listeFamille) {

			LigneFiltre ligneFamille = new LigneFiltre(famille.getId(), famille.getIntitule(), false);

			blocFiltre1.add(ligneFamille);

		}

		// on ajoute le bloc1 pret à la liste de bloc
		listBlocFiltre.add(blocFiltre1);

		
		// prépa du bloc filtre2
		BlocFiltre blocFiltre2 = new BlocFiltre("Sous-Famille");

		// remplir le bloc avec les lignes de filtres
		// on instancie objet DAO pour utiliser la méthode findAll()
		SousFamilleDAO ssFamDAO = new SousFamilleDAO();

		// on recup la vraie liste des ssfamilles dans une liste
		List<SousFamille> listeSSFam = ssFamDAO.findAll();

		// ajout des lignes dans le bloc filtre pour chaque ssfamille de la liste, je la
		// met dans un objet ligneSSFamille et l'ajoute à mon bloc

		for (SousFamille ssFam : listeSSFam) {

			LigneFiltre ligneSSFamille = new LigneFiltre(ssFam.getId(), ssFam.getIntitule_ssFamille(), false);

			blocFiltre2.add(ligneSSFamille);

		}

		// on ajoute le bloc2 pret à la liste de bloc
		listBlocFiltre.add(blocFiltre2);

		
		// prépa du bloc filtre3
		BlocFiltre blocFiltre3 = new BlocFiltre("Marque");

		// remplir le bloc avec les lignes de filtres
		// on instancie objet DAO pour utiliser la méthode findAll()
		MarqueDAO marqueDAO = new MarqueDAO();

		// on recup la vraie liste des marques dans une liste
		List<Marque> listeMarque = marqueDAO.findAll();

		// ajout des lignes dans le bloc filtre: pour chaque marque de la liste, je la
		// met dans un objet marque et l'ajoute à mon bloc

		for (Marque marque : listeMarque) {

			LigneFiltre ligneMarque = new LigneFiltre(marque.getId(), marque.getNomMarque(), false);

			blocFiltre3.add(ligneMarque);

		}

		// on ajoute le bloc3 pret à la liste de bloc
		listBlocFiltre.add(blocFiltre3);
		
		
		// prépa du bloc filtre4
				/*BlocFiltre blocFiltre4 = new BlocFiltre("Couleur");

				// remplir le bloc avec les lignes de filtres
				// on instancie objet DAO pour utiliser la méthode findAll()
				CouleurDAO couleurDAO = new CouleurDAO();

				// on recup la vraie liste des marques dans une liste
				List<Couleur> listeCouleur = couleurDAO.findAll();

				// ajout des lignes dans le bloc filtre: pour chaque marque de la liste, je la
				// met dans un objet couleur et l'ajoute à mon bloc

				for (Couleur couleur : listeCouleur) {

					LigneFiltre ligneCouleur = new LigneFiltre(couleur.getId(), couleur.getNomCouleur(), false);

					blocFiltre4.add(ligneCouleur);

				}

				// on ajoute le bloc3 pret à la liste de bloc
				
				listBlocFiltre.add(blocFiltre4);
*/
	}

	// méthode pour retourner la liste de blocs complète
	public static List<BlocFiltre> getListBlocFiltre() {
		return listBlocFiltre;
	}

}
