package com.hxqh.test;

import com.hxqh.AppConfig;
import com.hxqh.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Ocean lin on 2020/2/25.
 *
 * @author Ocean lin
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService1 = (UserService) context.getBean("userService");
		userService1.query();



	}
}
