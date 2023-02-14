package ArrayInJava;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) 
	{
		int i,pos;
		Scanner sc = new Scanner(System.in);
		int a[] = new int[100];
		System.out.println("Enter how many elements you want to enter");
		int n = sc.nextInt();
		for(i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the element ");
		int x = sc.nextInt();
		System.out.println("Enter the index number where you want to enter the ele");
		pos = sc.nextInt();
		n++;
		for(i=n-1;i>=pos;i--)
		{
			a[i] = a[i-1];
		}
		a[pos-1] = x;
		
		//Updated Array print
		
		for(i=0;i<n;i++)
		{
			System.out.println("  "+a[i]);
		}
		
		
		
		
			
	}
	
}
/*Elements will be entered by user.
 * 
 * User => Enter the pos the element input/add
 * 
 * 
 * */