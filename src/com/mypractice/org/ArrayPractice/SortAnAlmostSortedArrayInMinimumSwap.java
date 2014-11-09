package com.mypractice.org.ArrayPractice;

//05-Sep-14 SU915198

/*
 * 
 * 
 * Sort An Almost Sorted Array In Minimum number of Swap
 * 
 * 
 */

public class SortAnAlmostSortedArrayInMinimumSwap {

	private int[] array;

	public int[] sortArray(int[] array) {
		try {
			this.setArray(array);
			this.quickSort(0, array.length - 1);
			return this.getArray();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;

	}

	private void quickSort(int leftIndex, int rightIndex) {
		try {
			int pivot = array[(leftIndex + rightIndex) / 2];
			int i = leftIndex;
			int j = rightIndex;
			while (i <= j) {
				while (pivot > array[i])
					i++;
				while (pivot < array[j])
					j--;
				if (i <= j) {
					int k = array[j];
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					System.out.println("temp > " + temp + "  > " + k);
					i++;
					j--;
				}
				if (j > leftIndex)
					quickSort(leftIndex, j);
				if (i < rightIndex)
					quickSort(i, rightIndex);
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
