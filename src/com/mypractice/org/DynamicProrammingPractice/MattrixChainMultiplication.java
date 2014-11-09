package com.mypractice.org.DynamicProrammingPractice;

public class MattrixChainMultiplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int[] dim={30, 35, 15, 5, 10, 20, 25};
		new MattrixChainMultiplication().mattrixChainMultiplication(dim);

	}
	
	
	
	private void mattrixChainMultiplication(int[] dim /*Storing Mattrix Dimension*/)
	{
		try
		{
			int n = dim.length;
			int[][] minCost = new int[n][n];
			int[][] mulSeq = new int[n][n]; // Storing The multiply sequence
			
			for(int i=0;i<n;i++)
			{
				minCost[i][i] = 0;
				mulSeq[i][i] = 0;
			}
			int x=0;
			
			
			for(int l=2;l<=n;l++)
			{
				for(int i=1;i<n-l+1;i++)
				{
					int j=i+l-1;
					minCost[i][j]=Integer.MAX_VALUE;
					for(int k=i;k<=j-1;k++)
					{
						int cost = minCost[i][k]+minCost[k+1][j]+(dim[i-1]*dim[k]*dim[j]);
						if(cost<=minCost[i][j])
						{
							minCost[i][j]=cost;
							mulSeq[i][j] = k;
						}
					}
				}
			}
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(minCost[i][j]+"|"+mulSeq[i][j]+"|");
				}
				System.out.println();
				System.out.println("---------------------------------------------");
			}
			System.out.println(minCost[1][n-1]);
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
}
