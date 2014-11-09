package com.mypractice.org.StringAlgo;

public class ShortString {

	/**
	 * @param args
	 */
	
	/*
	 * In this string shorting capital letter comes first becz shorting is 
	 * done on the bassis of ascii value of charecter
	 * 
	 */
	public static void main(String[] args) {
		String s = "a0b0c0d0e0f0g0h0i03459789fdgdfgj0k0l0m0n0o0p0q0r0s0t0u0v0w0x0y0z0";
		System.out.println(new ShortString().shortString(s));

	}
	
	public String shortString(String str)
	{
		try
		{
			char[] ch = str.toCharArray();
			int min=0;
			String s=new String();
			for(int i=0;i<ch.length;i++)
			{
				min=ch[i];
				int k=0;
				for(int j=i;j<ch.length;j++)
				{
					if(min>ch[j])
					{
						min=ch[j];
						k=j;
					}
				}
				
				char temp=ch[i];
				ch[i]=(char) min;
				s=s+ch[i];
				ch[k]=temp;
				//System.out.println(temp+" : "+ch[i]);
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
