package com.tns.genericmethod;

public class BoundedTypeExample <T extends Number> {

void print(T num){
System.out.println("Only Number is allowed "+ num);
}

@SuppressWarnings("rawtypes")
public static void main(String[] args) {
@SuppressWarnings("unchecked")
BoundedTypeExample<Integer> boundedTypeExample = new BoundedTypeExample();
boundedTypeExample.print(4);

}
}


