package com.day7;

class MyThread2 implements Runnable{
	
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("My thread is running " + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}}
	}}

public class MultiThreading4 
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new MyThread2());
		t1.setName("T1");
		t1.start();
	}
}
