/**
 * 
 */
package world.we.deserve.provider;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * @author Miguel Ángel Fernández Fernández
 *@ApplicationPath("webapi")
 **/
public class App  extends ResourceConfig {
	
	public App() {
        register(new ApplicationBinder());
        packages(true, "world.we.deserve");
    }

}