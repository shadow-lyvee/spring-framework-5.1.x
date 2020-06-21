package com.shadow;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
@Slf4j
public class MyWebApplicationInitializer implements WebApplicationInitializer {
	/**
	 *
	 * 新垣结衣
	 * 博多
	 * 乔碧萝
	 */
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("-------------------");
		AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
		ac.register(App.class);
		ac.refresh();

		// Create and register the DispatcherServlet
		DispatcherServlet servlet = new DispatcherServlet(ac);
		ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
		registration.setLoadOnStartup(1);
		registration.addMapping("*.do");
	}
}
