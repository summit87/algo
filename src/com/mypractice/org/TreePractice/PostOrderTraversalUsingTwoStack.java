package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;
import java.util.Stack;

public class PostOrderTraversalUsingTwoStack {

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
    /*1.1 Create an empty stack
    2.1 Do following while root is not NULL
        a) Push root's right child and then root to stack.
        b) Set root as root's left child.
    2.2 Pop an item from stack and set it as root.
        a) If the popped item has a right child and the right child 
           is at top of stack, then remove the right child from stack,
           push the root back and set root as root's right child.
        b) Else print root's data and set root as NULL.
    2.3 Repeat steps 2.1 and 2.2 while stack is not empty.
    */
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
	    PostOrderTraversalUsingTwoStack p = new PostOrderTraversalUsingTwoStack();
	    TreeNode tn = to.getTree();
	    p.traverseUsinfSingleStack(tn);
	    System.out.println();
	    p.traverse(tn);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private void traverse(TreeNode tn)
    {
	try
	{
	    Stack<TreeNode> st = new Stack<TreeNode>();
	    Stack<TreeNode> st1 = new Stack<TreeNode>();
	    TreeNode t = tn;
	    st.push(t);
	    while(t!=null&&!st.isEmpty())
	    {
		t=st.pop();
		st1.push(t);
		if(t.getLeftChildNode()!=null)
		{
		    st.push(t.getLeftChildNode());
		}
		if(t.getRightChildNode()!=null)
		{
		    st.push(t.getRightChildNode());
		}
	    }
	    while(!st1.isEmpty())
	    {
		System.out.print(st1.pop().getNodeData()+",");
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    private void traverseUsinfSingleStack(TreeNode tn)
    {
	try
	{
	    Stack<TreeNode> st = new Stack<TreeNode>();
	    TreeNode t = tn;
	   // st.push(t);
	    while(true)
	    {
		while(t!=null)
		{
		    if(t.getRightChildNode()!=null)
			st.push(t.getRightChildNode());
		    st.push(t);
		    t=t.getLeftChildNode();
		}
		t=st.pop();
		if(t.getRightChildNode()!=null&&(!st.isEmpty()&&st.peek()==t.getRightChildNode()))
		{
		    st.pop();
		    st.push(t);
		    t=t.getRightChildNode();
		}
		else
		{
		    System.out.print(t.getNodeData()+",");
		    t=null;
		}
		if(st.isEmpty())
		{
		    break;
		}
	    } 
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
}
