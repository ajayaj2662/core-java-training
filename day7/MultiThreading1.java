package com.day7;

class MyThread extends Thread{
	
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("My thread is running " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}}
	}
}
public class MultiThreading1{
	public static void main(String[] args)
	{
		Thread t = Thread.currentThread();
		MyThread t1 = new MyThread();
		t1.setName("t1");
		t1.start();
	
		MyThread t2 = new MyThread();
		t2.setName("t2");
		t2.start();
		
		System.out.println("Main Thread");
		
		System.out.println(t1.getPriority());
		System.out.println(t1.getState());
		System.out.println(t1.getName());
		
		System.out.println(t2.getPriority());
		System.out.println(t2.getState());
		System.out.println(t2.getName());
	}
}
