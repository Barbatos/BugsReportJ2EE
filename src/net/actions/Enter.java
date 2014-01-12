package net.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.bo.KUtilisateur;
import net.ko.framework.KoSession;
import net.ko.http.objects.KRequest;
import net.ko.http.servlets.KSAction;
import net.ko.utils.KString;

/**
 * Servlet implementation class Enter
 */
@WebServlet("/enter.act")
public class Enter extends KSAction{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Enter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		super.doGet(request, response);
		String login = KRequest.GETPOST("login", request);
		String password = KRequest.GETPOST("password", request);
		
		if(KString.isNotNull(password) && KString.isNotNull(login)){
			KUtilisateur utilisateur = KoSession.kloadOne(KUtilisateur.class, "password='"+password+"' and login='"+login+"'");
			
			if(utilisateur.isLoaded()){
				session.setAttribute("idUtilisateur", utilisateur.getId());
				KRequest.forward("/homeConnected.do", request, response);
				return;
			}
		}
		KRequest.forward("/fConnexionError.do", request, response,"errorMessage=Paramétres de connexion invalides&id=-1&_ajx=true","GET");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
