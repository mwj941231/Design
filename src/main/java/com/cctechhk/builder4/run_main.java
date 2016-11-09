/**
 * Project Name:Design
 * File Name:run_main.java
 * Package Name:com.cctechhk.builder4
 * Date:2016年11月9日下午4:22:15
 * Copyright (c) 2016, XXXXX@qq.com All Rights Reserved.
 *
*/

package com.cctechhk.builder4;

public class run_main {
	public static void main(String[] args) {

        map_cloudy map_cloudy = new map_cloudy();
        map_build_adv map_build_adv = new map_build_adv(map_cloudy);
        map_build_adv.create_map();

        System.out.println();

        map_sun map_sun = new map_sun();
        map_build_low map_build_low = new map_build_low(map_sun);
        map_build_low.create_map();

    }
}

