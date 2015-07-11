/**
 * 
 */
package world.we.deserve.service;

import javax.servlet.http.HttpSession;

import org.jvnet.hk2.annotations.Contract;

/**
 * @author Miguel Ángel Fernández Fernández
 *
 */
@Contract
public interface IServiceBO {

	/* (non-Javadoc)
	 * @see org.ctic.eldercises.bo.impl.IPlanDefinition#getValue()
	 */
	public abstract String getValue();
//	public abstract HttpSession getHttpSession();

}