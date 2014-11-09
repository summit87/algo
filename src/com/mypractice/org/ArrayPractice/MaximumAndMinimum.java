package com.mypractice.org.ArrayPractice;

public class MaximumAndMinimum {

    /**
     * @param args
     * 
     * 
     * Write a C function to return minimum and maximum in an array. You program should make minimum number 
     * of comparisons.
     * 
     * 
     */
    public static void main(String[] args) {
		
	try
	{
	    int[] a = {1000, 11, 445, 1, 330, 3000};
	    String s = new MaximumAndMinimum().getMaxMin1(a);
	    System.out.println(s);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    /*Time Complexity Is O(N) With minimum comparision*/
    private String getMaxMin(int[] a)
    {
	try
	{
	    int min=0;
	    int max=0;
	    if(a.length==1)
	    {
		min=a[0];
		max=a[0];
	    }
	    else
	    {
		if(a[0]>a[1])
		{
		    min=a[1];
		    max=a[0];
		}
		else
		{
		    min=a[0];
		    max=a[1];
		}
		for(int i=2;i<a.length;i++)
		{
		    if(a[i]>max)
		    {
			 max=a[i];
		    }
		    else if(a[i]<min)
		    {
			 min=a[i];
		    }
		}
	    }
	    return min+" : "+max;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    
    private String getMaxMin1(int[] a)
    {
	try
	{
	    int max=0;
	    int min=0;
	    int n = a.length;
	    int i=0;
	    if(n%2==0)
	    {
		if(a[0]>a[1])
		{
		    min=a[1];
		    max=a[0];
		}
		else
		{
		    min=a[0];
		    max=a[1];
		}
		i=2;
	    }
	    else
	    {
		min = a[0];
		max=a[0];
		i=1;
	    }
	    
	    for(int j=i;j<=a.length-i;j+=2)
	    {
		if(a[j]>a[j+1])
		{
		    if(a[j]>max)
		    {
			max=a[j];
		    }
		    if(a[j+1]<min)
		    {
			min=a[j+1];
		    }
		}
		else
		{
		    if(a[j+1]>max)
		    {
			max=a[j+1];
		    }
		    if(a[j]<min)
		    {
			min=a[j];
		    }
		}
	    }
	    return min+" : "+max;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    
    
    
    
    
}
