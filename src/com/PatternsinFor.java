package com;

import java.util.Scanner;

class ABC
{
	private int r;
	public int getA() {
		return r;
	}
	public void setA(int x) {
		r = x;
	}
}
public class PatternsinFor {

		public static void main(String[] args)
		{
			
			ABC obj = new ABC();
			int a;
			String str;
			Scanner sc= new Scanner(System.in);
			//obj.setA(34);
			//a = obj.getA();
			System.out.println("Enter The String");
			str = sc.nextLine();
			System.out.println("Your String is"+str);
			
			//System.out.println("A is "+a);
//			System.out.println("Enter A");
//			a = sc.nextInt();
//			System.out.println("Enter B");
//			b = sc.nextInt();
//			c = a+b;
//			System.out.println("Addition of "+a+ " and "+b+" is "+c);
		}
}
/*
 * mvc : MODEL VIEW CONTROLLER 
 *  MVVC : 
 *       
 *  		OBJ => CLASS INSTANCE OF => RETURN TRUE FALSE
 *  	
 * Associativity : Arithemetic : l to r
 *  
 * logical : r to l 
 *  ++ -- & |  	
 * 
 * a = (12/5)*(4/5) => 
 * 
 *   
 *   Scanner Class => import java.util.Scanner 
 * 
 * Enter Data from user :=> 
 * 
 * 	
 * */
