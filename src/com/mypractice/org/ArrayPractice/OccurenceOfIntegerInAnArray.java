package com.mypractice.org.ArrayPractice;

import java.util.HashMap;

import javax.naming.BinaryRefAddr;

public class OccurenceOfIntegerInAnArray {

    /**
     * @param args
     * 
     * Find the first repeating element in an array of integers
     * 
     * 
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	try
	{
	    int[] a = {10, 5, 3, 4, 3, 6, 6};
	    OccurenceOfIntegerInAnArray o = new OccurenceOfIntegerInAnArray();
	    o.occurence11(a);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    /*Occurence by using binary search*/
    
    
    
    private void occurence11(int[] a)
    {
	try
	{
	    for(int i=0;i<a.length;i++)
	    {
		int k = occurence_usingBinarySearch(a,0,a.length-1,a[i]);
		if(k!=-1)
		{
		    int k2 = occurence_usingBinarySearch(a,k+1,a.length-1,a[i]);
		    if(k2!=-1)
		    {
			System.out.println("First Occurenece : "+a[k2-k+1]);
			break;
		    }
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    private int occurence_usingBinarySearch(int[] a,int lowIndex,int highIndex,int key)
    {
	try
	{
	    int mid = (lowIndex+highIndex)/2;
	    if(a[mid]==key)
	    {
		return mid;
	    }
	    else if(key<a[mid]&&mid-1>lowIndex)
	    {
		return occurence_usingBinarySearch(a, lowIndex,mid-1, key);
	    }
	    else if(key>a[mid]&&mid+1<highIndex)
	    {
		return occurence_usingBinarySearch(a,mid+1, highIndex, key);
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    
    
    
    
    
    /*Using hash Map*/
    
    private void occurence1(int[] a)
    {
	try
	{
	    HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
	    for(int i=0;i<a.length;i++)
	    {
		if(h.containsKey(a[i]))
		{
		    System.out.println("First Occurenece : "+a[i]);
		    break;
		}
		else
		{
		    h.put(a[i],i);
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    /*Time complexity is O(N)*/
    private void occurence(int[] a)
    {
	try
	{
	    int i=0;
	    int j=a.length-1;
	    while(i<a.length-1&&j>=0)
	    {
		if(a[i]==a[j])
		{
		    System.out.println("First Occurenece : "+a[i]);
		    break;
		}
		j--;
		i++;
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }

}
