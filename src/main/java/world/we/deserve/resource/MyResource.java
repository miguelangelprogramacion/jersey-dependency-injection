package world.we.deserve.resource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import world.we.deserve.service.IServiceBO;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

	@Inject IServiceBO iServiceBO;
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
    	System.out.println(iServiceBO);
//    	System.out.println("Session "+iServiceBO.getHttpSession());
    	System.out.println(iServiceBO.getValue());
        return iServiceBO.getValue();
    }
}
