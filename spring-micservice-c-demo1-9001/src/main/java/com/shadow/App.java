package com.shadow;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.annotation.WebServlet;
import java.util.List;

@Configuration
@ComponentScan("com.shadow")
@EnableWebMvc
public class App implements WebMvcConfigurer {


	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		System.out.println("---------");
		converters.add(new FastJsonHttpMessageConverter());
	}
	//json
}
