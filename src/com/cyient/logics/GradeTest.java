package com.cyient.logics;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		
//		int p;
//		
//		System.out.println("enter percentage\n");
//		Scanner sc= new Scanner(System.in);	
//		p= sc.nextInt();
//		
//		if(p>=90)
//			System.out.println("Grade A");
//		else if(p>=80 && p<=89)
//			System.out.println("Grade B");
//		else if(p>=33 && p<=59)
//			System.out.println("Grade C");
//		else if(p<33)
//			System.out.println("Grade F");
//		else
//			System.out.println("Failed");
		
		
		int[] numbers = {10,20,30,40,50,60,80,55,42,8,64,25,35};
		
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i] <= 50)
				System.out.println(numbers[i]);
		
		}
		
	}

}
