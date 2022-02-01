package com.src.map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapEx {

	public static void main(String[] args) throws InterruptedException {
		HashMap hm = new HashMap();
		WeakHashMap whm =new WeakHashMap();
		
		
	Demo d =new Demo();
	
		hm.put(d, "hashmap");
		
		whm.put(d, "weakhashmap");
		System.out.println(hm);
		System.out.println(whm);
		
		d=null;
		
		System.gc();
		Thread.sleep(4000);
		
		System.out.println(hm);
		System.out.println(whm);

	}

}

class Demo{

	@Override
	public String toString() {
		return "Demo";
	}
	
	Demo()
	{
		System.out.println("demo object created");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("demo object is deleted");
	}
	
	
	
	
}