/**
 * Project Name:Design
 * File Name:SingLeton.java
 * Package Name:com.cctechhk.singleton
 * Date:2016年11月8日下午4:04:49
 * Copyright (c) 2016, XXXXX@qq.com All Rights Reserved.
 *
*/

package com.cctechhk.singleton;

import javax.swing.plaf.SliderUI;

/**
 * ClassName:SingLeton <br/>
 * Function: TODO 第一种（懒汉，线程不安全）： <br/>
 * Reason:	 TODO 这种写法lazy loading很明显，但是致命的是在多线程不能正常工作。 <br/>
 * Date:     2016年11月8日 下午4:04:49 <br/>
 * @author   maweijie
 * @version  
 * @since    JDK 1.7.0_72
 * @see 	 
 */
public class Singleton {
	private static Singleton instance;
	
	//私有化构造方法
	private Singleton(){}
	
	//外部获取对象的方法
	public static Singleton getInstance(){
		if(instance == null){
			System.out.println("Singleton start new Object !");
			instance = new Singleton();
		}
		return instance;
	}
}

