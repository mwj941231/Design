/**
 * Project Name:Design
 * File Name:SendFactory.java
 * Package Name:com.cctechhk.staticfatory
 * Date:2016年11月8日下午8:06:23
 * Copyright (c) 2016, XXXXX@qq.com All Rights Reserved.
 *
 */

package com.cctechhk.staticfatory;

import com.cctechhk.generalfactory.MailSender;
import com.cctechhk.generalfactory.Sender;
import com.cctechhk.generalfactory.SmsSender;

/**
 * ClassName:SendFactory <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2016年11月8日 下午8:06:23 <br/>
 * 
 * @author 123
 * @version
 * @since JDK 1.7.0_72
 * @see
 */
public class SendFactory {
	public static Sender produceMail() {
		return new MailSender();
	}

	public static Sender produceSms() {
		return new SmsSender();
	}
}
