package com.mypractice.org.ArrayPractice;

public class FindTheMaximumElementInAnArray {

    /**
     * @param args
     * 
     * 
     * Find the maximum element in an array which is first increasing and then decreasing
     * 
     * 
     */
    public static void main(String[] args) {
	
	try
	{
	    //{8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1}
	    int[] a1 = {0, 1, 1, 2, 2, 2, 2, 2, 3, 4, 4, 5, 3, 3, 2, 2, 1, 1}; 
	    int max = new FindTheMaximumElementInAnArray().getMax(a1,0,a1.length);
	    System.out.println(max);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private int getMax(int[] a,int left,int right)
    {
	try
	{
	    int mid = (left+right)/2;
	    if(right==left+1&&a[left]>=a[right])
	    {
		return a[left];
	    }
	    else if(right==left+1&&a[left]<=a[right])
	    {
		return a[right];
	    }
	    else if(mid-1<=left&&mid+1<=right&&a[mid]>=a[mid+1]&&a[mid]>=a[mid-1])
	    {
		return a[mid];
	    }
	    else if(mid+1<=right&&a[mid]<=a[mid+1]&&a[mid]>=a[mid-1])
	    {
		return getMax(a,mid+1, right);
	    }
	    else if(mid-1<=left&&mid+1<=right&&a[mid]>=a[mid+1]&&a[mid]<=a[mid-1])
	    {
		return getMax(a,left,mid-1);
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    
    
    
}
