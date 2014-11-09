package com.mypractice.org.DynamicProrammingPractice;

public class LongestCommonSubsequence {

	
	public static void main(String[] args)
	{
		int[] array = {223,34,43,43,5,89,4,9,-1,2,78};
		System.out.println(new LongestCommonSubsequence().longetCSByMemorization(array,array.length));
	}
	
	
	public int longetCSByRecurssion(int[] array,int n,int maxLength)
	{
		int res=0;
		int max = 1;
		int maxL = maxLength;
		if(n==0)
		{
			return 1;
		}
		else 
		{
			for(int i=1;i<n;i++)
			{
				res=longetCSByRecurssion(array, i, maxLength);
				if((array[i-1]<=array[n-1])&&(res+1>max))
				{
					max=res+1;
				}
			}
			if(maxL<max)
			{
				maxL=max;
			}
			return maxL;
		}
	} 
	
	public int longetCSByMemorization(int[] a,int n)
	{
		int maxLCS=0;
		int[] LCS = new int[n];;
		int[] LCS1 = new int[n];
		int k=0;
		for(int i=0;i<n;i++)
		{
			LCS[i]=0;
		}
		if(n==0)
		{
			return 1;
		}
		else
		{
			for(int i=1;i<n;i++)
			{
				maxLCS=0;
				for(int j=0;j<=i;j++)
				{
					if((a[i]>=a[j]))
					{
						maxLCS++;
						LCS[i] = maxLCS;
					}
				}
			}
			
		}
		maxLCS=0;
		for(int i=0;i<n;i++)
		{
			if(LCS[i]>maxLCS)
			{
				maxLCS=LCS[i];
				//System.out.println(maxLCS);
			}
		}
		return maxLCS;
	}
	
	
}


