package com;

public class MinimumValueOfArray {

	public static void main(String[] args) {
		

		int []a= {4,3,5,2,1,6};
		int min = a[0];
		for (int i=1; i<a.length;i++)
		{
			if (min > a[i])
			{
				min = a[i];
			}
		}
		System.out.println(" Maximum element is " + min);

	}

}