package com.mypractice.org.StringAlgo;

import java.util.HashMap;

public class RecursivelyRemoveAllAdjacentDuplicates {

    /**
     * @param args
     */
    static int top;
    static int maxSize ;
    static char[] items ;
    public static void main(String[] args) {

	try
	{
	    String s = "geeksforgeeg";
	    maxSize = s.length();
	    items = new char[maxSize];
	    new RecursivelyRemoveAllAdjacentDuplicates().removeDuplicate("geeksforgeeg");
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private void removeDuplicate(String s)
    {
	try
	{
	    int j=0;
	    int k=0;
	    pushItem(s.charAt(0));
	    for(int i=0;i<s.length()-1;i++)
	    {
		if(s.charAt(i)==s.charAt(i+1))
		{
		    k=i;
		}
		else
		{
            		while(s.charAt(i)!=s.charAt(i+1)&&!isEmpty()&&s.charAt(k)!=s.charAt(i))
            		{
            		    char c = popItem();
//            		    if(c!=s.charAt(i))
//            		    {
            			System.out.print(c+",");
            		    //}
            		}
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    public char popItem() throws Exception
    {
        try
        {
             return items[top--];
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
    public void pushItem(char item) throws Exception
    {
        try
        {
            items[++top] = item;
        }
        catch(Exception ex)
        {
            throw ex;
        }
        
    }
    
    
    
    public boolean isEmpty()
    {
        return (top == -1);
    }
    
    
}
