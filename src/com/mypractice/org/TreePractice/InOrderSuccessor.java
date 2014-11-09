package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class InOrderSuccessor {

    /**
     * @param args
     *  Creating an example tree
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
	    InOrderSuccessor to = new InOrderSuccessor();
	    MyTree m = null;
	    MyTree m1 = new MyTree();
	    Scanner sc = new Scanner(new File("tree.txt"));
	    String[] a = sc.next().split(",");
	    for(String s : a)
	    {
		m=m1.insert(m,Integer.parseInt(s));
	    }
	    m1.traverse(m);
//	    MyTree tn = new InOrderSuccessor().getInOrderSuccessor(m,new MyTree(4));
//	    System.out.println(tn.getData());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }

    
    private MyTree getLeft(MyTree tn)
    {
	try
	{
	    while(tn!=null&&tn.getLeft()!=null)
	    {
		tn=tn.getLeft();
	    }
	    return tn;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    private MyTree getInOrderSuccessor(MyTree tn,MyTree targetNode)
    {
	try
	{
	    if(targetNode.getRight()!=null)
	    {
		return getLeft(tn.getRight());
	    }
	    MyTree p=targetNode.getParent();
	    System.out.println("poipoi > "+p.getData());
	    while(p!=null)
	    {
		
		p=p.getParent();
	    }
	    return p;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
   
    
}
class MyTree
{
	int data;
	MyTree left;
	MyTree right;
	MyTree parent;
	public int getData() {
	    return data;
	}
	public void setData(int data) {
	    this.data = data;
	}
	public MyTree getLeft() {
	    return left;
	}
	public void setLeft(MyTree left) {
	    this.left = left;
	}
	public MyTree getRight() {
	    return right;
	}
	public void setRight(MyTree right) {
	    this.right = right;
	}
	public MyTree getParent() {
	    return parent;
	}
	public void setParent(MyTree parent) {
	    this.parent = parent;
	}
	public MyTree()
	{
	    
	}
	public MyTree(int data) {
	    super();
	    this.data = data;
	    parent=null;
	    left=null;
	    right=null;
	}
	
	
	public MyTree insert(MyTree tree,int data)
	{
	    try
	    {
		if(tree==null)
		{
		    return new MyTree(data);
		}
		else
		{
		    MyTree temp;
		    if(data<tree.getData())
		    {
			temp=insert(tree.getLeft(),data);
			temp.setParent(tree);
			tree.setLeft(temp);
		    }
		    else if(data>tree.getData())
		    {
			temp=insert(tree.getRight(),data);
			temp.setParent(tree);
			tree.setRight(temp);
		    }
		    return tree;
		}
	    }
	    catch(Exception ex)
	    {
		ex.printStackTrace();
	    }
	    return null;
	}
	
	public void traverse(MyTree p)
	{
	    while(p!=null)
	    {
		System.out.print(p.getData()+",");
		p=p.getParent();
	    }
	}
	
}