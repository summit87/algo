package com.mypractice.org.ArrayPractice;

public class CountSort {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try
	{
	    int[] a1 = {0, 23, 14, 12, 9};
	    int[] a = new CountSort().array(a1,24);
	    for(int i=0;i<9;i++)
	    {
		System.out.print(a[i]+",");
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private int[] array(int[] a,int range)
    {
	try
	{
	    int[] count = new int[range];
	    int[] outPut = new int[range];
	    count[0]=0;
	    for(int i = 1;i<a.length;i++)
	    {
		count[a[i]]++;
	    }
	    for(int i=1;i<range;i++)
	    {
		count[i] += count[i-1];
	    }
	    for(int j=1;j<a.length;j++)
	    {
		outPut[count[a[j]]-1] = a[j];
		count[a[j]]--;
	    }
	    return outPut;
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    
    
}
