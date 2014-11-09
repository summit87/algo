package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class BinaryTreeToDLL2 {

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
	    BinaryTreeToDLL2 bd = new BinaryTreeToDLL2();
	    bd.printDLL(to.getTree());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private void treeToDLL(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    treeToDLL(tn.getLeftChildNode());
	    if(tree==null)
	    {
		tree = tn;
		tr=tree;
	    }
	    else
	    {
		tn.setLeftChildNode(tree);
		tree.setRightChildNode(tn);
	    }
	    tree = tn;
	    treeToDLL(tn.getRightChildNode());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    private void printDLL(TreeNode tn)
    {
	try
	{
	    
	    treeToDLL(tn);
	    while(tr!=null)
	    {
		System.out.print(tr.getNodeData()+",");
		tr = tr.getRightChildNode();
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
}
