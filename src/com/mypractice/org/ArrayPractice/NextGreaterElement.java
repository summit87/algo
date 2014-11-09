package com.mypractice.org.ArrayPractice;

public class NextGreaterElement {

    /**
     * @param args
     */

    static int top = -1;
    static int size = 0;
    static int[] a;

    public static void main(String[] args) {
	try {
	    int[] a1 = { 13, 7, 6, 12 };
	    size = a1.length;
	    a = new int[size];
	    System.out.println(a.length);
	    new NextGreaterElement().findNextGreaterELementUsingStack(a1);
	} catch (Exception ex) {
	    ex.printStackTrace();
	}

    }

    private void findNextGreaterELement(int[] a1) {
	try {
	    int next = 0;
	    for (int i = 0; i < a1.length; i++) {
		next = -1;
		for (int j = i + 1; j < a1.length; j++) {
		    if (a1[i] < a1[j]) {
			next = a1[j];
			// System.out.println("Next Greater for > "+a1[i]+" Is > "+next);
			break;
		    }
		}
		System.out.println("Next Greater for > " + a1[i] + " Is > "
			+ next);
	    }
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
    }

    private void findNextGreaterELementUsingStack(int[] a1) {
	try {
	    int next = -1;
	    int ele = 0;
	    if (isEmpty()) {
		push(a1[0]);
	    }
	    for (int i = 1; i < a1.length; i++) {
		next = a1[i];
		if (!isEmpty()) {
		    ele = pop();
		    while (ele < next) {
			System.out.println("Next Greater for >> " + ele
				+ " Is > " + next);
			if (isEmpty()) {
			    break;
			}
			ele = pop();
		    }
		    if (ele > next) {
			push(ele);
		    }
		}
		push(next);
	    }
	    while (!isEmpty()) {
		ele = pop();
		next = -1;
		System.out.println("Next Greater for > " + ele + " Is > "
			+ next);
	    }

	} catch (Exception ex) {
	    ex.printStackTrace();
	}
    }

    private void push(int element) {
	try {
	    if (top == size - 1) {
		System.out.println("StackOverFlowExceptio..");
	    } else {
		top = top + 1;
		a[top] = element;
	    }
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
    }

    private int pop() {
	try {
	    if (top == -1) {
		System.out.println("StackUnderFlowExceptio..");
		return 0;
	    } else {
		return a[top--];
	    }
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
	return -1;
    }

    private boolean isEmpty() {
	try {
	    if (top == -1) {
		return true;
	    }
	    return false;
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
	return false;
    }

}
