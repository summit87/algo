package com.mypractice.org.ArrayPractice;

public class AProductArrayPuzzle {

    /**
     * @param args
     * 
     * Given an array arr[] of n integers, construct a Product 
     * Array prod[] (of same size) such that prod[i] is equal to the product of 
     * all the elements of arr[] except arr[i]. Solve it without division operator and in O(n).
     * 
     */
    public static void main(String[] args) {
	try
	{
	    int[] a = {10, 3, 5, 6, 2};
	    new AProductArrayPuzzle().product1(a);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    
    private void product(int[] a)
    {
	try
	{
	    int[] leftPro = new int[a.length];
	    int[] rightPro = new int[a.length];
	    leftPro[0]=1;
	    rightPro[a.length-1] = 1;
	    int[] prod = new int[a.length];
	    for(int i=1;i<a.length;i++)
	    {
		leftPro[i]=leftPro[i-1]*a[i-1];
	    }
	    for(int i=a.length-2;i>=0;i--)
	    {
		rightPro[i]=rightPro[i+1]*a[i+1];
	    }
	    
	    for(int i=0;i<a.length;i++)
	    {
		prod[i]=leftPro[i]*rightPro[i];
	    }
	    for(int i =0;i<a.length;i++)
	    {
		System.out.print(prod[i]+",");
	    }
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    private void product1(int[] a)
    {
	try
	{
	    int temp=1;
	    int[] prod = new int[a.length];
	    for(int i=0;i<a.length;i++)
	    {
		prod[i]=temp;
		temp*=a[i];
	    }
	    temp=1;
	    for(int i=a.length-1;i>=0;i--)
	    {
		prod[i]*=temp;
		temp*=a[i];
	    }
	    for(int i =0;i<a.length;i++)
	    {
		System.out.print(prod[i]+",");
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
}
