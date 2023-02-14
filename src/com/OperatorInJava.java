package com;

import java.util.Scanner;

class Arin
{
	

}
public class OperatorInJava extends Arin{
		
		public static void main(String[] args) 
		{
//				Arin ar = new Arin();
//				OperatorInJava obj = new OperatorInJava();
//			//	System.out.println("obj is instance of OperatorinJava is :=>"+(obj instanceof OperatorInJava));
//			System.out.println("obj is instance of arin"+(ar instanceof OperatorInJava));
//		//	boolean a,b;
//	   //	boolean c; 
//			int a,b,c;
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter a");
//			a  =sc.nextInt();//14
//		//	a = sc.nextBoolean();//a = true => 14 => 1 1 1 0  
//			System.out.println("Enter b");
//			b = sc.nextInt();//2                     0 0 1 0 
//		//	b = sc.nextBoolean();//b = false
//			//c = !((a&&b)||(a^b));//!(false) => true 
//			c =  ((a>>b)+(a<<b)-(a&b)+(a|b)); //c = 71
//			int d = ++c - c-- + a++ + a-- + b-- + c-- + ++a + --c + c++ - --c - a--;
			int a=5,b=6,c,d;
			
			
			
			//System.out.println("Value of c is : "+c);
			System.out.println("value of d is : "+(a+b));
		}
		
}
/*
 * Arithmetic Operators : + - % / * 
 * Relational Operators : > < >= <= == != instance of
 * Bitwise : & | ^ >> <<
 * Logical : && || !
 * conditional : : ?
 * Assignment : = -= += != &= 
 * post/pre inc/decre : ++expre express--
 * 
 * associativity  : 
 * 		post pre , arithmetic ,bitwise , relational , logical , shifting => l to r 
 * 		conditional  ,  assignment => r to l 
 * 
 * 		a   b      a&&b     a||b   !a     a^b
 *      t   t       t        t      f      f
 *      t   f       f        t      f      t
 *      f   t       f		 t      t      t
 *      f   f       f		 f	    t      f
 *      
 *      14>>2  => 14/2(2) => 14/4 => 3
 *      14<<2  => 14*2(2) => 14*4 => 56
 *       
 *      
 *     
 * */
