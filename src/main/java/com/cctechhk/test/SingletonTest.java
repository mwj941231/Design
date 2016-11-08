/**
 * Project Name:Design
 * File Name:SingletonTest.java
 * Package Name:com.cctechhk.test
 * Date:2016年11月8日下午4:15:52
 * Copyright (c) 2016, XXXXX@qq.com All Rights Reserved.
 *
*/

package com.cctechhk.test;

import org.junit.Test;

import com.cctechhk.singleton.Singleton;
import com.cctechhk.singleton.Singleton2;
import com.cctechhk.singleton.Singleton3;
import com.cctechhk.singleton.Singleton5;
import com.cctechhk.singleton.Singleton7;

public class SingletonTest {
	
	@Test
	public void methon1(){
		long start = System.currentTimeMillis();
		for(int i=0;i<100000;i++){
			new Thread(new Runnable() {
				public void run() {
					Singleton.getInstance();
				}
			}).start();;
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}
	
	@Test
	public void methon2(){
		long start = System.currentTimeMillis();
		for(int i=0;i<100000;i++){
			new Thread(new Runnable() {
				public void run() {
					Singleton2.getInstance();
				}
			}).start();;
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}
	
	@Test
	public void method3(){
		long start = System.currentTimeMillis();
		for(int i=0;i<100000;i++){
			new Thread(new Runnable() {
				public void run() {
					Singleton3.getInstance();
				}
			}).start();;
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}
	
	@Test
	public void method5(){
		long start = System.currentTimeMillis();
		for(int i=0;i<100000;i++){
			new Thread(new Runnable() {
				public void run() {
					Singleton5.getInstance();
				}
			}).start();;
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}
	
	@Test
	public void method7(){
		long start = System.currentTimeMillis();
		for(int i=0;i<100000;i++){
			new Thread(new Runnable() {
				public void run() {
					Singleton7.getSingleton();
				}
			}).start();;
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}
	
	
}

