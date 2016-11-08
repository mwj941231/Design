/**
 * Project Name:Design
 * File Name:Singleton2.java
 * Package Name:com.cctechhk.singleton
 * Date:2016年11月8日下午4:11:05
 * Copyright (c) 2016, XXXXX@qq.com All Rights Reserved.
 *
*/

package com.cctechhk.singleton;
/**
 * ClassName:Singleton2 <br/>
 * Function: TODO 第二种（懒汉，线程安全）： <br/>
 * Reason:	 TODO 这种写法能够在多线程中很好的工作，而且看起来它也具备很好的lazy loading，但是，遗憾的是，效率很低，99%情况下不需要同步。 <br/>
 * Date:     2016年11月8日 下午4:11:05 <br/>
 * @author   123
 * @version  
 * @since    JDK 1.7.0_72
 * @see 	 
 */
public class Singleton2 {
	private static Singleton2 instance;
	
	//私有化构造方法
	private Singleton2(){}
	
	//外部获取Singleton对象的方法
	public static synchronized Singleton2 getInstance(){
		if(instance == null){
			System.out.println("Singleton start new Object !");
			instance = new Singleton2();
		}
		return instance;
	} 
}	

