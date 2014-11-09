package com.mypractice.org.ArrayPractice;

public class LongestBitonicSubsequence {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try
	{
	    int[] a ={1, 11, 2, 10, 4, 5, 2, 1};//{0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15}; //{1, 11, 2, 10, 4, 5, 2, 1};
	    int len = new LongestBitonicSubsequence().getLongestIncresingSubSequence(a);
	    System.out.println(len);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    
    private int getLongestIncresingSubSequence(int[] a)
    {
	try
	{
	    int[] lis = new int[a.length];
	    int[] lds = new int[a.length];
	    int[] lind = new int[a.length];
	    int j1=0;int j2=0;
	    int[] arr = new int[a.length];
	    for(int i=0;i<a.length;i++)
	    {
		lis[i]=1;
	    }
	    for(int i=0;i<a.length;i++)
	    {
		lds[i]=1;
	    }
	    for(int i=0;i<a.length;i++)
	    {
		for(int j=0;j<=i;j++)
		{
		    if(a[i]>a[j]&&lis[i]<lis[j]+1)
		    {
			lis[i] = lis[j]+1;
			System.out.println("LIS-->"+j+" > "+lis[j]);
			lind[i]=j;
			
		    }
		}
	    }
	    int max1=0;
	    int lastInd=0;
	    for(int i=0;i<lis.length;i++)
	    {
		if(lis[i]>=max1)
		{
		    max1=lis[i];
		    lastInd=i;
		}
	    }
	    for(int i=a.length-2;i>=0;i--)
	    {
		for(int j=a.length-1;j>i;j--)
		{
		    if(a[i]>a[j]&&lds[i]<lds[j]+1)
		    {
			lds[i] = lds[j]+1;
			System.out.println("LDS-->"+i);
			
		    }
		}
	    }
	    int max=lis[0]+lds[0]-1;
	    for(int i=0;i<a.length;i++)
	    {
		if(max<lis[i]+lds[i]-1)
		{
		    max=lis[i]+lds[i]-1;
		    lastInd=i;
		}
	    }
//	    for(int k1=max-1;k1>=0;k1--)
//	    {
//		 arr[k1] = a[lastInd];
//		 lastInd=lis[k1];
//	    }
//	    for(int i=0;i<a.length;i++)
//	    {
//	 	 System.out.print(arr[i]+",");
//	    }
//	    System.out.println(" > "+lastInd);
	    return max;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
}
