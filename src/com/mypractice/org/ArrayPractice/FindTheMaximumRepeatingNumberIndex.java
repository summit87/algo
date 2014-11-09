package com.mypractice.org.ArrayPractice;

public class FindTheMaximumRepeatingNumberIndex {

    /**
     * @param args
     * Find the maximum repeating number in O(n) time and O(1) extra space
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	try
	{
	    int[] array = {2, 3, 3, 5,5,6,5,5,5,5,5,5,5,5, 3, 4, 1, 7};
	    int j = new FindTheMaximumRepeatingNumberIndex().getIndex1(array);
	    System.out.println(j);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }

    
    
    private int getIndex1(int[] a)
    {
	try
	{
	    int k = a.length;
	    for(int i=0;i<a.length;i++)
	    {
		a[a[i]%k]+=k;
	    }
	    for(int i=0;i<a.length;i++)
	    {
		System.out.print(a[i]+",");
	    }
	    int max=0;
	    int j=0;
	    int j1=0;
	    for(j=0;j<a.length;j++)
	    {
		if(a[j]>max)
		{
		    max= a[j];
		    j1=j;
		}
	    }
	    return j1;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    
    
    
    private int getIndex(int[] a)
    {
	try
	{
	    int[] count = new int[10];
	    for(int i=0;i<a.length;i++)
	    {
		count[a[i]]++;
	    }
	    int max=0;
	    int j=0;
	    for(int i=0;i<count.length;i++)
	    {
		if(count[i]!=0&&count[i]>max)
		{
		    max=count[i];
		    j=i;
		}
	    }
	    return j;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    
    
    
    
}
