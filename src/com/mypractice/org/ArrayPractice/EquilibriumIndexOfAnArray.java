package com.mypractice.org.ArrayPractice;

public class EquilibriumIndexOfAnArray {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try
	{
	    int[] a = {-7, 1, 5, 2, -4, 3, 0};	
	    int eq = new EquilibriumIndexOfAnArray().getEquilibriumPoint1(a);
	    System.out.println(eq);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    private int getEquilibriumPoint1(int[] a)
    {
	try
	{
	    int sum=0;
	    int left=0;
	    for(int i=0;i<a.length;i++)
	    {
		sum+=a[i];
	    }
	    for(int i=0;i<a.length;i++)
	    {
		sum-=a[i];
		if(left==sum)
		{
		    return i;
		}
		left+=a[i];
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
	
    }
    
    
    /*O(N^2)*/
    private int getEquilibriumPoint(int[] a)
    {
	try
	{
	    for(int i=0;i<a.length;i++)
	    {
		int left=0;
		int right=0;
		int j=0;
		for(j=0;j<i;j++)
		{
		    left+=a[j];
		}
		for(j=i+1;j<a.length;j++)
		{
		    right+=a[j];
		}
		if(left==right)
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

}
