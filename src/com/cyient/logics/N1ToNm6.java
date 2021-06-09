package com.cyient.logics;

import java.util.Scanner;

public class N1ToNm6 {

	public static void main(String[] args) {
		
		int N=0;int M=0;
		System.out.println("Enter N Number\n");
		Scanner sc= new Scanner(System.in);
		N=sc.nextInt();
		
		System.out.println("Enter M Number\n");
		Scanner sc1= new Scanner(System.in);
		M=sc1.nextInt();
		
		for(int i=1; i<=M; ++i)
		{
			System.out.println(N-i);
		}

	}

}
