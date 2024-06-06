package com;

public class LinearSearchString {

	public static void main(String[] args) {
		String [] arr= {"deepu","Anju", "Jaya","Anu","Kito"};
		String item = "Jaya";
		int temp=0;
		for (int i=0; i<arr.length;i++)
		{
			if (arr[i].equals (item))
			{
				System.out.println(" item present in " + i + " index Value " );
				temp = temp+1;
			}
		}
		if (temp==0);
		{
			System.out.println("item is not present in the list");
		}

	}

}
