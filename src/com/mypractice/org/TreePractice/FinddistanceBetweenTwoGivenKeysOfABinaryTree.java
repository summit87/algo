package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class FinddistanceBetweenTwoGivenKeysOfABinaryTree {

    /**
     * @param args
     *  Find distance between two given keys of a Binary Tree
	Find the distance between two keys in a binary tree, no parent pointers
 	are given. Distance between two nodes is the minimum number of edges to
 	 be traversed to reach one node from other.
 	 The distance between two nodes can be obtained in terms of lowest common ancestor. Following is the formula.

            Dist(n1, n2) = Dist(root, n1) + Dist(root, n2) - 2*Dist(root, lca) 
            'n1' and 'n2' are the two given keys
            'root' is root of given Binary Tree.
            'lca' is lowest common ancestor of n1 and n2
            Dist(n1, n2) is the distance between n1 and n2.
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
	    FinddistanceBetweenTwoGivenKeysOfABinaryTree dist = new FinddistanceBetweenTwoGivenKeysOfABinaryTree();
	    int x = dist.getDistance(to.getTree(),1,10);
	    System.out.println(x);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	
	
	
    }
    
    int d1=0;int d2=0;int dis=0;int lev=0;
    private int findLevel(TreeNode tn,int key,int lev)
    {
	try
	{
	    if(tn==null)
	    {
		return -1;
	    }
	    if(tn.getNodeData()==key)
	    {
		return lev;
	    }
	    int l = findLevel(tn.getLeftChildNode(), key, lev+1);
	    return l!=-1?l:findLevel(tn.getRightChildNode(), key, lev+1);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    private TreeNode findTreeNodeLCA(TreeNode tn,int key1,int key2,int lev)
    {
	try
	{
	    if(tn==null)
	    {
		return null;
	    }
	    if(tn.getNodeData()==key1)
	    {
		d1=lev;
		return tn;
	    }
	    if(tn.getNodeData()==key2)
	    {
		d2=lev;
		return tn;
	    }
	    
	    TreeNode lLCA = findTreeNodeLCA(tn.getLeftChildNode(), key1, key2, lev+1);
	    TreeNode rLCA = findTreeNodeLCA(tn.getRightChildNode(), key1, key2, lev+1);
	    if(lLCA!=null&&rLCA!=null)
	    {
		dis = d1+d2-2*lev;
		return tn;
	    }
	    return lLCA!=null?lLCA:rLCA;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
   
    private int getDistance(TreeNode tn,int key1,int key2)
    {
	try
	{
	   
	    TreeNode lca = findTreeNodeLCA(tn, key1, key2,0);
	    if(d1!=-1&&d2!=-1)
	    {
		return dis;
	    }
	    if(d1!=-1)
	    {
		return findLevel(lca, key2,0);
	    }
	    if(d2!=-1)
	    {
		return findLevel(lca, key1,0);
	    }
	    return -1;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
}
