package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class SplayTreeSearch {

    /**
     * @param args
     * * *  Convert a given Binary Tree to Doubly Linked List | Set 1
                  Code To Test the logic
		  Creating an example tree
		                     5
				   /   \
				  3    10
				 / \   / \
				1   4 9  11
				     /
				    8
				    //100,50,40,30,20,200 put this 
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
	    SplayTreeSearch sp = new SplayTreeSearch();
	    TreeNode tn1 = to.getTree();
	    //to.printInorderTree(tn1);
	    TreeNode tk = sp.find(tn1,8);
	    System.out.println();
	    to.preOrderTree(tk);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    
    private TreeNode leftRotation(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return tn;
	    }
	    TreeNode x = tn.getRightChildNode();
	    
	    TreeNode xl = x.getLeftChildNode();
	    
	    tn.setRightChildNode(xl);
	    x.setLeftChildNode(tn);
	    return x;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    private TreeNode rightRotation(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return null;
	    }
	    TreeNode x = tn.getLeftChildNode();
	    TreeNode xr = x.getRightChildNode();
	    tn.setLeftChildNode(xr);
	    x.setRightChildNode(tn);
	    return x;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    
    
    private TreeNode find(TreeNode tn,int key)
    {
	try
	{
	    if(tn==null||tn.getNodeData()==key)
	    {
		return tn;
	    }
	    if(tn.getNodeData()>key)
	    {
		if(tn.getLeftChildNode()==null)
		{
		    return tn;
		}
		if(tn.getLeftChildNode().getNodeData()>key)
		{
		    tn.getLeftChildNode().setLeftChildNode(find(tn.getLeftChildNode().getLeftChildNode(),key));
		    tn=rightRotation(tn);
		}
		else if(key>tn.getLeftChildNode().getNodeData())
		{
		    tn.getLeftChildNode().setRightChildNode(find(tn.getLeftChildNode().getRightChildNode(), key));
		    if(tn.getLeftChildNode().getRightChildNode()!=null)
		    {
			tn.setLeftChildNode(leftRotation(tn.getLeftChildNode()));
		    }
		}
		return tn.getLeftChildNode()==null?tn:rightRotation(tn);
	    }
	    else
	    {
		if(tn.getRightChildNode()==null)
		{
		    return tn;
		}
		if(tn.getRightChildNode().getNodeData()<key)
		{
		    tn.getRightChildNode().setRightChildNode(find(tn.getRightChildNode().getRightChildNode(), key));
		    tn = leftRotation(tn);
		}
		else if(tn.getRightChildNode().getNodeData()>key)
		{
		    tn.getRightChildNode().setLeftChildNode(find(tn.getRightChildNode().getLeftChildNode(),key));
		    if(tn.getRightChildNode()!=null)
		    {
			tn.setRightChildNode(rightRotation(tn.getRightChildNode()));
		    }
		}
		return tn.getRightChildNode()==null?tn:leftRotation(tn);
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
}
