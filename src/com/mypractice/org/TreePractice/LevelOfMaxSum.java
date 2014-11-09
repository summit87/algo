package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOfMaxSum {

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
	
	try
	{
	    TreeOperation to = new TreeOperation();
	    Scanner sc = new Scanner(new File("tree.txt"));
	    String[] a = sc.next().split(",");
	    for(String s : a)
	    {
		to.addNodeValue(Integer.parseInt(s));
	    }
	    LevelOfMaxSum l = new LevelOfMaxSum();
	    int p = l.maxLevelSum(to.getTree());
	    System.out.println(p);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private int maxLevelSum(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return -1;
	    }
	    Queue<TreeNode> q = new LinkedList<TreeNode>();
	    Queue<Integer> ql = new LinkedList<Integer>();
	    TreeNode t = tn;
	    int currentSum=0;
	    int max=0;
	    int cl=0;
	    q.add(t);
	    q.add(null);
	    int l=1;
	    ql.add(l);
	    while(!q.isEmpty())
	    {
		
		
		    currentSum +=t.getNodeData();
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
	    return cl;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
}
