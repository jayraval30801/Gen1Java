package com;

import java.util.Scanner;

public class ControlStmt {
	public static void main(String[] args) 
	{
			int k,i,j;
		    for(i=5;i>=1;i--)
		    {
		    	for(k=1;k<=i;k++)
		    	{
		    		System.out.print(" ");
		    	}
		    	for(j=5;j>=i;j--)
		    	{
		    		System.out.print(" "+j);	
		    	}
		    	System.out.println();
		    }
		    for(i=2;i<=5;i++)
		    {
		    	for(k=1;k<=i;k++)
		    	{
		    		System.out.print(" ");
		    	}
		    	for(j=5;j>=i;j--)
		    	{
		    		System.out.print(" "+j);	
		    	}
		    	System.out.println();
		    }
	}
}
/*
 * Control Statement: 
 * 			1) if else : 
 * 					1) if else
 * 					2) nested if 
 * 					3) else if 
 * 					4) ladder else if 		
 * 			2) Loops:
 * 					1) for loop
 * 					2) while loop
 * 					3) do while loop
 * 					4) for each loop: 	
 * 			3) switch:
 * 					1) switch  	
 *******
 *     *
 *     *
 *     *
 *     *
 *******       
 *
 * 
 *			5
 *         5 4
 *        5 4 3 
 *       5 4 3 2 
 *      5 4 3 2 1
 *       5 4 3 2 
 *        5 4 3 
 *         5 4 
 *          5 
 *            
 * 			A
 *         B C
 *        D E F
 *       G H I J
 *        D E F 
 *         B C
 *          A  	
 * 
 *
 * */
 