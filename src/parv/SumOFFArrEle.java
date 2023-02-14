package parv;

import java.util.Scanner;

public class SumOFFArrEle {

		public static void main(String[] args) {
			int count=0,i,j;
			int a[][] = new int[3][3];
			Scanner sc = new Scanner(System.in);
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.println("Enter a["+i+"]["+j+"]");
					a[i][j] = sc.nextInt();
				}
			}
			
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					count = count + a[i][j];
				}
			}
			
		System.out.println("Sum of All Elements is "+count);
			
			
		}
}
