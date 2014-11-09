package com.mypractice.org.ArrayPractice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;

import com.mypractice.org.shorting.InShorting;
import com.mypractice.org.shorting.QuickShort;

public class SortArrayElementAccordingToFreq {

    /**
     * @param args
     * 
     * 
     * Sort elements by frequency
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	try
	{
	    int[] a = {2,5,2,8,5,6,8,8};
	    int[] count = new int[9];
	    int[] ind = new int[9];
	    int k=9;
	    HashMap<Integer,Integer> map = new LinkedHashMap<Integer, Integer>();
	    QuickShort q = new QuickShort();
	    for(int i=0;i<a.length;i++)
	    {
		//count[a[i]]++;
		
		    map.put(a[i],count[a[i]]++);    
		
		
	    }
	    System.out.println(map.keySet());
	   
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }
    
    
    private void sortArray(int[] a)
    {
	try
	{
	    int[] ar = new InShorting().inShort(a);
	    int[][] arr = new int[a.length][2];
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
}

//class SortNum implements Comparator<T>
