package com.cyient.methods;

public class MethodsTest {

	
	public static void main(String[] args) {
		int base=49;
		int height=1;
		Area obj= new Area();
		
		
		double res=Area.areaOfTriangle(base,height);
		System.out.println(res);
		double result= Area.areaOfCircle(height);
		System.out.println(result);
		double area= Area.areaOfRectangle(base, height);
		System.out.println(area);
		
		double a= obj.areaOfSquare(height);
		System.out.println(a);
		double b= Area.areaOfTrepizum(base, base, height);
		System.out.println(b);
		

	}

}


