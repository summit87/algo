package com.mypractice.org.TreePractice;

public class CheckforIdenticaBSTswithoutbuildingthetrees {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	try
	{
	    int[] a = {8, 3, 6, 1, 4, 7, 10, 14, 13};
	    int[] b = {8, 10, 14, 3, 6, 4, 1, 7, 13};
	    int n=a.length;
	    int min=Integer.MIN_VALUE;
	    int max=Integer.MAX_VALUE;
	    CheckforIdenticaBSTswithoutbuildingthetrees c = new CheckforIdenticaBSTswithoutbuildingthetrees();
	    if(c.isBSTIdentical(a, b,0,0, min, max, n))
	    {
		System.out.println("Yes its is");
	    }
	    else
	    {
		System.out.println("Yes its not");
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    
    private boolean isBSTIdentical(int[] a,int[] b,int x,int y,int min,int max,int n)
    {
	try
	{
	    int j=0;int k=0;
	    for(j=x;j<=n;j++)
	    {
		if(a[j]>min&&a[j]<max)
		    break;
	    }
	    for(k=y;k<=n;k++)
	    {
		if(b[k]>min&&b[k]<max)
		    break;
	    }
	    if(j==n&&k==n)
	    {
		System.out.println(a[j]+" > "+b[k]);
		return true;
	    }
	    if(j<=n&&k<=n&&((j==n)^(k==n)||(a[j]!=b[k])))
	    {
		System.out.println(a[j]+" > "+b[k]);
		return false;
	    }
	    if(k<=n&&j<=n)
	    {
		System.out.println(a[j]+" > "+b[k]);
		return isBSTIdentical(a, b, j+1,k+1,a[j],max, n)&&
	    	       isBSTIdentical(a, b, j+1,k+1,min,a[j], n);
	    }
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    
    
    
}
