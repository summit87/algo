package com.mypractice.org.ArrayPractice;

public class MaximumSumIncreasingSubsequence {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	try
	{
	    int[] a={1, 101, 2, 3, 100, 4, 5};
	    new MaximumSumIncreasingSubsequence().getMaximumSubArray(a);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private void getMaximumSubArray(int[] a)
    {
	try
	{
	    int[] maxLength = new int[a.length];
	    int[] sub = new int[a.length];
	    for(int i=0;i<a.length;i++)
	    {
		sub[i]=-1;
	    }
	    for(int i=0;i<a.length;i++)
	    {
		maxLength[i]=a[i];
	    }
	    for(int i=0;i<a.length;i++)
	    {
		for(int j=0;j<i;j++)
		{
		    if(a[i]>a[j]&&maxLength[i]<(maxLength[j]+a[i]))
		    {
			maxLength[i]=maxLength[j]+a[i];
			sub[j]=j;
			System.out.println(j);
		    }
		}
	    }
	    for(int i=0;i<sub.length;i++)
	    {
		if(sub[i]>=0)
		System.out.println(sub[i]+"> "+a[sub[i]]);
	    }
	    System.out.println();
	    int max=0;
	    for(int i=0;i<a.length;i++)
	    {
		if(max<maxLength[i])
		{
		    max=maxLength[i];
		}
	    }
	    System.out.println(max);
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
}
