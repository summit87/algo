package com.mypractice.org.ArrayPractice;

public class RearrangePositiveAndNegative {

    /**
     * @param args
     * 
     * Rearrange positive and negative numbers in O(n) time and O(1) extra space
     * 
     */
    static int[] array={-1, 2, -3, 4, 5, 6, -7, 8, 9};
    public static void main(String[] args) {
	// TODO Auto-generated method stub
//	int[] a = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
//	array = new int[a.length];
	new RearrangePositiveAndNegative().quick(0,array.length-1);
	for(int i=0;i<array.length;i++)
	{
	    System.out.print(array[i]+",");
	}
	System.out.println("--------------------------");
	
	int k=-1;
	for(int i=0;i<array.length;i++)
	{
	    if(array[i]<0)
	    {
		k++;
	    }
	}
	
	int pos = k+1;
	int neg = 0;
	
	while(pos<array.length&&neg<pos&&array[neg]<0)
	{
	    int temp = array[neg];
	    array[neg]=array[pos];
	    array[pos]=temp;
	    pos++;
	    neg+=2;
	}
	System.out.println();
	for(int i=0;i<array.length;i++)
	{
	    System.out.print(array[i]+",");
	}
	System.out.println("--------------------------");
	
    }

    
    
    /*Seperating positive and negative number using quick sort*/
    
    
    private void quick(int low,int high)
    {
	try
	{
	    int i=low;
	    int j=high;
	    int pivot = array[(low+high)/2];
	    while(i<=j)
	    {
		while(pivot>array[i])
		{
		    i++;
		}
		while(pivot<array[j])
		{
		    j--;
		}
		if(i<=j)
		{
		    int temp=array[i];
		    array[i]=array[j];
		    array[j]=temp;
		    i++;
		    j--;
		}
		if(low<j)
		{
		    quick(low,j);
		}
		if(high>i)
		{
		    quick(i,high);
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
}
