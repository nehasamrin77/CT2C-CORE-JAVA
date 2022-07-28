package com.tns.multithreading;
//creating thread using thread class - second technique

	class ChildThread1 extends Thread  //thread
	{
		public void run()
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("iam a child thread");
				Thread.yield(); //passes the chance of execution to main method
			}
		}
	}
	public class ThreadDemo2 {

	public static void main(String[] args) {
		ChildThread t =new ChildThread();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("iam a main thread");

	}

}
}