package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ConnectNodesAtSameLevel {

    /**
     * @param args
     * 
     * 	   A--->NULL
          / \
         B-->C-->NULL
        / \   \
       D-->E-->F-->NULL
       
     */
    
    
    /**
     * @param args
     * *  Convert a given Binary Tree to Doubly Linked List | Set 1
                  Code To Test the logic
		  Creating an example tree
		                     5
				   /   \
				  3--->10
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
	    ConnectNodesAtSameLevel co = new ConnectNodesAtSameLevel();
	    TreeNode tn = to.getTree();
	    co.connectNextNode(tn);
	    System.out.println(tn.getLeftChildNode().getNextRightNode().getLeftChildNode().getNodeData());
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    private void connectNextNode(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    int noOfNode=0;
	    Queue<TreeNode> q = new LinkedList<TreeNode>();
	    TreeNode t= tn;
	    q.add(t);
	    while(true)
	    {
		noOfNode = q.size();
		while(noOfNode>0)
		{
		    t=q.peek();
		    q.poll();
		    if(t.getLeftChildNode()!=null)
		    {
			if(t.getRightChildNode()!=null)
			{
			    t.getLeftChildNode().setNextRightNode(t.getRightChildNode());
			}
			q.add(t.getLeftChildNode());
		    }
		    if(t.getRightChildNode()!=null)
		    {
			if(t.getNextRightNode()!=null)
			{
			    t.getRightChildNode().setNextRightNode(t.getNextRightNode().getLeftChildNode());
			}
			q.add(t.getRightChildNode());
		    }
		    noOfNode--;
		}
		if(q.isEmpty())
		{
		    break;
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    private void connectNextNodePreOrder(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    if(tn.getLeftChildNode()!=null)
	    {
		tn.getLeftChildNode().setNextRightNode(tn.getRightChildNode());
	    }
	    if(tn.getRightChildNode()!=null)
	    {
		tn.getRightChildNode().setNextRightNode(tn.getNextRightNode()!=null?tn.getNextRightNode().getLeftChildNode():null);
	    }
	    connectNextNodePreOrder(tn.getLeftChildNode());
	    connectNextNodePreOrder(tn.getRightChildNode());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
}
