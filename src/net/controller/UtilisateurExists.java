package net.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.ko.http.objects.KRequest;
import net.ko.mapping.IMappingControl;
import net.technics.Utils;

public class UtilisateurExists implements IMappingControl {

	@Override
	public boolean isValid(HttpServletRequest request, HttpServletResponse response) {
		return Utils.getIdUtilisateur(request) == null;
	}

	@Override
	public void onInvalidControl(HttpServletRequest request, HttpServletResponse response) {
		String idUtilisateur = Utils.getIdUtilisateur(request);
		
		try {
			KRequest.forward("/fInscription.do", request, response, "idUtilisateur="+idUtilisateur);
		} 
		catch (ServletException | IOException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public boolean beforeProcessAction(HttpServletRequest request, HttpServletResponse response) {
		return true;
	}

}

