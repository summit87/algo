package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class RemoveNode {

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
	    TreeNode tn = to.getTree();
	    to.printInorderTree(tn);
	    RemoveNode re = new RemoveNode();
	    int key=15;
	    TreeNode th=re.remove(tn, key);
	    System.out.println();
	    to.printInorderTree(th);
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private TreeNode remove(TreeNode tn,int key)
    {
	try
	{
	    if(tn==null)
	    {
		return null;
	    }
	    int lsum = sum+tn.getNodeData();
	    int rsum=lsum;
	    tn.setLeftChildNode(remove(tn.getLeftChildNode(),key));
	    tn.setRightChildNode(remove(tn.getRightChildNode(),key));
	    sum = lsum>rsum?lsum:rsum;
	    if(sum<key)
	    {
		tn=null;
	    }
	    return tn;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    
}
