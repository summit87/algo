package com.mypractice.org.ArrayPractice;


public class NextGreaterNumber {

    /*Find next greater number with same set of digits*/
    
    
    
    public int greaterNumber(int number) {
	try {
	    int[] a = new int[10];
	    int n = number;
	    int x1 = n % 10;
	    n = n / 10;
	    int i = 1;
	    a[0] = x1;
	    while (n != 0) {
		if (x1 < n % 10) {
		    x1 = n % 10;
		    n = n / 10;
		    a[i] = x1;

		    i++;
		} else {
		    x1 = n % 10;
		    a[i] = x1;
		    i++;
		    break;
		}
	    }
	    n = n / 10;
	    x1 = n % 10;
	    int oldNo = n;
	    // Selection sort for sorting next 4 digit in given example
	    int min = 0;
	    for (int i1 = 1; i1 <= i-1; i1++) {
		min = i1;
		int temp1 = 0;
		for (int j = i1 + 1; j <= i-1; j++) {
		    if (a[min] >= a[j]) {
			min = j;
		    }
		}
		temp1 = a[i1];
		a[i1] = a[min];
		a[min] = temp1;
	    }
	    int newNo = 0;
	    int len = i - 1;
	    oldNo = (int) (oldNo*(Math.pow(10,i))); 
	    for (int l = 0; l <= len; l++) {
		newNo += (a[l] * Math.pow(10, len - l));
	    }
	    return newNo+oldNo;

	} catch (Exception ex) {
	    ex.printStackTrace();
	}
	return 0;
    }
}
