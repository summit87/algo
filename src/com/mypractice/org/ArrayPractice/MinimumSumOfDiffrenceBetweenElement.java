package com.mypractice.org.ArrayPractice;

import com.mypractice.org.shorting.BubbleShort;

public class MinimumSumOfDiffrenceBetweenElement {
	
	public static void main(String[] args)
	{
		int[] array = {1515,1520,1500,1535};
		array=new BubbleShort().bubbleShort(array);
		int i=0;
		int sum=0;
		int j=0;
		for(int l:array)
		{
			System.out.print(l+",");
		}
		System.out.println();
		while(i<array.length)
		{
			sum+=array[i+1]-array[i];
			i=i+2;
		}
		System.out.println(sum);
	}
	
	
	
	
	
}
