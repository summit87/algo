package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class PrintBSTKeysInGivenRange {

    /**
     * @param args
     *       Code To Test the logic
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
	    PrintBSTKeysInGivenRange bst= new PrintBSTKeysInGivenRange();
	    TreeNode tn=to.getTree();
	    bst.printKey(tn, 1, 4);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private void printKey(TreeNode tn,int key1,int key2)
    {
	if(tn==null)
	{
	    return;
	}
	if(key1<tn.getNodeData())
	{
	    printKey(tn.getLeftChildNode(), key1, key2);
	}
	if(key1<=tn.getNodeData()&&tn.getNodeData()<=key2)
	{
	    System.out.print(tn.getNodeData()+",");
	}
	if(key2>tn.getNodeData())
	{
	    printKey(tn.getRightChildNode(), key1, key2);
	}
    }
    
    
}
