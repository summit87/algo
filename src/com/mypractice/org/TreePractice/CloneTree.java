package com.mypractice.org.TreePractice;

public class CloneTree {

    public static void main(String[] args)
    {
	try
	{
	    TreeNode tn = new TreeNode(1);
	    tn.setLeftChildNode(new TreeNode(2));
	    tn.setRightChildNode(new TreeNode(3));
	    tn.setRandomT(tn.getRightChildNode());
	    tn.getLeftChildNode().setRandomT(tn);
	    CloneTreeOperation cto = new CloneTreeOperation();
	    TreeNode clone = cto.getClone(tn);
	    System.out.println("\nOriginal Tree.......");
	    cto.print(tn);
	    System.out.println("\nClone Tree.......");
	    cto.print(clone);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }

    
}
