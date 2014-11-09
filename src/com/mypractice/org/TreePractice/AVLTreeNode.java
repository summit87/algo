package com.mypractice.org.TreePractice;

public class AVLTreeNode {

    
    
    private int hight;
    private int nodeData;
    private AVLTreeNode leftChild;
    private AVLTreeNode rightChild;
    public AVLTreeNode(int nodeData, AVLTreeNode leftChild,
	    AVLTreeNode rightChild) {
	super();
	this.nodeData = nodeData;
	this.leftChild = leftChild;
	this.rightChild = rightChild;
    }
    public int getHight() {
        return hight;
    }
    public void setHight(int hight) {
        this.hight = hight;
    }
    public int getNodeData() {
        return nodeData;
    }
    public void setNodeData(int nodeData) {
        this.nodeData = nodeData;
    }
    public AVLTreeNode getLeftChild() {
        return leftChild;
    }
    public void setLeftChild(AVLTreeNode leftChild) {
        this.leftChild = leftChild;
    }
    public AVLTreeNode getRightChild() {
        return rightChild;
    }
    public void setRightChild(AVLTreeNode rightChild) {
        this.rightChild = rightChild;
    }
    
    
    
    
    
    
    
    
}
