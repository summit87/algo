package com.mypractice.org.StringAlgo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringPermutation {

	/**
	 * @param args
	 */
	ShortString sht = new ShortString();
	static Set<String> set = new LinkedHashSet<String>();
	public static void main(String[] args) {
		String s="String";
		new StringPermutation().permuteString("",s);
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

	
	private void permuteString(String s1,String s/*int istartingIndex int j endingIndex*/)
	{
		if(s.length()<=1)
		{
			set.add(s+s1);
		}
		for(int i=0;i<s.length();i++)
		{
			String s2=s.substring(0,i)+s.substring(i+1);
			permuteString(s1+s.charAt(i),s2);
		}
		//return s;
	}

}
