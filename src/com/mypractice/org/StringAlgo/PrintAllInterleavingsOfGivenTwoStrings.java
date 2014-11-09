package com.mypractice.org.StringAlgo;

public class PrintAllInterleavingsOfGivenTwoStrings {

    /**
     * @param args
     */
    public static void main(String[] args) {
	
	try
	{
	    String str1 = "BBX";
	    String str2 = "BBD";
	    new PrintAllInterleavingsOfGivenTwoStrings().interleavedString(str1, str2,new char[str1.length()+str2.length()],0);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    private void interleavedString(String str1,String str2,char[] outPut,int i)
    {
	try
	{
	    if(str1.length()==0&&str2.length()==0)
	    {
		for(char c : outPut)
		{
		    System.out.print(c);
		}
		System.out.println();
	    }
	    if(str1.length()!=0)
	    {
		outPut[i]=str1.charAt(0);
		interleavedString(str1.substring(1),str2,outPut,i+1);
	    }
	    if(str2.length()!=0)
	    {
		outPut[i]=str2.charAt(0); 
		interleavedString(str1,str2.substring(1),outPut,i+1);
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
}
