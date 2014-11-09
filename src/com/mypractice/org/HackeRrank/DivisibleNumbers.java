package com.mypractice.org.HackeRrank;

public class DivisibleNumbers {

    /**
     * @param args
     */
    public static void main(String[] args) {
	
	try
	{
	    int m=0;
	    int min = Integer.MAX_VALUE;
	    int n=9;
	    DivisibleNumbers d = new DivisibleNumbers();
	    for(int i=1;i<=n;i++)
	    {
		if(min>=i)
		{
		    min=i;
		}
	    }
	    System.out.println("Min > "+min);
	    if(min%n==0&&d.isCondition(min))
	    {
		d.print(min);
	    }
	    else
	    {
		System.out.println("lkj");
	    }
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }
    private void print(int m)
    {
	int pow=0;
	String s = String.valueOf(m);
	
	if(m%10==0)
	{
	    s=s+"0";
	}
	int i=0;
	pow=s.length()-1;
	String s2=new String();
	while(i<s.length())
	{
	   if((int)Math.pow(10,pow)==1)
	   {
	       s2+=Integer.parseInt(String.valueOf(s.charAt(i)))+"+";  
	   }
	   else
	   {
	       s2+=Integer.parseInt(String.valueOf(s.charAt(i)))+"*"+(int)Math.pow(10,pow)+"+"; 
	   }
	    pow--;
	    i++;
	}
	
	    s2=s2.substring(0,s2.length()-1);
	
	System.out.println("s2 > "+s2);
    }
    private boolean isCondition(int m)
    {
	try
	{
	    System.out.println("oiuo");
	    if(String.valueOf(m)!=String.valueOf((double)m))
	    {
		
		int sum=0;
		int pro=1;
		while(m>0)
		{
		    pro*=m%10;
		    sum+=m%10;
		    m=m/10;
		}
		if(sum==pro)
		{
		    return true;
		}
		return false;
	    }
	    return false;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }

}
