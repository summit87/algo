package com.mypractice.org.ArrayPractice;

public class TwoElementsWhoseSumIsClosestToZero {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try
	{
	    int[] a = {1, 60, -10, 70, -80, 85};
	    new TwoElementsWhoseSumIsClosestToZero().getSum(a);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }
    
    private void getSum(int[] a)
    {
	try
	{
	    int max=0;
	    int max_l=0;
	    int max_r=0;
	    int sum=0;
	    max=a[0]+a[1];
	    for(int i=0;i<a.length;i++)
	    {
		for(int k=i+1;k<a.length;k++)
		{
		    sum+=a[i]+a[k];
		    if(Math.abs(sum)>Math.abs(max))
		    {
			max=sum;
			max_l=i;
			max_r=k;
		    }
		}
	    }
	    
	    System.out.println(a[max_l]+" > "+a[max_r]);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }

}
