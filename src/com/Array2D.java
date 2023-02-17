package com;

import java.util.Scanner;

public class Array2D {

		public static void main(String[] args) {
     			Scanner sc = new Scanner(System.in);
				int n,i,j,r,c;
				int a[][] = new int[100][100];
				System.out.println("Enter Rows of array");
				r = sc.nextInt();
				System.out.println("Enter Columns of array");
				c = sc.nextInt();
				for(i=0;i<r;i++)
				{
					for(j=0;j<c;j++)
					{
						System.out.println("Enter a["+i+"]["+j+"]");
						a[i][j]  = sc.nextInt();
					}
				}
				for(i=0;i<r;i++)
				{
					for(j=0;j<c;j++)
					{
						System.out.printf("\t"+a[i][j]);
					}
					System.out.println();
				}
				
				
				
 		}
}
/*
 * 1  2 3 
 * 22 3 4
 * 1  4 8 
 * */
