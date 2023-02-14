package com;

import java.util.Scanner;

public class StringInfo 
{
	public static void main(String[] args) 
	{
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		a = sc.nextInt();
		System.out.println("Enter b");
		b = sc.nextInt();
		if (a > b) {
			System.out.format("%d is greater than %d", a, b);
		} else {
			System.out.format("%d is less than %d", a, b);
		}
	}
}

/*
 * Control Statement: 1) if else 2) switch 3) loops : for , while , do while ,
 * for-each loop
 * 
 * 
 */
//			System.out.println("Enter a");
//		    a = sc.nextInt();
//		    System.out.println("Enter b");
//		   int  b = sc.nextInt();
//		    int c = a+b;
//		    float d= 12.34f;
//		    System.out.printf("%d + %d =  %d\n",a,b,c);
//		    System.out.format("%d + %d =  %d\n",a,b,c);
//		    System.out.println(""+a+"+"+b+"="+c);	
//		    System.out.printf("Float variable : %10.2f",d);
//		}
// * next() => String input => Word 
// * nextLine() => String 
// * 
// * */