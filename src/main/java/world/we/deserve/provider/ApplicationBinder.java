/**
 * 
 */
package world.we.deserve.provider;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

import world.we.deserve.service.IServiceBO;
import world.we.deserve.service.IServiceDAO;
import world.we.deserve.service.ServiceBO;
import world.we.deserve.service.ServiceDAO;

/**
 * @author Miguel Ángel Fernández Fernández
 *
 */
public class ApplicationBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(ServiceBO.class).to(IServiceBO.class);
        bind(new ServiceDAO("From DAO")).to(IServiceDAO.class);
    }
}