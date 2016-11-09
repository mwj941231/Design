/**
 * Project Name:Design
 * File Name:ConcreteBuilder.java
 * Package Name:com.cctechhk.builder2
 * Date:2016年11月9日下午2:59:17
 * Copyright (c) 2016, XXXXX@qq.com All Rights Reserved.
 *
 */

package com.cctechhk.builder2;

public class ConcreteBuilder implements Builder {

	private Product product = new Product();

	/**
	 * 产品零件建造方法1
	 */
	public void buildPart1() {
        //构建产品的第一个零件
		product.setPart1("编号：9527");
    }

	/**
	 * 产品零件建造方法2
	 */
	public void buildPart2() {
        //构建产品的第二个零件
		product.setPart2("名称：XXX");
    }

	/**
	 * 产品返还方法
	 */
	public Product retrieveResult() {
		return product;
	}

}
