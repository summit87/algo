package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class SumOfAllNodesFromRootToLeaf {

    /**
     * @param args
     * Sum of all the numbers that are formed from root to leaf paths
     * 
     * Convert a given Binary Tree to Doubly Linked List | Set 1
                  Code To Test the logic
		  Creating an example tree
		                     5
				   /   \
				  3    10
				 / \   / \
				1   4 9  11
     */
    public static void main(String[] args) {

	
	try
	{
	    TreeOperation to = new TreeOperation();
	    Scanner sc = new Scanner(new File("tree.txt"));
	    String[] a = sc.next().split(",");
	    for(String s : a)
	    {
		to.addNodeValue(Integer.parseInt(s));
	    }
	    int sum = new SumOfAllNodesFromRootToLeaf().getSumRootToLeaf(to.getTree(),0);
	    System.out.println(sum);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    /*In this method the logic is same as ,the printing the all node from root to leaf ,
     * except in return statement here we are adding return value from left subtree
     * and from right subtree, because if we think in root (In above tree its 5) of above tree
     * then root to leaf node is 5,3,1 and 5,10,11 , it might be possible same structure exist in 
     * subtree either its in left or right subtree ,. thats why we are adding in return statement; */
    private int getSumRootToLeaf(TreeNode tn,int val)
    {
	try
	{
	    if(tn==null)
	    {
		return 0;
	    }
	    val = (val*10)+tn.getNodeData();
	    if(tn.getLeftChildNode()==null&&tn.getRightChildNode()==null)
	    {
		return val;
	    }
	    return (getSumRootToLeaf(tn.getLeftChildNode(), val))+(getSumRootToLeaf(tn.getRightChildNode(), val));
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    
}
