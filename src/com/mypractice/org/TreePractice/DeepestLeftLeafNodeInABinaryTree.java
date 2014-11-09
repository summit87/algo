package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class DeepestLeftLeafNodeInABinaryTree {
    static TreeNode dl=null;
    /**
     * @param args
     *  Convert a given Binary Tree to Doubly Linked List | Set 1
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
	    DeepestLeftLeafNodeInABinaryTree dp = new DeepestLeftLeafNodeInABinaryTree();
	    int maxLev=0;
	    int lev=0;
	    //TreeNode dl=null;
	    dp.depestLeftNode(to.getTree(), maxLev, lev,false);
	    System.out.println(dl.getNodeData());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    
    
    private void depestLeftNode(TreeNode tn,int maxLev,int lev,boolean isLeft)
    {
	if(tn==null)
	{
	    return;
	}
	if(isLeft&&tn.getLeftChildNode()!=null&&tn.getRightChildNode()!=null&&maxLev<lev)
	{
	    maxLev = lev;
	    dl=tn;
	    //return;
	}
	depestLeftNode(tn.getLeftChildNode(), maxLev, lev+1,true);
	depestLeftNode(tn.getRightChildNode(), maxLev, lev+1,false);
    }
    
    
    
}
