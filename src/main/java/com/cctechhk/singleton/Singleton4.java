/**
 * Project Name:Design
 * File Name:Singleton4.java
 * Package Name:com.cctechhk.singleton
 * Date:2016年11月8日下午5:32:22
 * Copyright (c) 2016, XXXXX@qq.com All Rights Reserved.
 *
*/

package com.cctechhk.singleton;
/**
 * ClassName:Singleton4 <br/>
 * Function: TODO 第四种（饿汉，变种）： <br/>
 * Reason:	 TODO 表面上看起来差别挺大，其实更第三种方式差不多，都是在类初始化即实例化instance。 <br/>
 * Date:     2016年11月8日 下午5:32:22 <br/>
 * @author   123
 * @version  
 * @since    JDK 1.7.0_72
 * @see 	 
 */
public class Singleton4 {
	private static Singleton4 singleton4 = null;
	static {
		singleton4 = new Singleton4();
	}
	
	//私有化方法
	private Singleton4 (){}
	
	public static Singleton4 getInstance(){
		System.out.println("Singleton start new Object !");
		return singleton4;
	}
}

