package com.mypractice.org.ArrayPractice;

public class MaximumSumFromSuarray {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try
	{
	    int[] a= {-2, -5, 6, -2, -3, 1, 5, -6};
	    int max_sum = new MaximumSumFromSuarray().getSumFromMidToRLAndLI(a,0,a.length-1); 
	    System.out.println(max_sum);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }
    
    
    
    
    private int getSumAccrosCrssingPoint(int[] a,int leftIndex,int midIndex,int rightIndex)
    {
	try
	{
	    int leftSum=0;
	    int sum=0;
	    for(int i=midIndex;i>=leftIndex;i--)
	    {
		sum+=a[i];
		if(sum>=leftSum)
		{
		    leftSum = sum;
		}
	    }
	    sum=0;
	    int rightSum=0;
	    for(int i=midIndex+1;i>=rightIndex;i--)
	    {
		sum+=a[i];
		if(sum>=rightSum)
		{
		    rightSum=sum;
		}
	    }
	    
	    return leftSum+rightSum;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    /*Get Sum From midIndex-->RightIndex and midIndex-->leftIndex*/
    
    
    private int getSumFromMidToRLAndLI(int[] a,int l,int h)
    {
	try
	{
	    if(l==h)
	    {
		return a[l];
	    }
	    int mid = (l+h)/2;
	    return (this.getMax(getSumFromMidToRLAndLI(a, l,mid),
		    this.getSumFromMidToRLAndLI(a,mid+1, h),
		    this.getSumAccrosCrssingPoint(a, l, mid,h)));   
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    
    
    /*Maximum Sum In Sub Array Using DP*/
    
    
    private int getMax(int a,int b)
    {
	try
	{
	    if(a>b)
	    {
		return a;
	    }
	    else
	    {
		return b;
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    private int getMax(int a,int b,int c)
    {
	try
	{
	    return getMax(getMax(a, b), c);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    
    
    
    
    
    
    
    
    /*Maximum sum in sub array from array using kadane algoritham 
     * 
     * The runtime complexity of Kadane's algorithm is \mathcal{O}(n).
     * 
     * */
    
    
    
    
    
    
    private int maxSumInSub(int[] a)
    {
	try
	{
	    int max_sum=a[0];
	    int max_end = a[0];
	    int j=0;
	    int k=0;
	    for(int i=1;i<a.length;i++)
	    {
		max_end+=a[i];
		if(max_end<0)  /*for minimum sub array just change < into > and put max_end=0 */
		{
		    max_end=0;
		    j=i;
		}
		if(max_end>max_sum) /*for minimum sub array just change < into > and rest is same */
		{
		    max_sum=max_end;
		   // j=j;
		    k=i;
		}
	    }
	    System.out.println(j+" > "+k);
	    return max_sum;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
}
