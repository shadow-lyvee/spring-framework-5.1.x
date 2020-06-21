package com.shadow.services;

import com.shadow.services.impl.X;
import com.shadow.services.impl.Y;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
public class A {




	//	public A(){
//		System.out.println("default");
//	}


//	public A(X x){
//		System.out.println("x");
//		this.x=x;
//
//	}
//
//	public A(X x,Y y){
//		System.out.println("x y");
//		this.x=x;
//
//	}
//
//
//
//
	public void print(){

		//System.out.println(y);
	}
}
