/**
 * Project Name:Design
 * File Name:Builder.java
 * Package Name:com.cctechhk.builder2
 * Date:2016年11月9日下午2:58:59
 * Copyright (c) 2016, XXXXX@qq.com All Rights Reserved.
 *
 */

package com.cctechhk.builder2;

public interface Builder {
	public void buildPart1();

	public void buildPart2();

	public Product retrieveResult();
}