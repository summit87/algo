package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class LongestIndependentSet {

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
	    LongestIndependentSet l = new LongestIndependentSet();
	    int l2=l.longestIndeSet1(to.getTree());
	    System.out.println(l2);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private int longetIndeSet(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return 0;
	    }
	    int excLen = longetIndeSet(tn.getLeftChildNode())+longetIndeSet(tn.getRightChildNode());
	    int incLen = 1;
	    if(tn.getLeftChildNode()!=null)
	    {
		incLen+=longetIndeSet(tn.getLeftChildNode().getRightChildNode())+longetIndeSet(tn.getLeftChildNode().getRightChildNode());
	    }
	    if(tn.getRightChildNode()!=null)
	    {
		incLen+=longetIndeSet(tn.getRightChildNode().getLeftChildNode())+longetIndeSet(tn.getRightChildNode().getRightChildNode());
	    }
	    return incLen>excLen?incLen:excLen;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    private int longestIndeSet1(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return -1;
	    }
	    if(tn.getResult()!=0)
	    {
		return tn.getResult();
	    }
	    if(tn.getLeftChildNode()==null&&tn.getRightChildNode()==null&&tn.getResult()==0)
	    {
		System.out.print(tn.getNodeData()+",");
		tn.setResult(1);
		return tn.getResult();
	    }
	    int excLen = longestIndeSet1(tn.getLeftChildNode())+longestIndeSet1(tn.getRightChildNode());
	    int incLen = 1;
	    if(tn.getLeftChildNode()!=null)
	    {
		incLen+=longestIndeSet1(tn.getLeftChildNode().getRightChildNode())+longestIndeSet1(tn.getLeftChildNode().getLeftChildNode());
	    }
	    if(tn.getRightChildNode()!=null)
	    {
		incLen+=longestIndeSet1(tn.getRightChildNode().getLeftChildNode())+longestIndeSet1(tn.getRightChildNode().getRightChildNode());
	    }
	    
	    tn.setResult(incLen>excLen?incLen:excLen);
	    return tn.getResult();
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
}
