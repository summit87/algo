package com.mypractice.org.ArrayPractice;

public class ProgramForArrayRotation {

    /**
     * @param args
     * 
     * 
     */
    static 	    int[] a = {1, 2, 3, 4, 5, 6, 7};
    public static void main(String[] args) {
	try
	{
	    new ProgramForArrayRotation().rotateArray1(2);
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
    
    
    
    private void rotateArray1(int d)
    {
	try
	{
	    int len = a.length;
	    int l = getGCD(len,d);
	    int j=0;
	    int k=0;
	    int temp =0;
	    for(int i=0;i<l;i++)
	    {
		temp = a[i];
		j=i;
		while(true)
		{
		    k=j+d;
		    if(k>len)
		    {
			k-=len;
		    }
		    else if(k==len)
		    {
			break;
		    }
		    a[j]=a[k];
		    j=k;
		}
		a[j]= temp;
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    
    
    private int getGCD(int a,int b)
    {
	try
	{
	    if(a==b)
	    {
		return a;
	    }
	    else if(a==0)
	    {
		return a;
	    }
	    else if(b==0)
	    {
		return b;
	    }
	    else
	    {
		while(a!=b)
		{
		    if(a>b)
		    {
			a-=b;
		    }
		    else if(b>a)
		    {
			b-=a;
		    }
		    else if(a==b)
		    {
			break;
		    }
		}
	    }
	    return b;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    

    /*By Using O(N) Time And O(N) SPACE */
    private void rotateArray(int[] a,int n,int d)
    {
	try
	{
	    int temp = a[0];
	    for(int i=0;i<d;i++)
	    {
		this.rotate(a, n);
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    private void rotate(int[] a,int n)
    {
	try
	{
	    int temp = a[0];
	    int i=0;
	    for(i=0;i<a.length-1;i++)
	    {
		a[i] = a[i+1];
	    }
	    a[i]=temp;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
}

