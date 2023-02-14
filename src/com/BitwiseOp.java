package com;

public class BitwiseOp 
{
		
		public static void main(String[] args) 
		{
		
			int a = 34;
			int b = 58;
			
		    int c = a&b;
		    int d = a|b;
		    int e = a^b;
		    System.out.println("a&b"+c);
		   System.out.println("a|b"+d);
		   System.out.println("a^b"+e);
		}
	//& | ^
				
}
/*  
 *  
 * A  = 34 => 34 - 100010   
 B    = 58 =>      111010  
 				--------------
 					
 A&B            => 100010 => 34 
 A|B            => 111010 => 58
 A^B            => 011000 => 24
 *
 *
 *TruthTable:
 *
 *  A   B   &   |   ^
 *  0   0   0   0   0
 *  0   1   0   1   1 
 *  1   0   0   1   1 
 *  1   1   1   1   0
 *
 * & => when any of 2 variables value is 0 => the output will be 0.
 * | => when any of 2 variables value  is 1 => the output will be 1.
 * ^ => when both variables value are same => the output will be 0.
 * 
 * 
 * A = 67  89 112
 * B = 234 45 68
 * 
 * 
 * */
