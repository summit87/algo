package com.mypractice.org.ArrayPractice;

public class MajorityElementInASortedArray {

    /**
     * @param args
     */
    public static void main(String[] args) {
	
	try
	{
	    int[] a = {1, 1, 2, 4, 4, 4, 4,6, 6};
	    int x=4;
	   // int i=new MajorityElementInASortedArray().isMajaority(a, x);
	   // System.out.println(i);
	    int i = new MajorityElementInASortedArray().binarySearch(a,0,a.length,x);
	    if(i==-1)
	    {
		System.out.println("NO Element Is Exist");
	    }
	    else
	    {
		System.out.println(" > "+a[(i+(a.length/2))]);
		if((i+((a.length/2)-1))<a.length&&a[i+((a.length/2)-1)]==x)
		{
		    System.out.println("That Element is in majority");
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
   
    
    
    
    private int binarySearch(int[] a,int l,int r,int x)
    {
	try
	{
	    int mid = (l+r)/2;
	    if(a[mid]==x&&x>=a[mid-1])
	    {
		return mid;
	    }
	    else
	    {
		if(a[mid]>x)
		{
		    return binarySearch(a, l,mid-1, x);
		}
		else 
		{
		    return binarySearch(a, mid+1, r, x);
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
