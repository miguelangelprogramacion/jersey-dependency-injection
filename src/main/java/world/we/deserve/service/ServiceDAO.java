/**
 * 
 */
package world.we.deserve.service;

/**
 * @author Miguel Ángel Fernández Fernández
 *
 */
public class ServiceDAO implements IServiceDAO {

	private String value;

	public ServiceDAO(String value) {
		super();
		this.value = value;
	}
	
	public ServiceDAO() {
		super();
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
