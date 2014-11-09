package com.mypractice.org.StringAlgo;

import java.util.HashSet;
import java.util.Set;

public class CountPossibleDecodingsOfAGvenDigitSequence {

    /**
     * @param args
     */
    public static void main(String[] args) {
	
	try
	{
	    char[] digit = {'1','2','3','4'};
	    String givenString = digit.toString();
	    for(String s : new CountPossibleDecodingsOfAGvenDigitSequence().printAllDecoding("", givenString))
	    {
		System.out.println(s);
	    }
//	    int count = new CountPossibleDecodingsOfAGvenDigitSequence().countDecosingByDP(digit,digit.length);
//	    System.out.println(count);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }
    
    
    private int countDecosingByDP(char[] digit,int n)
    {
	try
	{
	    int[] count = new int[n+1];
	    count[0] = 0;count[1]=1;
	    for(int i=2;i<n;i++)
	    {
		if(digit[n-1]=='0')
		{
		    count[i] = count[i-1];
		}
		if(digit[i-2]>='2'&&digit[i-1]<'7')
		{
		    count[i]+=count[i-2];
		}
	    }
	    return count[n-1];
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    
    
    private Set<String> printAllDecoding(String s,String givenString)
    {
	try
	{
	    Set<String> set = new HashSet<String>();
	    if(givenString.length()==0)
	    {
		set.add(s);
		return set;
	    }
	    if(givenString.length()==1)
	    {
		set.add(givenString);
		return set;
	    }
	    set.addAll(printAllDecoding(s+(char)(givenString.charAt(0)-'1'+'a'),givenString.substring(1)));
	    if(givenString.length()>=2&&givenString.charAt(0)=='1')
	    {
		set.addAll(printAllDecoding(s+(char)(10+givenString.charAt(1)-'1'+'a'), givenString.substring(1)));
	    }
	    if(givenString.length()>=2&&givenString.charAt(0)>='2'&&givenString.charAt(1)<'7')
	    {
		set.addAll(printAllDecoding(s+(char)(20+givenString.charAt(1)-'1'+'a'), givenString.substring(2)));
	    }
	    return set;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    
    
    
    
    
    
    /*By Recursion*/
    private int countDecosing(char[] digit,int n)
    {
	try
	{
	    int count = 0;
	    if(n==0||n==1)
	    {
		count= 1;
	    }
	    else
	    {
		if(digit[n-1]>'0'&&n-1<digit.length)
		{
		    count=countDecosing(digit, n-1);
		}
		if(digit[n-2]>='2'&&digit[n-1]<'7')
		{
		    count+=countDecosing(digit, n-2);
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
    
    
}
