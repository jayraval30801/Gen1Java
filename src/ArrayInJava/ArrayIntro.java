package ArrayInJava;

import java.util.Scanner;

public class ArrayIntro 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i, n,posCount=0,negCount=0;
		int a[] = new int[100];
		System.out.println("Enter the Size");
		n = sc.nextInt();
		for (i = 0; i <n; i++) {
			System.out.println("Enter a[" + i + "]");
			a[i] = sc.nextInt();
		}
		System.out.println("Your elements are");
		for (i = 0; i < n; i++)
		{
				if(a[i]<0)
				{
					negCount++;
				}else
				{
					posCount++;
				}
		}
		System.out.println("Pos elements count are"+posCount);
		System.out.println("Neg Elements count are"+negCount);
	}
}
/*
 * int a[size]; => {}
 * 
 * Array : Types : 2 1-d array 2-d array (multi dimentional)
 * 
 * loops: input elements fetch
 * 
 * Disadvantage: Size => elements => init
 * 
 * int a[] = new int[SIZE];
 * 
 * Sum of Elements : 
 * 
 * 	NegElement
 * PosElement
 * 
 */