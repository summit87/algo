package com.mypractice.org.ArrayPractice;

public class MergeAnArrayOfSizeNIntoAnotherArray {

    /**
     * @param args
     */
    static int[] a = {2, 8,0, 0, 0, 13, 0, 15, 20};;
    static int[] a1 = {5, 7, 9, 25};
    public static void main(String[] args) {
	try
	{
	    MergeAnArrayOfSizeNIntoAnotherArray m = new MergeAnArrayOfSizeNIntoAnotherArray();
	    m.moveElement();
	    m.merge();
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private void merge()
    {
	try
	{
	    int m=a.length-1;
	    int i=0;
	    int n = a1.length-1;
	    int l = a1.length-1;
	    int k=0;
	    while(k<m+n)
	    {
		if(l<m+n&&a[l]<a1[i])
		{
		    a[k] = a[l];
		    l++;
		    k++;
		    System.out.println(i+" => "+k+" > "+l);
		}
		else
		{
		    a[k] = a1[i];
		    i++;
		    k++;
		}
		
	    }
	    for(int x=0;x<m+n;x++)
	    {
		System.out.print(a[x]+",");
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    private void moveElement()
    {
	try
	{
	    int i=a.length-1;
	    int j=a.length-1;
	    while(i>=0)
	    {
		if(a[i]!=0&&j>0)
		{
		    a[j] = a[i];
		    j--;
		}
		i--;
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
}
