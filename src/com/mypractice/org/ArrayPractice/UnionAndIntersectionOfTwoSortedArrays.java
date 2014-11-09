package com.mypractice.org.ArrayPractice;

public class UnionAndIntersectionOfTwoSortedArrays {

    /**
     * @param args
     */
    public static void main(String[] args) {
	
	try
	{
	    
	    /* 
	     * If suppose we want to find common element among 3 sorted array the the step u have to fallow
	     * 
	     * 1. Take intersection of two sorted array and store it in temp array
	     * 2. and then again take intersection of third array and temp 
	     * 3. Then u will get commom element between two array i.e temp and array3
	     * 
	     */
	    
	    int[] ar1 = {1, 5, 10, 20, 40, 80};
	    int[] ar2= {6, 7, 20, 80, 100};
	    int[] ar3= {3, 4, 15, 20, 30, 70, 80, 120};
	    new UnionAndIntersectionOfTwoSortedArrays().getUnionInBetweenThreeElement(ar1, ar2, ar3);
 
	    
//	    int[] a1= {1, 3, 4, 5, 7};
//	    int[] a2= {2, 3, 5, 6};
//	    for(int k : new UnionAndIntersectionOfTwoSortedArrays().getUnion(a1, a2))
//	    {
//		if(k!=0)
//		{
//		    System.out.print(k+",");
//		}
//	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private int[] getUnion(int[] a1,int[] a2)
    {
	try
	{
	    int[] temp = new int[a1.length+a2.length-1];
	    int j=0;
	    int i=0;
	    int k=0;
	    while(i<a1.length&&j<a2.length)
	    {
		if(a1[i]<a2[j])
		{
		    temp[k] = a1[i];//For intersection comment these line
		    i++;
		}
		else if(a1[i]>a2[j])
		{
		    temp[k] = a2[j];//For intersection comment these line
		    j++;
		}
		else if(a1[i]==a2[j])
		{
		    temp[k] = a1[i];
		    i++;
		    j++;
		}
		k++;
	    }
	    
	    /*For getting intersection comment the billow two while loop*/
	    while(i<a1.length)
	    {
		temp[k] = a1[i];
		k++;
		i++;
	    }
	    while(j<a2.length)
	    {
		temp[k] = a2[j];
		j++;k++;
	    }
	    return temp;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    
    private void getUnionInBetweenThreeElement(int[] a1,int[] a2,int[] a3)
    {
	try
	{
	    int i=0;
	    int j=0;
	    int k=0;
	    
	    
	    while(i<a1.length&&j<a2.length&&k<a3.length)
	    {
		if(a1[i]==a2[j]&&a2[j]==a3[k])
		{
		    System.out.println(a1[i]+","+a2[j]+","+a3[k]);
		    i++;
		    k++;
		    j++;
		}
		else if(a1[i]<a2[j])
		{
		    i++;
		}
		else if(a2[j]<a3[k])
		{
		    j++;
		}
		else
		{
		    k++;
		}
	    }
	    
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
}
