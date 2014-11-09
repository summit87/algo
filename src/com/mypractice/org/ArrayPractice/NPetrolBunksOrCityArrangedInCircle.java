package com.mypractice.org.ArrayPractice;

public class NPetrolBunksOrCityArrangedInCircle {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	/*{4, 6}, {6, 5}, {7, 3} and {4, 5}
	 * first index is denoting fuel in litters and second index is distance between petrol pump; 
	 */
	int[] a = {2,-3,4};
	System.out.println(new NPetrolBunksOrCityArrangedInCircle().getMinimumPosition(a));
    }

    private int getMinimumPosition(int[] a)
    {
	try
	{
	    int lastPosition = 0;
	    int position = 0;
	    int minPosition=1;
	    int minIndex = 0;
	    while(position<a.length)
	    {
		lastPosition+=a[position];
		position++;
		if(lastPosition<minPosition)
		{
		    minPosition = lastPosition;
		    minIndex = position%a.length;
		}
	    }
	    return minIndex;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
}
