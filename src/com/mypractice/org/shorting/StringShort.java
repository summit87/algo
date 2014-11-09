package com.mypractice.org.shorting;

public class StringShort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try
		{
			String s="sumit";
			char[] ch = s.toCharArray();
			int min;
			String s1=null;
			for(int j=0;j<ch.length;j++)
			{
				min = j;
				char temp=' ';
				int k=0;
				for(int i=j+1;i<ch.length;i++)
				{
					if(ch[min]-'0'>ch[i]-'0')
					{
						min=i;
					}
				}
				temp=ch[j];
				ch[j]=ch[min];
				ch[min]=temp;
			}
			for(char f : ch)
			{
				System.out.print(f+",");
			}
			System.out.println();
			for(char g : ch)
			{
				System.out.print(g-'0'+",");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
