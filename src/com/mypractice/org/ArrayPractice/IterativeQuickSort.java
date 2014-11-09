package com.mypractice.org.ArrayPractice;

public class IterativeQuickSort {

    /**
     * @param args
     */
    static int[] a = {4, 3, 15, 12, 10, 3, 2, 8};
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	try
	{
	    new IterativeQuickSort().iterativeQuickSort(0,a.length);
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

    private void iterativeQuickSort(int l,int h)
    {
	try
	{
	    int[] stack = new int[h-l+1];
	    int top=-1;
	    stack[++top] = l;
	    stack[++top]=h;
	    while(top>=0)
	    {
		h=stack[top--];
		l=stack[top--];
		int pivot = this.arrangeArray(l, h);
		if(pivot-1>l)
		{
		    stack[++top] = l;
		    stack[++top] = pivot-1;
		}
		else if(pivot+1<h)
		{
		    stack[++top] = pivot+1;
		    stack[++top] = h;
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    private int arrangeArray(int l,int h)
    {
	try
	{
	    int temp=0;
	    int i= l;int j=l;
	    int x=a[h-1];
	    while(j<h)
	    {
		if(a[j]<=x)
		{
		    temp=a[i];
		    a[i]=a[j];
		    a[j]=temp;
		    i++;
		}
		j++;
	    }
	    
	    return i;
//	    for(int k=0;k<a.length;k++)
//	    {
//		System.out.print(a[k]+",");
//	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    
    
    
}
