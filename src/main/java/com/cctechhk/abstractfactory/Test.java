/**
 * Project Name:Design
 * File Name:Test.java
 * Package Name:com.cctechhk.abstractfactory
 * Date:2016年11月8日下午8:36:43
 * Copyright (c) 2016, XXXXX@qq.com All Rights Reserved.
 *
*/

package com.cctechhk.abstractfactory;

public class Test {  
	  
    public static void main(String[] args) {  
        Provider provider = new SendMailFactory();  
        Sender sender = provider.produce();  
        sender.Send();  
    }  
}  
