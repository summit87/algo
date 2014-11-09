package com.mypractice.org.ArrayPractice;

import javax.swing.text.Position.Bias;

public class SearchingIn2DSortedMattrixUsingBinarySearch {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	try
	{
	    int[][]m =  new int[][] { 	      {10, 20, 30, 40}, 
                        		      {15, 25, 35, 45},
                        		      {27, 29, 37, 48},
                        		      {32, 33, 39, 50}
                        	  };
	    int key = 50;
	    
	    int l = 3;
	    int row=0;
	    while(row!=4&&l>=0)
	    {
		if(m[row][l] > key)
		{
		        l--;
        		int index = new SearchingIn2DSortedMattrixUsingBinarySearch().binarySearch(m[row],0,l, key);
        		if(index>0)
        		{
        		    System.out.println(" > "+index);
        		    break;
        		}
		}
		if(m[row][l] < key)
		{
		        l--;
        		int index = new SearchingIn2DSortedMattrixUsingBinarySearch().binarySearch(m[row],0,l, key);
        		if(index>0)
        		{
        		    System.out.println(" > "+index);
        		    break;
        		}
		}
		
		row++;
	    }
	    
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }
    
    
    private int binarySearch(int[] a,int leftIndex,int rightIndex,int key)
    {
	try
	{
	    int mid = (leftIndex+rightIndex)/2;
	    if(a[mid]==key)
	    {
		return mid;
	    }
	    else
	    {
		if(a[mid]>key)
		{
		    return binarySearch(a, leftIndex,mid-1, key);
		}
		else if(a[mid]<key)
		{
		    return binarySearch(a,mid+1, rightIndex, key);
		}
	    }
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }

}
