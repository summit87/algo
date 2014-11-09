package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;
import java.util.Stack;

public class FindAPairWithGivenSumInBST {

    /**
     * @param args
     * Code To Test the logic
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
	    FindAPairWithGivenSumInBST f = new FindAPairWithGivenSumInBST();
	    if(f.isPairExist(to.getTree(),13))
	    {
		System.out.println("Y");
	    }
	    else
	    {
		System.out.println("N");
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	
	
    }

    
    private boolean isPairExist(TreeNode tn,int sum)
    {
	try
	{
	    if(tn==null)
	    {
		return false;
	    }
	    boolean d1=false;
	    boolean d2=false;
	    int val1=0;
	    int val2=0;
	    Stack<TreeNode> st1 = new Stack<TreeNode>();
	    Stack<TreeNode> st2 = new Stack<TreeNode>();
	    TreeNode t = tn;
	    TreeNode t1 = tn;
	    while(true)
	    {
		while(!d1)
		{
		    	if(t!=null)
			{
			    st1.push(t);
			   // if(t.getLeftChildNode()!=null)
			    t=t.getLeftChildNode();
			}
			else
			{
			    if(st1.isEmpty())
			    {
				d1=true;
			    }
			    else
			    {
				t=st1.pop();
				val1=t.getNodeData();
				t=t.getRightChildNode();
				
				d1=true;
			    }
			}
		}
		while(!d2)
		{
		    if(t1!=null)
		    {
			st2.push(t1);
			 t1=t1.getRightChildNode();
		    }
		    else
		    {
			if(st2.isEmpty())
			{
			    d2=true;
			}
			else
			{
			    t1=st2.pop();
			    val2=t1.getNodeData();
			    t1=t1.getLeftChildNode();
			    d2=true;
			}
		    }
		}
		if((val1+val2)==sum)
		{
		    System.out.println(val1+" > "+val2);
		    return true;
		}
		if((val1+val2)<sum)
		{
		    d1=false;
		}
		if((val1+val2)>sum)
		{
		    d2=false;
		}
		if(val1>=val2)
		{
		    return false;
		}
	    }
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    
    
}
