package com;

//  ii) Selection Sort:- it is a combination of searching and sorting. it sorts an array by repeatedly 
//             finding the minimun element (considering ascending order) from unsorted part and putting it at the
//             beginning. in every iteration of selection sort the minimum element (cosidering ascending order)
//             from the unsorted subarray is picked and moved the sorted subarray.


public class SelectionSort {

	public static void main(String[] args) {
// integer pass	
/*
		int [] a = {38,52,9,18,6,62,13};
		int min, temp=0;
		for(int i=0; i<a.length; i++)
		{
			min=i;
			for(int j=i; j<a.length; j++)
			{
				if (a[j]<a[min])
				{
					min=j;
				}
			}
					temp = a[i];
					a[i] = a[min];
					a[min] = temp;
		}
          for (int i=0; i<a.length; i++)
          {
        	  System.out.println(a[i] + " ");
          }
 */
// String pass
          
          String [] a = {"Jayshree", "Munna", "Vimal","Priya","Shruti"};
  		int min;
  		String temp = " ";
  		for(int i=0; i<a.length; i++)
  		{
  			min=i;
  			for(int j=i; j<a.length; j++)
  			{
  				if (a[j].compareTo(a[min])<0)
  				{
  					min=j;
  				}
  			}
  					temp = a[i];
  					a[i] = a[min];
  					a[min] = temp;
  		}
            for (int i=0; i<a.length; i++)
            {
          	  System.out.println(a[i] + " ");
            }

          
          
          
	}

}
