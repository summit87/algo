package com.mypractice.org.ArrayPractice;

public class LongestMonotonicallyIncreasingSubsequence {

    /**
     * @param args
     * 
     * 0, 2, 6, 9, 11, 15.
     * 
     */
    public static void main(String[] args) {
	
	try
	{
	    int[] a =  {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
	    new LongestMonotonicallyIncreasingSubsequence().LMIS(a);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private void LMIS(int[] a)
    {
	int len = 1;
	int[] temp = new int[a.length];
	int x=0;
	for(int i=0;i<a.length;i++)
	{
	    if(a[i]<temp[0])
	    {
		temp[0]=a[i];
	    }
	    else if(a[i]>temp[len-1])
	    {
		temp[len] = a[i];
		len++;
	    }
	    else
	    {
		int k = this.binarySearch(temp,0,len-1,a[i]);
		temp[k] = a[i];
		//len=k++;
		
	    }
	}
	for(int i=0;i<len;i++)
	{
	    System.out.print(temp[i]+",");
	}
	System.out.println("Length : "+len);
    }
    
    
    
    
    private int binarySearch(int[] a,int left,int right,int key)
    {
	try
	{
	    while(1<right-left)
	    {
		 int mid = (left+right)/2;
		 if(key<=a[mid])  
		 {
		     right=mid;
		 }
		 else
		 {
		     left=mid;
		 }
	    }
	    return right;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
}
