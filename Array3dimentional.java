package com;

public class Array3dimentional {

	public static void main(String[] args) {
		
		// int[][][] a= {{{10,20},{30,40,50,60},{70,80,90}}};
		// System.out.print(a[0][0][0]);

		
		// int[][][] a = {{{10,20},{30,40,50,60},{70,80,90}}};
		// System.out.print(a[0][0][1]);
		
		
		// int[][][] a= {{{10,20},{30,40,50,60},{70,80,90}}};
		 // System.out.print(a.length);
		
		
		// int[][][] a= {{{10,20},{30,40,50,60},{70,80,90}}};
		//  System.out.print(a[0].length);
		 
		 
		// int[][][] a= {{{10,20},{30,40,50,60},{70,80,90}}};
		// System.out.print(a[0][0].length);
		
		
		// int[][][] a= {{{10,20},{30,40,50,60},{70,80,90}}};
		 //System.out.print(a[0][1].length);
		
//	OR for loop	
		
		int[][][] a = {{{10,20},{30,40,50,60},{70,80,90}}};
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length; j++)
			{
				for (int k=0; k<a[i][j].length; k++)
				{
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println();
			}
		}	
	}

}
