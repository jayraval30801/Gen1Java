package ArrayInJava;

public class Array2D {

	public static void main(String[] args) {
		
		int a[][] = new int[2][2];
		
		int[][] b = {{1,4},{5,8}};
		a[0][0] = 1;
		a[0][1] = 2;
		a[1][0] = 3;
		a[1][1] = 4;
		
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(" "+b[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
}

/*
 * Matrix : 
 * 		Row & Col : 
 * 	row col : 2*2 :
 *  1 2
 *  3 4 
 * 	1 2
 *  1 3
 *  2*3 :
 *   1 1 1
 *   3 1 2
 *  4*1 : 
 *   1	
 *   1	 
 *   5
 *   4
 *   
 *   
 *     
 *     
  * */
