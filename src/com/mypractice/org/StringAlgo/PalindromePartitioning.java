package com.mypractice.org.StringAlgo;

public class PalindromePartitioning {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try
	{
	    char[] str = "ababbbabbababa".toCharArray();
	    int minPartion = new PalindromePartitioning().minPartionOfString(str);
	    System.out.println("minPartion > "+minPartion);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private int minPartionOfString(char[] str)
    {
	try
	{
	    int len = str.length;
	    boolean[][] p = new boolean[len][len];
	    int[][] c = new int[len][len];
	    for(int i=0;i<len;i++)
	    {
		p[i][i]=true;
		c[i][i]=0;
	    }
	    for(int l=2;l<=len;l++)
	    {
		for(int i=0;i<len-l+1;i++)
		{
		    int j=i+l-1;
		    if(l==2)
		    {
			p[i][j] = (str[i]==str[j]);
		    }
		    else
		    {
			p[i][j] = (str[i]==str[j])&&(p[i+1][j-1]);
		    }
		    if(p[i][j]==true)
		    {
			c[i][j]=0;
		    }
		    c[i][j]=Integer.MAX_VALUE;
		    for(int k=i;k<j;k++)
		    {
			c[i][j] = (c[i][j]>(c[i][k]+c[k+1][j]+1)?(c[i][k]+c[k+1][j]+1):c[i][j]);
		    }
		}
	    }
	    for(int i=0;i<len;i++)
	    {
		for(int j=0;j<len;j++)
		{
		   System.out.print(c[i][j]+",");
		}
		System.out.println();
		
	    }
	    System.out.println();
	    for(int i=0;i<len;i++)
	    {
		for(int j=0;j<len;j++)
		{
		   System.out.print(p[i][j]+",");
		}
		System.out.println();
		
	    }
	    return c[0][len-1];
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
}
