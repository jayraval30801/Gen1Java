package ArrayInJava;

import java.util.Scanner;

public class Arrayinfo {
	
		static int a[] = {12,23,3443,53};
		public static int largest()
		{
			int i ;
			int max = a[0]; ///max = 12
			for(i=0;i<a.length;i++)//i=3
			{
				if(a[i]>max)// a[2]>max 3443>23 
				{
					max = a[i];//max = 3443
				}
			}
			return max;
		}
		public static void main(String[] args) {
			System.out.println("Largest ele is "+largest());
		}
	
	
}
/*array elements find max value element.
 * 
 * */
 