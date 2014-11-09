package com.mypractice.org.ArrayPractice;

public class LeaderElementInArray {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] a ={4,2, 5, 25,34,67,26};
	new LeaderElementInArray().replaceingWithNextGreatestNumber(a);

    }

    
    private void leaserOfArray(int[] a)
    {
	try
	{
	   int max=0;
	    for(int i=a.length-1;i>=0;i--)
	    {
		if(max<a[i])
		{
		    max=a[i];
		    System.out.println("Leader Of The Array > "+a[i]);
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    private void replaceingWithNextGreatestNumber(int[] a)
    {
	try
	{
	   int max=a[a.length-1];
	   a[a.length-1]=-1;
	    for(int i=a.length-2;i>=0;i--)
	    {
		int k=a[i];
		a[i]=max;
		if(max<k)
		{
		    max=k;
		    //System.out.println("Leader Of The Array > "+a[i]);
		}
	    }
	    
	    for(int i=0;i<a.length;i++)
	    {
		System.out.print(a[i]+",");
	    }
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
}
