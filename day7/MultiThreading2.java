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
	}}

public class MultiThreading2
{
	public static void main(String[] args)
	{
		MyThread t1 = new MyThread();
		t1.setName("t1");
		t1.start();
		
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	
		t1.suspend();
		
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		t1.resume();	
	}
}
