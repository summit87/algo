package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class BinaryTreeToDLL1 {

    /**
     * @param args
     *  Convert a given Binary Tree to Doubly Linked List | Set 1
                  Code To Test the logic
		  Creating an example tree
		                     5
				   /   \
				  3    10
				 / \   / \
				1   4 9  11
     * 1) Fix Left Pointers: In this step, we change left pointers to point to previous nodes in DLL. The idea is simple, 
     * we do inorder traversal of tree. In inorder traversal, we keep track of previous visited node and change left pointer
     *  to the previous node. See fixPrevPtr() in below implementation.

       2) Fix Right Pointers: The above is intuitive and simple. How to change right pointers to point to next node in DLL? 
       The idea is to use left pointers fixed in step 1. We start from the rightmost node in Binary Tree (BT). The rightmost 
       node is the last node in DLL. Since left pointers are changed to point to previous node in DLL,
        we can linearly traverse the complete DLL using these pointers. The traversal would be from last to first node. 
        While traversing the DLL, we keep track of the previously visited node and change the right pointer to the previous node. See fixNextPtr() in below implementation.
     */
    
    TreeNode tree=null;
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
	    BinaryTreeToDLL1 bd = new BinaryTreeToDLL1();
	    bd.printDLL(to.getTree());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	

    }

    /*Here in this method we are making left pointer as previous pointer of dll by traversing in inOrder fashion
     * Because we have to keep InOrder traverser persist;
     * in comment 1 in fixLeftAsPreviousOfDLL method, we are making left as previous pointer in DLL by setting null  initially
     * and then in 2nd comment we are keeping track of previous traversed node..
     * 
     * */
    private void fixLeftAsPreviousOfDLL(TreeNode tn)
    {
	try
	{
	    if(tn!=null)
	    {
		fixLeftAsPreviousOfDLL(tn.getLeftChildNode());
		/*1*/
		tn.setLeftChildNode(tree);
		/*2*/
		tree = tn;
		fixLeftAsPreviousOfDLL(tn.getRightChildNode());
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    /*In this method we are going in right most so we can reach head of previous pointer
     *  (In comment 1in below method) (In first we did or we have fixed previous pointer of DLL)
     * BY using right most pointer we can set next pointer of DLL, 
     * when we are traversing reverse order by using left pointer which is nothing but previous pointer of DLL of 
     * 
     * */
    private TreeNode fixRightAsNextOfDll(TreeNode tn)
    {
	try
	{
	    if(tn!=null)
	    {
		TreeNode tr=null;
		/*1*/
		while(tn.getRightChildNode()!=null)
		    tn=tn.getRightChildNode();
		/*2*/
		while(tn!=null&&tn.getLeftChildNode()!=null)
		{
		    tr=tn;
		    tn=tn.getLeftChildNode();
		    tn.setRightChildNode(tr);
		}
		return tn;
	    }
	    return null;
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    private TreeNode getDLL(TreeNode tn)
    {
	try
	{
	    fixLeftAsPreviousOfDLL(tn);
	    TreeNode tr = fixRightAsNextOfDll(tn);
	    return tr;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    private void printDLL(TreeNode tn)
    {
	try
	{
	    TreeNode tn1 = getDLL(tn);
	    while(tn1!=null)
	    {
		System.out.print(tn1.getNodeData()+",");
		tn1=tn1.getRightChildNode();
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
}
