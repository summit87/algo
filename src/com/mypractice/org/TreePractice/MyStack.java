package com.mypractice.org.TreePractice;

public class MyStack {

    
    
    private TreeNode treeNOde;
    private MyStack next;
    public TreeNode getTreeNOde() {
        return treeNOde;
    }
    public void setTreeNOde(TreeNode treeNOde) {
        this.treeNOde = treeNOde;
    }
    public MyStack getNext() {
        return next;
    }
    public void setNext(MyStack next) {
        this.next = next;
    }
    public MyStack(TreeNode treeNOde) {
	super();
	this.treeNOde = treeNOde;
    }
    
    
    
    
    
}
