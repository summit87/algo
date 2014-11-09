package com.mypractice.org.ArrayPractice;

public class ElementInASortedAndRotated {

    /**
     * @param args
     * 
     * Find the minimum element in a sorted and rotated array
     */
    public static void main(String[] args) {
	
	try
	{
	    int[] a = {2, 2, 2, 0, 2, 3, 3};
	  // int[] a = {5,6,1,1,2,3};
	   int ind = new ElementInASortedAndRotated().binarySearch(a,0,a.length-1);
	   System.out.println(ind);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }
    
    
    private int minimumEle(int min1,int min2)
    {
	try
	{
	    if(min1>min2)
	    {
		return min2;
	    }
	    return min1;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    private int binarySearch(int[] a,int low,int high)
    {
	try
	{
	    int mid = (low+high)/2;
	    if(a[mid]>a[mid+1] && (mid+1)<high&&(mid+1)>low)
	    {
		return a[mid+1];
	    }
	    if(a[mid]<a[mid-1] && mid<high&&mid>low)
	    {
		return a[mid];
	    }
	    if((a[mid]==a[high]&&a[mid]==a[low])&& (mid+1)<high&&(mid-1)>low)
	    {
		return this.minimumEle(binarySearch(a, low,mid-1), binarySearch(a, mid+1, high));
	    }
	    if(a[mid]<a[high] && mid<high&&mid>low)
	    {
		return binarySearch(a, low,mid-1);
	    }
	    else if(a[mid]>a[low] && (mid+1)<high&&(mid-1)>low)
	    {
		return binarySearch(a, mid+1, high);
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
}
