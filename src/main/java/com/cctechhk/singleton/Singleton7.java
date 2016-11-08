/**
 * Project Name:Design
 * File Name:Singleton7.java
 * Package Name:com.cctechhk.singleton
 * Date:2016年11月8日下午7:05:42
 * Copyright (c) 2016, XXXXX@qq.com All Rights Reserved.
 *
 */

package com.cctechhk.singleton;

/**
 * ClassName:Singleton7 <br/>
 * Function: TODO 第七种（双重校验锁）： <br/>
 * Reason: TODO
 * 这个是第二种方式的升级版，俗称双重检查锁定，详细介绍请查看：http://www.ibm.com/developerworks/cn
 * /java/j-dcl.html 在JDK1.5之后，双重检查锁定才能够正常达到单例效果。 <br/>
 * Date: 2016年11月8日 下午7:05:42 <br/>
 * 
 * @author maweijie
 * @version
 * @since JDK 1.7.0_72
 * @see
 */
public class Singleton7 {
	private volatile static Singleton7 singleton;

	private Singleton7() {
	}

	public static Singleton7 getSingleton() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					System.out.println("Singleton start new Object !");
					singleton = new Singleton7();
				}
			}
		}
		return singleton;
	}
}
