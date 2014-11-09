package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class PrintAncestorsofagivennode {

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
	    TreeOperation to = new TreeOperation();
	    Scanner sc = new Scanner(new File("tree.txt"));
	    String[] a = sc.next().split(",");
	    int[] array = new int[10];
	    for(String s : a)
	    {
		to.addNodeValue(Integer.parseInt(s));
	    }
	    PrintAncestorsofagivennode d = new PrintAncestorsofagivennode();
	    d.ancestor1(to.getTree(),new TreeNode(null,null,11));
	    //d.ancestor(to.getTree(), 0, array,11);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private void ancestor(TreeNode tn,int ind,int[] array,int key)
    {
	try
	{
	    if(tn==null)
		{
		    return;
		}
		array[ind]=tn.getNodeData();
		ind++;
		if(tn.getLeftChildNode()==null&&tn.getRightChildNode()==null&&tn.getNodeData()==key)
		{
		    for(int i=0;i<ind-1;i++)
		    {
			System.out.print(array[i]+",");
		    }
		    ind=0;
		}
		ancestor(tn.getLeftChildNode(),ind,array,key);
		ancestor(tn.getRightChildNode(),ind,array,key);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    private boolean ancestor1(TreeNode tn,TreeNode key)
    {
	try
	{
	    if(tn==null)
	    {
		return false;
	    }
	    if(tn.getLeftChildNode()==key||tn.getRightChildNode()==key||ancestor1(tn.getLeftChildNode(),key)||ancestor1(tn.getRightChildNode(),key))
	    {
		System.out.print(tn.getNodeData()+",");
	    }
	    return true;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
}
