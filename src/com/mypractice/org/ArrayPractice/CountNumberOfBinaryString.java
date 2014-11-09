package com.mypractice.org.ArrayPractice;

/*
 * Count number of binary strings without consecutive 1
 * 
 */

public class CountNumberOfBinaryString {

    public static void main(String[] args) {
	try {
	    System.out.println(new CountNumberOfBinaryString().countBinary(8));
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
    }

    public int countBinary(int n) {
	try {
	    int[] a = new int[n + 1];
	    int[] b = new int[n + 1];
	    a[0] = 1;
	    a[1] = 2;
	    a[2] = 3;
	    if (n == 1) {
		return a[1];
	    }
	    if (n == 2) {
		return a[2];
	    }
	    for (int i = 2; i <= n; i++) {
		a[i] = a[i - 1] + a[i - 2];
		// b[i] = a[i - 1];
	    }
	    return a[n];
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
	return 0;
    }
}
