package com.mypractice.org.ArrayPractice;

public class FindKClosestElementsToAGivenValue {

    public static void main(String[] args) {
	try {

	    int[] array = { 12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56 };
	    new FindKClosestElementsToAGivenValue().findkElement(array, 0,
		    array.length - 1, 35, 4);

	} catch (Exception ex) {
	    ex.printStackTrace();
	}
    }

    private void findkElement(int[] array, int leftIndex, int rightIndex,
	    int key, int k) {
	try {
	    int keyIndex = this.binarySearch(array, leftIndex, rightIndex, key);
	    System.out.println("KJHKJH-->" + keyIndex);
	    int r = keyIndex + 1;
	    int l = keyIndex - 1;
	    int count = 0;
	    while (count < k && l > 0 && r <= rightIndex) {

		if (key - array[l] < array[r] - key) {
		    System.out.print(array[l] + ",");
		    l--;
		} else if (key - array[l] > array[r] - key) {
		    System.out.print(array[r] + ",");
		    r++;
		}
		count++;
	    }
	} catch (Exception ex) {
	    ex.printStackTrace();
	}

    }

    private int binarySearch(int[] array, int leftIndex, int rightIndex, int key) {
	try {

	    int mid = (leftIndex + rightIndex) / 2;
	    if (array[mid] == key) {
		return mid;
	    }
	    if (array[mid] > key)
		return binarySearch(array, leftIndex, mid - 1, key);
	    else
		return binarySearch(array, mid + 1, rightIndex, key);

	} catch (Exception ex) {
	    ex.printStackTrace();
	}
	return -1;
    }

}
