package com.mypractice.org.StringAlgo;

import java.util.HashMap;

public class LengthOfTheLongestSubstringWithoutRepeatingCharacters {

    /**
     * @param args
     */
    public static void main(String[] args) {
	
	try
	{
	    char[] str = "ABEDEFGABEF".toCharArray();
	    int len = new LengthOfTheLongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubString(str);
	    System.out.println(len);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    private int lengthOfLongestSubString(char[] str)
    {
	try
	{
	    int[] visited = new int[256];
	    int current_len = 1;
	    int max_len=Integer.MIN_VALUE;
	    int pre_ind = 0;
	    for(int i=0;i<256;i++)
	    {
		visited[i]=-1;
	    }
	    visited[str[0]]=0;
	    int st=Integer.MAX_VALUE;
	    for(int i=1;i<str.length;i++)
	    {
		pre_ind = visited[str[i]];
		if(pre_ind<0&&i-current_len>pre_ind)
		{
		    current_len++;
		}
		else
		{
		    if(current_len>=max_len)
		    {
			max_len = current_len;
			System.out.println("(i-pre_ind)-->"+(i-pre_ind));
			current_len = i-pre_ind;
			System.out.println("current_len >"+current_len);
		    }
		}
		visited[str[i]] = i;
	    }
	    if(current_len>max_len)
	    {
		max_len = current_len;
	    }
	   // System.out.println("Starting Index-->"+st);
	    return max_len;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    private int getLCS(char[] str)
    {
	try
	{
	    HashMap<String, Integer> map = new HashMap<String, Integer>();
	    int len=0;
	    for(int i=0;i<str.length;i++)
	    {
		if(map.containsKey(String.valueOf(str[i]))==false) 
		{
		    map.put(String.valueOf(str[i]),i);
		}
		else
		{
		    len=(len>map.size()?len:map.size());
		    i=map.get(String.valueOf(str[i]));
		    map.clear();
		}
	    }
	    return len>=map.size()?len:map.size();
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }

}
