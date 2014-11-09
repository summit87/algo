package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.*;

public class LevelOfTreeUsingQueue {

    /**
     * @param args
     * * * *  Convert a given Binary Tree to Doubly Linked List | Set 1
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
	    LevelOfTreeUsingQueue le = new LevelOfTreeUsingQueue();
	    int lev =le.getLevel(to.getTree());
	    System.out.println(lev);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }
    
    private int getLevel(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return -1;
	    }
	    int lev=1;
	    Queue<TreeNode> tq = new LinkedList<TreeNode>();
	    Queue<Integer> le = new LinkedList<Integer>();
	    tq.add(tn);
	    le.add(lev);
	    TreeNode t1 = tn;
	    while(t1!=null&&!le.isEmpty())
	    {
		if(lev>=2&&lev<=4)
		{
		    System.out.print(t1.getNodeData()+","+lev);
		}
		System.out.println();
		if(t1.getLeftChildNode()!=null)
		{
		    tq.add(t1.getLeftChildNode());
		    le.add(lev+1);
		}
		if(t1.getRightChildNode()!=null)
		{
		    tq.add(t1.getRightChildNode());
		    le.add(lev+1);
		}
		t1 = tq.peek();
		tq.poll();
		
		    lev = le.peek().intValue();
		    le.poll();
		
	    }
	    return lev;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }

}
