//package com.pentagon.rect;
package com.iis.day2;
import java.util.Scanner;

public class Rectangle{

    int length;

    int breath;

    Scanner sc;

    public void area()

    {

      sc= new Scanner(System.in);

      System.out.println("Enter the Lenght");

      length=sc.nextInt();

      System.out.println("Enter the Breath");

      breath=sc.nextInt();

      float area=length*breath;

      System.out.println("The Area is "+area);

      

    }

  // public void sum() {

    //	float da=a1.area()+area();

    //	System.out.println("The Sum of 2 Rectangles is "+da);

 //  }

    public static void main(String[] args) {

    	Rectangle a1=new Rectangle();

		Rectangle a2=new Rectangle();

		a1.area();

		a2.area();

		

		//a1.sum();

		//a2.sum();

	}

}