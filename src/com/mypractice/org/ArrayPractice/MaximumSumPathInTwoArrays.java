package com.mypractice.org.ArrayPractice;

/*
 * Given two sorted arrays such the arrays may have some common 
 * elements. Find the sum of the maximum sum path to reach from
 * beginning of any array to end of any of the two arrays. We can 
 * switch from one array to another array only at common elements.
 * 
 */

public class MaximumSumPathInTwoArrays {

    private int[] array;

    public int maximumSumPath(int[] array1, int[] array2) {
	try {
	    int a1 = array1.length;
	    int a2 = array2.length;
	    int i1 = 0;
	    int i2 = 0;
	    int y1 = 0, y2 = 0, sum1 = 0, sum2 = 0, result = 0;
	    int i = 0, j = 0;
	    while (i < a1 && j < a2) {

		if (array1[i] == array2[j]) {

		    // Here y2=0, becz when we get the common point or
		    // intersection point b/w two array in same index
		    // then we want to go back with number of y1 steps thats why
		    // we r incrementing y2 till y1 number of steps

		    y2 = 0;
		    y1 = i - y1;
		    int x1 = i;
		    int x2 = j;

		    sum1 = 0;
		    sum2 = 0;
		    while (x1 >= 0 && x2 >= 0 && y2 <= y1) {
			sum1 += array1[x1];
			sum2 += array2[x2];
			x1--;
			x2--;
			y2++;
		    }
		    result += this.maxVal(sum1, sum2);
		    i1 = i;
		    i2 = j;
		}
		i++;
		j++;
	    }
	    sum1 = 0;
	    sum2 = 0;
	    if (i1 < a1) {
		if (i1 != 0)
		    i1 = i1 + 1;
		for (int k = i1; k < a1; k++) {
		    sum1 += array1[k];
		}
	    }
	    if (i2 < a2) {
		if (i2 != 0)
		    i2 = i2 + 1;
		for (int k = i2; k < a2; k++) {
		    sum2 += +array2[k];
		}
	    }
	    result += this.maxVal(sum1, 0);
	    return result;

	} catch (Exception ex) {
	    ex.printStackTrace();
	}
	return -1;
    }

    private int maxVal(int max1, int max2) {
	try {
	    if (max1 > max2) {
		return max1;
	    }
	    return max2;
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
	return 0;
    }

    public int[] getArray() {
	return array;
    }

    public void setArray(int[] array) {
	this.array = array;
    }

}
