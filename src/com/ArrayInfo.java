package com;

import java.util.Scanner;

public class ArrayInfo {

		public static void main(String[] args) {
			int n,i;
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			int[] arr = new int[10];//Array Declare
			for(i=0;i<arr.length;i++)
			{
				System.out.println("Enter a["+i+"]");
				arr[i] = sc.nextInt();
			}
			System.out.println("Your Elements are ");
			for(i=0;i<arr.length;i++)
			{
				System.out.println(""+arr[i]);
			}
		}
}
