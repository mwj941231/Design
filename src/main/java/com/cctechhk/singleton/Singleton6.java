/**
 * Project Name:Design
 * File Name:Singleton6.java
 * Package Name:com.cctechhk.singleton
 * Date:2016年11月8日下午5:42:59
 * Copyright (c) 2016, XXXXX@qq.com All Rights Reserved.
 *
*/

package com.cctechhk.singleton;
/**
 * ClassName:Singleton6 <br/>
 * Function: TODO 第六种（枚举）：<br/>
 * Reason:	 TODO 这种方式是Effective Java作者Josh Bloch 提倡的方式，
 * 它不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象，
 * 可谓是很坚强的壁垒啊，不过，个人认为由于1.5中才加入enum特性，
 * 用这种方式写不免让人感觉生疏，在实际工作中，我也很少看见有人这么写过。 <br/>
 * Date:     2016年11月8日 下午5:42:59 <br/>
 * @author   maweijie
 * @version  
 * @since    JDK 1.7.0_72
 * @see 	 
 */
public enum Singleton6 {
	INSTANCE;  
	public void whateverMethod() {  
		
	}  
}

