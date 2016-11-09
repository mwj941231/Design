/**
 * Project Name:Design
 * File Name:Builder.java
 * Package Name:com.cctechhk.build
 * Date:2016年11月9日下午12:01:24
 * Copyright (c) 2016, XXXXX@qq.com All Rights Reserved.
 *
 */

package com.cctechhk.build;

import java.util.ArrayList;
import java.util.List;

import com.cctechhk.generalfactory.MailSender;
import com.cctechhk.generalfactory.Sender;
import com.cctechhk.generalfactory.SmsSender;

public class Builder {
	private List<Sender> list = new ArrayList<Sender>();

	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}

	public void produceSmsSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}
}
