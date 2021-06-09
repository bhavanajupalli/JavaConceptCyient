package com.cyient.logics;

public class DispEveOddRes3 {
	
public static void main(String[] args) {
	//Display sum of even results find the result and check whether it is odd or even? (Range is 0 to 50)
	
	int sum=0;
	for(int i=0; i<=50; ++i)
	{
		if(i%2 ==0)
			sum= sum+i;		
	}
	
	System.out.println(sum);
	
	if(sum%2==0)
		System.out.println("Sum is Even\n");
	else
		System.out.println("Sum is Odd\n");
	
	
	
	
	
	
	
	
	
	
}

}
