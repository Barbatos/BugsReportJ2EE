package net.display;

import javax.servlet.http.HttpServletRequest;

import net.ko.controller.KObjectController;
import net.ko.displays.KObjectDisplay;
import net.ko.http.objects.KRequest;
import net.ko.http.views.KFieldControl;
import net.ko.http.views.KHtmlFieldControl;
import net.ko.kobject.KObject;
import net.ko.types.HtmlControlType;

public class ConnexionDisplay extends KObjectDisplay {

	@Override
	public KFieldControl getControl(KObject ko, String memberName,
			KObjectController koc, HttpServletRequest request) {
		KHtmlFieldControl fc= (KHtmlFieldControl)super.getControl(ko, memberName, koc, request);
		if("login".equals(memberName)){
			fc=new KHtmlFieldControl("Login", "", "login", "login", HtmlControlType.khcText);
			fc.setOptions("style='width: 300px' placeholder='Entrer votre login'");
			fc.setRequired(true);
		}
		if("password".equals(memberName)){
			fc.setOptions("style='width: 300px' placeholder='Entrer votre mot de passe'");
			koc.getFieldController(memberName).setValidateMethodName("");
		}
		fc.setValue(KRequest.GETPOST(memberName, request, ""));
		return fc;
	}
}
