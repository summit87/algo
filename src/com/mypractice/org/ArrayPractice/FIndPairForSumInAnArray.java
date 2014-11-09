package com.mypractice.org.ArrayPractice;

import java.util.HashMap;

public class FIndPairForSumInAnArray {
    /**
     * 
     * @param args
     * 
     * If suppose we want to find 4 elements from an array for given sun then ALGO for that
     * 
     * 1. Sort the array element
     * 2. Take three loop 
     * 	  2.a 1st loop initilaise i from 0 to i-3
     *    2.b 2nd loop initilaise from i+1 to n-2
     *    2.c 3rd will be used for bellow logic i.e in getPair()
     * 3. from first two loop u will get two element and from third loop u will 2 more element , so total four element in O(N3) 
     * 
     */
    static int[] a={5, 20, 3, 2, 50, 80} ;
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	FIndPairForSumInAnArray f = new FIndPairForSumInAnArray();
//	f.quickSort(0,a.length-1);
//	f.getPair(a,16);
	f.getPairUsingHashMap(a, 51);
//	for(int l : a)
//	{
//	    System.out.print(l+",");
//	}
    }

    private void getPair(int[] a1,int x)
    {
	try
	{
	    int left=0;
	    int right = a1.length-1;
	    while(left<=right)
	    {
		if(a1[left]+a1[right]==x)
		{
		    System.out.println(a1[left]+" > "+a1[right]);
		    break;
		}
		else if(a1[left]+a1[right]<x)
		{
		    left++;
		}
		else
		{
		    right--;
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    private void quickSort(int left,int right)
    {
	try
	{
	    int i=left;
	    int j=right;
	    int p = a[(left+right)/2];
	    while(i<=j)
	    {
		while(p>a[i])
		    i++;
		while(p<a[j])
		    j--;
		if(i<=j)
		{
		    int temp=a[i];
		    	a[i]=a[j];
		    	a[j]=temp;
		    	i++;
		    	j--;
		}
		if(left<j)
		{
		    quickSort(left,j);
		}
		else if(right>i)
		{
		    quickSort(i, right);
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    private void getPairUsingHashMap(int[] a,int x)
    {
	try
	{
	    HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
	    boolean[] flag=new boolean[50];
	    
	    for(int i=1;i<a.length;i++)
	    {
		int temp = x-a[i];
		if(temp>=0&&flag[temp])
		{
		    System.out.println(a[i]+" > "+temp);
		    break;
		}
		flag[a[i]]=true;
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
}
