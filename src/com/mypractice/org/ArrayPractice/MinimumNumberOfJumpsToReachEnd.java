package com.mypractice.org.ArrayPractice;

public class MinimumNumberOfJumpsToReachEnd {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try
	{
	    int[] a = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
	    System.out.println("Mimuni > "+new MinimumNumberOfJumpsToReachEnd().getMinJump(a));
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    private int getMinJump(int[] a)
    {
	try
	{
	    int[] jump = new int[a.length];
	    for(int i=1;i<a.length;i++)
	    {
		jump[i]=Integer.MAX_VALUE;
		for(int j=0;j<i;j++)
		{
		    if(i<=j+a[j]&&jump[j]!=Integer.MAX_VALUE)
		    {
			jump[i]=minimum(jump[i],jump[j]+1);
			System.out.println(i+" > "+j);
			break;
		    }
		}
	    }
	    return jump[a.length-2];
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    private int minimum(int x1,int x2)
    {
	try
	{
	    return x1>x2?x2:x1;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }

}
