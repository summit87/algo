package com.mypractice.org.ArrayPractice;

public class FindAllElementThatAppearMoreThanNbyKTime {

    /**
     * @param args
     */
    public static void main(String[] args) {
	
	try
	{
	    int[] a = {3, 1, 2, 2, 1, 2,5,5,5,7,7,7, 3, 3};
	    new FindAllElementThatAppearMoreThanNbyKTime().getSubArray(a);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }
    
    /*By O(N) Time Complexity and O(K) Space Complexity*/
    private void getSubArray(int[] a)
    {
	try
	{
	    int[] count = new int[a.length];
	    for(int i=0;i<a.length;i++)
	    {
		count[a[i]]++;
	    }
	    for(int i=0;i<a.length;i++)
	    {
		if(count[i]!=0)
		{
		    if(count[i]>2)
		    {
			System.out.print(i+",");
		    }
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }

}
