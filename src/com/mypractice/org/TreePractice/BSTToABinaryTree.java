package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class BSTToABinaryTree {

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
    
    static int sum=0;
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
	    BSTToABinaryTree bt = new BSTToABinaryTree();
	    TreeNode tn = to.getTree();
	    TreeNode t=tn;
	    to.printInorderTree(tn);
	    bt.binarySearchToBinaryTree(t);
	    System.out.println();
	    to.printInorderTree(t);
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private void binarySearchToBinaryTree(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    binarySearchToBinaryTree(tn.getRightChildNode());
	    sum+=tn.getNodeData();
	    tn.setNodeData(sum);
	    binarySearchToBinaryTree(tn.getLeftChildNode());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
}
