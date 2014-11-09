package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SpiralOrderTraversal {

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
	    SpiralOrderTraversal sp = new SpiralOrderTraversal();
	    int h=sp.getHight(to.getTree());
	    boolean flag=false;
	    for(int lev=1;lev<=h;lev++)
	    {
		sp.printSpiral(to.getTree(), lev,flag);
		flag=!flag;
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private void printSpiral(TreeNode tn,int lev,boolean ltr)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    if(lev==1)
	    {
		System.out.print(tn.getNodeData()+",");
	    }
	    if(lev>1)
	    {
		if(ltr)
		{
		    printSpiral(tn.getLeftChildNode(), lev-1, ltr);
		    printSpiral(tn.getRightChildNode(), lev-1, ltr);
		}
		if(!ltr)
		{
		    printSpiral(tn.getRightChildNode(), lev-1, ltr);
		    printSpiral(tn.getLeftChildNode(), lev-1, ltr);
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    private int getHight(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return -1;
	    }
	    Queue<TreeNode> q = new LinkedList<TreeNode>();
	    int hight=0;
	    TreeNode t = tn;
	    q.add(t);
	    while(true)
	    {
		int no_of_node = q.size();
		if(no_of_node==0)
		{
		    return hight;
		}
		hight++;
		while(no_of_node>0)
		{
		    t=q.peek();
		    q.poll();
		    System.out.print(t.getNodeData()+",");/* that line will print the node in level order traversal*/
		    if(t.getRightChildNode()!=null)
		    {
			q.add(t.getRightChildNode());
		    }
		    if(t.getLeftChildNode()!=null)
		    {
			q.add(t.getLeftChildNode());
		    }
		    no_of_node--;
		}
		System.out.println();
		
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
}
