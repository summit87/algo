package com.mypractice.org.LinkedListProgramm;

import java.io.File;
import java.util.Scanner;

public class SinglyQueueImpl {

	/**
	 * @param args
	 */
	LinkListNode frontNode;
	LinkListNode rearNode;
	public static void main(String[] args) {
		try
		{
			SinglyQueueImpl l = new SinglyQueueImpl();
			Scanner sc = new Scanner(new File("linkList.txt"));
			String[] a = sc.next().split("->");
			for(String s : a)
			{
				l.insertInQueue(Integer.parseInt(s));
			}
			l.print();
			System.out.println();
			sc.close();
			a=null;
			sc = new Scanner(new File("del.txt"));
			a=sc.next().split("->");
			for(String s : a)
			{
				l.deleteFronNode(Integer.parseInt(s));
			}
			l.print();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}
	
	
	private void insertInQueue(int nodeVal)
	{
		try
		{
			LinkListNode ll = new LinkListNode(nodeVal,null);
			if(frontNode==null&&rearNode==null)
			{
				frontNode = rearNode=ll;
			}
			else
			{
				LinkListNode tempQueue = rearNode;
				while(tempQueue.getNextLink()!=null)
				{
					tempQueue = tempQueue.getNextLink();
				}
				
				tempQueue.setNextLink(ll);
				tempQueue=ll;
				rearNode = tempQueue;
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	private void deleteFronNode(int nodeVal)
	{
		try
		{
			while(frontNode.getNextLink()!=null)
			{
				if(frontNode.getNodeData()==nodeVal)
				{
					LinkListNode temp = frontNode;
					frontNode = frontNode.getNextLink();
					temp = null;
					break;
				}
				frontNode = frontNode.getNextLink();
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
			LinkListNode temp = frontNode;
			while(temp!=null)
			{
				System.out.print(temp.getNodeData()+"-->");
				temp=temp.getNextLink();
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
}
