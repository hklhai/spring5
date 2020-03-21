package com.hxqh.test;

import com.hxqh.AppConfig;
import com.hxqh.dao.IndexDao;
import com.hxqh.imports.MyMethodCallBack;
import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Ocean lin on 2020/3/20.
 *
 * @author Ocean lin
 */
public class TestEnhance {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(IndexDao.class);
		enhancer.setUseFactory(false);
		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);

		enhancer.setCallback(new MyMethodCallBack());
		// enhancer.setCallbackFilter(CALLBACK_FILTER);
		IndexDao indexDao = (IndexDao) enhancer.create();
		indexDao.query();

	}
}
