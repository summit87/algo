package com.mypractice.org.ArrayPractice;

public class SortTheCharecterUsingCountSort {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String s = "geeksforgeeks";
	new SortTheCharecterUsingCountSort().sortCharecter(s);

    }
    
    private void sortCharecter(String s)
    {
	int[] count = new int[256];
	char ch;
	for(int i=0;i<s.length();i++)
	{
	    count[s.charAt(i)]++;
	}
	
	
    }
}
