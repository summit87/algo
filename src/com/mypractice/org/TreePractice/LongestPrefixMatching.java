package com.mypractice.org.TreePractice;

import java.util.HashMap;

public class LongestPrefixMatching {

    TrieTreeForLCP root;
    public static void main(String[] args)
    {
	try
	{
	    LongestPrefixMatching dict = new LongestPrefixMatching();
	    dict.insert("are");
	    dict.insert("area");
	    dict.insert("base");
	    dict.insert("cat");
	    dict.insert("cater");        
	    dict.insert("basement");
	    String s = dict.serach("baseme");
	    System.out.println(s);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    public LongestPrefixMatching() {
	root = new TrieTreeForLCP((char)0);
    }

    private void insert(String word)
    {
	try
	{
	    int len = word.length();
	    TrieTreeForLCP tl = root;
	    for(int i=0;i<len;i++)
	    {
		HashMap<Character,TrieTreeForLCP> child = tl.getChild();
		char ch = word.charAt(i);
		if(child.containsKey(ch))
		{
		    tl=child.get(ch);// through this line we will refer the current trie node
		}
		else
		{
		    TrieTreeForLCP temp = new TrieTreeForLCP(ch);
		    child.put(ch,temp);
		    tl=temp;
		}
	    }
	    tl.setEnd(true);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    private String serach(String input)
    {
	try
	{
	    int len=input.length();
	    TrieTreeForLCP tl = root;
	    String result=new String();
	    int lastMatch=0;
	    for(int i=0;i<len;i++)
	    {
		HashMap<Character,TrieTreeForLCP> child = tl.getChild();
		char ch=input.charAt(i);
		if(child.containsKey(ch))
		{
		    result+=String.valueOf(ch);
		    tl=child.get(ch);
		    if(tl.isEnd())
		    {
			lastMatch=i+1;
		    }
		}
		else
		{
		    break;
		}
	    }
	    if(!tl.isEnd())
	    {
		return result.substring(0,lastMatch);
	    }
	    return result;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    
    
}
class TrieTreeForLCP {
    
    
    private char ch;
    private boolean end;
    private HashMap<Character,TrieTreeForLCP> child = new HashMap<Character, TrieTreeForLCP>();
    public TrieTreeForLCP(char ch) {
	super();
	this.ch = ch;
	this.child = new HashMap<Character, TrieTreeForLCP>();
    }
    public char getCh() {
        return ch;
    }
    public void setCh(char ch) {
        this.ch = ch;
    }
    public boolean isEnd() {
        return end;
    }
    public void setEnd(boolean end) {
        this.end = end;
    }
    public HashMap<Character, TrieTreeForLCP> getChild() {
        return child;
    }
    public void setChild(HashMap<Character, TrieTreeForLCP> child) {
        this.child = child;
    }
    
    
    

}
