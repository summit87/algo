package com.mypractice.org.LinkedListProgramm;

public class DoublyLinkListNode {

	private DoublyLinkListNode rightPointer;
	private DoublyLinkListNode leftPointer;
	private int nodeData;
	
	
	public DoublyLinkListNode(DoublyLinkListNode rightPointer,
			DoublyLinkListNode leftPointer, int nodeData) {
		this.rightPointer = rightPointer;
		this.leftPointer = leftPointer;
		this.nodeData = nodeData;
	}
	public DoublyLinkListNode getRightPointer() {
		return rightPointer;
	}
	public void setRightPointer(DoublyLinkListNode rightPointer) {
		this.rightPointer = rightPointer;
	}
	public DoublyLinkListNode getLeftPointer() {
		return leftPointer;
	}
	public void setLeftPointer(DoublyLinkListNode leftPointer) {
		this.leftPointer = leftPointer;
	}
	public int getNodeData() {
		return nodeData;
	}
	public void setNodeData(int nodeData) {
		this.nodeData = nodeData;
	}
	
	
}
