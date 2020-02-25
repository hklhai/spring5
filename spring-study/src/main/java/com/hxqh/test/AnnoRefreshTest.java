package com.hxqh.test;

import com.hxqh.AppConfig;
import com.hxqh.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Ocean lin on 2020/2/25.
 *
 * @author Ocean lin
 */
public class AnnoRefreshTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext(UserService.class);
		ctx1.register(UserService.class);
		ctx1.refresh();
		UserService userService3 = (UserService) ctx1.getBean("userService");
		userService3.query();

		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService4 = (UserService) ctx1.getBean("userService");
		userService4.query();

	}
}
