package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DeepestOddLevelLeafNode {

    /**
     * @param args
     *  * * *  Convert a given Binary Tree to Doubly Linked List | Set 1
                  Code To Test the logic
		  Creating an example tree
		                     5
				   /   \
				  3    10
				 / \   / \
				1   4 9  11
				     /
				    8
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
    	    TreeNode tn = to.getTree();
    	    DeepestOddLevelLeafNode dp = new DeepestOddLevelLeafNode();
    	    dp.getOddLevelLeaf(tn);
    	    
    	    int l = dp.depestDepth(tn,1);
    	    System.out.println(l);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private void getOddLevelLeaf(TreeNode tn)
    {
	try
	{
	    Queue<TreeNode> tq = new LinkedList<TreeNode>();
	    Queue<Integer> tl = new LinkedList<Integer>();
	    int le=1;
	    int max=1;
	    TreeNode t = tn;
	    tl.add(le);
	    int sume=0;
	    int sumo=0;
	    while(t!=null&&!tl.isEmpty())
	    {
		if(t.getLeftChildNode()!=null)
		{
		    tq.add(t.getLeftChildNode());
		    tl.add(le+1);
		}
		if(t.getRightChildNode()!=null)
		{
		    tq.add(t.getRightChildNode());
		    tl.add(le+1);
		}
		t = tq.peek();
		tq.poll();
		le=tl.peek();
		tl.poll();
		
		if(le%2!=0)
		{
		    sume+=tn.getNodeData();
		}
		if(le%2==0)
		{
		    sumo+=tn.getNodeData();
		}
	    }
	    
	    System.out.println((sume-sumo));
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    private int depestDepth(TreeNode tn,int lev)
    {
	try
	{
	    if(tn==null)
	    {
		return 0;
	    }
	    if(tn.getLeftChildNode()==null&&tn.getRightChildNode()==null&&lev%2!=0)
	    {
		return lev;
	    }
	    return  getMax(depestDepth(tn.getLeftChildNode(), lev+1),depestDepth(tn.getRightChildNode(), lev+1));
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    private int getMax(int a,int b)
    {
	try
	{
	    return a>b?a:b;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
}
