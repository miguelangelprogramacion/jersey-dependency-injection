/**
 * 
 */
package world.we.deserve.service;

import javax.inject.Inject;

/**
 * @author Miguel Ángel Fernández Fernández
 *
 */
public class ServiceBO implements IServiceBO {
	
	@Inject
	private IServiceDAO foo;

	@Override
	public String getValue()
	{
		return foo.getValue();
	}

	public IServiceDAO getFoo() {
		return foo;
	}
}
