package com.mypractice.org.ArrayPractice;

public class FindAPairWithTheGivenDifference {

    /**
     * @param args
     */
    
    static int [] a={5, 20, 3, 2, 50, 80};
    public static void main(String[] args) {
	try
	{
	    FindAPairWithTheGivenDifference f = new FindAPairWithTheGivenDifference();
	    f.quickSort(0,a.length-1);
	    int diff=78;
	    for(int x : a)
	    {
		int ind = f.binarySearch(0,a.length,(x+diff));
		if(ind!=-1)
		{
		    System.out.println(x+" > "+ind);
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private int binarySearch(int left,int right,int key)
    {
	try
	{
	    int mid = (left+right)/2;
	    if(a[mid]==key)
	    {
		return a[mid];
	    }
	    else if(key<a[mid]&&mid-1>=left)
	    {
		return binarySearch(left,mid-1, key);
	    }
	    else if(mid+1<right)
	    {
		return binarySearch(mid+1, right, key);
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    
    private void quickSort(int left,int right)
    {
	try
	{
	    int i=left;
	    int j=right;
	    int p = a[(left+right)/2];
	    while(i<=j)
	    {
		while(p>a[i])
		    i++;
		while(p<a[j])
		    j--;
		if(i<=j)
		{
		    int temp=a[i];
		    	a[i]=a[j];
		    	a[j]=temp;
		    	i++;
		    	j--;
		}
		if(j>left)
		{
		    quickSort(left,j);
		}
		else if(i<right)
		{
		    quickSort(i, right);
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
}
