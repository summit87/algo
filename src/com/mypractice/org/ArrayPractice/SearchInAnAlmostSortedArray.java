package com.mypractice.org.ArrayPractice;

//05-Sep-14 SU915198

/*
 * Given an array which is sorted, but after sorting some elements are moved to either of the adjacent positions, 
 * i.e., arr[i] may be present at arr[i+1] or arr[i-1]. Write an efficient function to
 * search an element in this array. Basically the element arr[i] can only be swapped with either arr[i+1] or arr[i-1].
 *  
 */

public class SearchInAnAlmostSortedArray {

	private int[] array;

	public int getElement(int[] array, int key) {
		try {
			this.setArray(array);
			int l = this.getArray().length;
			return this.binarySearch(this.getArray(), key, 0, l - 1);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return -1;
	}

	private int binarySearch(int[] array, int key, int leftIndex, int rightIndex) {
		try {
			int midIndex = (leftIndex + rightIndex) / 2;
			if (array[midIndex] == key) {
				return midIndex;
			} else if (array[midIndex - 1] == key && midIndex > leftIndex) {
				return midIndex - 1;
			} else if (array[midIndex + 1] == key && midIndex < rightIndex) {
				return midIndex + 1;
			} else if (array[midIndex] > key) {
				return binarySearch(array, key, leftIndex, midIndex - 2);
			} else {
				return binarySearch(array, key, midIndex + 2, rightIndex);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return -1;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

}
