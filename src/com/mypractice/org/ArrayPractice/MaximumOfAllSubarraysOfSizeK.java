package com.mypractice.org.ArrayPractice;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumOfAllSubarraysOfSizeK {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	try
	{
	    int[] a =  {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
	    int k=4;
	    new MaximumOfAllSubarraysOfSizeK().maximumOfSubArray(a, k);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    
    private void usingDeQueueForMaximumSubArray(int[] a,int k)
    {
	try
	{
	    Deque<Integer> di = new LinkedList<Integer>();
	    int i=0;
	    for(i=0;i<k;i++)
	    {
		while(!di.isEmpty()&&a[i]>a[di.getLast()])
		{
		    di.pollFirst();
		}
		di.addLast(new Integer(i));
	    }
	    for(;i<a.length;i++)
	    {
		System.out.print(a[di.getLast()]+",");
		while(!di.isEmpty()&&i-k>=di.getLast())
		{
		    di.pollLast();
		}
		while(!di.isEmpty()&&a[i]>=a[di.getLast()])
		{
		    di.pollFirst();
		}
		di.addLast(new Integer(i));
	    }
	    System.out.print(a[di.getLast()]+",");
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    
    private void maximumOfSubArray(int[] a,int k)
    {
	try
	{
	    int max=0;
	    for(int i=0;i<a.length-k;i++)
	    {
		max=a[i];
		for(int j=1;j<k;j++)
		{
		    if(a[i+j]>max)
		    {
			max=a[i+j];
		    }
		}
		System.out.print(max+",");
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
}
