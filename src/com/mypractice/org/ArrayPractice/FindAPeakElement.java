package com.mypractice.org.ArrayPractice;

public class FindAPeakElement {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try
	{
	    int[] a =  {10, 20, 15, 2, 23, 90, 67};
	    int j=0;
	    int i=0;
	    /*If u remove the loop then u will get first ocurrence of peak element */
	    while(i<a.length-1)
	    {
		j=new FindAPeakElement().getPeakElement(a,i,a.length-1,a.length);
		System.out.println("Peak-->"+a[j]);
		i+=j+1;
	    }
//	    int peak = new FindAPeakElement().getPeakI(a);
//	    System.out.println("Peak-->"+a[peak]);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }
    
    private int getPeakI(int[] a)
    {
	try
	{
	    int i=0;
	    for(i=0;i<a.length-1;i++)
	    {
		if(a[i+1]<a[i]&&a[i]>a[i+2])
		{
		    break;
		}
	    }
	    return i;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    private int getPeakElement(int[] a,int low,int high,int n)
    {
	try
	{
	    int mid=(low+high)/2;
	    if(mid==0)
	    {
		return a[mid];
	    }
	    else if(mid==n-1)
	    {
		return mid;
	    }
	    else if(a[mid-1]<a[mid]&&a[mid]>a[mid+1])
	    {
		return mid;
	    }
	    if(a[mid-1]>a[mid])
	    {
		return getPeakElement(a, low,mid-1, n);
	    }
	    return getPeakElement(a,mid+1, high, n);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    

}
