package com.mypractice.org.ArrayPractice;

public class LargestSubarrayWithEqualNumberOf0sAnd1s {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try
	{
	    int[] a = {1, 0, 0, 1, 0, 1, 1};
	    new LargestSubarrayWithEqualNumberOf0sAnd1s().getMaxSubArray(a);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }
    
    private void getMaxSubArray(int[] a)
    {
	try
	{
	    int start=0;int sum=0;int j=0;int max0=0;int max1=0;int end=0;
	    int len=0;
	    int sum1=0;
	    for(int i=0;i<a.length;i++) 
	    {
		j=i;
		while(j<a.length)
		{
		    if(a[j]==0)
		    {
			sum--;
		    }
		    else if(a[j]==1)
		    {
			sum++;
		    }
		    
			//sum=max0-max1;
			if(sum==0&&len<(j-i+1))
			{
			    len = j-i+1;
			    start = i;
			}
		   
		    j++;
		}
		
	    }
	    System.out.println("Sum > "+sum1);
	    System.out.println("Start > "+start+" end > "+len);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }

}
