package com.mypractice.org.ArrayPractice;

import java.util.HashMap;
import java.util.Map.Entry;

import MyMap.MapEntry;

public class PrintUniqueRowsInAGivenBooleanMatrix {

    /**
     * @param args
     * 
     * Given a binary matrix, print all unique rows of the given matrix.
     * 
     * 
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	try
	{
	    int[][] a = {	{0, 1, 0, 0, 1},
        	        	{1, 0, 1, 1, 0},
        	        	{0, 1, 0, 0, 1},
        	        	{1, 1, 1, 0, 0},
	    		};
	    
	    	new PrintUniqueRowsInAGivenBooleanMatrix().getUniqueRow(a,4,5);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private void getUniqueRow(int[][] a,int row,int column)
    {
	try
	{
	    HashMap<String,Integer> map = new HashMap<String, Integer>();
	    String s = new String();
	    for(int i=0;i<row;i++)
	    {
		s= new String();
		for(int j=0;j<column;j++)
		{
			s+=String.valueOf(a[i][j]);
		}
		if(map.containsKey(s)==false)
		{
		    map.put(s,i);
		}
	    }
	    
	    for(Entry<String,Integer> e : map.entrySet())
	    {
		System.out.println(e.getKey());
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
}
