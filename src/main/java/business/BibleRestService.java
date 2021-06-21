package business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import beans.Bible;

@RequestScoped
@Path("/bible")

public class BibleRestService {

	@Inject
	BibleBusinessInterface service;
	
	@GET
	@Path("/getjson")
	@Produces(MediaType.APPLICATION_JSON)
	public Bible getBibleAsJson()
	{
		return service.getBible();
	}
	@GET
	@Path("/getxml")
	@Produces(MediaType.APPLICATION_XML)
	public  Bible getBibleAsXml()
	{
		Bible b = new Bible();
		b = service.getBible();
		System.out.println("OrderRestService: " + b.getBook());
		return service.getBible();
	}

	
	
}
