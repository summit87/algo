package com.mypractice.org.ArrayPractice;

public class Segregate0sAnd1sInAnArray {

    /**
     * @param args
     */
    static int[] a =  {0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1};
    public static void main(String[] args) {
	try
	{
	  
	    new Segregate0sAnd1sInAnArray().segregate1(a);
//	    for(int i=0;i<a.length;i++)
//	    {
//		System.out.print(a[i]+",");
//	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    private void segregate(int[] a)
    {
	try
	{
	    int[] count = new int[a.length];
	    for(int i=0;i<a.length;i++)
	    {
		count[a[i]]++;
	    }
	    for(int i=0;i<count[0];i++)
	    {
		a[i]=0;
	    }
	    for(int i=count[0];i<a.length;i++)
	    {
		a[i]=1;
	    }
	    for(int i=0;i<a.length;i++)
	    {
		System.out.print(a[i]+",");
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    private void segregate1(int[] a)
    {
	try
	{
	    int i=0;int j=a.length-1;
		while(i<j)
		{
		    while(a[i]==0)
		    {
			i++;
		    }
		    while(a[j]==1)
		    {
			j--;
		    }
		    if(i<=j)
		    {
			int temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		    }
		}
		 for(int i1=0;i1<a.length;i1++)
		    {
			System.out.print(a[i1]+",");
		    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
      private void segregationUsingQuickSort(int l,int r)
      {
          try
          {
    	  int i=l;
    	  int j=r;
    	  int p=a[(l+r)/2];
    	  while(i<=j)
    	  {
    	      while(p>a[i])
    		  i++;
    	      while(p<a[j])
    		  j--;
    	      if(i<=j)
    	      {
    		  int temp = a[j];
    		  a[j]=a[i];
    		  a[i]=temp;
    		  i++;
    		  j--;
    	      }
    	      if(i<r)
    	      {
    		  segregationUsingQuickSort(i, r);
    	      }
    	      else if(j>l)
    	      {
    		  segregationUsingQuickSort(l, j);
    	      }
    	  }
          }
          catch(Exception ex)
          {
    	  ex.printStackTrace();
          }
      }

}
