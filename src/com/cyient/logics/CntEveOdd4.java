package com.cyient.logics;

public class CntEveOdd4 {
public static void main(String[] args) {
	//find the count of even or odd results : 5*1 to 5*30
	
// //For Loop:
	int even=0;int odd=0;int c1=0; int c2=0;
	
	System.out.println("Even Numbers");
	for(int i=0; i<=30; ++i)
	{
		even= 5*i;
		System.out.println("5x"+i+"="+even);
		
		if((even%2)==0)
		{
			System.out.println("Even Products"+even);
			++c1;
		}
	}
	
	System.out.println("\n");
	
	System.out.println("Odd Numbers");
	for(int i=0; i<=30; ++i)
	{
		odd= 5*i;
		System.out.println("5x"+i+"="+odd);
		
		if((odd%2)!=0)
		{
			System.out.println("Odd Products"+odd);
			++c2;
		}
		
	}
	System.out.println("Even Result"+c1+"\t"+"Odd Result"+c2);
	
//	//While Loop
	
	int even1=0;int odd1=0;int c3=0; int c4=0;
	int i=0;
	while(i<=30)
	{
		even1= 5*i;
		System.out.println("5x"+i+"="+even1);
		
		if((even1%2)==0)
		{
			System.out.println("Even Products"+even1);
			++c3;
		}
		
		++i;
	}
	System.out.println("\n");
	
	int j=0;
	while(j<=30)
	{
		odd1= 5*j;
		System.out.println("5x"+j+"="+odd1);
		
		if((odd1 %2)!=0)
		{
			System.out.println("Odd Products"+odd1);
			++c4;
		}
		++j;	
	}
	System.out.println("Even Result"+c3+"\t"+"Odd Result"+c4);
	
// //Do while Loop
	int even2=0;int odd2=0;int c5=0; int c6=0;
	int k=0;
	do
	{
		even2= 5*k;
		System.out.println("5x"+k+"="+even2);
		
		if((even2 %2)==0)
		{
			System.out.println("Even Products"+even2);
			++c5;
		}
		
		++k;
	}while(k<=30);
	System.out.println("\n");
	
	int l=0;
	do
	{
		odd2= 5*l;
		System.out.println("5x"+l+"="+odd2);
		
		if((odd2 %2)!=0)
		{
			System.out.println("Odd Products"+odd2);
			++c6;
		}
		++l;	
	}while(l<=30);
	System.out.println("Even Result"+c5+"\t"+"Odd Result"+c6);
  }
}
