package com.mypractice.org.ArrayPractice;

import java.util.HashMap;

public class FindTheSubArrayWhichHavingSumZero {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try
	{
	    int[] a = {4,2,-3,1,6};
	    new FindTheSubArrayWhichHavingSumZero().gettingSubArray(a);
	    new FindTheSubArrayWhichHavingSumZero().usingHashMap(a);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }

    
    /*
     * 
     * 
     * Here we are using hashMap for reducing time complexity
     *  making sum as key and index (this is the index till where we are taking sum in the array)
     *  as value. if we will get same sum in the hash map then we will take value for that key
     *  for refrence check this-->http://www.careercup.com/question?id=5772881111810048
     * */
    
    
    
    private void usingHashMap(int[] a)
    {
	try
	{
	    HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
	    int i=0;
	    int sum=0;
	    int j=0;
	    int begInd=0;
	    while(i<a.length)
	    {
		sum=0;
		j=0;
		while(j<=i)
		{
		    sum+=a[i];
		    j++;
		}
		if(map.containsKey(sum))
		{
		    begInd = map.get(sum);
		    j++;
		    break;
		}
		else
		{
		    map.put(sum,j);
		}
		i++;
	    }
	    
	    System.out.println("Zero Index - >"+begInd+" > "+j);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    private void gettingSubArray(int[] a)
    {
	try
	{
	    int sum=0;
	    int k=0;int p=0;
	    int length = a.length-1;
	    for(int i=0;i<a.length;i++)
	    {
		sum=a[i];
		if(sum==0)
		{
		    return;
		}
		for(int j=i+1;j<a.length;j++)
		{
		    sum+=a[j];
		    if(sum==0/*&&length > (j-i+1)*/)
		    {
			//length = j-i+1;
			p=i;k=j;
			break;
		    }
		}
	    }
	    System.out.println(p+" > "+k);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
}
