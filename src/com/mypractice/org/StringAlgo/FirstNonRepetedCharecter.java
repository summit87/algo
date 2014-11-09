package com.mypractice.org.StringAlgo;

public class FirstNonRepetedCharecter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str ="geexkstforgeexks";
		//String[] s = new FirstNonRepetedCharecter().getFirstNonRepetedChar(str).split(",");
		System.out.println(new FirstNonRepetedCharecter().indexInCharOfString2(str));
		//System.out.println(s[0]+","+s[1]);
	}

	private char indexInCharOfString(String str)
	{
		try
		{
			int[] ch = new int[256];
			int j=0;
			for(int i=0;i<str.length();i++)
			{
				ch[str.charAt(i)]++;
			}
			for(int i=0;i<str.length();i++)
			{
				if(ch[str.charAt(i)]==1)
				{
				   // System.out.println(str.charAt(i));
				    j=i;
				    break;
				}
			}
			return str.charAt(j);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return ' ';
	}
	public String getFirstNonRepetedChar(String str)
	{
		try
		{
			int count =0;
			char ch='p';
			int[] arr=new int[str.length()];
			for(int i=0;i<str.length();i++)
			{
				count=0;
				for(int j=0;j<str.length();j++)
				{
					if(str.charAt(i)==str.charAt(j))
					{
						count++;
					}
				}
				if(count == 1)
				{
					ch=str.charAt(i);
					break;
				}
			}
			
			return count+","+String.valueOf(ch); 
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			//return null;
		}
		return null;
	}
	
	
	
	private CountClass[] indexInCharOfString1(String s)
	{
	    try
	    {
		CountClass[] co = new CountClass[256];
		int j=0;
		for(char i='a';i<='z'&&j<s.length()&&String.valueOf(s.charAt(j))!=null;i++,j++)
		{
		    if(i==s.charAt(j))
		    {
			
				    System.out.println(s.charAt(i));
	        		    (co[s.charAt(j)].count)++;
	        		    if((co[s.charAt(j)].count)==1)
	        		    {
	        			co[s.charAt(j)].index=i;
	        			System.out.println(j);
	        		    }
			    
		    }
		}
		return co;
	    }
	    catch(Exception ex)
	    {
		ex.printStackTrace();
	    }
	    return null;
	}
	private int indexInCharOfString2(String s)
	{
	    try
	    {
		CountClass[] c = indexInCharOfString1(s);
		int result=100;
		int j=0;
		for(char i='a';i<='z'&&j<s.length()&&String.valueOf(s.charAt(j))!=null;i++,j++)
		{
		    if(i==s.charAt(j))
		    {
			System.out.println(i);
        		    if(c[i].count==1&&result>c[i].index)
        		    {
        			result = c[i].index;
        		    }
		    }
		}
		return s.charAt(result);
	    }
	    catch(Exception ex)
	    {
		ex.printStackTrace();
	    }
	    return -1;
	}
	
	
}
