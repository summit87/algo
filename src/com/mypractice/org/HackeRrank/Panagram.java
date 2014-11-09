package com.mypractice.org.HackeRrank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class Panagram {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try
	{
	    
	    BufferedReader br = new BufferedReader(new FileReader(new File("pan.txt")));
	    String line = br.readLine();
	    Panagram p = new Panagram();
	    if(p.isPanagram(line)) 
	    {
		System.out.println("pangram");
	    }
	    else
	    {
		System.out.println("not pangram");
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    private HashMap<Character,Character>  storeChar(String s)
    {
	try
	{
	    s=s.toUpperCase();
	    System.out.println(s);
	    HashMap<Character,Character> map = new HashMap<Character, Character>();
	    for(int i=0;i<s.length();i++)
	    {
		if(s.charAt(i)!=' ')
		{
        		if(map.containsKey(s.charAt(i))==false) 
        		{
        		    map.put(s.charAt(i),s.charAt(i));
        		}
		}
	    }
	    System.out.println(map.keySet()+"> "+map.size());
	    return map;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }

    private boolean isPanagram(String s)
    {
	try
	{
	    HashMap<Character,Character> map = storeChar(s);
	    boolean flag=false;
	    for(char c='A';c<='Z';c++)
	    {
		if(map.containsKey(c))
		{
		   flag=true;
		}
		else
		{
		    flag=false;
		    break;
		}
	    }
	    return flag;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    
}
