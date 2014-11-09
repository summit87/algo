package com.Test.LinkList;

public class LinListImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try
		{
			LinkedListNode list = new LinkedListNode();
			list.insertNode(1);
			list.insertNode(2);
			list.insertNode(3);
			list.insertNode(4);
			list.insertNode(5);
			list.printList();
			System.out.println("<<<<---Inserting Data Between Linked List--->>>>>");
		//	Thread.currentThread().sleep(5000);
			list.insertBetweenNode(3,10);
			list.printList();
			System.out.println("<<<<---Inserting Data Into Head--->>>>>");
			//Thread.currentThread().sleep(5000);
			list.inserIntoHead(12);
			list.printList();
			System.out.println("<<<<---Inserting Into Last--->>>>>");
			//Thread.currentThread().sleep(5000);
			list.insertNode(13);
			list.printList();
			System.out.println("<<<<---Deletion From Anywhere From List--->>>>>");
			//Thread.currentThread().sleep(5000);
			list.deleteMidNode(2);
			list.printList();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
