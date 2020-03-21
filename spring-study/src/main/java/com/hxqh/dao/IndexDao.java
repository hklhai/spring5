package com.hxqh.dao;

/**
 * Created by Ocean lin on 2020/3/16.
 *
 * @author Ocean lin
 */
public class IndexDao implements Dao {


	public IndexDao() {
		System.out.println("IndexDao-init!");
	}

	@Override
	public void query() {
		System.out.println("IndexDao");
	}
}
