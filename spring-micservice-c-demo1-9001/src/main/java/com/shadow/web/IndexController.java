package com.shadow.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {


	@RequestMapping("index")
	@ResponseBody
	public Map<String,Object> index(){
		Map<String,Object> map = new HashMap<>();
		map.put("suc","ok");
		return map;
	}

	@RequestMapping("register")
	public String register(){
		System.out.println("register");
		return "xxxx";
	}
}
