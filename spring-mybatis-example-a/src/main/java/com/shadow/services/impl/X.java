package com.shadow.services.impl;

import com.shadow.services.I;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;


public class X implements ApplicationContextAware, BeanNameAware, InitializingBean {

//	//属性注入
//	@Autowired
//	Z z;

	@Value("${jdbc.name}")
	private String name;

	public X(){
		System.out.println("x  default");
	}


	public String getName() {
		return name;
	}

	@PostConstruct
	public void initAnno(){
		System.out.println(" Lifecycle Callback init anno ");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("interface lifecycle callback");
	}




	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("applicationContextAware");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("BeanNameAware");
	}


}
