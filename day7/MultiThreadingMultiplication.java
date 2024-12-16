package com.day7;

class Thread4 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println(i +" * 2 = " + (i*2));
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
			}
		}
	}}
class Thread5 implements Runnable{
		
		@Override
		public synchronized void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println(i +" * 5 = " + (i*5));
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
			}
		}	
	}
		
	}
public class MultiThreadingMultiplication 
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Thread4());
		t1.setName("two");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread t2 = new Thread(new Thread5());
		t2.setName("Five");
		t2.start();
	}
}
