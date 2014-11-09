package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import com.mypractice.org.LinkedListProgramm.LinkListNode;

public class LevelOrderTraversalUsingQueue {

    /**
     * @param args
     * * *  Convert a given Binary Tree to Doubly Linked List | Set 1
                  Code To Test the logic
		  Creating an example tree
		                     5
				   /   \
				  3    10
				 / \   / \
				1   4 9  11
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
	    LevelOrderTraversalUsingQueue le = new LevelOrderTraversalUsingQueue();
	    le.levelOrderTraversal(to.getTree());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }

    
    
    
    public void levelOrderTraversal(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	   Queue<TreeNode> t = new LinkedList<TreeNode>();
	   int lev=0;
	   Queue<Integer> le = new LinkedList<Integer>();
	   le.add(lev);
	   TreeNode t1 = tn;
	    while(t1!=null)
	    {
		lev = le.peek();
		//
		System.out.print(t1.getNodeData()+",");
		if(t1.getLeftChildNode()!=null)
		{
		    t.add(t1.getLeftChildNode());
		    //le.poll();
		    le.add(lev+1);
		}
		if(t1.getRightChildNode()!=null)
		{
		    t.add(t1.getRightChildNode());
		   // le.poll();
		    le.add(lev+1);
		}
		t1=t.peek();
		t.poll();
	    }
	   // System.out.println(le.size());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
}
