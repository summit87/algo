package com.mypractice.org.LinkedListProgramm;

import java.awt.geom.CubicCurve2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CircularLinkedListImpl {

	
	
	LinkListNode circularList;
	public static void main(String[] args) throws FileNotFoundException
	{
		CircularLinkedListImpl l= new CircularLinkedListImpl();
		Scanner sc = new Scanner(new File("linkList.txt"));
		String[] a = sc.next().split("->");
		for(String s : a)
		{
			l.insertInToCL(Integer.parseInt(s));
		}
		sc.close();
		sc= new Scanner(new File("headNode.txt"));
		a=null;
		a = sc.next().split("->");
		for(String s : a)
		{
			l.inserInToHead(Integer.parseInt(s));
		}
		sc.close();
		l.print();
	}
	
	
	private void insertInToCL(int nodeVal)
	{
		try
		{
			LinkListNode start = circularList;
			LinkListNode ll = new LinkListNode(nodeVal,null);;
			if(circularList==null)
			{
				ll.setNextLink(ll);
				circularList=ll;
			}
			else
			{
				while(start.getNextLink()!=circularList)
				{
					start=start.getNextLink();
				}
				ll.setNextLink(circularList);
				start.setNextLink(ll);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	
	
	
	private void inserInToHead(int nodeVal)
	{
		try
		{
			LinkListNode ll = new LinkListNode(nodeVal,null);
			if(circularList==null)
			{
				ll.setNextLink(ll);
				circularList=ll;
			}
			else
			{
				LinkListNode tempNode = circularList;
				LinkListNode tempNode1 = tempNode;
				while(tempNode1.getNextLink()!=circularList)
				{
					tempNode1=tempNode1.getNextLink();
				}
				ll.setNextLink(tempNode);
				tempNode1.setNextLink(ll);
				circularList = ll;
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
			LinkListNode cl = circularList;
			while(cl!=null)
			{
				System.out.print(cl.getNodeData()+"-->");
				cl = cl.getNextLink();
				if(cl==circularList)
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
