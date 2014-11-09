package com.mypractice.org.ArrayPractice;

public class CountTheNumberOfOccurrencesInASortedArray {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try
	{
	    int[] a = {1, 1,2, 2, 2, 2, 2, 2,3,};
	    int x=2;
	    int i = new CountTheNumberOfOccurrencesInASortedArray().getOccurence(a, x);
	    int j = new CountTheNumberOfOccurrencesInASortedArray().getFirstBinarySearch(a,0,a.length-1, x, a.length);
	    int j1 = new CountTheNumberOfOccurrencesInASortedArray().getFirstBinarySearch(a,j,a.length-1, x, a.length);
	    System.out.println(j1);	
	    System.out.println(j);
	    System.out.println(i);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    
    private int getFirstBinarySearch(int[] a,int left,int right,int x,int n)
    {
	try
	{
	    int mid = (left+right)/2;
	    if(mid==0&&x>a[mid-1]||(a[mid]==x))
	    {
		return mid;
	    }
	    else
	    {
		if(x<a[mid]&&mid-1>left)
		{
		    return getFirstBinarySearch(a, left,mid-1, x, n);
		}
		else if(x>a[mid]&&mid+1<right)
		{
		    return getFirstBinarySearch(a,mid+1, right, x, n);
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    private int getLastBinarySearch(int[] a,int left,int right,int x,int n)
    {
	try
	{
	    int mid = (left+right)/2;
	    if(mid==n-1&&x<a[mid+1]||(a[mid]==x))
	    {
		return mid;
	    }
	    else
	    {
		if(x<a[mid]&&mid-1>left)
		{
		    return getFirstBinarySearch(a, left,mid-1, x, n);
		}
		else if(x>a[mid]&&mid+1<right)
		{
		    return getFirstBinarySearch(a,mid+1, right, x, n);
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    
    
    private int getOccurence(int[] a,int x)
    {
	try
	{
	    int[] count = new int[a.length];
	    for(int i=0;i<a.length;i++)
	    {
		count[a[i]]++;
	    }
	    for(int i=0;i<a.length;i++)
	    {
		if(count[i]!=0&&a[i]==x)
		{
		    return count[i];
		}
	    }
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
}
