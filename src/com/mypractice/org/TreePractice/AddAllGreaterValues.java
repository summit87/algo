package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class AddAllGreaterValues {

    /**
     * @param args
     * 
     * Add all greater values
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
     */
    
    
    static int sum=0;
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
	    
    	    TreeNode tn = to.getTree();
    	    to.printInorderTree(tn);
    	    AddAllGreaterValues ad = new AddAllGreaterValues();
    	    ad.addNodeValue(tn);
    	    System.out.println("---------------------------------");
    	    to.printInorderTree(tn);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private void addNodeValue(TreeNode tn)
    {
	if(tn==null)
	{
	    return;
	}
	addNodeValue(tn.getRightChildNode());
	sum=sum+tn.getNodeData();
	tn.setNodeData(sum);
	addNodeValue(tn.getLeftChildNode());
    }
    
    
    
}
