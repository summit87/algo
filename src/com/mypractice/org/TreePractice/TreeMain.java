package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class TreeMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

	
	
	try
	{
	    
	    /*Code To Test the logic
		  Creating an example tree
		                     5
				   /   \
				  3    10
				 / \   / \
				1   4 9  11
					   
	    */
	    TreeOperation to = new TreeOperation();
	    Scanner sc = new Scanner(new File("tree.txt"));
	    String[] a = sc.next().split(",");
	    
	    for(String s : a)
	    {
		to.addNodeValue(Integer.parseInt(s));
	    }
	    //to.addNodeValue(21);
	    //to.iterativeTreeTraversal(to.getTree());
	   // System.out.println(to.diameter(to.getTree()));
//	    to.getMaxSumBetweenTwoLeaf(to.getTree(),0);
//	    System.out.println(to.getM());
	   // to.printInorderTree(to.getTree());
	    System.out.println("\n---------Iterative Traversal Traversal------------");
	    //to.printAllNodeFromAGivenDistance(to.getTree(),to.getTree(),1);;
	    
	    int x = to.findLCA1(to.getTree(),1,10);
	    System.out.println("LCA > "+x);
	    
	    //to.printLevTree(to.getTree());
	    //to.printRight(to.getTree());
	    
	    //to.printTreeInVerticalOrder(to.getTree());
	    
	   // to.reverseNode(1);
//	    to.genrateSum();
//	    
//	    to.printInorderTree(to.getTree());
	    
//	    TreeNode node1 = to.find(1);
//	    TreeNode node2 = to.find(11);
	    /*--------- Sub Tree--------
	    TreeOperation to1 = new TreeOperation();
	    to1.addNodeValue(3);
	    to1.addNodeValue(1);
	    to1.addNodeValue(4);
	    to1.addNodeValue(5);
	    if(to.isSubTree(to.getTree(),to1.getTree()))
	    {
		System.out.println("Yes Its SUB  Tree");
	    }
	    else
	    {
		System.out.println("Yes Its NOt SUB Tree");
	    }*/
//	    int[] path = new int[100];
//	    to.printRootToLeaf(to.getTree(),path);
	    
	   // System.out.println("---------Iterative Traversal Traversal------------");
	  // to.iterativeTraversal(to.getTree());
	    //to.printInorderTree(to.getTree());
//	    System.out.println("\n---------PreOrderTraversal------------\n");
//	    to.preOrderTree(to.getTree());
//	    System.out.println("\n---------PostOrderTraversal------------\n");
//	    to.postOrderTree(to.getTree());
	    //to.delete(5);
	    //TreeNode tn = to.getTreeAfterDeletion(to.getTree(),1);
	   // System.out.println("Hight--"+to.isCousin(to.getTree(), node1, node2));
	    //System.out.println("--After Deletion-------InOrderTraversal------------");
	    //to.printInorderTree(to.getMaxSumSubTree());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }

}
