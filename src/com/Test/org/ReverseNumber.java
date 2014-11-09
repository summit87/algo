package com.Test.org;

public class ReverseNumber {

	public static void main(String[] args)
	{
		System.out.println(new ReverseNumber().reverseNumber(234578));  
	}
	
	public int reverseNumber(int number)
	{
		if(number == 0)
		{
			return 0;
		}
		int num = 0;
		num = num*10+number%10;
		return reverseNumber(number/10)+num;
	}
	
}
