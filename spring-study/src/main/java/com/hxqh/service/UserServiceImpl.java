package com.hxqh.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Ocean lin on 2020/2/25.
 *
 * @author Ocean lin
 */
@Service("userService")
public class UserServiceImpl implements UserService {


	public UserServiceImpl() {
		System.out.println("Construction");
	}

	@PostConstruct
	public void init() {
		System.out.println("init");
	}

	@Override
	public void query() {
		System.out.println("user query!");
	}
}
