package business;


import java.util.List;

import javax.ejb.Local;
import beans.Bible;

@Local
public interface BibleBusinessInterface {
	public Bible findFirst(String find);
	public Bible getBible();
	

}
