/**
 * Project Name:Design
 * File Name:Client.java
 * Package Name:com.cctechhk.factory
 * Date:2016年11月8日下午7:35:11
 * Copyright (c) 2016, XXXXX@qq.com All Rights Reserved.
 *
*/

package com.cctechhk.factory;
/**
 * ClassName:Client <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016年11月8日 下午7:35:11 <br/>
 * @author   123
 * @version  
 * @since    JDK 1.7.0_72
 * @see 	 
 */
public class Client { 
    public static void main(String[] args) { 
      //创建一个具体工厂 
      Factory factory = new ConcreteFactory(); 
      //根据参数中具体产品的.class名称来决定创建的产品类型 
      IProduct product01 = factory.createProduct(ConcreteProductA.class); 
      IProduct product02 = factory.createProduct(ConcreteProductB.class); 
        
      product01.method01(); 
      product01.method02(); 
      product02.method01(); 
      product02.method02(); 
    } 
}
