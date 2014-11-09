package com.mypractice.org.ArrayPractice;

public class FindTheMIssingSmallestPositiveNumber {

    /**
     * @param args
     * Find the smallest positive number missing from an unsorted array
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	try
	{
	    int[] a = {2, 3, 7, 6, 8, -1, -10, 15};
	    int num = new FindTheMIssingSmallestPositiveNumber().getMissedNumber(a);
	    System.out.println(num);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }

    private int getMissedNumber(int[] a)
    {
	try
	{
	    int x=0;
	   a=arraySegregation(a);
	   for(int o=0;o<a.length;o++)
	   {
	       System.out.print(a[o]+",");
	   }
	   System.out.println();
	   int fromPositive=0;
	   for(int o=0;o<a.length;o++)
	   {
	      if(a[o]>0)
	      {
		  fromPositive = o;
		  break;
	      }
	   }
	   x=a.length-fromPositive;
	   System.out.println("fromPositive > "+fromPositive);
	   for(int i=fromPositive;i<x;i++)
	   {
	       if((Math.abs(a[i])-1)>=0&&(Math.abs(a[i])-1)<=x&&a[Math.abs(a[i])-1]>0)
	       {
		   a[Math.abs(a[i])-1]=-a[Math.abs(a[i])-1];
	       }
	   }
	   for(int o=fromPositive;o<=x;o++)
	   {
	       System.out.print(a[o]+",");
	   }
	   System.out.println();
	   for(int i=fromPositive;i<x;i++)
	   {
	       if(a[i]>0)
	       {
		   return i+1;
	       }
	   }
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    private int[] arraySegregation(int[] a)
    {
	try
	{
	    int i=0;int j=0;
	    for(i=0;i<a.length;i++)
	    {
		if(a[i]<0)
		{
		    int temp = a[i];
		    a[i]=a[j];
		    a[j]=temp;
		    j++;
		}
	    }
	    System.out.println("Index > "+j);
	    return a;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    
    
    
}
