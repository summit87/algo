package com.mypractice.org.ArrayPractice;

public class NumberOfPairs {

    /**
     * @param args
     * 
     * Find number of pairs such that x^y > y^x
     */
    public static void main(String[] args) {
	try
	{
	    int[] x = {1, 2, 6};
	    int[] Y = {1, 5};
	    int count=0;
	    /*O(NlogN) where N-->Length Of X*/
	    for(int i=0;i<x.length;i++)
	    {
		    int in = new NumberOfPairs().binarySearch(Y,0,Y.length-1,x[i]);
		    if(in>0)
		    {
			count +=Y.length-in;
		    }
	    }
	    /*O(MlogM) where M-->Length Of X*/
	    for(int i=0;i<Y.length;i++)
	    {
		int in = new NumberOfPairs().binarySearch(x,0,x.length-1,Y[i]);
		    if(in>0)
		    {
			count +=x.length-in;
		    }
		
	    }
	    System.out.println(count-1);
	    
	    /*Total Complexity is O(NLogN)+O(MlogM) */
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    
    
    
    
    
    
    
    
    
    private int binarySearch(int[] a,int lI,int rI,int key)
    {
	try
	{
	    int mid = (lI+rI)/2;
	    if(a[mid]>key)
	    {
		return mid;
	    }
	    else if(a[mid]<key&&mid+1<=rI)
	    {
		return binarySearch(a, mid+1, rI, key);
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
}
