package net.actions;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.bo.KReport;
import net.bo.KUtilisateur;
import net.ko.framework.KoSession;
import net.ko.http.objects.KRequest;
import net.ko.utils.KString;

import org.apache.catalina.Globals;

@WebServlet(name = "Action", urlPatterns = { "*.act" })
public class Action extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private java.sql.Timestamp timestamp;
	
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
				
			case "creerReport":
				creerReport(request, response, out);
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
	
	public void creerReport(HttpServletRequest request, HttpServletResponse response, PrintWriter out) throws ServletException, IOException {
		
		
		String libelle = KRequest.GETPOST("libelle", request);
		String descriptif = KRequest.GETPOST("descriptif", request);
		String actualResults = KRequest.GETPOST("actualResults", request);
		String expectedResults = KRequest.GETPOST("expectedResults", request);
		String userAction = KRequest.GETPOST("userAction", request);
		java.sql.Date dateCreation = new java.sql.Date(System.currentTimeMillis());
		int idStatut = Integer.parseInt(KRequest.GETPOST("idStatut", request));
		int idUsecase = Integer.parseInt(KRequest.GETPOST("idUsecase", request));
		int idUtilisateur = 1;
		
		if(KString.isNotNull(libelle) && KString.isNotNull(descriptif) && KString.isNotNull(actualResults) && KString.isNotNull(userAction) && KRequest.isPost(request)){
			KReport report = new KReport();
			
			report.setLibelle(libelle);
			report.setDescriptif(descriptif);
			report.setActualResults(actualResults);
			report.setExpectedResults(expectedResults);
			report.setUserAction(userAction);
			report.setDateCreation(dateCreation);
			report.setIdStatut(idStatut);
			report.setIdUsecase(idUsecase);
			report.setIdUtilisateur(idUtilisateur);
			
			KoSession.add(report);
			
			request.getSession().setAttribute("libelle", report.getLibelle());
			out.print("<div class='infoUpdateMessage'>Report ["+report+"] créé</div>");
			KRequest.forward("/homeConnected.do", request, response, "_ajx=true");
		}
		
		else{
			KRequest.forward("/homeConnected.do", request, response, "_ajx=true");
		}
	}
	
	public void exit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().invalidate();
        KRequest.forward("/index.do", request, response);
	}
}
