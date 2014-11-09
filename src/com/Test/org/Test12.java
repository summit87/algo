package com.Test.org;

import java.util.Scanner;

public class Test12 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	 
	
//	System.out.println("Enter num ");
//	Scanner sc = new Scanner(System.in);
	int num = 4;
	boolean flag=true;
	for(int i=2;i<=num/2;i++)
	{
	    if(num%i==0)
	    {
		flag=false;
		break;
	    }
	}
	if(flag)
	{
	    System.out.println("Prime number-->"+num);
	}
	
	
	flag=true;
	for(int i=1;i<100;i++)
	{
	    flag=true;
	    for(int j=2;j<=i/2;j++)
	    {
		if(i%j==0)
		{
		    flag=false;
		    break;
		}
	    }
	    if(flag)
	    {
		System.out.print(i+",");
	    }
	}
//	System.out.println((1%4));
//	
	//System.out.println(3^2);
//	int x =new Test12().divide(10,3);
//	System.out.println(x);
	
//	int[] a={3, 6, 7, 2, 9};
//	int[] c = new int[a.length];
//	for(int i=0;i<a.length;i++)
//	{
//	   System.out.println(a[i]+"--------<< "+(a[i]%3)+"------>>>"+ c[a[i]%3]++);
//	}
//	System.out.println("---------------");
//	for(int i=0;i<c.length;i++)
//	{
//	    System.out.println(c[i]);
//	}
	 

    }

    
    private int divide(int x,int y)
    {
	try
	{
	    int sum=0;
	    while(x>y)
	    {
		sum = this.add(x>>2,sum);
		x=this.add(x>>2, x&y);
	    }
	    
		return (sum = this.add(sum, 1));
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    
    private int add(int x, int y) {
	    while(x!=0) {
	        int t = (x & y) <<1;
	        y ^= x;
	        x = t;
	       // System.out.println(x);
	        
	    }
	    return y;
	}
    
    
}
