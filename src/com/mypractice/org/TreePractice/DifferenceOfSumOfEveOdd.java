package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DifferenceOfSumOfEveOdd {

    /**
     * @param args
     *  Code To Test the logic
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
	    DifferenceOfSumOfEveOdd d = new DifferenceOfSumOfEveOdd();
	    int diff = d.diff(to.getTree());
	    System.out.println(diff);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }
    
    
    private int diff(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return 0;
	    }
	    return tn.getNodeData()-diff(tn.getLeftChildNode())-diff(tn.getRightChildNode());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    private int diffWithOutRecur(TreeNode tn)
    {
	try
	{
	    Queue<TreeNode> tq = new LinkedList<TreeNode>();
	    Queue<Integer> tl = new LinkedList<Integer>();
	    int le=1;
	    TreeNode t = tn;
	    tl.add(le);
	    tq.add(t);
	    int sume=0;
	    int sumo=0;
	    TreeNode t1=null;
	    TreeNode t2=null;
	    while(t!=null&&!tl.isEmpty())
	    {
		if(le%2==0)
		{
		    sume+=t.getNodeData();
		}
		if(le%2==1)
		{
		    sumo+=t.getNodeData();
		}
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
		
		
	    }
	    return (sumo-sume);
	   // System.out.println((sumo-sume));
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }

}
