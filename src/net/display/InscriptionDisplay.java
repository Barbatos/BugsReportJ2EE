package net.display;

import javax.servlet.http.HttpServletRequest;

import net.ko.controller.KObjectController;
import net.ko.displays.KObjectDisplay;
import net.ko.http.views.KFieldControl;
import net.ko.kobject.KObject;

public class InscriptionDisplay extends KObjectDisplay {

	@Override
	public KFieldControl getControl(KObject ko, String memberName, KObjectController koc, HttpServletRequest request) {
		KFieldControl fc = super.getControl(ko, memberName, koc, request);
		if("login".equals(memberName))
			koc.getFieldController(memberName).setValidateMethodName("validateLogin");
		return fc;
	}
}
