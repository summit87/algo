package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class PrintLeftOrRightView {

    /**
     * @param args
     *  			     5
				   /   \
				  3    10
				 / \   / \
				1   4 9  11
     */
    
    static int max=0;
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
	    PrintLeftOrRightView plr = new PrintLeftOrRightView();
	    plr.printLeftOrRight(to.getTree(),1);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    private void printLeftOrRight(TreeNode tn,int lev)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    if(max<lev)
	    {
		System.out.print(tn.getNodeData()+",");
		max=lev;
	    }
	    printLeftOrRight(tn.getLeftChildNode(), lev+1);
	    printLeftOrRight(tn.getRightChildNode(), lev+1);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    
}
