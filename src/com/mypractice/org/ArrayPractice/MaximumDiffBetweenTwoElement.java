package com.mypractice.org.ArrayPractice;

public class MaximumDiffBetweenTwoElement {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try
	{
	    int[] a = {2, 3, 10, 6, 4, 8, 1};
	    
	    int i = new MaximumDiffBetweenTwoElement().getMaxDiff1(a);
	    System.out.println(i);
	} 
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    /**Total time complexity O(N) */
    private int getMaxDiff1(int[] a)
    {
	try
	{
	    int max_diff= a[1]-a[0];
	    int min_ele = a[0];
	    for(int i=1;i<a.length;i++)
	    {
		if(a[i]-min_ele>max_diff)
		{
		    max_diff= a[i]-min_ele;
		}
		if(a[i]<min_ele)
		{
		    min_ele = a[i];
		}
	    }
	    return max_diff;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    
    
    /*Total time complexity is O(N2)*/
    private int getMaxDiff(int[] a)
    {
	try
	{
	    int max_diff = a[1]-a[0];
	    for(int i=0;i<a.length;i++)
	    {
		for(int j=i+1;j<a.length;j++)
		{
		    int x = a[j]-a[i];
		    if(x>max_diff)
		    {
			max_diff = x;
		    }
		}
	    }
	    return max_diff;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    
    
}
