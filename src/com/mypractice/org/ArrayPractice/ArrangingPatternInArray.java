package com.mypractice.org.ArrayPractice;

public class ArrangingPatternInArray {

	/**
	 * @param args
	 * Given an array convert it to another array such that the following condition holds:
		a < b > c < d > e < f > g < h
		where the modified array is {a,b,c,d,e,f,g,h}
		Input:
		1,2,3,4,5,6
		Output:
		1,3,2,5,4,6
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int[] a = {1,2,3,4,5,6 };
			for(int i : new ArrangingPatternInArray().getDesiredOutPut(a))
			{
				System.out.print(i+",");
			}
//			for(int i :new ArrangingPatternInArray().getDesiredOutPutWithOutShorted(a))
//				{
//					System.out.print(i+",");
//				}
//			System.out.println();
			//new ArrangingPatternInArray().getDesiredOutPutWithOutShorted(a);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}
	
	
	private int[] getDesiredOutPutWithOutShorted(int[] a)
	{
		try
		{
			int min1=0,min2=0,min3=0;
			boolean flag = false;
			for(int i=0;i<a.length-2;)
			{
				min1=a[i];min2=a[i];min3=a[i];
				int k1=0,k2=0,k3=0;
				int temp1=0,temp2=0,temp3=0;
				for(int j=i;j<a.length;j++)
				{
					if(min1>a[j])
					{
						min2=min1;
						min1=a[j];
						k1=j;
					}
					else if(min2>a[j])
					{
						min3=min2;
						min2=a[j];
						k2=j;
					}
					else if(min3>a[j])
					{
						min3=a[j];
						k3=j;
					}
				}
				temp1=a[i];temp2=a[i+1];temp3=a[i+2];
				a[i]=min1;a[i+1]=min3;a[i+2]=min2;
				a[k1]=temp1;a[k2]=temp2;a[k3]=temp3;
				i=i+3;
			}
			//System.out.println(" > "+min1+" > "+min2+" > "+min3);
			return a;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}
	
	
	
	
	
	// When Array Is Allready Shorted Tyhen That Logic Will Work time complexity O(n)
	private int[] getDesiredOutPut(int[] a)
	{
		try
		{
			//int temp=0;
			for(int i=0;i<a.length-2;i++)
			{
				if(a[i]<a[i+1]&&a[i+2]>a[i+1]&&a[i+2]>a[i])
				{
					int temp=a[i+2];
					a[i+2]=a[i+1];
					a[i+1]=temp;
				}
				
			}
			return a;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}

}
