package com.awesomeis.project.web;

import javax.servlet.ServletContext;

import org.springframework.web.servlet.resource.DefaultServletHttpRequestHandler;

public class DefaultServletHandler extends DefaultServletHttpRequestHandler {

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.resource.DefaultServletHttpRequestHandler#setServletContext(javax.servlet.ServletContext)
	 */
	@Override
	public void setServletContext(ServletContext servletContext) {
		try {
			super.setServletContext(servletContext);
		}
		catch(IllegalStateException ise) {
		    throw ise;
		}
	}	
}
