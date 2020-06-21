package com.shadow.util;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class SpringApplication {

	public static void run() throws LifecycleException {
		//启动tomcat.start();
		/**
		 * 1、猜测
		 * 2、boot源码
		 */
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8999);
		/**
		 * boot
		 * tocmat源码
		 */
		tomcat.addWebapp("/","d:\\zl");
		tomcat.start();
		tomcat.getServer().await();

	}
}
