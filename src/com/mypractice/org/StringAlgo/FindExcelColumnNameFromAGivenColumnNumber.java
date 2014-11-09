package com.mypractice.org.StringAlgo;

import com.sun.corba.se.impl.ior.NewObjectKeyTemplateBase;

public class FindExcelColumnNameFromAGivenColumnNumber {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try
	{
	    int c = 676;
	   for(char d : new FindExcelColumnNameFromAGivenColumnNumber().getColomnName(c))
	   {
	       System.out.print(d);
	   }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    
    private char[] getColomnName(int columnNumber)
    {
	try
	{
	    int reminder = 0;
	    char[] s=new char[10];
	    int c=0;
	    while(columnNumber>0)
	    {
		reminder = columnNumber%26;
		if(reminder==0)
		{
		    s[c] = 'Z';
		    c++;
		    columnNumber = (columnNumber/26)-1;
		}
		else
		{
		    s[c] = (char) ((char)(reminder-1)+('A'));
		    c++;
		    columnNumber = columnNumber/26;
		}
	    }
	    return s;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    
    
}
