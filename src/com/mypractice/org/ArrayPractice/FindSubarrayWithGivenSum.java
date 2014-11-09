package com.mypractice.org.ArrayPractice;

public class FindSubarrayWithGivenSum {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	try
	{
	    int[] a = {1, 4, 20, 3, 10, 5};
	    new FindSubarrayWithGivenSum().getSubArrayIndex(a,33);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private void getSubArrayIndex(int[] a,int sum)
    {
	try
	{
	    int i=0;
	    int s=0;
	    int current_sum = a[0];
	    for(i=1;i<a.length;i++)
	    {
		while(current_sum>sum&&s<=i-1)
		{
		    current_sum=current_sum-a[s];
		    s++;
		}
		if(current_sum==sum)
		{
		    System.out.println("Starting Index > "+s);
		    System.out.println("Ending Index > "+(i-1));
		    break;
		}
		if(i<a.length)
		{
		    current_sum=current_sum+a[i];
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
}
