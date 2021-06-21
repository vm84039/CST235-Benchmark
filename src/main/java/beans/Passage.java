package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "bible")
@ViewScoped
@Stateless

public class Passage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public List<Bible> verses;
	
	public List<Bible> getVerse() {
		verses = new ArrayList<Bible>();
		return verses;		
	};

}



