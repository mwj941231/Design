/**
 * Project Name:Design
 * File Name:map_build_low.java
 * Package Name:com.cctechhk.builder4
 * Date:2016年11月9日下午4:21:21
 * Copyright (c) 2016, XXXXX@qq.com All Rights Reserved.
 *
 */

package com.cctechhk.builder4;

public class map_build_low {

	private map_interface map_interface_ref;

	public map_build_low(map_interface map_interface_ref) {
		super();
		this.map_interface_ref = map_interface_ref;
	}

	public void create_map() {
		System.out.println("创建一个低画质的地图");
		// 创建的顺序很重要 从天空往路面创建
		map_interface_ref.create_weather();
		map_interface_ref.create_house();
		// map_interface_ref.create_tree();将创建树的过程去掉
		map_interface_ref.create_way();

	}

}