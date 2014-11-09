package com.mypractice.org.ArrayPractice;

public class FindTheRepeatingAndTheMissing {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try
	{
	    int[] a = {7, 3, 6, 5, 5, 6, 2};
	    new FindTheRepeatingAndTheMissing().getMissingAndRepeting1(a);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private void getMissingAndRepeting1(int[] a)
    {
	try
	{
	    int[] temp=new int[a.length+1];
	    for(int i=0;i<a.length;i++)
	    {
		if(temp[a[i]]==0)
		{
		    temp[a[i]]=1;
		}
		else
		{
		    System.out.println("Repeting  > "+a[i]);
		}
	    }
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    
    
    private void getMissingAndRepeting(int[] a)
    {
	try
	{
	    for(int i=0;i<a.length;i++)
	    {
		if(a[Math.abs(a[i])-1]>0)
		{
		    a[Math.abs(a[i])-1]=-a[Math.abs(a[i])-1];
		}
		else
		{
		    System.out.println("Repeting Element > "+Math.abs(a[i]));
		}
	    }
	    for(int i=0;i<a.length;i++)
	    {
		if(a[i]>0)
		{
		    System.out.println("MIssing ELement > "+(i+1));
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
}
