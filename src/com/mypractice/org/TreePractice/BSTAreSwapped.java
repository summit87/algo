package com.mypractice.org.TreePractice;

import com.mypractice.org.StringAlgo.FirstNonRepetedCharecter;

public class BSTAreSwapped {

    /**
     * @param args
     * 
     * struct node *root = newNode(6);
        root->left        = newNode(10);
        root->right       = newNode(2);
        root->left->left  = newNode(1);
        root->left->right = newNode(3);
        root->right->right = newNode(12);
        root->right->left = newNode(7);
     */
    
    static TreeNode tn=null;
    static TreeNode first;
    static TreeNode mid;
    static TreeNode last;
    static TreeNode pre;
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	try
	{
	    BSTAreSwapped bst = new BSTAreSwapped();
	    tn = new TreeNode(6);
	    tn.setLeftChildNode(new TreeNode(10));
	    tn.setRightChildNode(new TreeNode(2));
	    tn.getLeftChildNode().setLeftChildNode(new TreeNode(1));
	    tn.getLeftChildNode().setRightChildNode(new TreeNode(3));
	    tn.getRightChildNode().setRightChildNode(new TreeNode(12));
	    tn.getRightChildNode().setLeftChildNode(new TreeNode(7));
	    TreeOperation to = new TreeOperation();
	    to.printInorderTree(tn);
	    bst.swapped(tn);
	    System.out.println("\n");
	    System.out.println("\n"+first.getNodeData()+" > "+mid.getNodeData()+" > "+last.getNodeData()+"\n");
	    if(first!=null&&last!=null)
	    {
		bst.swapNodeData(first.getNodeData(),last.getNodeData());
	    }
	    if(first!=null&&mid!=null)
	    {
		bst.swapNodeData1(first.getNodeData(),mid.getNodeData());
	    }
	    System.out.println("\n"+first.getNodeData()+" > "+mid.getNodeData()+" > "+last.getNodeData()+"\n");
	    to.printInorderTree(tn);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	

    }

    private void swapped(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    swapped(tn.getLeftChildNode());
	    if(pre!=null&&tn.getNodeData()<pre.getNodeData())
	    {
		if(first==null)
		{
		    first = pre;
		    mid=tn;
		}
		else
		{
		    last=tn;
		}
	    }
	    pre=tn;
	    swapped(tn.getRightChildNode());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    private void swapNodeData(int a,int b)
    {
	try
	{
	    int t = a;
	    	a=b;
	    	b=t;
	    	first.setNodeData(a);
	    	last.setNodeData(b);
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }

    private void swapNodeData1(int a,int b)
    {
	try
	{
	    int t = a;
	    	a=b;
	    	b=t;
	    	first.setNodeData(a);
	    	mid.setNodeData(b);
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    private void swapped1(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    swapped1(tn.getLeftChildNode());
	    TreeNode tn1=null;
	    if(pre!=null&&tn.getNodeData()<pre.getNodeData())
	    {
		tn1 = pre;
		int k = tn.getNodeData();
		int k1 = tn1.getNodeData();
		tn.setNodeData(k1);
		pre.setNodeData(k);
	    }
	    
	    pre=tn;
	    swapped1(tn.getRightChildNode());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
}
