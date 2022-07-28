package com.tns.collection;
import java.util.ArrayList;


public class CollectionMethod {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Ranchi");
		l1.add("shanaya");
		l1.add("kala");
		l1.add("rafiya");
		l1.add("ameena");
		l1.add("oindrilla");
		
		//clear method
         //	l1.clear();
		
		//contains method
		System.out.println(l1.contains("neha")); 
		
		//indexOf method
		System.out.println(l1.indexOf("kala")); 
		System.out.println(l1.indexOf("alina")); 
		System.out.println(l1.indexOf("rafiya")); 
		System.out.println(l1.lastIndexOf("rafiya"));
		
		//set method
		l1.set(1, "alina");
		
		for(int i=0; i<l1.size(); i++)
		{
			System.out.print(l1.get(i));
			System.out.print(", "); 
			
		}

	}

}
