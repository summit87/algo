package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BoundryLevelPrinting {

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
	    BoundryLevelPrinting bo = new BoundryLevelPrinting();
	    TreeNode tn = to.getTree();
	    bo.printBoundryInLevel(tn);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private void printBoundry(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    TreeNode tn1=tn;
	    printLeftLeaves(tn1.getLeftChildNode());
	    System.out.print(tn1.getNodeData()+",");
	    printLeaves(tn1.getLeftChildNode());
	    printLeaves(tn1.getRightChildNode());
	    printRightLeaves(tn1.getRightChildNode());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    private void printLeaves(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    printLeaves(tn.getLeftChildNode());
	    if(tn.getLeftChildNode()==null&&tn.getLeftChildNode()==null)
	    {
		System.out.print(tn.getNodeData()+",");
	    }
	    printLeaves(tn.getRightChildNode());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    private void printLeftLeaves(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    if(tn.getLeftChildNode()!=null)
	    {
		System.out.print(tn.getNodeData()+",");
		printLeftLeaves(tn.getLeftChildNode());
	    }
	    if(tn.getRightChildNode()!=null)
	    {
		System.out.print(tn.getNodeData()+",");
		printLeftLeaves(tn.getRightChildNode());
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    private void printRightLeaves(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    if(tn.getRightChildNode()!=null)
	    {
		System.out.print(tn.getNodeData()+",");
		printRightLeaves(tn.getRightChildNode());
	    }
	    if(tn.getLeftChildNode()!=null)
	    {
		System.out.print(tn.getNodeData()+",");
		printRightLeaves(tn.getLeftChildNode());
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    private void printBoundryInLevel(TreeNode tn)
    {
	try
	{
	    Queue<TreeNode> q = new LinkedList<TreeNode>();
	    Stack<Integer> st = new Stack<Integer>();
	    TreeNode t = tn;
	    q.add(t);
	    while(true)
	    {
		int n = q.size();
		if(n==0)
		{
		    break;
		}
		st.add(q.peek().getNodeData());
		while(n>0)
		{
		    TreeNode t1 = q.peek();
		    q.poll();
		    if(t1.getLeftChildNode()!=null)
		    {
			q.add(t1.getLeftChildNode());
		    }
		    if(t1.getRightChildNode()!=null)
		    {
			q.add(t1.getRightChildNode());
		    }
		    t=t1;
		}
		 st.add(t.getNodeData());
	    }
	    while(!st.isEmpty())
	    {
		System.out.print(st.pop()+",");
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
}
