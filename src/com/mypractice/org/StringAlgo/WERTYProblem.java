package com.mypractice.org.StringAlgo;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class WERTYProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try
		{
			char[] arrayOfKey = {'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M',','};
			System.out.println("Enter Input");
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			System.out.println(new WERTYProblem().getDesiredOutPut(str, arrayOfKey));
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

	
	private String getDesiredOutPut(String s,char[] arrayOfKey)
	{
		try
		{
			String str = new String(); 
			for(int i=0;i<s.length();i++)
			{
				str+=String.valueOf(getLeftCharofEnteredChar(s.charAt(i), arrayOfKey));
			}
			return str;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}
	
	
	
	private char getLeftCharofEnteredChar(char ch,char[] arrayOfKey)
	{
		try
		{
			int k=0;
			for(int i=0;i<arrayOfKey.length;i++)
			{
				//k=0;
				if(ch==arrayOfKey[i])
				{
					k=i-1;
					System.out.println(ch+" > "+k+" > "+i);
				}
			}
			if(k<0)
			{
				k=0;
			}
			ch=arrayOfKey[k];
			return ch;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return 'p';
	}
	
	
	
	
}
