package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintingRootToLeafNode {

    /**
     * @param args
     * Iterative version for printing all possible paths from root to leafs:
     * 
     *  * *  Convert a given Binary Tree to Doubly Linked List | Set 1
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
	    PrintingRootToLeafNode pr = new PrintingRootToLeafNode();
	    pr.printinRootToLeaf(to.getTree());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

     
    private void printinRootToLeaf(TreeNode tn)
    {
	try
	{
	    Queue<TreeNode> q = new LinkedList<TreeNode>();
	    q.add(tn);
	    int[] a = new int[7];
	    int i=0;
	    TreeNode t =tn;
	    while(t!=null)
	    {
		if(t.getLeftChildNode()==null&&t.getRightChildNode()==null)
		{
		    int i1=0;
		    while(i1<q.size())
		    {
			System.out.print(q.peek().getNodeData()+",");
			i1++;
		    }
		    System.out.println(q.size());
		}
		if(t.getLeftChildNode()!=null)
		{
		    q.add(t.getLeftChildNode());
		}
		if(t.getRightChildNode()!=null)
		{
		    q.add(t.getRightChildNode());
		}
		 t=q.peek();
		 q.poll();
		
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    private void print(int[] a,int i)
    {
	try
	{
	    for(int k=0;k<i;k++)
	    {
		System.out.print(a[k]+",");
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
}
