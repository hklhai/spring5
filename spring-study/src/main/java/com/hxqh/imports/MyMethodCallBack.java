package com.hxqh.imports;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Ocean lin on 2020/3/20.
 *
 * @author Ocean lin
 */
public class MyMethodCallBack implements MethodInterceptor {

	/**
	 * 调用a()  method和methodProxy都是a()
	 * 调用a(){
	 *
	 *     c() //原始方法
	 * }
	 * c()是method，a()是methodProxy
	 *
	 *
	 * 如果methodProxy和method相同通过 beanfactory get
	 * 否则new
	 *
	 * @param o
	 * @param method
	 * @param objects
	 * @param methodProxy
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("MethodInterceptor==");
		// 调用父类
		return methodProxy.invokeSuper(o, objects);
	}
}
