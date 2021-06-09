package com.cyient.logics;

public class OddNumSum5 {

	public static void main(String[] args) {
		// sum of odd numbers from 1 to 15
		int sum=0;
		for(int i=1; i<=15; ++i)
		{
			if((i%2)!= 0)
				sum= sum+i;
		}
		System.out.println("Odd Numbers Sum:"+sum);
	}

}
