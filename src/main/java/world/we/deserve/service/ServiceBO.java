/**
 * 
 */
package world.we.deserve.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.jvnet.hk2.annotations.Service;

/**
 * @author Miguel Ángel Fernández Fernández
 *
 */
@Service
public class ServiceBO implements IServiceBO {

	/* (non-Javadoc)
	 * @see world.we.deserve.service.IServiceBO#getValue()
	 */
//	@Override
//	public String getValue() {
//		return "fsfsdsfdf";
//	}
	
	@Inject
	private IServiceDAO foo;
	
//	@Inject
//	private  HttpSession httpSession;

//	public HttpSession getHttpSession() {
//		return httpSession;
//	}

	@Override
	public String getValue()
	{
		return foo.getValue();
	}

	public IServiceDAO getFoo() {
		return foo;
	}
}
