package com.mypractice.org.HackeRrank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestClass {

    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
	      
	       
	       
	try
	{
	        BufferedReader br = new BufferedReader(new FileReader(new File("test")));
	        String line = br.readLine();
	        int N = Integer.parseInt(line);
	   for(int i=0;i<N&&br.ready();i++)
	   {
	       new TestClass().printPrimeFactor(Integer.parseInt(br.readLine()));
	   }
	    int num=10;
	   
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	
    }
    
    
    private void printPrimeFactor(int num)
    {
	try
	{
	    	int p=2;
	    	int min = Integer.MAX_VALUE;
	    	int alfiMoney=num;
		while(num>=0&&p<=num)
		{
		    if(isPrimeNumber(p)&&num%p==0)
		    {
			num=num/p;
			//System.out.print(p+",");
			if(min>p)
			{
			    min=p;
			}
		    }
		    else
		    {
			p++;
		    }
		}
		System.out.println((alfiMoney-min));
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    private boolean isPrimeNumber(int num)
    {
	try
	{
	    for(int i=2;i<=num/2;i++)
	    {
		if(num%i==0)
		{
		    return false;
		}
	    }
	    return true;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }

}
