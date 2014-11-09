package com.mypractice.org.ArrayPractice;

public class MinimumDistanceBetweenTwoNumbers {

    /**
     * @param args
     */
    public static void main(String[] args) {
	
	try
	{
	    int[] a = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
	    System.out.println(new MinimumDistanceBetweenTwoNumbers().getMinDistance(a, 3, 6));
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    private int getMinDistance(int[] a,int x,int y)
    {
	try
	{
	    int pre=0;
	    int minDis=Integer.MAX_VALUE;
	    int i=0;
	    for(i=0;i<a.length;i++)
	    {
		if(x==a[i]||y==a[i])
		{
		    pre=i;
		    break;
		}
	    }
	    
	    for(;i<a.length;i++)
	    {
		if(x==a[i]||y==a[i])
		{
		    	if(a[i]!=a[pre]&&minDis>Math.abs((i-pre)))
			{
			    minDis = Math.abs((i-pre));
			    pre=i;
			}
			else
			{
			    pre=i;
			}
		}
	    }
	    return minDis;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
}
