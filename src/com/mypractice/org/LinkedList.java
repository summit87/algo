package com.mypractice.org;

public class LinkedList {

	/**
	 * @param args
	 */
	
	MyLinkedList myLinkedList;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			LinkedList l = new LinkedList();
			l.insertNode(12);
			l.insertNode(13);
			l.insertNode(14);
			l.insertNode(15);
			l.print();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		

	}

	private void insertNode(int nextNodeVal)
	{
		try
		{
			
			if(myLinkedList==null)
			{
				myLinkedList= new MyLinkedList(nextNodeVal);
				myLinkedList.setNextLink(null);
			}
			else
			{
				MyLinkedList tempNOde = myLinkedList;
				
				while(tempNOde.getNextLink()!=null)
				{
					tempNOde = tempNOde.getNextLink();
				}
				MyLinkedList temp = new MyLinkedList(nextNodeVal);
				temp.setNextLink(null);
				tempNOde.setNextLink(temp);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	private void print()
	{
		//MyLinkedList l = myLinkedList;
		while(myLinkedList!=null)
		{
			//System.out.println("OIUOI");
			System.out.print(myLinkedList.getData()+"-->");
			myLinkedList = myLinkedList.getNextLink();
		}
	}
	
	
	
	
}
