package com.mypractice.org.LinkedListProgramm;

public class LinkListNode {

	
	private int nodeData;
	private LinkListNode nextLink;
	public int getNodeData() {
		return nodeData;
	}
	public void setNodeData(int nodeData) {
		this.nodeData = nodeData;
	}
	public LinkListNode getNextLink() {
		return nextLink;
	}
	public void setNextLink(LinkListNode nextLink) {
		this.nextLink = nextLink;
	}
	public LinkListNode(int nodeData, LinkListNode nextLink) {
		super();
		this.nodeData = nodeData;
		this.nextLink = nextLink;
	}
	
	
	
	
}
