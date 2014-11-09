package com.mypractice.org.TreePractice;

public class TreeNode {

    
    
    private TreeNode leftChildNode;
    private TreeNode rightChildNode;
    private TreeNode parent;
    private int nodeData;
    private int result;
    private TreeNode randomT;
    private boolean isVisisted;
    private TreeNode nextNode;// for populating In Order successor in this node i.e nextNode
    /* We are adding this enetiy for this question
     * 
         * A--->NULL
          / \
         B-->C-->NULL
        / \   \
       D-->E-->F-->NULL
     * 
    */
    private TreeNode nextRightNode;
    
    
    
    public TreeNode(TreeNode leftChildNode, TreeNode rightChildNode,
	    int nodeData) {
	super();
	this.leftChildNode = leftChildNode;
	this.rightChildNode = rightChildNode;
	this.nodeData = nodeData;
    }
    public TreeNode getLeftChildNode() {
        return leftChildNode;
    }
    public void setLeftChildNode(TreeNode leftChildNode) {
        this.leftChildNode = leftChildNode;
    }
    public TreeNode getRightChildNode() {
        return rightChildNode;
    }
    public void setRightChildNode(TreeNode rightChildNode) {
        this.rightChildNode = rightChildNode;
    }
    public int getNodeData() {
        return nodeData;
    }
    public void setNodeData(int nodeData) {
        this.nodeData = nodeData;
    }
    public TreeNode getRandomT() {
        return randomT;
    }
    public void setRandomT(TreeNode randomT) {
        this.randomT = randomT;
    }
    public TreeNode(TreeNode leftChildNode, TreeNode rightChildNode,
	    int nodeData, TreeNode randomT) {
	super();
	this.leftChildNode = leftChildNode;
	this.rightChildNode = rightChildNode;
	this.nodeData = nodeData;
	this.randomT = randomT;
    }
    public TreeNode(int nodeData) {
	super();
	this.nodeData = nodeData;
    }
    public boolean isVisisted() {
        return isVisisted;
    }
    public void setVisisted(boolean isVisisted) {
        this.isVisisted = isVisisted;
    }
    public TreeNode(TreeNode leftChildNode, TreeNode rightChildNode,
	    int nodeData, boolean isVisisted) {
	super();
	this.leftChildNode = leftChildNode;
	this.rightChildNode = rightChildNode;
	this.nodeData = nodeData;
	this.isVisisted = isVisisted;
    }
    public TreeNode getParent() {
        return parent;
    }
    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
    public int getResult() {
        return result;
    }
    public void setResult(int result) {
        this.result = result;
    }
    public TreeNode getNextNode() {
        return nextNode;
    }
    public void setNextNode(TreeNode nextNode) {
        this.nextNode = nextNode;
    }
    public TreeNode getNextRightNode() {
        return nextRightNode;
    }
    public void setNextRightNode(TreeNode nextRightNode) {
        this.nextRightNode = nextRightNode;
    }
    
    
    
    
    
    
    
    
    
}
