/**
 * 
 */
package world.we.deserve.provider;

import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;

import org.glassfish.hk2.api.DynamicConfiguration;
import org.glassfish.hk2.api.DynamicConfigurationService;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.utilities.BuilderHelper;
import org.glassfish.jersey.server.ResourceConfig;

import world.we.deserve.service.IServiceBO;
import world.we.deserve.service.IServiceDAO;
import world.we.deserve.service.ServiceBO;
import world.we.deserve.service.ServiceDAO;

/**
 * @author Miguel Ángel Fernández Fernández
 * 
 **/
@ApplicationPath("/webapi")
public class ResourceConfigApp  extends ResourceConfig {
	//http://chat.stackoverflow.com/rooms/72743/discussion-between-dermoritz-and-peeskillet
	
	@Inject
    public ResourceConfigApp(ServiceLocator locator) {
		
		// Obtain the DynamicConfiguration object for binding a service to a contract.
 		DynamicConfigurationService dcs = locator.getService(DynamicConfigurationService.class);
 		DynamicConfiguration config = dcs.createDynamicConfiguration();
 		
 		config.bind(BuilderHelper.link(ServiceBO.class).to(IServiceBO.class).build());
 		config.bind(BuilderHelper.link(ServiceDAO.class).to(IServiceDAO.class).build());
 		
 		config.commit(); 		

        packages(true, "world.we.deserve;world.we.deserve.service");
    }
}