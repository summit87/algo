package com.mypractice.org.StringAlgo;

public class AnagramSubstringSearchOrSearchForAllPermutations {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try
	{
	    char[] text="BACDGABCDA".toCharArray();
	    char[] pattern = "ABCD".toCharArray();
	    new AnagramSubstringSearchOrSearchForAllPermutations().anagramSearch(text, pattern);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private void anagramSearch(char[] text,char[] pattern)
    {
	try
	{
	    int n=text.length;
	    int m = pattern.length;
	    char[] countP=new char[256];
	    char[] countW = new char[256];
	    int j=0;
	    for(int i=0;i<pattern.length;i++)
	    {
		countP[pattern[i]]++;
		countW[text[i]]++;
	    }
	    for(j=m;j<n;j++)
	    {
		if(compareString(countP, countW))
		{
		    System.out.println("Pattern -->Found At The Index - > "+(j-m));
		}
		
		    countW[text[j]]++;
		    countW[text[j-m]]--;
		
	    }
	    if(compareString(countP, countW))
		{
		    System.out.println("Pattern -->Found At The Index - > "+(n-m));
		}
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    
    
    private boolean compareString(char[] countP,char[] countW)
    {
	try
	{
	    for(int i=0;i<256;i++)
		if(countP[i]!=countW[i])
		    return false;
		return true;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    
    
    
}
