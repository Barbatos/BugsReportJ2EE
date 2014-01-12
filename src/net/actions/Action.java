package net.actions;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import net.bo.KUtilisateur;
import net.ko.framework.KoSession;
import net.ko.http.objects.KRequest;
import net.ko.http.servlets.KSAction;
import net.ko.utils.KString;
import net.technics.Utils;

@WebServlet("/Action.act")
public class Action extends KSAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void createUtilisateur() throws ServletException, IOException{
		String password = KRequest.GETPOST("password", request);
		String login 	= KRequest.GETPOST("login", request);
		
		if(KString.isNotNull(password) && KString.isNotNull(login) && KRequest.isPost(request)){
			KUtilisateur utilisateur = new KUtilisateur();
			
			utilisateur.setPassword(password);
			utilisateur.setLogin(login);
			KoSession.add(utilisateur);
			
			session.setAttribute("idUtilisateur", utilisateur.getId());
			out.print("<div class='infoUpdateMessage'>Utilisateur ["+utilisateur+"] créé</div>");
		}
		else {
			KRequest.forward("/fConnexion.do", request, response, "_ajx=true");
		}
	}
	
	public void exit() throws ServletException, IOException{
		session.invalidate();
        KRequest.forward("/index.do", request, response);
	}
}
