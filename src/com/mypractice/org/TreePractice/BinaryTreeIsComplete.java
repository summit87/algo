package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeIsComplete {

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
	    BinaryTreeIsComplete bist = new BinaryTreeIsComplete();
	    TreeNode tn = to.getTree();
	   if(bist.isComplete(tn))
	   {
	       System.out.println("YUPS it is");
	   }
	   else
	   {
	       System.out.println("Its Not");
	   }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    private boolean isComplete(TreeNode tn)
    {
	try
	{
	    Queue<TreeNode> q = new LinkedList<TreeNode>();
	    boolean flag=false;
	    TreeNode t=tn;
	    q.add(t);
	    while(t!=null&&!q.isEmpty())
	    {
		if(t.getLeftChildNode()!=null)
		{
		    q.add(t.getLeftChildNode());
		    if(flag==true)
		    {
			return !flag;
		    }
		}
		else
		{
		    flag=true;
		}
		if(t.getRightChildNode()!=null)
		{
		    q.add(t.getRightChildNode());
		    if(flag==true)
		    {
			return !flag;
		    }
		}
		else
		{
		    flag=true;
		}
		t=q.peek();
		q.poll();
	    }
	    return true;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
}
