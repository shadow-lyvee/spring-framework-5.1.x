package com.shadow.test;


import com.shadow.app.App;
import org.springframework.context.annotation.*;

public class Test {
	public static void main(String[] args) {

		/**
		 * web程序 入口----->tomcat--加载应用立马解析应用下面的web.xml--启动spring
		 */
		//初始化spring容器----90%会在程序入口 刚刚启动就要初始化spring容器
		//启动spring  帮你把所有的bean给实例化好
//		init（）{
//			ClassPathXmlApplicationContext
//					ac= new ClassPathXmlApplicationContext("applicationContext.xml");
//
//		}
//
//		ac.getBean("x");























//		Class<App> appClass = App.class;
//		Annotation[] annotations = appClass.getAnnotations();
//		StandardAnnotationMetadata standardAnnotationMetadata
//				= new StandardAnnotationMetadata(appClass);
//		MultiValueMap<String, Object> allAnnotationAttributes = standardAnnotationMetadata.getAllAnnotationAttributes(PropertySource.class.getName(), false);
//		for (String s : allAnnotationAttributes.keySet()) {
//			System.out.println(s);
//		}
//		System.out.println(annotations);






		AnnotationConfigApplicationContext ac=new
				AnnotationConfigApplicationContext(App.class);



	}
}
