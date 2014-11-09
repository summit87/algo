package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class BSTVerify {

    /**
     * @param args
     * Convert a given Binary Tree to Doubly Linked List | Set 1
                  Code To Test the logic
		  Creating an example tree
		                     5
				   /   \
				  3    10
				 / \   / \
				1   4 9  11
				     /
				    8
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	try
	{
	    TreeOperation to = new TreeOperation();
	    Scanner sc = new Scanner(new File("tree.txt"));
	    String[] a = sc.next().split(",");
	    for(String s : a)
	    {
		to.addNodeValue(Integer.parseInt(s));
	    }
	    int low = Integer.MIN_VALUE;
	    int high = Integer.MAX_VALUE;
	    if(new BSTVerify().isBST(to.getTree(), low))
	    {
		System.out.println("BST");
	    }
	    else
	    {
		System.out.println("NOT BST");
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    /*By In Order Traversal*/
    private boolean isBST(TreeNode tn,int val)
    {
	try
	{
	    if(tn==null)
	    {
		return true;
	    }
	    if(isBST(tn.getLeftChildNode(), val))
	    {
		if(val<tn.getNodeData())
		{
		    val=tn.getNodeData();
		    return isBST(tn.getRightChildNode(), val);
		}
		else
		{
		    return false;
		}
	    }
	    else
	    {
		return false;
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    /*By Using Binary Search*/
    
    
    private boolean isBSTByBinarySearch(TreeNode tn,int low,int high)
    {
	try
	{
	    if(tn==null)
	    {
		return true;
	    }
	    if(low<tn.getNodeData()&&high>tn.getNodeData())
	    {
		return isBSTByBinarySearch(tn.getLeftChildNode(), low,tn.getNodeData())
		&&isBSTByBinarySearch(tn.getRightChildNode(),tn.getNodeData(), high);
	    }
	    else
	    {
		return false;
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return  false;
    }
}
