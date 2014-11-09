package com.mypractice.org.StringAlgo;

public class LexicographicRankOfAString {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try
	{
	    char[] str = "STRING".toCharArray();
	    new LexicographicRankOfAString().coutnCharecter(str);
//	    int rank = new LexicographicRankOfAString().getLexicoGraphicRanke(str);
//	    System.out.println((rank+1)); // By Default the rank will be 1 so we are adding +1 in to the result
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    
    private void coutnCharecter(char[] ch)
    {
	try
	{
	    int[] count = new int[256];
	    for(int i=0;i<ch.length;i++)
	    {
		++count[ch[i]];
	    }
	    for(int k=0;k<256;k++)
	    {
		if(count[k]!=0)
		System.out.println(count[k]+","+(char)k);
	    }
	    System.out.println("-------");
	    System.out.println();
	    for(int k=1;k<256;k++)
	    {
		count[k]+=count[k-1];
	    }
	    for(int k=1;k<256;k++)
	    {
		if(count[k]!=0)
		System.out.println(count[k]+","+(char)k);
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    private int fact(int num)
    {
	try
	{
	    return num<=1?1:num*fact(num-1);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    private int smallestChar(int i,int j,char ch,char[] str)
    {
	try
	{
	    int count=0;
	    for(int i1=i+1;i1<=j;i1++)
	    {
		if(ch>str[i1])
		{
		    count++;
		}
	    }
	    return count;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    private int getLexicoGraphicRanke(char[]ch)
    {
	try
	{
	    int mul = fact(ch.length);
	    int len = ch.length;
	    int result=0;
	    for(int i=0;i<ch.length;i++)
	    {
		mul=mul/(len-i);
		int count = smallestChar(i,len-1, ch[i],ch);
		result+=count*mul;
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
