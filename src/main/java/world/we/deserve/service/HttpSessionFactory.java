/**
 * 
 */
package world.we.deserve.service;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.glassfish.hk2.api.Factory;

/**
 * @author Miguel Ángel Fernández Fernández
 *
 */
public class HttpSessionFactory implements Factory<HttpSession> {
 
    private final HttpServletRequest request;
 
    @Inject
    public HttpSessionFactory(HttpServletRequest request) {
        this.request = request;
    }
 
    @Override
    public HttpSession provide() {
       return request.getSession();
    }
 
    @Override
    public void dispose(HttpSession t) {
    }
}