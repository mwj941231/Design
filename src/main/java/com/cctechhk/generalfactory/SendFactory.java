/**
 * Project Name:Design
 * File Name:SendFactory.java
 * Package Name:com.cctechhk.generalfactory
 * Date:2016年11月8日下午7:58:38
 * Copyright (c) 2016, XXXXX@qq.com All Rights Reserved.
 *
 */

package com.cctechhk.generalfactory;

/**
 * ClassName:SendFactory <br/>
 * Function: TODO 普通工厂方法 <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2016年11月8日 下午7:58:38 <br/>
 * 
 * @author 123
 * @version
 * @since JDK 1.7.0_72
 * @see
 */
public class SendFactory {
	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("请输入正确的类型!");
			return null;
		}
	}
}
