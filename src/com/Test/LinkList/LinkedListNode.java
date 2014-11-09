package com.Test.LinkList;

public class LinkedListNode {

	Node start;
	
	public LinkedListNode()
	{
		start = null;
	}
	// Insertion Operation
	public void insertNode(int data)
	{
		if(start == null)
		{
			start = new Node(data,start);
		}
		else
		{
			Node temp = start;
			while(temp.getNode()!=null)
			{
				temp = temp.getNode();
			}
			Node newNode = new Node(data,null);
			temp.setNode(newNode);
		}
	}
	public void insertBetweenNode(int afterData,int nodeValue)
	{
		try 
		{
			Node temp = start;
			while(temp!=null)
			{
				if(temp.getData()==afterData)
				{
					Node node = new Node(nodeValue,temp.getNode());
					temp.setNode(node);
					//break;
				}
				temp = temp.getNode();
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public void inserIntoHead(int nodeValue)
	{
		try
		{
			Node temp = start;
			Node node  = new Node(nodeValue,temp);
			temp = node;
			start = temp;
			//temp.setNode(node);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	

	

	
	public void deleteMidNode(int delValue)
	{
		try
		{
			Node temp = start;
			Node delNode = start;
			if(temp.getData() == delValue)
			{
				start = start.getNode();
				temp=null;
				return;
			}
			else
			{
				while(temp!=null)
				{
					if(temp.getNode().getData() == delValue)
					{
						delNode = temp.getNode();
						temp.setNode(delNode.getNode()) ;
						temp = new Node(0); 
					}
					temp = temp.getNode();
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	// Printing Operation11111111111
	public void printList()
	{
		Node pNode = start;
		while(pNode!=null)
		{
			System.out.print(pNode.getData()+"-->"); 
			pNode = pNode.getNode();
		}
		System.out.println();
	}
}
