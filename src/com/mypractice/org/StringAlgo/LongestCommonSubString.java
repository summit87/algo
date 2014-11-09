package com.mypractice.org.StringAlgo;

public class LongestCommonSubString {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// 
	try
	{
	    String str = "OldSite:GeeksforGeeks.org";
	    String str1 = "NewSite:GeeksQuiz.com";
	    System.out.println(new LongestCommonSubString().getLongestSubString(str.toCharArray(), str1.toCharArray()));
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    
    private int getLongestSubString(char[] str,char[] str1)
    {
	try
	{
	    int m=str.length;
	    int n = str1.length;
	    int[][] lcs = new int[m][n];
	    int result=0;
	    for(int i=0;i<m;i++)
	    {
		for(int j=0;j<n;j++)
		{
		    if(i==0||j==0)
		    {
			lcs[i][j] = 0;
		    }
		    else if(str[i-1]==str1[j-1])
		    {
			lcs[i][j] = 1+lcs[i-1][j-1];
			result = result<=lcs[i][j]?lcs[i][j]:result;
		    }
		    else
		    {
			lcs[i][j]=0;
		    }
		}
	    }
	    return result;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    
    
    
}
