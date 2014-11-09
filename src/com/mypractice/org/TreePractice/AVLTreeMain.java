package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class AVLTreeMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	try
	{
	    AVLTreeImpl avlImpl = new AVLTreeImpl();
	    Scanner sc = new Scanner(new File("avltree.txt"));
	    String[] a = sc.next().split(",");
	    AVLTreeNode avlTree = null;
	    for(String s : a)
	    {
		avlTree = avlImpl.addNode(avlTree, Integer.parseInt(s));
	    }
	    avlImpl.preOrderTraversal(avlTree);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

}
