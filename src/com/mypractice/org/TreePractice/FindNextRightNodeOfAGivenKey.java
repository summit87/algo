package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindNextRightNodeOfAGivenKey {

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
	    int key=3;
	    FindNextRightNodeOfAGivenKey f = new FindNextRightNodeOfAGivenKey();
	    int val = f.nextRightNode(to.getTree(), key).getNodeData();
	    System.out.println(val);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    
    private TreeNode nextRightNode(TreeNode tn,int key)
    {
	try
	{
	    Queue<TreeNode> t = new LinkedList<TreeNode>();
	    Queue<Integer> le = new LinkedList<Integer>();
	    TreeNode t1 = tn;
	    int lev = 0;
	    le.add(lev);
	    t.add(t1);
	    while(t1!=null)
	    {
		TreeNode to = t.peek();
		lev = le.peek();
		t.poll();
		le.poll();
		if(to.getNodeData()==key)
		{
		    if(le.size()==0&&le.peek()!=lev)
		    {
			return null;
		    }
		    TreeNode to1 = t.peek();
		    t.poll();
		    return to1;
		}
		if(t1.getLeftChildNode()!=null)
		{
		    t.add(t1.getLeftChildNode());
		    le.add(lev+1);
		}
		if(t1.getRightChildNode()!=null)
		{
		    t.add(t1.getRightChildNode());
		    le.add(lev+1);
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    
    
    
}
