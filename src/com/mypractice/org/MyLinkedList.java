package com.mypractice.org;

public class MyLinkedList {

	private int data;
	private MyLinkedList nextLink;
	
	public MyLinkedList(int data) {
		//super();
		this.data = data;
		this.nextLink = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public MyLinkedList getNextLink() {
		return nextLink;
	}
	public void setNextLink(MyLinkedList nextLink) {
		this.nextLink = nextLink;
	}
	
	
	
}
