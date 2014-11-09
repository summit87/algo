package com.Test.LinkList;

public class Node {

	public Node node;
	public int data;
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	public Node()
	{
		
	}
	
	public Node(int data)
	{
		this.data = data;
	}
	
	public Node(int data,Node node)
	{
		this.data = data;
		this.node = node;
	}
	
	
	
}
