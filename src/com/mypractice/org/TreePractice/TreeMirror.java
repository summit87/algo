package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class TreeMirror {

    /**
     * @param args
     * Creating an example tree
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
	    int[] array = new int[10];
	    for(String s : a)
	    {
		to.addNodeValue(Integer.parseInt(s));
	    }
	    TreeNode tn1 = to.getTree();
	    TreeMirror t = new TreeMirror();
	    to.printInorderTree(tn1);
	    TreeNode tn = t.mirror(tn1);
	    System.out.println();
	    to.printInorderTree(tn);
	    
	    if(t.isMirror(tn1, tn))
	    {
		System.out.println("Yes It is !");
	    }
	    else
	    {
		System.out.println("Yes It Not is !");
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private TreeNode mirror(TreeNode tn)
    {
	try
	{
	    if(tn!=null)
	    {
		mirror(tn.getLeftChildNode());
		TreeNode t = tn.getLeftChildNode();
		tn.setLeftChildNode(tn.getRightChildNode());
		tn.setRightChildNode(t);
	    }
	    return tn;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    
    private boolean isMirror(TreeNode tn,TreeNode tn1)
    {
	try
	{
	    if(tn==null)
	    {
		return false;
	    }
	    if(tn.getLeftChildNode()==tn1.getRightChildNode()||tn.getRightChildNode()==tn1.getLeftChildNode()
		    ||isMirror(tn.getLeftChildNode(),tn1.getRightChildNode())
		    ||isMirror(tn.getRightChildNode(), tn1.getLeftChildNode()))
	    {
		return true;
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
}
