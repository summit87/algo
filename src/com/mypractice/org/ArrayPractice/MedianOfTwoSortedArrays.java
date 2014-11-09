package com.mypractice.org.ArrayPractice;

public class MedianOfTwoSortedArrays {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
		
	try
	{
	    int[] a1={1, 12, 15, 26, 38};
	    int[] a2={2, 13, 17, 30, 45};
	    int n=a1.length;
	    //int median = new MedianOfTwoSortedArrays().getMedian(a1, a2,a1.length);
//	    System.out.println("median > "+median);
	    int median  = new MedianOfTwoSortedArrays().medainOfTwoArrayUsingBinarySearch(a1, a2,0,n,a1.length);
	    System.out.println(median);
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }

    
    
    
    private int medainOfTwoArrayUsingBinarySearch(int[] a1,int[] a2,int left,int right,int n)
    {
	try
	{
	    if(left>right)
	    {
		return medainOfTwoArrayUsingBinarySearch(a2, a1,0, right,n);
	    }
	    else
	    {
		int mid = (left+right)/2;
		int j = n-mid-1;
		if(a1[mid]>a2[j]&&a1[mid]<a2[j+1]&&j+1<n)
		{
		    return (a1[mid]+a2[j])/2;
		}
		else
		{
		    if(a1[mid]>a2[j])
		    {
			return medainOfTwoArrayUsingBinarySearch(a1, a2, left,mid-1, n);
		    }
		    else if(a1[mid]<a2[j])
		    {
			return medainOfTwoArrayUsingBinarySearch(a1, a2,mid+1, right, n);
		    }
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    
    
    
    
    
    
    private int getMedian(int[] a1,int[] a2,int n)
    {
	try
	{
	    int m1=-1;
	    int m2=-1;
	    int i=0;
	    int j=0;
	    for(int c=0;c<=n;c++)
	    {
		if(i==n)
		{
		    m1=m2;
		    m2=a2[0];
		    break;
		}
		if(j==n)
		{
		    m1=m2;
		    m2=a1[0];
		    break;
		}
		if(a1[i]<a2[j])
		{
		    m1=m2;
		    m2=a1[i];
		    i++;
		}
		else
		{
		    m1=m2;
		    m2=a2[j];
		    j++;
		}
	    }
	    
	    System.out.println(m1+" > "+m2);
	    return (m1+m2)/2;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
}
