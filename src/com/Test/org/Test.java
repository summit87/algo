package com.Test.org;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Test {

	public static void main(String[] args)
	{
		try
		{

		    
		    int c=97;
		    int a=4;
		    String h = "sdfsdf";
		   System.out.println(h.indexOf('f'));
		    System.out.println(h.substring(0,1)+h.substring(h.length(),h.length()));  
//		    System.out.println(Integer.MAX_VALUE);
//		    for(int l=10;l<=99;l++)
//		    {
//			p*=l;
//			System.out.println(p);
//		    }
//		    System.out.println(p);
		  //  System.out.println(new Test().gcd(a, c)); 
//		    System.out.println(26%26);
//		    System.out.println(new Test().getMin(12, 3, 78));;
//		    
//		   int[] a = {2, 3, 3, 5, 3, 4, 1, 7};
//		   int k=8;
//		   for(int i=0;i<a.length;i++)
//		   {
//		       //System.out.print(i+","+a[a[i]%k]+",");
//		       a[a[i]%k]+=k;
//		       //System.out.print(a[i]);
//		       //System.out.println();
//		   }
//		   for(int i=0;i<a.length;i++)
//		   {
//		       System.out.print(a[i]+",");
//		   }
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		
	}
	
	private int getMin(int a,int b,int c)
	{
	    return getM(a,b)>c?c:getM(a,b);
	}
	
	private int getM(int a,int b)
	{
	    return a>b?b:a;
	}
	
	
	private int gcd(int a,int c)
	{
	    try
	    {
		if(c==0)
		{
		    return a;
		}
		return gcd(c,a%c);
	    }
	    catch(Exception ex)
	    {
		ex.printStackTrace();
	    }
	    return -1;
	}
	
	
	
	private int gcd1(int a,int b)
	{
	    try
	    {
		    if(a==0)
		    {
			return b;
		    }
		    else if(b==0)
		    {
			return a;
		    }
		    else if(a==b)
		    {
			return a;
		    }
		    while(a!=b)
		    {
			if(a>b)
			{
			    a-=b;
			}
			else if(a<b)
			{
			    b-=a;
			}
			else
			{
			    break;
			}
		    }
		    return a;
	    }
	    catch(Exception ex)
	    {
		ex.printStackTrace();
	    }
	    return -1;
	}
	
	
	   // System.out.println(("SUMMIT 100-890").toUpperCase());
	    
	    //			
//		int f[] = new int[10000];
//		f[0]=0;f[1]=1;
//		
//		for(int i=0;i<161;i++)
//		{
//			f[i+2] = f[i]+f[i+1];
//			System.out.println(f[i+2]);
//		}
		
		
		
		
//		int i=1675475;
//		int k = 165;
//		int re = 0;
//		int qu=0; 
//		//
//		qu=k;
//		System.out.println(k/16+" : "+k%16);
//		qu = k/16;
//		re=qu%16;
//		while(qu!=0&&re!=0)
//		{
//			System.out.println(qu+" : "+re);
//			qu = qu/16;
//			re=qu%16;
//		}
	
}
