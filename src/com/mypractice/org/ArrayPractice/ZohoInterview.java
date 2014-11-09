package com.mypractice.org.ArrayPractice;

public class ZohoInterview {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	try
	{
	    int[] a = {1, 2, 3, 4, 5, 6, 7};
	    new ZohoInterview().sortWIthMaxAndMin(a);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }

    
    private void sortWIthMaxAndMin(int[] a)
    {
	try
	{
	    int x1=0;
	    int x2=0;
	    if(a.length%2==0)
	    {
		x1=a.length/2;
		x2=a.length/2;
	    }
	    else
	    {
		x1=(a.length-1)/2;
		x2=(a.length+1)/2;
	    }
	    int[] a1 = new int[x1];
	    int[] a2 = new int[x2];
	    int i=0;
	    int j=0;
	    for(i=0;i<x1;i++)
	    {
		a1[i] = a[i];
	    }
	    for(;i<a.length;i++)
	    {
		a2[j]=a[i];
		j++;
	    }
	    for(int i1=0;i1<a1.length;i1++)
	    {
		System.out.print(a1[i1]+",");
	    }
	    System.out.println();
	    for(int i1=0;i1<a2.length;i1++)
	    {
		System.out.print(a2[i1]+",");
	    }
	    j=a2.length-1;
	    i=0;
	    int k=0;
	    while(i<a1.length&&j>=0)
	    {
		a[k]=a2[j];
		a[k+1] =a1[i] ;
		j--;i++;k+=2;
	    }
	   // System.out.println(">>>"+a1[i-1]);
	    for(int l=0;l<a.length;l++)
	    {
		System.out.print(a[l]+",");
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
}
