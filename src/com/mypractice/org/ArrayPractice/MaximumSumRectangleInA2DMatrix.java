package com.mypractice.org.ArrayPractice;

public class MaximumSumRectangleInA2DMatrix {

    /**
     * @param args
     * 
     * Check this program again...
     * 
     * 
     */
    static int start=0;
    static int end=-1;
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	try
	{
	    int[][] a = {
		    		{1, 2, -1, -4, -20},
		    		{-8, -3, 4, 2, 1},
		    		{3, 8, 10, 1, 3},
		    		{-4, -1, 1, 7, -6}
                   	};
	    
	    new MaximumSumRectangleInA2DMatrix().getSubMattrix(a);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private int maxSumByKadaneAlgo(int[] a,int n)
    {
	try
	{
	    int maxSum=0;
	    int max_frwd = 0;
	    int ls = 0;
	    for(int i=0;i<n;i++)
	    {
		if(maxSum<0)
		{
		    maxSum=a[i];
		    ls=i+1;
		}
		else
		{
		    maxSum+=a[i];
		}
		if(maxSum>max_frwd)
		{
		    max_frwd = maxSum;
		    start=ls;
		    end=i;
		}
	    }
	    if(end!=-1)
	    {
		return max_frwd;
	    }
	    maxSum=a[0];
	    max_frwd = a[0];
	    start=0;
	    end=0;
	    for(int i=0;i<a.length;i++)
	    {
		if(a[i]>maxSum)
		{
		    maxSum=a[i];
		    start=end=0;
		}
	    }
	    return maxSum;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    private void getSubMattrix(int[][] a)
    {
	try
	{
	    int leftIndex=0;
	    int rightIndex=0;
	    int startLeft=0;
	    int endRight=0;
	    int row=4;
	    int colum = 5;
	    int sum=0;
	    int[] temp = new int[5];
	    int maxSum=0;
	    for(int i=0;i<colum;i++)
	    {
		for(int right=i;right<colum;right++)
		{
		    for(int k=0;k<row;k++)
		    {
			temp[k]+=a[k][right];
		    }
		    sum=this.maxSumByKadaneAlgo(temp,temp.length);
		    if(sum>maxSum)
		    {
			maxSum=sum;
			leftIndex=i;
			rightIndex=right;
			startLeft=start;
			endRight = end;
		    }
		}
	    }
	    
	    System.out.println("(Start Left : end Left )--->"+"("+startLeft+" : "+leftIndex+")");
	    System.out.println("(Start Right : end Right )--->"+"("+endRight+" : "+rightIndex+")");
	    //System.out.println(leftIndex+" > "+startLeft+" > "+rightIndex+" > "+endRight);
	    System.out.println(maxSum);
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
}
