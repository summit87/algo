package com.mypractice.org.StringAlgo;

import java.math.BigInteger;
import java.util.Random;

public class RobinKarpPatternMatching {

	/**
	 * @param args
	 */
	private static long qPrime;
	private static int radix;
	private static int patternLength;
	private static long leadingDigit;
	private static long pattHash;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt="abrakadabra";
		String patte = "kadab";
		new RobinKarpPatternMatching().robinKarpPatternToHash(patte,txt);

	}

	private void robinKarpPatternToHash(String patte,String text)
	{
		try
		{
			//radix=1;
			qPrime = longPrime();
			radix=256;
			System.out.println("LongPrime-->"+qPrime);
			//System.out.println("OffsetOrRaddix -->"+offsetOrRadix(patt,qPrime));
			leadingDigit = offsetOrRadix(patte,qPrime);
			//System.out.println("Hash-->"+patternToHash(patt,qPrime,patt.length())); 
			pattHash = patternToHash(patte,qPrime,patte.length());
			
			System.out.println("Index > "+new RobinKarpPatternMatching().search(text,patte));
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	
	
	private int search(String txt,String patt)
	{
		int n=txt.length();
		int m=patt.length();
		long textHash = patternToHash(txt,qPrime,patt.length());
		if(n<m)
		{
			return n;
		}
		else if(textHash==pattHash&&check(txt,0))
		{
			return 0;
		}
		else
		{
			for(int i=m;i<n;i++)
			{
				textHash = ((textHash+qPrime-leadingDigit*txt.charAt(i-m))%qPrime)%qPrime;
				System.out.println("Removing Trailing  > "+textHash);
				textHash = (textHash*radix+txt.charAt(i))%qPrime;
				System.out.println("Adding Leading  > "+textHash);
				int os = i-m+1;
				if(pattHash==textHash&&check(txt,os))
				{
					return os;
				}
			}
		}
		return -1;
	}
	
	
	
	private boolean check(String patt,int i)
	{
		
		for(int j=0;j<patt.length();j++)
		{
			if(patt.charAt(j)!=patt.charAt(i+j))
			{
				return false;
			}
		}
		return true;
	}
	
	private long offsetOrRadix(String pattern,long qPrime)
	{
		radix=256;
		leadingDigit=1;
		for(int i=0;i<pattern.length();i++)
		{
			leadingDigit = (radix*leadingDigit)%qPrime;
		}
		return leadingDigit;
	}
	
	private long patternToHash(String pattern,long qPrime,int plength)
	{
		long h=0;
		System.out.println("qPrime > "+qPrime);
		for(int i=0;i<plength;i++)
		{
			h=(radix*h+pattern.charAt(i))%qPrime; 
		}
		return h;
	}
	
	
	private long longPrime()
	{
		BigInteger b = BigInteger.probablePrime(31,new Random());
		return b.longValue();
	}
	
	
}
