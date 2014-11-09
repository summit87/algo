package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseLevelOrderTrave {

    /**
     * @param args
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
	    ReverseLevelOrderTrave r = new ReverseLevelOrderTrave();
	    r.reverseLevelOrder(to.getTree());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private void reverseLevelOrder(TreeNode tn)
    {
	try
	{
	    Queue<TreeNode> q = new LinkedList<TreeNode>();
	    Stack<TreeNode> s = new Stack<TreeNode>();
	    TreeNode t = tn;
	    q.add(t);
	    while(!q.isEmpty())
	    {
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
		s.add(t);
	    }
	    while(!s.isEmpty())
	    {
		System.out.print(s.pop().getNodeData()+",");
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
}


