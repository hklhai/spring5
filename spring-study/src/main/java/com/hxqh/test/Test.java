package com.hxqh.test;

import com.hxqh.AppConfig;
import com.hxqh.dao.Dao;
import com.hxqh.dao.IndexDao3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Ocean lin on 2020/2/25.
 *
 * @author Ocean lin
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		UserService userService1 = (UserService) context.getBean("userService");
//		userService1.query();

//		context.getBean(IndexDao3.class).query();

//		IndexDao indexDao = (IndexDao) context.getBean(IndexDao.class);
//		indexDao.query();


		Dao dao = (Dao) context.getBean("indexDao");
		dao.query();
	}
}
