package com.mypractice.org.shorting;

public class KClosestElementInArray {

    public static void main(String[] args) {
	int[] a = { 12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56 };
	// System.out.println();
	new KClosestElementInArray().print(a, a.length - 1, 6, 39);
    }

    public void print(int[] a, int n, int k, int v) {
	int c = new KClosestElementInArray().findKClosestElement(a, 0,
		a.length - 1, v);

	int r = c + 1;
	int count = 0;
	int left = c;
	if (a[left] == v) {
	    left--;
	}
	while (count < k && left > 0 && r <= n) {
	    if (v - a[left] < a[r] - v) {
		System.out.print(a[left]+",");
		left--;
	    } else {
		System.out.print(a[r]+",");
		r++;
	    }
	    count++;
	}

    }

    /* Binary Search Algoritham */

    public int findKClosestElement(int[] a, int leftIndex, int rightIndex, int x) {
	int mid = (leftIndex + rightIndex) / 2;
	int left = leftIndex;
	int right = rightIndex;
	if (a[leftIndex] >= x) {
	    // System.out.println(a[leftIndex]);
	    return leftIndex;
	}
	if (a[rightIndex] <= x) {
	    return rightIndex;
	}
	if (x >= a[mid] && x < a[mid + 1]) {
	    return mid;
	}
	if (x > a[mid]) {
	    return findKClosestElement(a, mid + 1, rightIndex, x);
	}
	return findKClosestElement(a, leftIndex, mid - 1, x);

    }

}
