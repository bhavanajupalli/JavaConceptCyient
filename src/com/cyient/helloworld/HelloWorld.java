package com.cyient.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		float f= 1.1f;
		//System.out.println(f);
		String colors[]= new String[4];
		colors[0]= "red";
		colors[1]=	"blue";
		colors[2]= "green";
		colors[4]= "yellow";
		
		for(String s:colors)
		{
			System.out.println(s);
		}
		
		double array[]=new double[3];
		array[0]= 10;
		array[1]= 20.20;
		array[2]= 26.50;
		
		for(double s:array)
		{
			System.out.println(s);
		}
		
		
		
	}

}
