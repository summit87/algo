package com.mypractice.org.ArrayPractice;

/*
 * 
 * Create a matrix with alternating rectangles of O and X
 * 
 */

public class AlternatingRectanglesOfOAndX {

    public static void main(String[] args) {

	try {
	    new AlternatingRectanglesOfOAndX().alternateOandX(10, 10);
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
    }

    private void alternateOandX(int row, int column) {
	try {

	    char[][] a = new char[row][column];
	    int r = 0;
	    int r1 = row;
	    int c1 = column;
	    int c = 0;
	    char x = 'X';
	    while (c < column && r < row) {
		for (int i = r; i < column; i++) {
		    a[r][i] = x;
		}
		r++;

		for (int i = r; i < row; i++) {
		    a[i][column - 1] = x;
		}
		column--;

		for (int i = column - 1; i >= c; i--) {
		    a[row - 1][i] = x;
		}
		row--;

		for (int i = row - 1; i >= r; i--) {
		    a[i][c] = x;
		}
		c++;

		if (x == 'X') {
		    x = 'O';
		} else {
		    x = 'X';
		}
	    }

	    for (int i = 0; i < r1; i++) {
		for (int j = 0; j < c1; j++) {
		    System.out.print(a[i][j] + " ");
		}
		System.out.println();
	    }

	} catch (Exception ex) {
	    ex.printStackTrace();
	}
    }

}
