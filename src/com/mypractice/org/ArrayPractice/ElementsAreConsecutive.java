package com.mypractice.org.ArrayPractice;

public class ElementsAreConsecutive {

    /**
     * @param args
     */
    public static void main(String[] args) {
		try
		{
		    int[] a =  {5, 2, 3, 1, 4,6};
		    if(new ElementsAreConsecutive().isConsecutive(a))
		    {
			System.out.println("Yes Its Is");
		    }
		    else
		    {
			System.out.println("Its Not");
		    }
		}
		catch(Exception ex)
		{
		    ex.printStackTrace();
		}

    }

    
    private boolean isConsecutive(int[] a)
    {
	try
	{
	    boolean[] visited = new boolean[max(a)];
	    int m = min(a);
	    int ma = max(a);
	    if(ma+m-1==a.length)
	    {
        	    for(int i=0;i<a.length;i++)
        	    {
        		if(visited[a[i]-m]!=false)
        		{
        		    
        		    return false;
        		}
        		visited[a[i]-m]=true;
        	    }
        	    return true;
	    }
	    return false;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    private int min(int[] a)
    {
	try
	{
	    int m = Integer.MAX_VALUE;
	    for(int i=0;i<a.length;i++)
	    {
		if(m>a[i])
		{
		    m=a[i];
		}
	    }
	    return m;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    private int max(int[] a)
    {
	try
	{
	    int m = Integer.MIN_VALUE;
	    for(int i=0;i<a.length;i++)
	    {
		if(m<a[i])
		{
		    m=a[i];
		}
	    }
	    return m;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
}
