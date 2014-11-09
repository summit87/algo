package com.mypractice.org.HackeRrank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class PrefixCompression {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try
	{
	    	BufferedReader br = new BufferedReader(new FileReader(new File("PrefixCompression.txt")));
	        String x = br.readLine();
	        String y = br.readLine();
	        new PrefixCompression().optput(x, y);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }

    
    private void optput(String x,String y)
    {
	try
	{
	    int i=0;
	    for(i=0;i<x.length()&&i<y.length();i++)
	    {
		if(x.charAt(i)!=y.charAt(i))
		{
		    break;
		}
	    }
	    System.out.println(i+" "+x.substring(0,i));
	    System.out.println(x.length()!=0?x.length()-i+" "+x.subSequence(i,x.length()):0+" "+0);
	    System.out.println(y.length()!=0?y.length()-i+" "+y.subSequence(i,y.length()):0+" "+0);
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
}
