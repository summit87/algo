package com.mypractice.org.DynamicProrammingPractice;

public class SecondMaxElement {

	
	public static void main(String[] args)
	{
		int[] a = { 545,90,21,5,12, 1,16, 22, 30, 35, 39, 42, 45,525, 48, 50, 53, 255, 526 };
		System.out.println(new SecondMaxElement().secondMinimumElement(a,a.length-1)); 
	}
	
	public int secondMaxElement(int[] a,int n)
	{
		
		int max1=0,max2=0;
		for(int i=0;i<=n;i++)
		{
			if(max1<a[i])
			{
				max2=max1;
				max1=a[i];
			}
			else if(max2<a[i])
			{
				max2=a[i];
			}
		}
		return max2;
	}
	
	
	public int secondMinimumElement(int[] a,int n)
	{
		int min1=0, min2=0,min3=0;boolean flag=false;
		for(int i=0;i<=n;i++)
		{
			if(!flag)
			{
				min1=a[i];
				flag=true;
			}
			else if(min1>a[i])
			{
				min2=min1;
				min1=a[i];
			}
			else if(min2>a[i])
			{
				min3=min2;
				min2=a[i];
			}
			else if(min3>a[i])
			{
				min3=a[i];
			}
		}
		return min3;
	}
	
	
}
