/**
 * Project Name:Design
 * File Name:Factory.java
 * Package Name:com.cctechhk.factory
 * Date:2016年11月8日下午7:31:02
 * Copyright (c) 2016, XXXXX@qq.com All Rights Reserved.
 *
*/

package com.cctechhk.factory;
/**
 * ClassName:Factory <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016年11月8日 下午7:31:02 <br/>
 * @author   123
 * @version  
 * @since    JDK 1.7.0_72
 * @see 	 
 */
//抽象的工厂类，定义了其子类必须实现的createProduct()方法 
public abstract class Factory { 
	 //运用了Java 中的泛型和反射技术 
	 public abstract <T extends IProduct> T createProduct(Class<T> c); 
} 

