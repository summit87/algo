package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class PopulateInorder {

    /**
     * @param args
     * *  Convert a given Binary Tree to Doubly Linked List | Set 1
                  Code To Test the logic
		  Creating an example tree
		                     5
				   /   \
				  3    10
				 / \   / \
				1   4 9  11
     */
    TreeNode tree = null;
    TreeNode tr=null;
    static TreeNode next;
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
	    PopulateInorder po = new PopulateInorder();
	    po.populateInOrderSuccessor(to.getTree());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	    
	}
	
    }

    
    private void populateInOrderSuccessor(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    populateInOrderSuccessor(tn.getRightChildNode());
	    tn.setNextNode(next);
	    next=tn;
	    populateInOrderSuccessor(tn.getLeftChildNode());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
}
