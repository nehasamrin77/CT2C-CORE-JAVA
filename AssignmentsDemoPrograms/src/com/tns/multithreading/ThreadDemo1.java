package com.tns.multithreading;
 //create a thread using  a thread class
class ChildThread extends Thread  //thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("iam a child thread");
		}
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		ChildThread t =new ChildThread();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("iam a main thread");
		}
		

	}

}
