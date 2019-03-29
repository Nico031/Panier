package fr.afpa.panier.commandes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import fr.afpa.panier.ICommande.ICommand;
import fr.afpa.panier.commun.IConstantes;
import fr.afpa.panier.logging.TestLogging;
import fr.afpa.panier.services.ServiceFiltre;

/**
 * InitCommande est la classe qui traite les requettes d'initialisation des
 * filtres
 * 
 * @version 1.0
 * @date 29 mars 2019
 * @author nico
 *
 */
public class InitCommande implements ICommand {
	
	private static Logger logger = Logger.getLogger(TestLogging.class);

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		logger.info("Je suis dans : " + this.getClass());

		// initialisation des blocFiltre et des lignes
		ServiceFiltre.init();

		// recup des listes dans la session
		request.getSession().setAttribute(IConstantes.CLEF_LISTE_FILTRE, ServiceFiltre.getListBlocFiltre());

		return (IConstantes.JSP_ROOT + "login_succes.jsp");
	}

}
