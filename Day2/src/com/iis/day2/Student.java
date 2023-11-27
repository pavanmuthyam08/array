package com.iis.day2;

import java.util.Scanner;
public class Student
{
	private String name;
	private int id;
	private int score;
	private Scanner sc;
	public void accept()
	{
	sc=new Scanner(System.in);
	System.out.println("Enter the Student Id");
	id=sc.nextInt();
	System.out.println("Enter the Name of Student");
	name=sc.next();
	System.out.println("Enter thge score of student");
	score=sc.nextInt();
	}
	public void display()
	{
	System.out.println("The Student Id is "+id);
	System.out.println("The Student Name is "+name);
	System.out.println("The Student score is "+score);
	}
	public static void main(String args[])
	{
	Student s=new Student();
	s.accept();
	s.display();
	}
}