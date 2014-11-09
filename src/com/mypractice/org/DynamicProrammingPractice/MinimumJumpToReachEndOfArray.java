package com.mypractice.org.DynamicProrammingPractice;

public class MinimumJumpToReachEndOfArray {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] a = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
	System.out.println(new MinimumJumpToReachEndOfArray().minimumJump(a, 0,
		a.length - 1));

    }

    public int minimumJump(int[] a, int l, int h) {
	int minJump = 0;
	int[] jumps = new int[h + 1];
	jumps[0] = 0;
	for (int i = 1; i < h; i++) {
	    jumps[i] = a[h];
	    for (int j = 0; j < i; j++) {
		if (i <= j + jumps[j] && jumps[j] != a[h]) {
		    jumps[i] = jumps[j] + 1;
		    break;
		}
	    }
	}
	return jumps[h - 1];

    }

}
