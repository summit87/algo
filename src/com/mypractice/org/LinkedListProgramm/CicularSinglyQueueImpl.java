package com.mypractice.org.LinkedListProgramm;

import java.io.File;
import java.util.Scanner;

public class CicularSinglyQueueImpl {

	/**
	 * @param args
	 */
	LinkListNode frontNode;
	LinkListNode rearNode;
	public static void main(String[] args) {
		try
		{
			CicularSinglyQueueImpl l = new CicularSinglyQueueImpl();
			Scanner sc = new Scanner(new File("linkList.txt"));
			String[] a = sc.next().split("->");
			for(String s : a)
			{
				l.insertIntoQueue(Integer.parseInt(s));
			}
			l.print();
			System.out.println();
			sc.close();
			a=null;
			sc = new Scanner(new File("del.txt"));
			a = sc.next().split("->");
			for(String s : a)
			{
				l.delete(Integer.parseInt(s)); 
			}
			l.print();
		}
		catch(Exception ex)
		{ 
			ex.printStackTrace();
		}
	}
	
	
	private void delete(int nodeVal)
	{
		try
		{
			LinkListNode temp = frontNode;
			while(temp!=null)
			{
				if(temp.getNodeData()==nodeVal)
				{
					LinkListNode temp1 = frontNode;
					System.out.println(">"+temp1.getNodeData());
					frontNode = frontNode.getNextLink();
					rearNode.setNextLink(frontNode);
					temp1=null;
					break;
				}
				temp=temp.getNextLink();
				if(temp==frontNode)
				{
					//System.out.println(temp.getNodeData());
					break;
				}
				
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	
	private void insertIntoQueue(int nodeVal)
	{
		try
		{
			LinkListNode ll = new LinkListNode(nodeVal,null);
			if(frontNode==null&&rearNode==null)
			{
				ll.setNextLink(ll);
				frontNode = rearNode=ll;
			}
			else
			{
				LinkListNode temp = rearNode;
				while(temp.getNextLink()!=rearNode)
				{
					temp=temp.getNextLink();
				}
				ll.setNextLink(frontNode);
				temp.setNextLink(ll);
				temp=ll;
				//rearNode=ll;
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	
	private void print()
	{
		try
		{
			LinkListNode ll = frontNode;
			while(ll!=null)
			{
				System.out.print(ll.getNodeData()+"-->");
				ll=ll.getNextLink();
				if(ll==frontNode)
				{
					break;
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
}
