package controller;

import java.util.List;

import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.Bible;
import business.BibleBusinessService;

@ManagedBean
@ViewScoped 
@Stateless

public class FormController {
	
	
	@Inject
	BibleBusinessService service;
	
	public String First(Bible bible)
	{ 
		FacesContext context = FacesContext.getCurrentInstance();
		//put the user object into the POST request
		bible = context.getApplication().evaluateExpressionGet(context, "#{bible}", Bible.class);
		bible = service.findFirst(bible.getSearch());
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("bible", bible);
		System.out.println("FormController:  Bible: " + bible.getBook());
		if (bible.getVerse() == -1) { 
			return "FirstWordFail.xhtml"; }
		else {
		return "FirstWordResponse.xhtml"; }
	}

}
