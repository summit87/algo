package com.mypractice.org.ArrayPractice;

public class SmallestSubarrayWithSumGreaterThanAGivenValue {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	int[] array = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
	int sum = 280;
	System.out.println(new SmallestSubarrayWithSumGreaterThanAGivenValue().smallestSubarray(array, sum)); 

    }

    
    
    private int smallestSubarray(int[] array,int givenSum)
    {
	try
	{
	    int sum = 0;
	    int length=array.length-1;
	    int k=0;
	    int l=0;
	    for(int i=0;i<array.length;i++)
	    {
		sum = array[i];
		/*Here if u change the == operand in place of > then question will get change i.g
		 * Find sub array with given sum
		*/
		if(sum > givenSum) 
		{
		    return 1;
		}
		for(int j=i+1;j<array.length;j++)
		{
		    sum+=array[j];
		    if(sum>givenSum && length > (j-i+1))
		    {
			length = j-i+1;
			k=i;l=j;
		    }
		}
	    }
	    System.out.println(k+" > "+l+" : "+length);
	    return length;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return 0;
    }
    
    
    
}
