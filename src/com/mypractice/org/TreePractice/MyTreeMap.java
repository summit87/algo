package com.mypractice.org.TreePractice;

public class MyTreeMap {
    
    
    private int key;
    private int value;
    private MyTreeMap leftChild;
    private MyTreeMap rightChild;
    
    
    
    
    
    
    public MyTreeMap(int key, int value, MyTreeMap leftChild,
	    MyTreeMap rightChild) {
	super();
	this.key = key;
	this.value = value;
	this.leftChild = leftChild;
	this.rightChild = rightChild;
    }
    public int getKey() {
        return key;
    }
    public void setKey(int key) {
        this.key = key;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public MyTreeMap getLeftChild() {
        return leftChild;
    }
    public void setLeftChild(MyTreeMap leftChild) {
        this.leftChild = leftChild;
    }
    public MyTreeMap getRightChild() {
        return rightChild;
    }
    public void setRightChild(MyTreeMap rightChild) {
        this.rightChild = rightChild;
    }
    
    
    
    
    
    

}
