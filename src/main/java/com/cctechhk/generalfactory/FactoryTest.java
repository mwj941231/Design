/**
 * Project Name:Design
 * File Name:FactoryTest.java
 * Package Name:com.cctechhk.generalfactory
 * Date:2016年11月8日下午8:01:48
 * Copyright (c) 2016, XXXXX@qq.com All Rights Reserved.
 *
 */

package com.cctechhk.generalfactory;

/**
 * ClassName:FactoryTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2016年11月8日 下午8:01:48 <br/>
 * 
 * @author 123
 * @version
 * @since JDK 1.7.0_72
 * @see
 */
public class FactoryTest {
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produce("sms");
		sender.Send();
	}
}
