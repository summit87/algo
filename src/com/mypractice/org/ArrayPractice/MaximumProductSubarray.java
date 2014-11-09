package com.mypractice.org.ArrayPractice;

public class MaximumProductSubarray {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try
	{
	    int[] a = {6, -3, -10, 0, 2};
	    int maxProd = new MaximumProductSubarray().getMaxProd(a);
	    System.out.println("maxProd > "+maxProd);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private int getMaxProd(int[] a)
    {
	try
	{
	    int max=1;int min=1;
	    int max_so_far=0;
	    int start=0;
	    int start1=0;
	    int end=0;
	    for(int i=0;i<a.length;i++)
	    {
		if(a[i]>0)
		{
		    max=max*a[i];
		    min = getMin(min*a[i],1);
		    start = i;
		}
		else if(a[i]==0)
		{
		    max=1;
		    min=1;
		    start = i;
		}
		else
		{
		    int temp=max;
		    max=getMax(min*a[i],a[i]);
		    min = temp*a[i];
		    //start = i;
		}
		if(max_so_far<max)
		{
		    max_so_far=max;
		    start1 = start+1;
		    end=i;
		}
	    }
	    System.out.println("Start-->"+start1+" end >> "+end);
	    return max_so_far;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    private int getMin(int x1,int x2)
    {
	try
	{
	    return x1 > x2 ? x2 : x1;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    private int getMax(int x1,int x2)
    {
	try
	{
	    return x1 > x2 ? x1 : x2;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
}


