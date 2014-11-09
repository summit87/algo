package com.mypractice.org.HackeRrank;

import java.io.File;
import java.util.Scanner;

public class PalindromeIndex {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	try
	{
	    PalindromeIndex p = new PalindromeIndex();
	    Scanner in = new Scanner(new File("palin.txt"));
	    String line = in.nextLine();
            int N = Integer.parseInt(line);
            for(int i=0;i<N;i++)
            {
        	int k=new PalindromeIndex().getIndex(in.nextLine());
    	    	System.out.println(k); 
            }
	    
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private boolean isPalindrom(String s,int k)
    {
	try
	{
	    if(s.length()==0||s.length()==1)
	    {
		return true;
	    }
	    if(s.charAt(0)==s.charAt(s.length()-1))
	    {
		String s1 = s.substring(1,s.length()-1);
		return (isPalindrom(s1,k+1));
	    }
	    return false;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    
    private int getIndex(String s)
    {
	try
	{
	    int index=0;
	    if(isPalindrom(s,0))
	    {
		return -1;
	    }
	    for(index=0;index<s.length();index++)
	    {
		int k=s.indexOf(s.charAt(index));
		String x = s.substring(0,k)+s.substring(k+1,s.length());
		if(isPalindrom(x,0))
		{
		    return k;
		}
	    }
	    return 34;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return Integer.MIN_VALUE;
    }
    
}
