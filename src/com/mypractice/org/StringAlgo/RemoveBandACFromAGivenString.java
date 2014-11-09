package com.mypractice.org.StringAlgo;

public class RemoveBandACFromAGivenString {

    /**
     * @param args
     */
    public static void main(String[] args) {

	try
	{
	    char[] s = "ababac".toCharArray();
	    new RemoveBandACFromAGivenString().printChar(s);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private void printChar(char[] s)
    {
	try
	{
	    int i=0;
	    int state = 0;
	    for(int j=0;j<s.length;j++)
	    {
		if(state==0&&s[j]!='a'&&s[j]!='b')
		{
		    s[i]=s[j];
		    i++;
		}
		if(state==1&&s[j]!='c')
		{
		    s[i]='a';
		    i++;
		    if(s[j]!='b'&&s[j]!='a')
		    {
			s[i]=s[j];
			i++;
		    }
		}
		state = (s[j]=='a'?1:0);
	    }
	    if(state==1)
	    {
		s[i]='a';
		i++;
	    }
	    s[i--] = '\0';
	   System.out.println(String.valueOf(s));
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
}
