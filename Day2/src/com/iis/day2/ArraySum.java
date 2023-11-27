package com.iis.day2;

import java.util.Scanner;
public class ArraySum
{
	int arr[];
	int index;
	Scanner sc;
	public ArraySum()
	{
    sc=new Scanner(System.in);
	System.out.println("Enter the length of an Array");
	index=sc.nextInt();
	arr=new int[index];
	}
	public  void values()
	{
	for(int i=0; i<index;i++)
	{
	  System.out.println("Enter the values into Array");
	  arr[i]=sc.nextInt();
	}
}
	public void display()
	{
		int total=0;
	for(int num:arr)
	{
		total=total+num;
	}
	System.out.println("Sum of the values is "+total);
	}
	public static void main(String args[])
	{
	ArraySum a=new ArraySum();
	a.values();
	
	a.display();
	}
}

 