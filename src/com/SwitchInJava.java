package com;

import java.util.Scanner;

public class SwitchInJava {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Addition ");
		System.out.println("Enter 2 for Substraction");
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1 : 
				System.out.println("Enter number 1 ");
				int num1 = sc.nextInt();
				System.out.println("Enter number 2");
				int num2 = sc.nextInt();
				int num3 = num1 + num2;
				System.out.println("Addition  is : "+num3);
				break;
		case 2: 
			
			System.out.println("Enter number 1 ");
	  		 num1 = sc.nextInt();
			System.out.println("Enter number 2");
			 num2 = sc.nextInt();
			 num3 = num1 - num2;
			System.out.println("Substraction is : "+num3);
			break;
		
		default:
			
			System.out.println("Invalid Option");
			break;
		}
	}
}
/*
 * 
 * 
 * 
 * switch(choice)
 * {
 * 	case 1:
 * 			break;
 * 	case 2:
 * 			break;
 *  case 3: 
 *  		break;
 *  default:
 *  		break; 	
 * 	}
 * 
 * Task : 
 * 		Make program of calculator  1) Addition of two numbers
 * 								    2) Substraction of two numbers
 * 								    3) Multiplication of two numbers
 * 								    4) Division of two numbers		
 *
 * 
 * 
 * 
 * */
