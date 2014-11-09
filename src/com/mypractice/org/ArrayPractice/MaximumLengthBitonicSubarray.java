package com.mypractice.org.ArrayPractice;

public class MaximumLengthBitonicSubarray {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try
	{
	    int[] a =   {12, 4, 78, 90, 45, 23};
	    int maxLen = new MaximumLengthBitonicSubarray().maxBiotonicLength(a);
	    System.out.println(maxLen);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }
    
    private int maxBiotonicLength(int[] a)
    {
	try
	{
	    int max1=0;
	    int max2=0;
	    int k1=0;
	    int k2=0;
	    
	    for(int i=0;i<a.length-1;i++)
	    {
		if(a[i]<=a[i+1])
		{
		    max1=i;
		    k1++;
		}
	    }
	    for(int j=a.length-1;j>=1;j--)
	    {
		if(a[j]<=a[j-1])
		{
		    max2=j;
		    k2++;
		}
	    }
	    if(a[max1+1]==a[max2+max1])
	    {
		System.out.println("Common Ele > "+a[max2+max1]);
		return k1+k2;
	    }
	    
	}
	
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }

}
