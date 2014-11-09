package com.mypractice.org.shorting;

public class MergeShortAlgo {

	
	private int[] array;
	private int[] temp;
	int number;
	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
		temp = new int[array.length];
		mergeShort(0,array.length-1);
	}
	
	
	
	
	public void mergeShort(int leftIndex,int rightIndex)
	{
		try
		{
			if(rightIndex>leftIndex)
			{
				int mid=(rightIndex+leftIndex)/2;
				mergeShort(leftIndex,mid);
				mergeShort(mid+1,rightIndex);
				merge(leftIndex,mid,rightIndex);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
	
	public void merge(int leftIndex,int midIndex,int rightIndex)
	{
		try
		{
			for(int i=leftIndex;i<=rightIndex;i++)
			{
				temp[i] = array[i];
			}
			int left=leftIndex;
			int right=rightIndex;
			int mid = midIndex+1;
			int tempIndex=leftIndex;
			while(left<=midIndex&&mid<=right)
			{
				if(temp[left]<=temp[mid])
				{
					array[tempIndex] = temp[left];
					left++;
				}
				else
				{
					array[tempIndex] = temp[mid];
					mid++;
				}
				tempIndex++;
			}
			while(left<=midIndex)
			{
				array[tempIndex] = temp[left];
				left++;
				tempIndex++;
			}
			while(mid<=rightIndex)
			{
				array[tempIndex] = temp[mid];
				tempIndex++;
				mid++;
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	
}
