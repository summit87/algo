package com.mypractice.org.ArrayPractice;

public class FindASortedSubsequenceOfSize3InLinearTime {

    /**
     * @param args
     *  1) Create an auxiliary array smaller[0..n-1]. smaller[i] should store the index of a 
     *     number which is smaller than arr[i] and is on left side of arr[i]. smaller[i] should 
     *     contain -1 if there is no such element.
     *	2) Create another auxiliary array greater[0..n-1]. greater[i] should store the index of
     *     a number which is greater than arr[i] and is on right side of arr[i]. greater[i] should
     *     contain -1 if there is no such element.
     *	3) Finally traverse both smaller[] and greater[] and find the index i for which both 
     *     smaller[i] and greater[i] are not -1.
     *     
     *     
     *     
     *     So here is how you can solve the problem. You need to iterate over the array twice.
     *      On the first iteration mark all the values that have an element 
     *     greater then them on the right and on the second iteration mark all the element smaller
     *      then them on their left. Now your answer would be with an element that has both:
     */
    public static void main(String[] args) {
	try
	{
	    int[] a =  {12, 11, 10, 5, 6, 2, 30};
	    new FindASortedSubsequenceOfSize3InLinearTime().getSortedArray(a);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private void getSortedArray(int[] a)
    {
	try
	{
	    int min=0;
	    int max=a.length-1;
	    int[] greatet = new int[a.length];
	    int gretest_so_far=a[a.length-1];
	    int greatest_index=a.length-1;
	    
	    
	    int[] smallest = new int[a.length];
	    int smallest_index=0;
	    int smallest_so_far=a[0];
	    //greatet[0]=-1;
	   // smallest[a.length-1]=-1;
	    for(int i=1;i<a.length;i++)
	    {
		if(smallest_so_far>=a[i])
		{
		    smallest[i]=smallest_index;
		}
		else
		{
		    smallest_index = i;
		    smallest_so_far = a[i];
		}
	    }
	    for(int i=a.length-2;i>=0;i--)
	    {
		if(gretest_so_far<=a[i])
		{
		    greatet[i]=greatest_index;
		}
		else
		{
		    greatest_index=i;
		    gretest_so_far = a[i];
		    
		}
	    }
	    for(int i=0;i<smallest.length;i++)
	    {
		System.out.print(smallest[i]+",");
	    }
	    System.out.println();
	    System.out.println("------------Smalest Index and Greatest Index-------------");
	    System.out.println();
	    for(int i=0;i<greatet.length;i++)
	    {
		System.out.print(greatet[i]+",");
	    }
	    System.out.println();
	    System.out.println("------------Answer----------------------------------------");
	    System.out.println();
	    for(int i=0;i<a.length;i++)
	    {
		if(greatet[i]!=-1&&smallest[i]!=-1)
		{
		    System.out.print(a[smallest[i]]+","+a[i]+","+a[greatet[i]]+",");
		    return;
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
}
