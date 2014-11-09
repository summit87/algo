package com.mypractice.org.ArrayPractice;

public class FindTheRowWithMaximumNumberOf1s {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	
	int[][] a = {   {0, 0, 0, 1},
	        	{0, 1, 1, 1},
	        	{1, 1, 1, 1},
	        	{0, 0, 0, 0}
	    	    };
	int row=4;
	int col=4;
	int k = new FindTheRowWithMaximumNumberOf1s().getMaxRowOf1s(a, row, col);
	System.out.println(k);

    }
    
    
    
    private int getMaxRowOf1s(int[][] a,int row,int col)
    {
	try
	{
	    int max=0;
	    int k=0;
	    for(int i=0;i<row;i++)
	    {
		int ind = this.binarySearch(a[i],0,col);
		
		if(ind!=-1)
		{
		    if(col-ind>=max)
		    {
			max=col-ind;
			k=i;
		    }
		}
	    }
	    return k;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    
    private int binarySearch(int[] a,int left,int right)
    {
	try
	{
	    int mid = (left+right)/2;
	    if(a[mid]==1)
	    {
		return mid;
	    }
	    else if(a[mid]<1&&mid+1<right)
	    {
		return binarySearch(a, mid+1,right);
	    }
	    else if(left<mid-1)
	    {
		return binarySearch(a,left,mid-1);
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }

}
