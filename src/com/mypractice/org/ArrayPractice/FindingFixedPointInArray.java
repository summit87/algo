package com.mypractice.org.ArrayPractice;

import javax.naming.BinaryRefAddr;

public class FindingFixedPointInArray {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	try
	{
	    int[] a={0, 2, 5, 8, 17};
	    System.out.println(new FindingFixedPointInArray().getFixedPointUsingBS(a,0,a.length));
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    /*With O(N) Time Complexity */
    private int getFixedPoint(int[] a)
    {
	try
	{
	    for(int i=0;i<a.length;i++)
	    {
		if(a[i]==i)
		{
		    return i;
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    /*Using Binary Search If Array Is Sorted*/
    
    
    private int getFixedPointUsingBS(int[] a,int left,int right)
    {
	try
	{
	    int mid = (left+right)/2;
	    if(mid==a[mid])
	    {
		return a[mid];
	    }
	    else if(mid>a[mid])
	    {
		return getFixedPointUsingBS(a,mid+1, right);
	    }
	    else
	    {
		return getFixedPointUsingBS(a, left,mid-1);
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
}
