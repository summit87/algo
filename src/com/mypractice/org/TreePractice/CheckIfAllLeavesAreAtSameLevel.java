package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckIfAllLeavesAreAtSameLevel {

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
    //Try this question with out recursion
    static int leftLeavel=0;
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
    	    if(new CheckIfAllLeavesAreAtSameLevel().checkLevelWithoutRecusrion(tn))
    	    {
    		System.out.println("Yes It IS");
    	    }
    	    else
    	    {
    		System.out.println("Its Not In Same Level");
    	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private boolean checkLevel(TreeNode tn,int lev)
    {
	try
	{
	    if(tn==null)
	    {
		return true;
	    }
	    if(tn.getLeftChildNode()==null&&tn.getRightChildNode()==null)
	    {
		if(leftLeavel==0)
		{
		    leftLeavel=lev;
		    return true;
		}
		return lev==leftLeavel;
	    }
	    return (checkLevel(tn.getLeftChildNode(), lev+1)&&checkLevel(tn.getRightChildNode(), lev+1)) ;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    private boolean checkLevelWithoutRecusrion(TreeNode tn)
    {
	try
	{
	    Queue<TreeNode> tq = new LinkedList<TreeNode>();
	    Queue<Integer> tl = new LinkedList<Integer>();
	    int le=1;
	    int max=1;
	    TreeNode t = tn;
	    tl.add(le);
	    boolean flag=false;
	    boolean flag1=false;
	    int l1=0;
	    int l2=0;
	    
	    while(t!=null&&!tl.isEmpty())
	    {
		if(t.getLeftChildNode()!=null)
		{
		    tq.add(t.getLeftChildNode());
		    tl.add(le+1);
		    l1=tl.peek();
		}
		if(t.getRightChildNode()!=null)
		{
		    tq.add(t.getRightChildNode());
		    tl.add(le+1);
		    l2=tl.peek();
		}
		
		t = tq.peek();
		tq.poll();
		le=tl.peek();
		tl.poll();
		if(l1==l2)
		{
		    System.out.println(l1+" > "+l2);
		    continue;
		}
		else
		{
		    return false;
		}
	    }
	    return true;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    
}
