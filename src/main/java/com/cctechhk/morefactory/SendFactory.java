/**
 * Project Name:Design
 * File Name:SendFactory.java
 * Package Name:com.cctechhk.morefactory
 * Date:2016年11月8日下午8:03:37
 * Copyright (c) 2016, XXXXX@qq.com All Rights Reserved.
 *
 */

package com.cctechhk.morefactory;

import com.cctechhk.generalfactory.MailSender;
import com.cctechhk.generalfactory.Sender;
import com.cctechhk.generalfactory.SmsSender;

/**
 * ClassName:SendFactory <br/>
 * Function: TODO 多个工厂方法模式. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2016年11月8日 下午8:03:37 <br/>
 * 
 * @author 123
 * @version
 * @since JDK 1.7.0_72
 * @see
 */
public class SendFactory {
	
	public Sender produceMail() {
		return new MailSender();
	}

	public Sender produceSms() {
		return new SmsSender();
	}
}
