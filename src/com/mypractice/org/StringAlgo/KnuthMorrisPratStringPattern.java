package com.mypractice.org.StringAlgo;

public class KnuthMorrisPratStringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pattern="abcabdabc";
		String text="abcabdabcabdabcabdabdabc";
		new KnuthMorrisPratStringPattern().searchPattern(text, pattern);
	}



	private int[] getPreprocessing(String pattern)
	{
		int[] b=new int[pattern.length()+1];
		int j=-1;
		int i=0;
		b[0]=-1;
		while(i<pattern.length())
		{
			while(j>=0&&pattern.charAt(i)!=pattern.charAt(j))
			{
				j=b[j];
			}
			i++;
			j++;
			b[i]=j;
		}
		return b;
	}
	
	private void searchPattern(String str,String pattern)
	{
		try
		{
			int i=0;
			int[] b = new int[pattern.length()+1];
			b=getPreprocessing(pattern);
			int j=0;
			while(i<str.length())
			{
				while(j>=0&&str.charAt(i)!=pattern.charAt(j))
				{
					j=b[j];
				}
				j++;
				i++;
				if(j==pattern.length())
				{
					System.out.println("found : "+i);
					j=b[j];
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}