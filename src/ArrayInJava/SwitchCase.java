package ArrayInJava;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for area of square");
		System.out.println("Enter 2 for area of circle");
		System.out.println("Enter 3 for area of triangle");
		System.out.println("Enter 4 for area of rectangle");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1 : 
				System.out.println("You have selected square");
				System.out.println("Enter length of square");
				int l = sc.nextInt();
				int area = l*l;
				System.out.println("Area is :"+area);
		
		case 2: 
				
		}
	}
	
}
/*
 * Enter 1  for area of square => a = (l*l); => input length 
 * Enter 2 for area of circle => a = (pi*r*r); => input radius
 * Enter 3 for area of triangle => a = 1/2*h*b; => input height & breadth
 * Enter 4 for area of rectangle => a = l*b; => length & breadth
 * 
 * 
 * 
 * */
