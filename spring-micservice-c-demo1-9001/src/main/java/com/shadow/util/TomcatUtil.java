package com.shadow.util;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class TomcatUtil {
	public static void run() throws LifecycleException {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(9001);
		tomcat.addWebapp("/","d:\\zl");
		tomcat.start();
		tomcat.getServer().await();

	}
}
