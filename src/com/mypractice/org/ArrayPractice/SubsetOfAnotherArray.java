package com.mypractice.org.ArrayPractice;

public class SubsetOfAnotherArray {

    /**
     * @param args
     */
    static int[] a = {1, 2, 3, 4, 5, 6};
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] a2 = {1, 2, 4};
	 SubsetOfAnotherArray s = new SubsetOfAnotherArray();
	 if(s.isSubset(a2)==true)
	 {
	     System.out.println("Its Subset");
	 }
	 else
	 {
	     System.out.println("Its Not Subset");
	 }
    }

    private boolean isSubset(int[] a2)
    {
	try
	{
	    SubsetOfAnotherArray s = new SubsetOfAnotherArray();
	    s.quickSort(0,a.length-1);
//	    for(int i=0;i<a.length;i++)
//	    {
//		System.out.print(a[i]+",");
//	    }
//	    System.out.println();
	    for(int i=0;i<a2.length;i++)
	    {
		if(s.binarySearch(0, a.length,a2[i]))
		{
		    continue;
		}
		else
		{
		    return false;
		    
		}
	    }
	    return true;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    
    private void quickSort(int left,int right)
    {
	try
	{
	    int p=a[(left+right)/2];
	    int i=left;
	    int j=right;
	    while(i<=j)
	    {
		while(p>=a[i])
		    i++;
		while(p<=a[j])
		    j--;
		if(i<=j)
		{
		    int temp=a[i];
		    a[i]=a[j];
		    a[j]=temp;
		    i++;
		    j--;
		}
		if(i<right)
		{
		    quickSort(i, right);
		}
		else if(j>left)
		{
		    quickSort(left,j);
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    private boolean binarySearch(int left,int right,int key)
    {
	try
	{
	    int mid=(left+right)/2;
	    if(a[mid]==key)
	    {
		return true;
	    }
	    else if(key<a[mid]&&mid-1>=left)
	    {
		return binarySearch(left,mid-1, key);
	    }
	    else if(key>a[mid]&&mid+1<=right)
	    {
		return binarySearch(mid+1,right, key);
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
}
