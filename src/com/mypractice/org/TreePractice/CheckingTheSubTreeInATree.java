package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class CheckingTheSubTreeInATree {

    /**
     * @param args
     *     /**
     * @param args
     * *  Convert a given Binary Tree to Doubly Linked List | Set 1
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
	try
	{
	    TreeOperation to = new TreeOperation();
	    Scanner sc = new Scanner(new File("tree.txt"));
	    String[] a = sc.next().split(",");
	    for(String s : a)
	    {
		to.addNodeValue(Integer.parseInt(s));
	    }
	    
	    TreeOperation to1 = new TreeOperation();
	    Scanner sc1 = new Scanner(new File("sub.txt"));
	    String[] a1 = sc1.next().split(",");
	    for(String s : a1)
	    {
		to1.addNodeValue(Integer.parseInt(s));
	    }
	    
	    TreeNode tn1 = to.getTree();
	    TreeNode subTree = to1.getTree();
	    if(new CheckingTheSubTreeInATree().isSubTree(tn1, subTree))
	    {
		System.out.println("Yes");
	    }
	    else
	    {
		System.out.println("Not");
	    }
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private  boolean isIdenticalTree(TreeNode tn1,TreeNode tn2)
    {
	try
	{
	    if(tn1==null&&tn2==null)
	    {
		return true;
	    }
	    if(tn1==null||tn2==null)
	    {
		return false;
	    }
	    return (tn1.getNodeData()==tn2.getNodeData()
		    &&isIdenticalTree(tn1.getLeftChildNode(), tn2.getLeftChildNode())
		    &&isIdenticalTree(tn1.getRightChildNode(), tn2.getRightChildNode())); 
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    private boolean isSubTree(TreeNode tn1,TreeNode subTree)
    {
	try
	{
	    if(tn1==null&&subTree==null)
	    {
		return true;
	    }
	    if(tn1==null||subTree==null)
	    {
		return false;
	    }
	    if(isIdenticalTree(tn1,subTree))
	    {
		return true;
	    }
	    return (isSubTree(tn1.getLeftChildNode(), subTree)||isSubTree(tn1.getRightChildNode(), subTree));
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    
}
