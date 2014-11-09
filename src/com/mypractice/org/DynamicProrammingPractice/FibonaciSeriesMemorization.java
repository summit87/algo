package com.mypractice.org.DynamicProrammingPractice;

public class FibonaciSeriesMemorization {

	
	public static void main(String[] args) {
		System.out.println(new FibonaciSeriesMemorization().fibNotStoringVal(2749));
	}
	
	
	public int fibRec(int n)
	{
		if(n<=1)
		{
			return n;
		}
		else
		{
			return fibRec(n-1)+fibRec(n-2);
		}
	}	
	
	
	public int fibMemo(int n)
	{
		int[] f = new int[n+1];
		
		f[0] = 0;
		f[1] = 1;
		for(int i=2;i<=n;i++)
		{
			f[i] = f[i-1]+f[i-2];
		}
		return f[n];
		
	}
	
	
	public int fibNotStoringVal(int n)
	{
		int pre=0;
		int curr=1;
		int next=0;
		for(int i=2;i<=n;i++)
		{
			next=pre+curr;
			pre = curr;
			curr=next;
		}
		return curr;
	}
}


