package net.actions;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Globals;

import net.bo.KUtilisateur;
import net.ko.framework.KoSession;
import net.ko.http.objects.KRequest;
import net.ko.utils.KString;

@WebServlet(name = "Action", urlPatterns = { "*.act" })
public class Action extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Action() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Retourne l'action correspondant à la requête
	 * 
	 * @param request Requête
	 * @return action correspondante
	 */
	public String getAction(HttpServletRequest request) {
		String action = (String) request.getAttribute(Globals.DISPATCHER_REQUEST_PATH_ATTR);
		action = KString.getLastAfter(action, "/");
		action = action.replace(".act", "");
		return action;
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	/**
	 * Traitement des actions sur les vues à affichage limité
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF8");
		PrintWriter out = response.getWriter();
		String action = getAction(request);
		
		try {
			switch (action) {
			case "creerUtilisateur":
				creerUtilisateur(request, response, out);
				break;
				
			case "exit":
				exit(request, response);
				break;

			default:
				break;
			}
		} catch (Exception ex) {
		}
	}
	
	public void creerUtilisateur(HttpServletRequest request, HttpServletResponse response, PrintWriter out) throws ServletException, IOException {
		String password = KRequest.GETPOST("password", request);
		String login 	= KRequest.GETPOST("login", request);
		String email    = KRequest.GETPOST("mail", request);
		
		if(KString.isNotNull(password) && KString.isNotNull(login) && KString.isNotNull(email) && KRequest.isPost(request)){
			KUtilisateur utilisateur = new KUtilisateur();
			
			utilisateur.setPassword(password);
			utilisateur.setLogin(login);
			utilisateur.setIdGroupe(1);
			utilisateur.setMail(email);
			KoSession.add(utilisateur);
			
			request.getSession().setAttribute("idUtilisateur", utilisateur.getId());
			out.print("<div class='infoUpdateMessage'>Utilisateur ["+utilisateur+"] créé</div>");
		}
		else {
			KRequest.forward("/fConnexion.do", request, response, "_ajx=true");
		}
	}
	
	public void exit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().invalidate();
        KRequest.forward("/index.do", request, response);
	}
}
