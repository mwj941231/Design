/**
 * Project Name:Design
 * File Name:SendSmsFactory.java
 * Package Name:com.cctechhk.abstractfactory
 * Date:2016年11月8日下午8:36:04
 * Copyright (c) 2016, XXXXX@qq.com All Rights Reserved.
 *
*/

package com.cctechhk.abstractfactory;

public class SendSmsFactory implements Provider{  
	  
    public Sender produce() {  
        return new SmsSender();  
    }  
}  
