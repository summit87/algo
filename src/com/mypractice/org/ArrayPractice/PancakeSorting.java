package com.mypractice.org.ArrayPractice;

public class PancakeSorting {

    /**
     * @param args
     */
    
   static int[] a = {23, 10, 20, 11, 12, 6, 7};
    public static void main(String[] args) {
	try
	{
	    //
	    new PancakeSorting().paneCakeSort(a,a.length-1);
	    for(int i=0;i<a.length;i++)
	    {
		System.out.print(a[i]+",");
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private void paneCakeSort(int[] a,int n)
    {
	try
	{
	    for(int i=n;i>=0;i--)
	    {
		int maxInd = this.getMax(i);
		if(maxInd!=i-1)
		{
		    this.flipArray(maxInd);
		    this.flipArray(i-1);
		}
	    }
	  
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	
    }
    
    
    
    private void flipArray(int maxIndex)
    {
	try
	{
	    int start=0;
	    while(start<=maxIndex)
	    {
		int temp = a[maxIndex];
		a[maxIndex]=a[start];
		a[start]=temp;
		start++;
		maxIndex--;
	    }

	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	
    }
    
    
    private int getMax(int n)
    {
	try
	{
	    int max=0;
	    int ind=0;
	    for(int i=0;i<n;i++)
	    {
		if(a[i]>max)
		{
		    max = a[i];
		    ind = i;
		}
	    }
	    return ind;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    
}
