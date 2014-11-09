package com.mypractice.org.StringAlgo;

public class LongestCommonSubsequenceInString {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	char[] s1 ="AGGTAB".toCharArray();
	char[] s2 ="GXTXAYB".toCharArray();
	int lcs = new LongestCommonSubsequenceInString().lCSInString(s1,s2,s1.length,s2.length);
	//int lcs = new LongestCommonSubsequenceInString().lCSInString(s1, s2, s1.length, s2.length);
	System.out.println("LCS-->"+lcs);
    }

    
    private int lCSInString(char[] s1,char[] s2,int s1l,int s2l)
    {
	try
	{
	    if(s1l==s2l)
	    {
		return 0;
	    }
	    else
	    {
		if(s1l-1>=0&&s2l-1>=0&&s1[s1l-1]==s2[s2l-1])
		{
		    return 1+lCSInString(s1, s2, s1l-1, s2l-1);
		}
		else if(s1l-1>=0&&s2l-1>=0)
		{
		    return getMax(lCSInString(s1, s2, s1l, s2l-1),lCSInString(s1, s2, s1l-1, s2l));
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    private int getMax(int a,int b)
    {
	try
	{
	    return a<b?b:a;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    private int getLCS(String s1,String s2)
    {
	try
	{
	    int[][] lcs = new int[s1.length()+1][s2.length()+1];
	    int i=0;
	    int j=0;
	    for(i=0;i<=s1.length();i++)
	    {
		for(j=0;j<=s2.length();j++)
		{
		    if(i==0&&j==0)
		    {
			lcs[i][j]=0;
		    }
		    else if(s1.charAt(i)==s2.charAt(j))
		    {
			lcs[i][j] = 1+lcs[i-1][j-1];
		    }
		    else
		    {
			lcs[i][j] = getMax(lcs[i-1][j],lcs[i][j-1]);
		    }
		}
	    }
	    return lcs[s1.length()][s2.length()];
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
}
