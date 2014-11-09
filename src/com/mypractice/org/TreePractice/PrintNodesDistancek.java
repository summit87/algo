package com.mypractice.org.TreePractice;

import java.io.File;
import java.util.Scanner;

public class PrintNodesDistancek {

    /**
     * @param args
     * Print all nodes that are at distance k from a leaf node
       Given a Binary Tree and a positive integer k, print all 
       nodes that are distance k from a leaf node.
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
	    PrintNodesDistancek pd = new PrintNodesDistancek();
	    boolean[] isVisited = new boolean[8];
	    int[] nodeVal = new int[8];
	    for(int i=0;i<8;i++)
	    {
		isVisited[i]=true;
		nodeVal[i] = 0;
	    }
	    pd.printNodeAtDistanceK(to.getTree(),0, nodeVal, isVisited,2);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	
    }

    
    private void printNodeAtDistanceK(TreeNode tn,int pathLen,int[] nodeVal,boolean[] isVisited,int kth)
    {
	try
	{
	    if(tn==null)  
	    {
		return;
	    }
	    nodeVal[pathLen] = tn.getNodeData();
	    isVisited[pathLen]=false;
	    pathLen++;
	    if(tn.getLeftChildNode()==null&&tn.getRightChildNode()==null&&pathLen-kth-1>=0&&isVisited[pathLen-kth-1]==false)
	    {
		System.out.println(nodeVal[pathLen-kth-1]+",");
		isVisited[pathLen-kth-1]=true;
	    }
	    printNodeAtDistanceK(tn.getLeftChildNode(), pathLen, nodeVal, isVisited, kth);
	    printNodeAtDistanceK(tn.getRightChildNode(), pathLen, nodeVal, isVisited, kth);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
}
