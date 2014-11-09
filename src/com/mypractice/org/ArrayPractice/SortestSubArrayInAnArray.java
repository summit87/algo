package com.mypractice.org.ArrayPractice;

public class SortestSubArrayInAnArray {

    /**
     * @param args
     * 
     * Given an unsorted array of ints,sort the shortest sub-array which results in sorting of the whole array.
     * 
     * 
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	try
	{
	    int[] a = {-1,0,4,3,2,1,7,8,9};
	    new SortestSubArrayInAnArray().getShortestSubArray(a,0,a.length);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	

    }

    
    
    private void getShortestSubArray(int[] a,int begI,int endI)
    {
	try
	{
	    int index1=0;
	    int index2=0;
	    for(int i=0;i<a.length;i++)
	    {
		if(a[i]>a[i+1])
		{
		    index1=i;
		    break;
		}
	    }
	    for(int j=a.length-1;j>=0;j--)
	    {
		if(a[j-1]>a[j])
		{
		    index2=j;
		    break;
		}
	    }
	    int max=this.getMaxEle(a,index1,index2);
	    int min=this.getMinEle(a,index1,index2);
	    int x1=0;
	    int x2=0;
	    System.out.println(" >> "+max);
	    System.out.println(" >> "+min);
	    for(int i=0;i<=index1;i++)
	    {
		if(min<a[i])
		{
		    min=a[i];
		    x1=i;
		    break;
		}
	    }
	    for(int i=index2+1;i<a.length;i++)
	    {
		if(max>a[i])
		{
		    max=a[i];
		    x2=i;
		    break;
		}
	    }
	    
	    System.out.println(">> "+x2+" >> "+max);
	    System.out.println(">> "+x1+" >> "+min);
	    System.out.println(index1+" > "+index2);
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    
    private int getMaxEle(int[] a,int i,int j)
    {
	try
	{
	    int max=Integer.MAX_VALUE;
	    for(int k=i;k<=j;k++)
	    {
		if(max>a[k])
		{
		    max=a[k];
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
    
    
    private int getMinEle(int[] a,int i,int j)
    {
	try
	{
	    int min=Integer.MIN_VALUE;
	    for(int k=i;k<=j;k++)
	    {
		if(min<a[k])
		{
		    min=a[k];
		}
	    }
	    return min;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
}
