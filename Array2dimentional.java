package com;

public class Array2dimentional {

	public static void main(String[] args) {
		

	//	int[][] a = {{10,20,30,40},{50,60},{70,80,90}};
	//	System.out.println(a[0][0]);
   
   
	//	int[][] a = {{10,20,30,40},{50,60},{70,80,90}};
	//	System.out.println(a.length);
    
    
	//	int[][] a = {{10,20,30,40},{50,60},{70,80,90}};
	//	System.out.println(a[0].length);
	
		
	//	int[][] a = {{10,20,30,40},{50,60},{70,80,90}};
	//	System.out.println(a[1].length);
		
		
	//	int[][] a = {{10,20,30,40},{50,60},{70,80,90}};
	//	System.out.println(a[2].length);
		
		
		int[][] a = {{10,20,30,40},{50,60},{70,80,90}};
		for (int i = 0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
