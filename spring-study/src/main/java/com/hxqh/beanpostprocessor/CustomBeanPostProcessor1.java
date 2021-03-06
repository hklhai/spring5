package com.hxqh.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * Created by Ocean lin on 2020/2/25.
 *
 * @author Ocean lin
 */
@Component
public class CustomBeanPostProcessor1 implements BeanPostProcessor, PriorityOrdered {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ("userService".equals(beanName)) {
			System.out.println("BeforeInitialization1");
		}
		// before
		// Proxy.newProxyInstance(CustomBeanPostProcessor.class.getClassLoader(),bean.getClass().getInterfaces(),)
		// after
		// 返回代理对象

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("userService".equals(beanName)) {
			System.out.println("AfterInitialization1");
		}
		return bean;
	}

	@Override
	public int getOrder() {
		return 90;
	}
}
