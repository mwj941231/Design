/**
 * Project Name:Design
 * File Name:Client.java
 * Package Name:com.cctechhk.builder2
 * Date:2016年11月9日下午3:00:15
 * Copyright (c) 2016, XXXXX@qq.com All Rights Reserved.
 *
 */

package com.cctechhk.builder2;

public class Client {
	public static void main(String[] args) {
		//导演
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		director.construct();
		//建筑者
		Product product = builder.retrieveResult();
		System.out.println(product.getPart1());
		System.out.println(product.getPart2());
	}
}