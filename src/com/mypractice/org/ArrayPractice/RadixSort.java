package com.mypractice.org.ArrayPractice;

public class RadixSort {

    /**
     * <code>@param args</code> </strong>
     */
    static int[] ar = new int[10];
    public static void main(String[] args) {
	try
	{
	    int[] a = {170, 45, 75, 90, 802, 24, 2, 66};
	    new RadixSort().radixSort(a);
	    for(int i=0;i<ar.length;i++)
	    {
		System.out.print(ar[i]+",");
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }
    
    private void radixSort(int[] a)
    {
	try
	{
	    int m = this.getMaxVal(a,a.length);
	    System.out.println("MAX-->"+m);
	    for(int i=1;m/i>=0;i*=10)
	    {
		this.countSort(a,i, a.length);
		System.out.println("*****************");
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    

    
    private void countSort(int[] a,int exp,int n)
    {
	try
	{
	   int[] outPut = new int[n];  
	   int[] count = new int[10];
	   for(int i=1;i<n;i++)
	   {
	       count[(a[i]/exp)%10]++;
	   }
	   for(int i=1;i<n;i++)
	   {
	       count[i]+=count[i-1];
	   }
	   for(int i=n-1;i>0;i--)
	   {
	       outPut[count[(a[i]/exp)%10]-1] = a[i];
	       count[(a[i]/exp)%10]--;
	   }
	   
	   for(int i=0;i<n;i++)
	   {
	       ar[i] = outPut[i];
	       System.out.println(ar[i]);
	       System.out.println("----------------------");
	   }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    private int getMaxVal(int[] a,int n)
    {
	try
	{
	    int max=0;
	    for(int i=0;i<n;i++)
	    {
		if(max<a[i])
		{
		    max=a[i];
		}
	    }
	    return max;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    
}
