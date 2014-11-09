package com.mypractice.org.ArrayPractice;

public class RearrangeAnArray {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int[] a = {3,2,0,1};
	for(int i=0;i<new RearrangeAnArray().getArrangeValue(a).length;i++)
	{
	    System.out.print(a[i]+",");
	}

    }
    private int[] getArrangeValue(int[] a)
    {
	try
	{
	    int n=a.length;
	    for(int i=0;i<a.length;i++)
	    {
		a[i]+=(a[a[i]]%n)*n;
	    }
	    for(int i=0;i<a.length;i++)
	    {
		a[i] /=n;
	    }
	    return a;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
}
