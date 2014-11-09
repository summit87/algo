package com.mypractice.org.DynamicProrammingPractice;

public class LongestCommonSubsequenceInStrings {

	
	public static void main(String[] args)	
	{
		try
		{
			String str1 = new String("abcdgh");
			String str2 = new String("aedfhr");
			System.out.println(new LongestCommonSubsequenceInStrings().LCSInStringByMemo(str1, str2));
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	private int usingRecurcive()
	{
		try
		{
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return 0;
	}
	
	private int LCSInStringByMemo(String str1,String str2)
	{
		try
		{
			int[][] c= new int[str1.length()][str2.length()];;
			for(int i=0;i<str1.length();i++)
			{
				c[i][0]=0;
			}
			for(int j=0;j<str2.length();j++)
			{
				c[0][j]=0;
			}
			int x=0;
			int y=0;
			for(x=0;x<str1.length();x++)
			{
				for(y=0;y<str2.length();y++)
				{
					if(str1.charAt(x)==str2.charAt(y))
					{
						if(x-1<0&&y-1<0)
						{
							c[x][y]=c[0][0]+1;
						}
						else
						{
							c[x][y] = c[x-1][y-1]+1;
						}
					}
					else
					{
						if(x-1<0||y-1<0)
						{
							c[x][y]=Math.max(c[0][0],c[0][0]);
						}
						else
						{
							c[x][y]=Math.max(c[x-1][y],c[x][y-1]);
						}
						
					}
				}
			}
			return c[x-1][y-1];
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return 0;
		}
		
	}
	
}
