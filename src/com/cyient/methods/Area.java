package com.cyient.methods;

public class Area {

	
		public static double areaOfTriangle(int b,int h)
		{
			double area= 0.5*b*h;
			return area;
		}
	
		public static double areaOfRectangle(int b,int h)
		{
			double area= b*h;
			return area;
		}
		public static double areaOfCircle(int r)
		{
			double area= 3.14*r*r;
			return area;
		}
		public int areaOfSquare(int s)
		{
			int area= s*s;
			return area;
		}
		public static double areaOfTrepizum(int a,int b,int h)
		{
			double area= (a+b)*0.5*h;
			return area;
		}
	

}
