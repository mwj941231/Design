/**
 * Project Name:Design
 * File Name:Singleton5.java
 * Package Name:com.cctechhk.singleton
 * Date:2016年11月8日下午5:38:19
 * Copyright (c) 2016, XXXXX@qq.com All Rights Reserved.
 *
*/

package com.cctechhk.singleton;
/**
 * ClassName:Singleton5 <br/>
 * Function: TODO 第五种（静态内部类）：<br/>
 * Reason:	 TODO这种方式同样利用了classloder的机制来保证初始化instance时只有一个线程，
 * 它跟第三种和第四种方式不同的是（很细微的差别）：第三种和第四种方式是只要Singleton类被装载了，
 * 那么instance就会被实例化（没有达到lazy loading效果），而这种方式是Singleton类被装载了，
 * instance不一定被初始化。因为SingletonHolder类没有被主动使用，只有显示通过调用getInstance方法时，
 * 才会显示装载SingletonHolder类，从而实例化instance。想象一下，如果实例化instance很消耗资源，
 * 我想让他延迟加载，另外一方面，我不希望在Singleton类加载时就实例化，
 * 因为我不能确保Singleton类还可能在其他的地方被主动使用从而被加载，
 * 那么这个时候实例化instance显然是不合适的。这个时候，这种方式相比第三和第四种方式就显得很合理。 <br/>
 * Date:     2016年11月8日 下午5:38:19 <br/>
 * @author   123
 * @version  
 * @since    JDK 1.7.0_72
 * @see 	 
 */
public class Singleton5 {

	private static class SingletonHolder {
		private static final Singleton5 instance = new Singleton5();
	}
	
	private Singleton5(){}
	
	public static final Singleton5 getInstance(){
		return SingletonHolder.instance;
	}
}

