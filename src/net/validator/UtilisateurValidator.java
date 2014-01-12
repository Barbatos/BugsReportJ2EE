package net.validator;

import java.util.ArrayList;

import net.bo.KUtilisateur;
import net.ko.framework.KoSession;
import net.ko.kobject.KListObject;
import net.ko.utils.KString;
import net.ko.validation.KValidator;

public class UtilisateurValidator extends KValidator {
	private ArrayList<String> logins;
	
	public void validateLogin(){
		if(KString.isNotNull(getValue())){
			if(logins == null){
				
				logins = new ArrayList<>();
				KListObject<KUtilisateur> utilisateurs = KoSession.kloadMany(KUtilisateur.class);
				
				for(KUtilisateur utilisateur:utilisateurs)
					logins.add(utilisateur.getLogin());
			}
			
			setOnError(logins.indexOf(getValue())!=-1);
		}
	}
	
	@Override
	protected void onError(String fieldName) {
		if("login".equals(fieldName))
			if(KString.isNotNull(getValue()))
				displayError("Le login [" + getValue() +"] n'est pas disponible");
	}

	@Override
	protected void onValid(String fieldName) {
		if("login".equals(fieldName))
			if(KString.isNotNull(getValue()))
				displayInfo("Le login [" + getValue() +"] est disponible");
	}

}
