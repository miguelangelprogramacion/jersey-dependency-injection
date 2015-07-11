/**
 * 
 */
package world.we.deserve.service;

import org.jvnet.hk2.annotations.Service;

/**
 * @author Miguel Ángel Fernández Fernández
 *
 */
@Service
public class ServiceDAO implements IServiceDAO {

	private String value;

	public ServiceDAO() {
		super();
		this.value = "Value In DAO";
	}

	/* (non-Javadoc)
	 * @see org.ctic.eldercises.ws.rest.provider.IFoo#getValue()
	 */
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
