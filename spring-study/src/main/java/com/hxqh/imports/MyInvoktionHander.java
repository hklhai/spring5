package com.hxqh.imports;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Ocean lin on 2020/3/16.
 *
 * @author Ocean lin
 */
public class MyInvoktionHander implements InvocationHandler {

	Object target;

	public MyInvoktionHander(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("代理方法");
		return method.invoke(target, args);
	}
}
