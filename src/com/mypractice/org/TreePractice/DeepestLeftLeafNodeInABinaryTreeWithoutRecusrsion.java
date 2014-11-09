package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DeepestLeftLeafNodeInABinaryTreeWithoutRecusrsion {

    public static void main(String[] args)
    {
	try
	{
	    TreeOperation to = new TreeOperation();
	    Scanner sc = new Scanner(new File("tree.txt"));
	    String[] a = sc.next().split(",");
	    for(String s : a)
	    {
		to.addNodeValue(Integer.parseInt(s));
	    }
	    DeepestLeftLeafNodeInABinaryTreeWithoutRecusrsion dp = new DeepestLeftLeafNodeInABinaryTreeWithoutRecusrsion();
	    dp.getLeaf(to.getTree());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    private void getLeaf(TreeNode tn)
    {
	try
	{
	    int max=0;
	    int le=1;
	    boolean isLeft=false;
	    boolean isMaxUpdate=true;
	    Queue<TreeNode> t1 = new LinkedList<TreeNode>();
	    Queue<Integer> lev = new LinkedList<Integer>();
	    t1.add(tn);
	    lev.add(le);
	    TreeNode t2 = tn;
	    TreeNode t3 = null;
	    while(t2!=null&&!lev.isEmpty())
	    {
		if(max<le)
		{
		    max=le;
		    isMaxUpdate=true;
		}
		else
		{
		    isMaxUpdate = false;
		}
		if(t2.getLeftChildNode()!=null)
		{
		    t1.add(t2.getLeftChildNode());
		    lev.add(le+1);
		    t3=t2.getLeftChildNode();
		    isLeft=true;
		}
		if(t2.getRightChildNode()!=null)
		{
		    t1.add(t2.getRightChildNode());
		    lev.add(le+1);
		    isLeft=false;
		}
		t2=t1.peek();
		le=lev.peek();
		lev.poll();
		t1.poll();
		if(isLeft&&!isMaxUpdate)
		{
		    System.out.println(t3.getNodeData());
		    break;
		}
	    }
	}
	catch(Exception e)
	{
	    e.printStackTrace();
	}
    }
    
    
    
}
