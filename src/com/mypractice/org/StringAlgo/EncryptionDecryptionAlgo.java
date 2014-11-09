package com.mypractice.org.StringAlgo;

public class EncryptionDecryptionAlgo {

	
	public static void main(String[] args)
	{
		//new EncryptionDecryptionAlgo().encryptionDecryption("123423");
		new EncryptionDecryptionAlgo().usingMemorizationEncrDecry("1234");
	}
	
	private String encryptionDecryption(String str)
	{
		String s="";
		int g=0;
		if(str.length()<=0)
		{
			return "";
		}
		for(int i=1;i<=str.length();i++)
		{
			s=str.substring(0,i);
			g=Integer.parseInt(s);
			if(g>=1&&g<=26)
			{
				System.out.print(g+",");
				
				encryptionDecryption(str.substring(i));
			}
//			s=encryptionDecryption(str.substring(i));
//			System.out.println("--"+s);
			//s=s+str.substring(0,i);
			
		}
		System.out.println();
		return s;
	}
	
	private void usingMemorizationEncrDecry(String str)
	{
		try
		{
			int m=0;
			int j=0;
			int[][] ma = new int[str.length()+1][str.length()+1];
			int in=0;
			for(int i=0;i<str.length();i++)
			{
				j=0;
				while(j<str.length())
				{
					if(i==0)
					{
						in=Integer.parseInt(String.valueOf(str.charAt(j)));
						if(in>=1&&in<=26)
						{
							ma[i][j]=in;
						}
						j++;
					}
					else
					{
						int k=0;
						while(k<str.length()&&j<=k)
						{
							in = Integer.parseInt(str.substring(j,k+1));
							if(in>=1&&in<=26)
							{
								boolean flag=false;
								for(int l=0;l<str.length();l++)
								{
									for(int a=0;a<str.length();a++)
									{
										if(ma[l][a]!=in)
										{
											flag=true;
										}
									}
								}
								if(flag)
								{
									ma[i][j]=in;
								}
							}
							k++;
							j++;
						}
					}
					
				}
			}
			for(int i=0;i<str.length();i++)
			{
				for(int j1=0;j1<str.length();j1++)
				{
					System.out.print(ma[i][j1]+",");
				}
				System.out.println();
			}
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
}
