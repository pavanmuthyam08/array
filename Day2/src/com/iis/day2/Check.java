package com.iis.day2;

import java.util.Scanner;
public class Check
{
	int a[];
	int index;
	Scanner sc;
	public Check()
	{
		sc=new Scanner(System.in);
		a=new int[10];
	}
	public void values()
	{
 		System.out.println("Enter the 10 values into Array");
		for (int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public void check()
	{
		int b;
		System.out.println("Enter the value to check whether present in array ");
		b=sc.nextInt();
		int result=0;
		for(int val: a)
		{
			if(val==b)
			  result=1;
			else
			result=0;
		}
	if(result==1){
	System.out.println("The number is present");
}
	else{
	System.out.println("The number is not present");
		
	}
	
}
	public static void main(String args[])
	{
		Check c= new Check();
		c.values();
		c.check();
	}
}
