package com.mypractice.org.ArrayPractice;

public class ArrayMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
	/*
	 * sortArrayAccordingToOrder int[] array1 = { 2, 1, 2, 5, 7, 1, 9, 3,
	 * 6,8, 8 }; int[] array2 = { 2, 1, 8, 3 }; int[] a = new
	 * SortArrayAccordingToOrder().sortArrayAccordingToOrder(
	 * array1,array2); for (int i = 0; i < a.length; i++) {
	 * System.out.print(a[i] + ","); }
	 */

	
	  //SearchInAnAlmostSortedArray
	  
//	  int[] array = { 10, 3, 40, 20, 50, 80, 70 }; int i = new
//	  SearchInAnAlmostSortedArray().getElement(array, 70);
//	  System.out.println(i);
	 

	/*
	 * SortAnAlmostSortedArrayInMinimumSwap int[] array = { 10, 3, 40, 20,
	 * 50, 80, 70 }; array = new
	 * SortAnAlmostSortedArrayInMinimumSwap().sortArray(array); for (int i =
	 * 0; i < array.length; i++) { System.out.print(array[i] + ","); }
	 */

	// int[] array1 = { 5, 6, 9, 10 };
	// int[] array2 = { 1, 2, 5, 10 };
	//
	// int j = new MaximumSumPathInTwoArrays().maximumSumPath(array1,
	// array2);
	// System.out.println(j);
	int num = 534976;
	System.out.println("Old Num-->"+num);
	num=new NextGreaterNumber().greaterNumber(num);
	System.out.println("New Num-->"+num);

    }

}
