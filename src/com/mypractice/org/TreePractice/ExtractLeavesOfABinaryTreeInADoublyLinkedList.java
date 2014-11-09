package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class ExtractLeavesOfABinaryTreeInADoublyLinkedList {

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
    
    static TreeNode dllTree;
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
	    ExtractLeavesOfABinaryTreeInADoublyLinkedList leaf = new ExtractLeavesOfABinaryTreeInADoublyLinkedList();
	    TreeNode tn = leaf.getExtractedTree(to.getTree());
	    leaf.inOrderTraversal(tn);
	    System.out.println();
	    leaf.printDLL(dllTree);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    private TreeNode getExtractedTree(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return null;
	    }
	    if(tn.getLeftChildNode()==null&&tn.getRightChildNode()==null)
	    {
		tn.setRightChildNode(dllTree);
		if(dllTree!=null)
		{
		    dllTree.setLeftChildNode(tn);
		}
		dllTree = tn;
		return null;
	    }
	    tn.setLeftChildNode(getExtractedTree(tn.getLeftChildNode()));
	    tn.setRightChildNode(getExtractedTree(tn.getRightChildNode()));
	    return tn;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    private void inOrderTraversal(TreeNode tn)
    {
	try
	{
	    if(tn!=null)
	    {
		inOrderTraversal(tn.getLeftChildNode());
		System.out.print(tn.getNodeData()+",");
		inOrderTraversal(tn.getRightChildNode());
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    private void printDLL(TreeNode dll)
    {
	while(dll!=null)
	{
	    System.out.print(dll.getNodeData()+",");
	    dll = dll.getRightChildNode();
	}
    }
    
    
    
}
