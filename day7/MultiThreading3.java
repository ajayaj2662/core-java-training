package com.day7;

class MyThread1 extends Thread{
	
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
public class MultiThreading3 
{
	public static void main(String[] args)
	{
		MyThread1 t1 = new MyThread1();
		t1.setName("t1");
		t1.start();
		
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e){
//			e.printStackTrace();
		}
		
		try {
			t1.join();
		} catch (InterruptedException e) {
		}
		
		System.out.println("Main End");
	}
}
