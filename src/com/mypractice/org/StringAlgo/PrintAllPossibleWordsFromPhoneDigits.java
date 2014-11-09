package com.mypractice.org.StringAlgo;

public class PrintAllPossibleWordsFromPhoneDigits {

    /**
     * @param args
     */
    
    
    static char[][] ch ={
    			 	 {' '},
        			 {' '},
        			 {'a','b','c'},
        			 {'d','e','f'},
        			 {'g','h','i'},
        			 {'j','k','l'},
        			 {'m','n','o'},
        			 {'p','q','r','s'},
        			 {'t','u','v'},
        			 {'w','x','y','z'}
    		       };
    public static void main(String[] args) {
	try
	{
	    int[] num = {2,3,4};
	    char[] output = new char[num.length];
	    new PrintAllPossibleWordsFromPhoneDigits().printKeyCombination(num, output,0,num.length);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    private void printKeyCombination(int[] number,char[] output,int current_digit,int n)
    {
	try
	{
	    if(number.length==0)
	    {
		return;
	    }
	    if(current_digit==n)
	    {
		for(char c : output)
		{
		    System.out.print(c);
		}
		System.out.println();
		return;
	    }
	    for(int i=0;i<ch[number[current_digit]].length;i++)
	    {
		output[current_digit] = ch[number[current_digit]][i];
		printKeyCombination(number, output, current_digit+1, n);
		if(number[current_digit]==0||number[current_digit]==1)
		{
		    break;
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }

}
