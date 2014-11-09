package com.mypractice.org.ArrayPractice;

public class GetMaxNuberOfTraingle {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

	
	try
	{
	    int[] a = {10, 21, 22, 100, 101, 200, 300};
	    int c = new GetMaxNuberOfTraingle().getNumberOfCount(a);
	    System.out.println("Max Of Triangle > "+c);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	
	
    }

    private int getNumberOfCount(int[] a)
    {
	try
	{
	    int count=0;
	    int k=0;
	    for(int i=0;i<a.length-2;i++)
	    {
		k=i+2;
		for(int j=i+1;j<a.length-2&&k<a.length;j++)
		{
		    while(a[i]+a[j]>a[k])
		    {
			++k;
		    }
		    count+=(k-j-1);
		}
	    }
	    return count+1;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
}
