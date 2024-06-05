package com;


// Sorting: - It is the process of arranging the data in some logical order. In case of numeric values, 
//            logical order may be in ascending or descending order. In case of alphanumeric values, it can be
//             in dictionary order.

 //   ==>    Type of sorting:-
//           i) Bubble Sort:- it referred to as sinking sort is a comparison based algorithm i.e comparing
//                      each pair of adjacent items and swapping them if they are in the wrong order. The pass
//                       through the list is repeated until no. swaps are needed which indicates that the
//                       list is sorted.

public class SortingBubbleSort {

	public static void main(String[] args) {
	
/*
		int [] a = {36,19,29,12,5};
		int temp;
		for(int i=0; i>a.length; i++)
		{
			int flag = 0;
			for(int j=0; j<a.length; j++)
			{
				if (a[j]>a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = 1;
				}
			}
			if (flag==0)
			{
				break;
			}
		}
          for (int i=0; i<a.length; i++)
          {
        	  System.out.println(a[i] + "");
          }
  */
		
		// CompareTo: - it is used to comparing two string lexicographyically. each character of both the 
		//              strings is converted into a unicode value for comparision. if both the strings are equal
		//              then this method returns() else it return positive or negative value. The result is 
		//              positive if the first string is lexicographically greater then the second string else 
		//              the result would be positive
		
		String [] a = {"Jaya", "Anjali", "Anju","Deepika"};
		String temp;
		for(int i=0; i>a.length; i++)
		{
			int flag = 0;
			for(int j=0; j<a.length; j++)
			{
				if (a[j].compareTo(a[j+1]) >0)
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = 1;
				}
			}
			if (flag==0)
			{
				break;
			}
		}
          for (int i=0; i<a.length; i++)
          {
        	  System.out.println(a[i] + "");
          }
	}

}
