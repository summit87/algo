package com.mypractice.org.ArrayPractice;

public class GetMissingNUmberFromArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1, 2,3, 4, 6, 7, 8};
		System.out.println(new GetMissingNUmberFromArray().missingNumberByUsingXOR(a,a.length));  
	}
	
	private int missingNumber(int[] a,int n)
	{
		try
		{
			int sumOfToNum = 0;
			sumOfToNum = (n+1)*(n+2)/2;
			for(int i=0;i<n;i++)
			{
				sumOfToNum = sumOfToNum-a[i];
			}
			return sumOfToNum;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return 0;
	}
	
	
	// By Using XOR Operator
	
	public int missingNumberByUsingXOR(int[] a,int n)
	{
		try
		{
			int x1=a[0];
			int x2=1;
			for(int i=0;i<n;i++)
			{
				x1=x1^a[i];
			}
			for(int i=0;i<n;i++)
			{
				x2=x2^i;
			}
			System.out.println(x1+" > "+x2);
			return (x1^x2);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return 0;
	}

}
