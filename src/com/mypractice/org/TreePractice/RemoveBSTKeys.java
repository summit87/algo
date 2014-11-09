package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class RemoveBSTKeys {

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
     * @param args
     * There are two possible cases for every node.
        1) Node’s key is outside the given range. This case has two sub-cases.
        …….a) Node’s key is smaller than the min value.
        …….b) Node’s key is greater that the max value.
        2) Node’s key is in range.

        We don’t need to do anything for case 2. In case 1, we need to remove the node and change 
        root of sub-tree rooted with this node.
        The idea is to fix the tree in Postorder fashion. When we visit a node, we make sure that its
         left and right sub-trees are already fixed. In case 1.a), we simply remove root and return right 
         sub-tree as new root. In case 1.b), we remove root and return left sub-tree as new root.
     * 
     * */
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
	    RemoveBSTKeys r = new RemoveBSTKeys();
	    int min=4;
	    int max=10;
	    TreeNode t = to.getTree();
	    r.inOrder(t);
	   
	    TreeNode tn = r.getUpdatedTree(t, min, max) ;
	    System.out.println();
	    r.inOrder(tn);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    private TreeNode getUpdatedTree(TreeNode tn,int min,int max)
    {
	try
	{
	    if(tn==null)
	    {
		return null;
	    }
	    tn.setLeftChildNode(getUpdatedTree(tn.getLeftChildNode(),min,max));
	    tn.setRightChildNode(getUpdatedTree(tn.getRightChildNode(),min,max));
	    if(tn.getNodeData()<min)
	    {
		TreeNode t = tn.getRightChildNode();
		tn=null;
		return t;
	    }
	    if(tn.getNodeData()>max)
	    {
		TreeNode t = tn.getLeftChildNode();
		tn=null;
		return t;
	    }
	    return tn;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    private void inOrder(TreeNode tn)
    {
	try
	{
	    if(tn!=null)
	    {
		inOrder(tn.getLeftChildNode());
		System.out.print(tn.getNodeData()+",");
		inOrder(tn.getRightChildNode());
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
}
