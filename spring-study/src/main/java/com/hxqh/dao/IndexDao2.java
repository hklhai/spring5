package com.hxqh.dao;

import com.hxqh.imports.MyInvoktionHander;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;

/**
 * Created by Ocean lin on 2020/3/16.
 *
 * @author Ocean lin
 */
public class IndexDao2 implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName);
		if (beanName.equals("indexDao")) {
			bean = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{Dao.class}, new MyInvoktionHander(bean));
		}
		System.out.println("IndexDao2-BeanPostProcessor");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}


}
