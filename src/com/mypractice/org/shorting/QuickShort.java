package com.mypractice.org.shorting;

public class QuickShort {

    private int[] array;

    public void quickShort(int lowerIndex, int higherIndex) {
	try {
	    int i = lowerIndex;
	    int j = higherIndex;
	    int pivot = array[((higherIndex + lowerIndex) / 2)];
	    // System.out.println(lowerIndex+((higherIndex-lowerIndex)/2));
	    while (i <= j) {
		while (pivot > array[i])
		    i++;
		while (pivot < array[j])
		    j--;
		if (i <= j) {
		    int temp = array[i];
		    array[i] = array[j];
		    array[j] = temp;
		    i++;
		    j--;
		}
		if (lowerIndex < j)
		    quickShort(lowerIndex, j);
		if (i < higherIndex)
		    quickShort(i, higherIndex);
	    }
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
    }

    public int[] getArray() {
	return array;
    }

    public void setArray(int[] array) {
	this.array = array;
    }

}
