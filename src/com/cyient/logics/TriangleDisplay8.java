package com.cyient.logics;

public class TriangleDisplay8 {

	public static void main(String[] args) {
		
		//int s=5;
		int i[]= {0,1,2,3,4};
		int j[]= {0,1,2,3,4};
		
		for(int x=0; i[x]<=4; ++x)
		{
			for(int y=0; j[y]<=i[x]; ++y)
			{
				System.out.println("*");	
			}
			
			
			System.out.println("\n");
		}
		
		
	}

}
