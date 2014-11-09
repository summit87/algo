package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class PrintNodeWithoutSibling {

    /**
     * @param args
     * Print all nodes that don’t have sibling
     * Sibling : Both child node have diffrent parent
     * 
     * 
     * Code To Test the logic
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
	    PrintNodeWithoutSibling pd = new PrintNodeWithoutSibling();
	    pd.printSibling(to.getTree());
	    sc.close();
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private void printSibling(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    if(tn.getLeftChildNode()!=null&&tn.getRightChildNode()==null)
	    {
		System.out.print(tn.getLeftChildNode().getNodeData()+">>,");
		//printSibling(tn.getLeftChildNode());
	    }
	   if(tn.getRightChildNode()!=null&&tn.getLeftChildNode()==null)
	    {
		System.out.print(tn.getRightChildNode().getNodeData()+",<<");
		//printSibling(tn.getRightChildNode());
	    }
	    printSibling(tn.getLeftChildNode());
		printSibling(tn.getRightChildNode());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
}
