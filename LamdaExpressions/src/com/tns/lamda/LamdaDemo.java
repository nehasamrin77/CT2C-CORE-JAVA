package com.tns.lamda;
interface Anonymous
{
	void show();
}
public class LamdaDemo {

	public static void main(String[] args) {
		Anonymous l=() -> 
		{
			System.out.println("Lambda Expression Demo for simplification");
		};
		l.show();


	}

}
