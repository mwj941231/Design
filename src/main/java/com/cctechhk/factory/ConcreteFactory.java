/**
 * Project Name:Design
 * File Name:ConcreteFactory.java
 * Package Name:com.cctechhk.factory
 * Date:2016年11月8日下午7:34:49
 * Copyright (c) 2016, XXXXX@qq.com All Rights Reserved.
 *
 */

package com.cctechhk.factory;

/**
 * ClassName:ConcreteFactory <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2016年11月8日 下午7:34:49 <br/>
 * 
 * @author 123
 * @version
 * @since JDK 1.7.0_72
 * @see
 */
public class ConcreteFactory extends Factory {
	@SuppressWarnings("unchecked")
	public <T extends IProduct> T createProduct(Class<T> c) {
		T product = null;
		try {
			product = (T) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}
}
