package com.mypractice.org.StringAlgo;

public class FindIfAStringIsInterleavedOfTwoOtherStrings {

    /**
     * @param args
     */
    public static void main(String[] args) {
	
	try
	{
	    String strA = "BBX";
	    String strB = "BBD";
	    String strC = "BBBDBX";
	    if(new FindIfAStringIsInterleavedOfTwoOtherStrings().isInterleaved2(strA, strB, strC))
	    {
		System.out.println("Interleaved");
	    }
	    else
	    {
		System.out.println(" Not Interleaved");
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private boolean isInterleaved2(String strA,String strB,String strC)
    {
	try
	{
	    int m = strA.length();
	    int n = strC.length();
	    boolean[][] table = new boolean[m+1][n+1];
	    for(int i=0;i<m;i++)
	    {
		for(int j=0;j<n;j++)
		{
		    if(i==0&&j==0)
		    {
			table[i][j]=false;
		    }
		    else if(i==0&&strB.charAt(j)==strC.charAt(j-1))
		    {
			table[i][j]=table[i][j-1];
		    }
		    else if(j==0&&strA.charAt(i)==strC.charAt(i-1))
		    {
			table[i][j] = table[i-1][j];
		    }
		    else if(strA.charAt(i-1)==strC.charAt(i+j-1)&&strB.charAt(j-1)!=strC.charAt(i+j-1))
		    {
			table[i][j] = table[i][j-1];
		    }
		    else if(strB.charAt(j-1)==strC.charAt(i+j-1)&&strA.charAt(i-1)!=strC.charAt(i+j-1))
		    {
			table[i][j] = table[i][j-1];
		    }
		    else
		    {
			table[i][j] = (table[i-1][j]||table[i][j-1]);
		    }
		}
	    }
	    return table[m][n];
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    
    
    
    
    
    
    
    
    
    
    private boolean isInteleaved(String strA,String strB,String strC)
    {
	try
	{
	    int lenA = strA.length();
	    int lenB = strB.length();
	    int lenC = strC.length();
	    if(lenA+lenB==lenC)
	    {
		int i=0;
		int j=0;
		int k=0;
		while(i<=j)
		{
		    if(strA.charAt(j)==strC.charAt(i))
		    {
			j++;
		    }
		    else if(strB.charAt(k)==strC.charAt(i))
		    {
			k++;
		    }
		    else
		    {
			return false;
		    }
		    i++;
		}
		return true;
	    }
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    
    private boolean isInterleaved1(String strA,String strB,String strC,int lenA,int lenB,int lenC)
    {
	try
	{
	    if(strA==null||strB==null||strC==null)
	    {
		return true;
	    }
	    if(strC==null)
	    {
		return false;
	    }
	    if(lenA+1<=strA.length()&&lenB+1<=strB.length()&&lenC+1<=strC.length())
	    return (((strA.charAt(lenA)==strC.charAt(lenC)&&
		    isInterleaved1(strA, strB, strC, lenA+1, lenB, lenC+1)))||
		    ((strB.charAt(lenB)==strC.charAt(lenC)&&
			    isInterleaved1(strA, strB, strC, lenA, lenB+1, lenC+1))));
	    
		
	   
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    
    
    
    
}
