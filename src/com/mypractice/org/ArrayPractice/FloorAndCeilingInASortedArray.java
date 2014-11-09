package com.mypractice.org.ArrayPractice;

public class FloorAndCeilingInASortedArray {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	try
	{
	    int[] a = {1, 1, 8, 10, 10, 12, 18};
	    int x =  5;
	    int k = new FloorAndCeilingInASortedArray().getFloorOfArray(a, x);
	    System.out.println(k);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    private int getCellingOfArray(int[] a,int x)
    {
	try
	{
	    for(int i=0;i<a.length;i++)
	    {
		if(a[i]<x&&a[i+1]>=x)
		{
		    return a[i+1];
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    private int getFloorOfArray(int[] a,int x)
    {
	try
	{
	    int max=Integer.MIN_VALUE;
	    int l=0;
	    for(int i=0;i<a.length;i++)
	    {
		if(max < a[i] && max < x && a[i] < x)
		{
		    max=a[i];
		    l=i;
		}
	    }
	    return a[l];
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    
}
