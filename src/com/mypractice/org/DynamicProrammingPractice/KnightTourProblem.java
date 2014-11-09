package com.mypractice.org.DynamicProrammingPractice;

public class KnightTourProblem {

	static int[][] solutn = new int[8][8];
	public static void main(String[] args)
	{
		try
		{
			new KnightTourProblem().initKnight();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	
	
	private void initKnight()
	{
		try
		{
			 int[] x = {  2, 1, -1, -2, -2, -1,  1,  2 };
			 int[] y = {  1, 2,  2,  1, -1, -2, -2, -1 };
			 for(int i=0;i<8;i++)
			 {
				 for(int j=0;j<8;j++)
				 {
					 KnightTourProblem.solutn[i][j]=-1;
				 }
			 }
			 KnightTourProblem.solutn[0][0]=0;
			 if(solveKnightPorblem(0, 0, 1, x, y, KnightTourProblem.solutn, 8)==false)
			 {
				 System.out.println("No Move..");
			 }
			 else
			 {
				 printMovePosition(KnightTourProblem.solutn);
			 }
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	
	private boolean isValidMove(int x,int y,int[][] sol,int n)
	{
		try
		{
			if(x>=0&&x<n&&y>=0&&y<n&&sol[x][y]==-1)
			{
				return true;
			}
			return false;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return false;
	}
	
	private boolean solveKnightPorblem(int x // Current Position for knight in x co-ordinate e.g x1
									,int y   // Current Position for knight in y co-ordinate e.g y1
									,int totalMove // It will get increment when is there any possible move from current position i.e from (x1,y1)
									,int[] xTotal // it will give total number possible move in x co-ordinate
									,int[] yTotal // it will give total number possible move in y co-ordinate
									,int[][] solutn // it will give total number of possible solution from starting point to end point i.e for 8X8 mattrix that value belongs from 1....64
									,int n)
	{
		try
		{
			int next_x=0;
			int next_y=0;
			if(totalMove==n*n)
			{
				return true;
			}
			for(int i=0;i<8;i++)// we r considering the 8X8 chess board so loop will go from 0...8
			{
				next_x=x+xTotal[i]; // it will calculate all possible move in x-Co-ordinate
				next_y=y+yTotal[i];// it will calculate all possible move in y-Co-ordinate
				if(isValidMove(next_x, next_y, solutn, n)) 
				{
					//totalMove+=1;
					KnightTourProblem.solutn[next_x][next_y]=totalMove;
					if(solveKnightPorblem(next_x, next_y, totalMove+1, xTotal, yTotal, KnightTourProblem.solutn, n))
					{
						return true;
					}
					else
					{
						solutn[next_x][next_y]=-1;
					}
				}
			}
			return false;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return false;
	}
	
	private void printMovePosition(int[][] solutn)
	{
		for(int i=0;i<solutn.length;i++)
		{
			for(int j=0;j<solutn.length;j++)
			{
				System.out.print(solutn[i][j]+",");
			}
			System.out.println();
		}
	}
			
}
