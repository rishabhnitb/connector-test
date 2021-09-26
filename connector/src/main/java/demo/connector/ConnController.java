package demo.connector;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/conn")
public class ConnController {

	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String testConn() {
		
		return "working fine!..";
	}
}
