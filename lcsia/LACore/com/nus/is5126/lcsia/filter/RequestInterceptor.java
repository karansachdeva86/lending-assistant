/*


 *  
 *  @version     1.0, May 21, 2012
 *  @author Karan
 */
package com.nus.is5126.lcsia.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class RequestInterceptor extends HandlerInterceptorAdapter {

    private static Log logger = LogFactory.getLog(RequestInterceptor.class);

    /**
     * In this case intercept the request BEFORE it reaches the controller
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        try {
           
            response.addHeader("X-XSS-Protection", "0");
            logger.info("xss filter is off");
//            logger.info("Intercepting: " + request.getRequestURI());
//            response.addHeader("X-UA-Compatible", "IE=8");
//
//            if (!request.getRequestURI().contains("login")) {
//                HttpSession session = request.getSession();
//
//                //check if userInfo exist in session
//                UserDto userDto = (UserDto) session.getAttribute("user");
//                if (userDto == null) {
//                    response.sendRedirect("/cTrac/login");
//                    return false;
//                }
//            }
            return true;
        } catch (SystemException e) {
            logger.info("Could not intercept request...");
            return false;
        }
    }

    /** This could be any exception */
    private class SystemException extends RuntimeException {

        private static final long serialVersionUID = 1L;
        // Blank
    }
}
