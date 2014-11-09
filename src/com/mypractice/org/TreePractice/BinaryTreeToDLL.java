package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class BinaryTreeToDLL {

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
				1. If left subtree exists, process the left subtree
            …..1.a) Recursively convert the left subtree to DLL.
            …..1.b) Then find inorder predecessor of root in left subtree 
            (inorder predecessor is rightmost node in left subtree).
            …..1.c) Make inorder predecessor as previous of root and root as next of inorder predecessor.
            2. If right subtree exists, process the right subtree (Below 3 steps are similar to left subtree).
            …..2.a) Recursively convert the right subtree to DLL.
            …..2.b) Then find inorder successor of root in right subtree
             (inorder successor is leftmost node in right subtree).
            …..2.c) Make inorder successor as next of root and root as previous of inorder successor.
            3. Find the leftmost node and return it (the leftmost node is always head of converted DLL).
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
	    BinaryTreeToDLL bd = new BinaryTreeToDLL();
	    bd.printDLL(to.getTree());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    private TreeNode binaryTreeToDLL(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return tn;
	    }
	    if(tn.getLeftChildNode()!=null)
	    {
		TreeNode lTn = binaryTreeToDLL(tn.getLeftChildNode());
		/*With the help of this loop we are getting inorder predecessor od tree*/
		for(;lTn.getRightChildNode()!=null;lTn = lTn.getRightChildNode());
		/*In this line we are making next of root to predecessor*/
		lTn.setRightChildNode(tn);
		/*this line we are making previous of predecessor to root (here root is nothing but just root of predecessor)*/
		tn.setLeftChildNode(lTn);
	    }
	    if(tn.getRightChildNode()!=null)
	    {
		TreeNode rTn = binaryTreeToDLL(tn.getRightChildNode());
		/*Same concept but vice versa of above if condition*/
		for(;rTn.getLeftChildNode()!=null;rTn = rTn.getLeftChildNode());
		rTn.setLeftChildNode(tn);
		tn.setRightChildNode(rTn);
	    }
	    return tn;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    
    private TreeNode getDLL(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return tn;
	    }
	    TreeNode tree = binaryTreeToDLL(tn);
	    while(tree.getLeftChildNode()!=null)
		tree=tree.getLeftChildNode();
	    return tree;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    private void printDLL(TreeNode tn)
    {
	try
	{
	    TreeNode tree = getDLL(tn);
	    while(tree!=null)
	    {
		System.out.print(tree.getNodeData()+",");
		tree = tree.getRightChildNode();
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }

}
