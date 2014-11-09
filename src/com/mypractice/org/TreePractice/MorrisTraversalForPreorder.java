package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class MorrisTraversalForPreorder {

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
	    for(String s : a)
	    {
		to.addNodeValue(Integer.parseInt(s));
	    }
	    MorrisTraversalForPreorder m =new MorrisTraversalForPreorder();
	    m.morrisTraversalPreOrder(to.getTree());
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	
	
    }

    
    private void morrisTraversalPreOrder(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    TreeNode current = tn;
	    TreeNode pre ;
	    while(current!=null)
	    {
		if(current.getLeftChildNode()==null)
		{
		    System.out.print(current.getNodeData()+",");
		    current=current.getRightChildNode();
		}
		else
		{
		    pre=current.getLeftChildNode();
		    while(pre.getRightChildNode()!=null&&pre.getRightChildNode()!=current)
		    {
			pre=pre.getRightChildNode();
		    }
		    if(pre.getRightChildNode()==null)
		    {
			pre.setRightChildNode(current);
			current=current.getLeftChildNode();
		    }
		    else
		    {
			pre.setRightChildNode(null);
			System.out.print(current.getNodeData()+",");
			current=current.getRightChildNode();
		    }
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
}
