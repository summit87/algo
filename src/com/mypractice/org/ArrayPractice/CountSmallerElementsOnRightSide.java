package com.mypractice.org.ArrayPractice;

public class CountSmallerElementsOnRightSide {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	try
	{
	    int[] a = {12, 1, 2, 3, 0, 11, 4};
	    new CountSmallerElementsOnRightSide().getArray(a);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    private void getArray(int[] a)
    {
	try
	{
	    int[] count = new int[a.length];
	    for(int i=0;i<a.length;i++)
	    {
		for(int j=i+1;j<a.length;j++)
		{
		    if(a[i]>a[j])
		    {
			count[i]++;
		    }
		}
	    }
	    
	    for(int i=0;i<count.length;i++)
	    {
		System.out.print(count[i]+",");
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    
    
}
