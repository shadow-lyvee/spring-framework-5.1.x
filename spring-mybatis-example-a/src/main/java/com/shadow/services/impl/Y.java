package com.shadow.services.impl;

import com.shadow.services.I;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Y implements I {



	public Y(){
		System.out.println("create Y");
	}

	@Override
	public void m() {
	}

}
