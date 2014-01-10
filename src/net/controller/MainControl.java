package net.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.ko.http.objects.KRequest;
import net.ko.mapping.IMappingControl;
import net.technics.Utils;

public class MainControl implements IMappingControl {

	@Override
	public boolean isValid(HttpServletRequest request,
			HttpServletResponse response) {
		return Utils.getIdUtilisateur(request) != null;
	}

	@Override
	public void onInvalidControl(HttpServletRequest request,
			HttpServletResponse response) {
		try {
			KRequest.forward("home.do", request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public boolean beforeProcessAction(HttpServletRequest request,
			HttpServletResponse response) {
		return true;
	}

}
