package com.day6;
public class GarbageCollection 
{
	static int count = 0;
	 
	GarbageCollection(){
		count++;
		System.out.println(count);
	}
	protected void finalize() throws Throwable {
		count--;
		System.out.println(count);
	}
	public static void main(String[] args)
	{
		GarbageCollection obj1 = new GarbageCollection();
		GarbageCollection obj2 = new GarbageCollection();
		obj1 = null;
		System.gc();
		
		obj2 = null;
		//System.gc(); we can use both methods to call
		Runtime.getRuntime().gc();
	}
}
