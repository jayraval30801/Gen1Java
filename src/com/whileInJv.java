package com;

import java.util.Scanner;

public class whileInJv {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
				int[] a = new int[100];
				int i,n,max;
				System.out.println("Enter size of array");
				n = sc.nextInt();
				for(i=0;i<n;i++)
				{
					System.out.print("Enter a["+i+"]");//a[0] a[1]
					a[i] = sc.nextInt();
				}
				max = a[0];
				for(i=0;i<n;i++)
				{
					if(max<a[i])
					{
						max= a[i];
					}
				}
				System.out.print("Max elem is : "+max);//a[0] a[1]
				
//				System.out.println("Elements are :");
//				for(i=0;i<n;i++)
//				{
//					System.out.println(""+a[i]);
//				}
		}
}
/*
 *    
 *    Array : 
 *    		Elements :
 *  Position : 4
 *  Element : 12
 *    [12,343,56,12,7788,23,67]
 *    
 *    		
 */
