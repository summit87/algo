package com.mypractice.org.TreePractice;

public class AVLTreeImpl {

    
    
   // AVLTreeNode avlTreeRoot;
    
    public AVLTreeNode addNode(AVLTreeNode avlNode,int key)
    {
	try
	{
	    if(avlNode==null)
	    {
		avlNode = new AVLTreeNode(key,null,null);
		 return avlNode;
	    }
	    else if(key<avlNode.getNodeData())
	    {
		avlNode.setLeftChild(addNode(avlNode.getLeftChild(), key));
	    }
	    else if(key>avlNode.getNodeData())
	    {
		avlNode.setRightChild(addNode(avlNode.getRightChild(), key));
	    }
	    avlNode.setHight(max(getHightOfTree(avlNode.getRightChild()),getHightOfTree(avlNode.getLeftChild()))+1);
	    int balanceFactor = getHightOfTree(avlNode.getRightChild())-getHightOfTree(avlNode.getLeftChild());
	    
	    if(balanceFactor>1&&avlNode.getLeftChild()!=null&&key<avlNode.getLeftChild().getNodeData())
	    {
		return getRightRotation(avlNode);
	    }
	    if(balanceFactor>1&&avlNode.getLeftChild()!=null&&key>avlNode.getLeftChild().getNodeData())
	    {
		avlNode.setLeftChild(getLeftRotation(avlNode));
		return getRightRotation(avlNode);
	    }
	    if(balanceFactor<-1 &&avlNode.getRightChild()!=null&& key<avlNode.getRightChild().getNodeData())
	    {
		avlNode.setRightChild(getRightRotation(avlNode));
		return getLeftRotation(avlNode);
		
	    }
	    if(balanceFactor<-1 &&avlNode.getRightChild()!=null&& key>avlNode.getRightChild().getNodeData())
	    {
		return getLeftRotation(avlNode);
	    }
	    return avlNode;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    
    private AVLTreeNode getRightRotation(AVLTreeNode rightRotaion)
    {
	try
	{
	    if(rightRotaion==null)
	    {
		return null;
	    }
	    AVLTreeNode x = rightRotaion.getLeftChild();
	    AVLTreeNode t2 = x.getRightChild();
	    x.setRightChild(rightRotaion);
	    rightRotaion.setLeftChild(t2);
	    rightRotaion.setHight(max(getHightOfTree(rightRotaion.getLeftChild()),getHightOfTree(rightRotaion.getRightChild()))+1);
	    x.setHight(max(getHightOfTree(x.getLeftChild()),getHightOfTree(x.getRightChild()))+1);
	    return rightRotaion;
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    
    private AVLTreeNode getLeftRotation(AVLTreeNode leftRotation)
    {
	try
	{
	   if(leftRotation==null)
	   {
	       return null;
	   }
	   AVLTreeNode x = leftRotation.getRightChild();
	   AVLTreeNode t2 = x.getLeftChild();
	   x.setLeftChild(leftRotation);
	   leftRotation.setRightChild(t2);
	   x.setHight(max(getHightOfTree(x.getLeftChild()),getHightOfTree(x.getRightChild()))+1);
	   leftRotation.setHight(max(getHightOfTree(leftRotation.getLeftChild()),getHightOfTree(leftRotation.getRightChild()))+1);
	   
	   return leftRotation;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    private int getHightOfTree(AVLTreeNode avlNode)
    {
	try
	{
	    if(avlNode==null)
	    {
		return 0;
	    }
	    return avlNode.getHight();
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -100;
    }
    
    
    
    private int max(int leftHight,int rightHight)
    {
	try
	{
	    return leftHight>rightHight?leftHight:rightHight;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -100;
    }
    
    
    public void preOrderTraversal(AVLTreeNode avlTreeNode)
    {
	try
	{
	    if(avlTreeNode!=null)
	    {
        	    System.out.print(avlTreeNode.getNodeData()+",");
        	    preOrderTraversal(avlTreeNode.getLeftChild());
        	    preOrderTraversal(avlTreeNode.getRightChild());
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
}
