package com.mypractice.org.ArrayPractice;

public class SortArrayAccordingToOrder {

    private int[] array;

    public int[] sortArrayAccordingToOrder(int[] array1, int[] array2) {
	try {
	    int[] temp = new int[array1.length];
	    int[] temp1 = new int[array1.length];
	    boolean[] visited = new boolean[array1.length];
	    this.setArray(array1);
	    this.quickSort(0, array1.length - 1);
	    for (int i = 0; i < array1.length - 1; i++) {
		visited[i] = false;
	    }
	    temp = this.getArray();
	    int x = 0;
	    for (int i = 0; i < array2.length; i++) {
		for (int j = 0; j < temp.length; j++) {
		    if (temp[j] == array2[i]) {
			visited[j] = true;
			temp1[x] = temp[j];
			x++;
		    }
		}
	    }
	    for (int l = 0; l < temp.length; l++) {
		if (visited[l] == false) {
		    temp1[x] = temp[l];
		    x++;
		}
	    }
	    return temp1;

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
		    int temp = array[i];
		    array[i] = array[j];
		    array[j] = temp;
		    j--;
		    i++;
		}
		if (leftIndex < j) {
		    quickSort(leftIndex, j);
		} else {
		    quickSort(i, rightIndex);
		}
	    }
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
    }

    private int binarySearchUsingLoop(int[] array, int min, int max, int key) {
	try {
	    int mid = (min + max) / 2;
	    if (array[mid] == key) {
		return mid;
	    }
	    if (array[min] >= key) {
		return min;
	    }
	    if (array[max] <= key) {
		return max;
	    }
	    if (array[mid] <= key) {
		return binarySearchUsingLoop(array, mid + 1, max, key);
	    }
	    return binarySearchUsingLoop(array, min, mid - 1, key);

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
