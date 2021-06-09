package com.cyient.logics;

public class OddEven1 {

	public static void main(String[] args) {
	//	0 to 30
		// for loop: Iterations are less
	for(int i=0; i<=30; ++i)
	{
		 if(i%2==0)
		{
			System.out.println("Even Number"+i);
			System.out.println("\n");
		}
		else
		{
			System.out.println("Odd Number"+i);
			System.out.println("\n");
		}
	}

		//time complexity is more- no of iterations are more- For loop
	System.out.println("Even Numbers");
	for(int i=0; i<=30; ++i)
	{
		if((i%2)==0)
			System.out.println(i);		
	}
	System.out.println("\n");
	
	System.out.println("Odd Numbers");
	for(int i=0; i<=30; ++i)
	{
		if((i%2)!=0)	
			System.out.println(i);
	}
	
		//While Loop:
	int j=0;
	
	while(j<=30)
	{
		if(j%2 ==0)
			System.out.println("Even Number"+j);
		else
			System.out.println("Odd Number"+j);
		
		++j;
	}

		//Do While Loop:
	int k=0;
	do
	{
		if(k%2==0)
			System.out.println("Even Number"+k);
		
		else
			System.out.println("Odd Number"+k);
		
		++k;
		
	}while(k<=30);
	
  }

}
