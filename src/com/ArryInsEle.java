package com;

import java.util.Scanner;

public class ArryInsEle {
	
	public static void main(String[] args) {
		int i,n,p,e;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		n = sc.nextInt();
		int a[]  = new int[n+1];
		for(i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter position where you want to insert element");
		p = sc.nextInt();
		System.out.println("Enter value of element");
		e = sc.nextInt();
		for(i=n-1;i>=(p-1);i--)
		{
			a[i+1] = a[i];
		}
		a[p-1] = e;
		System.out.println("After inserting ");
		for(i=0;i<=n;i++)
		{
			System.out.println(""+a[i]+",");
		}
	}	
}
