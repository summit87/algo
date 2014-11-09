package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class ConvertAGivenTreeToItsSumTree {

    /**
     * @param args
     * *  Convert a given Binary Tree to Doubly Linked List | Set 1
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
    static int sum=0;
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
	    ConvertAGivenTreeToItsSumTree con = new ConvertAGivenTreeToItsSumTree();
	    TreeNode tn = to.getTree();
	    to.printInorderTree(tn);
	    con.treeToItsSum(tn);
	    System.out.println();
	    to.printInorderTree(tn);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	
    }

    
    private int treeToItsSum(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return 0;
	    }
	    int old = tn.getNodeData();
	    tn.setNodeData(treeToItsSum(tn.getLeftChildNode())+treeToItsSum(tn.getRightChildNode()));
	    return old+tn.getNodeData();
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    
//    private void treeToItsSum(TreeNode tn)
//    {
//	try
//	{
//	    if(tn==null)
//	    {
//		return;
//	    }
//	    int x=0;
//	    treeToItsSum(tn.getRightChildNode());
//	    treeToItsSum(tn.getLeftChildNode());
//	    x=sum;
//	    if(tn.getLeftChildNode()==null&&tn.getRightChildNode()==null)
//	    {
//		sum=tn.getNodeData();
//		tn.setNodeData(0);
//	    }
//	    else if(tn.getLeftChildNode()!=null&&tn.getRightChildNode()!=null)
//	    {
//		sum+=x+tn.getNodeData();
//		tn.setNodeData(sum);
//	    }
//	    
//	}
//	catch(Exception ex)
//	{
//	    ex.printStackTrace();
//	}
//    }
}
