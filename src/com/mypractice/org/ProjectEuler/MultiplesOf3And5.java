package com.mypractice.org.ProjectEuler;

public class MultiplesOf3And5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	try
	{
	    new MultiplesOf3And5().sumOfMultipleOfThree(1000);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    
    private void sumOfMultipleOfThree(int num)
    {
	try
	{
	    int sum=0;
	    for(int i=3;i<num;i++)
	    {
		if(i%3==0||i%5==0)
		{
		    sum+=i;
		}
	    }
	    System.out.println("Sum = "+sum);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
}
