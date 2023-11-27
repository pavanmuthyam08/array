package com.iis.day2;

import java.util.Scanner;
public class Employee
{
	double sal;
	int id;
	String name;
	Scanner sc=new Scanner(System.in);
	public void accept()
	{
	System.out.println("Enter the EmpId");
	id=sc.nextInt();
	System.out.println("Enter the Emp Name ");
	name=sc.next();
	System.out.println("Enter the Salary of Employee");
	
	sal=sc.nextDouble();
	}
	public double conus()
	{
	double bonus=0.00;
	if(sal>=30000 && sal<=50000)
	{
	   bonus=sal+(sal*0.1);
	   
	}
	else if(sal>50000 && sal<=100000)
	{
	 bonus=sal+(sal*0.2);
	}
	else {
		
	 System.out.println("Pelase enter the salary between 30000 to 100000");
	
	}
	return bonus;
	}
	public void display()
	{
	System.out.println("The Salary after Geting Bonus is "+conus());
	}
	public static void main(String args[])
	{
	Employee e=new Employee();
	e.accept();
    e.conus();
	e.display();
	}
}