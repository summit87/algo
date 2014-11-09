package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class FloorAndCeilFromABST {

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
    
    static int sum=0;
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
	    FloorAndCeilFromABST fc = new FloorAndCeilFromABST();
	    int c = fc.celling(to.getTree(),6);
	    int f = fc.floor(to.getTree(),6);
	    System.out.println("celling > "+c);
	    System.out.println("flor > "+f);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private int celling(TreeNode tn,int input)
    {
	try
	{
	    if(tn==null)
	    {
		return 0;
	    }
	    if(tn.getNodeData()==input)
	    {
		return tn.getNodeData();
	    }
	    else
	    {
		if(input>tn.getNodeData())
		{
		    return celling(tn.getRightChildNode(), input);
		}
		if(input<tn.getNodeData())
		{
		    int celing = celling(tn.getLeftChildNode(), input);
		    return celing<=input&&celing!=0?celing:tn.getNodeData();
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    private int floor(TreeNode tn,int input)
    {
	try
	{
	    if(tn==null)
	    {
		return -1;
	    }
	    if(tn.getNodeData()==input)
	    {
		return tn.getNodeData();
	    }
	    if(input<tn.getNodeData())
	    {
		return floor(tn.getLeftChildNode(), input);
	    }
	    if(input>tn.getNodeData())
	    {
		int flor = floor(tn.getRightChildNode(), input);
		return flor<=input&&flor!=-1?flor:tn.getNodeData();
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
}
