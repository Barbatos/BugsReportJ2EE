package net.technics;

import javax.servlet.http.HttpServletRequest;

import net.bo.KUtilisateur;
import net.bo.KModule;
import net.ko.framework.KoSession;
import net.ko.kobject.KListObject;

public class Utils {
	
	public static KUtilisateur getUtilisateur(HttpServletRequest request){
		KUtilisateur utilisateur = null;
		String idUtilisateur = getIdUtilisateur(request);
		if(idUtilisateur != null)
			utilisateur = KoSession.kloadOne(KUtilisateur.class, "id="+idUtilisateur);
		return utilisateur;
	}
	
	public static String getIdUtilisateur(HttpServletRequest request){
		Object result = request.getSession().getAttribute("idUtilisateur");
		System.out.println("deeeeeeeeerp");
		if(result != null)
			return result+"";
		else
			return null;
	}
	
	@SuppressWarnings("unchecked")
	public static KListObject<KModule> getModules(HttpServletRequest request){
		return (KListObject<KModule>) request.getServletContext().getAttribute("modules");
	}
}
