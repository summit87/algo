package com.mypractice.org.LinkedListProgramm;

import java.io.File;
import java.util.Scanner;

public class LinkedListImpl {

	/**
	 * @param args
	 */

	LinkListNode listNode;
	LinkListNode circularListNode;
	LinkListNode listNode1;
	LinkListNode listNode2;
	LinkListNode interSectionList;
	LinkListNode te;
	LinkListNode m2;
	int size = 0;

	public static void main(String[] args) {
		// 
		try {
			LinkedListImpl l = new LinkedListImpl();
			Scanner sc = new Scanner(new File("linkList.txt"));
			String[] a = sc.next().split("->");
			for (String s : a) {
				l.insertNode(Integer.parseInt(s));
				// l.createHalfLoopList(Integer.parseInt(s));
			}
			// l.deleteNode(11);
			// l.print();
			sc.close();
			a = null;
			sc = new Scanner(new File("linkList1.txt"));
			a = sc.next().split("->");
			for (String s : a) {
				l.insertNode1(Integer.parseInt(s));
			}
			l.print();
			// l.print1();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/** Delete These two Method */

	private void inserIntoHead1(int nodeVal) {
		try {
			LinkListNode tempNode = listNode1;
			LinkListNode tempNode1 = new LinkListNode(nodeVal, null);
			tempNode1.setNextLink(tempNode);
			tempNode = tempNode1;
			listNode1 = tempNode;
			// size++;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void insertNode1(int nodeVal) {
		try {
			LinkListNode ln = new LinkListNode(nodeVal, null);
			if (listNode1 == null) {
				ln.setNextLink(listNode1);
				listNode1 = ln;
				// size++;
			} else {
				LinkListNode tempLn = listNode1;
				while (tempLn.getNextLink() != null) {
					tempLn = tempLn.getNextLink();
				}
				tempLn.setNextLink(ln);
				// size++;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void insertNode2(int nodeVal) {
		try {
			LinkListNode ln = new LinkListNode(nodeVal, null);
			if (listNode2 == null) {
				ln.setNextLink(listNode2);
				listNode2 = ln;
				// size++;
			} else {
				LinkListNode tempLn = listNode2;
				while (tempLn.getNextLink() != null) {
					tempLn = tempLn.getNextLink();
				}
				tempLn.setNextLink(ln);
				// size++;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void inserIntoHead(int nodeVal) {
		try {
			LinkListNode tempNode = listNode;
			LinkListNode tempNode1 = new LinkListNode(nodeVal, null);
			tempNode1.setNextLink(tempNode);
			tempNode = tempNode1;
			listNode = tempNode;
			size++;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void insertNode(int nodeVal) {
		try {
			LinkListNode ln = new LinkListNode(nodeVal, null);
			if (listNode == null) {
				ln.setNextLink(listNode);
				listNode = ln;
				size++;
			} else {
				LinkListNode tempLn = listNode;
				while (tempLn.getNextLink() != null) {
					tempLn = tempLn.getNextLink();
				}
				tempLn.setNextLink(ln);
				size++;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void insertNodeForIntersection(int nodeVal) {
		try {
			LinkListNode ln = new LinkListNode(nodeVal, null);
			if (interSectionList == null) {
				ln.setNextLink(interSectionList);
				interSectionList = ln;
				size++;
			} else {
				LinkListNode tempLn = interSectionList;
				while (tempLn.getNextLink() != null) {
					tempLn = tempLn.getNextLink();
				}
				tempLn.setNextLink(ln);
				size++;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void insertNodeAfterAnyNode(int nodeIndex, int nodeVal) {
		try {
			LinkListNode newNode = new LinkListNode(nodeVal, null);
			LinkListNode tempNode = listNode;
			while (tempNode != null) {
				if (tempNode.getNodeData() == nodeIndex) {
					newNode.setNextLink(tempNode.getNextLink());
					tempNode.setNextLink(newNode);
					size++;
				}
				tempNode = tempNode.getNextLink();
			}

			/*
			 * This commented code will work when u will enter node index
			 * inplace of node value In above code nodeIndex will take nodeValue
			 * 
			 * LinkListNode l1 = this.getNode(nodeIndex); LinkListNode newNode =
			 * new LinkListNode(nodeVal,null);
			 * newNode.setNextLink(l1.getNextLink()); l1.setNextLink(newNode);
			 * 
			 */

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private LinkListNode deleteNextNodeOfMaxNode(LinkListNode listNode) {
		try {
			LinkListNode tempNode = listNode;
			LinkListNode reverseList = null;
			LinkListNode tempNode1 = tempNode;
			while (tempNode1 != null) {
				tempNode1 = tempNode.getNextLink();
				tempNode.setNextLink(reverseList);
				reverseList = tempNode;
				tempNode = tempNode1;
			}
			LinkListNode reverNode = reverseList;
			LinkListNode reverNode1 = reverNode;
			while (reverNode1 != null && reverNode1.getNextLink() != null) {
				if (reverNode1 != null) {
					if (reverNode1.getNodeData() > reverNode1.getNextLink()
							.getNodeData()) {
						LinkListNode reveNode = reverNode1.getNextLink()
								.getNextLink();
						reverNode1.setNextLink(reverNode1.getNextLink()
								.getNextLink());
						reveNode = null;
					}
					/*
					 * Why this else is required --> suppose above if condition
					 * is not true then any how we want move our pointer one
					 * step frwd so for that we want else condition for movinf
					 * our pointer one step frwd
					 * 
					 */
					else {
						reverNode1 = reverNode1.getNextLink();
					}
				}
			}
			LinkListNode reverseList1 = null;
			LinkListNode reverseList_1 = reverNode;
			while (reverseList_1 != null) {
				reverseList_1 = reverNode.getNextLink();
				reverNode.setNextLink(reverseList1);
				reverseList1 = reverNode;
				reverNode = reverseList_1;
			}
			return reverseList1;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	private boolean idealLinkdList(LinkListNode listNode, LinkListNode listNode1) {
		try {
			return ((listNode == null && listNode1 == null) || ((listNode
					.getNodeData() == listNode1.getNodeData()) && idealLinkdList(
					listNode.getNextLink(), listNode1.getNextLink())));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	private LinkListNode deleteNextNodeOfMaxNode_usingDoubleLoop(
			LinkListNode listNode) {
		try {
			LinkListNode tempNode = listNode;
			LinkListNode tempNode1 = null;
			LinkListNode tempNode11 = tempNode;
			LinkListNode tempNode_1 = tempNode11;
			while (tempNode11 != null && tempNode11.getNextLink() != null) {
				if (tempNode11.getNodeData() < tempNode11.getNextLink()
						.getNodeData()) {

					LinkListNode temp = tempNode11.getNextLink();
					System.out.println(temp.getNodeData());
					tempNode11.setNextLink(temp.getNextLink());
					tempNode11 = temp;
					// tempNode11=null;
					temp = null;
				} else {
					tempNode11 = tempNode11.getNextLink();
				}
			}
			return tempNode_1;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	private void deleteNode(int deletedNodeVal) {
		try {
			/*
			 * Here if part will delete the head node from linkedList and else
			 * part will delete the node from mid as well as from end of the
			 * linkedList
			 * 
			 * NOTE :
			 * 
			 * if we want delete node by some index e.g we want delete the node
			 * which is at index n then simply get the node(e.g suppose u got
			 * some node called 'ptr') at that index by calling
			 * getNode(indexNumber) method (just billow deleteNode(int
			 * deletedNodeVal) method) and then in place of "deletedNodeVal" put
			 * the value of ptr.getNodeData(). now u can delete node at that
			 * index... final code : LinkListNode tempNode2
			 * =this.getNode(deletedNodeVal);
			 * 
			 */

			LinkListNode tempNode = listNode;
			LinkListNode tempNode1 = listNode;
			if (tempNode.getNodeData() == deletedNodeVal) {
				listNode = listNode.getNextLink();
				tempNode = null;
				size--;
			} else {
				while (tempNode != null) {
					if (tempNode.getNextLink().getNodeData() == deletedNodeVal) {
						// tempNode1 = tempNode.getNextLink();
						tempNode.setNextLink(tempNode.getNextLink()
								.getNextLink());
						tempNode = null;
						size--;
						break;
					}
					tempNode = tempNode.getNextLink();
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private LinkListNode unionOfLinkList(LinkListNode listNode,
			LinkListNode listNode1) {
		try {

			LinkListNode re = null;
			LinkListNode tempNode = listNode;

			while (tempNode != null) {
				this.insertNodeForIntersection(tempNode.getNodeData());
				tempNode = tempNode.getNextLink();
			}
			LinkListNode node = interSectionList;
			LinkListNode node1 = node;
			re = listNode1;
			LinkListNode re1 = re;
			while (re1 != null) {
				if (!this.isNodePresent(node1, re1.getNodeData())) {
					this.insertNodeForIntersection(re1.getNodeData());
				}
				re1 = re1.getNextLink();
			}
			return node;

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	private boolean isNodePresent(LinkListNode listNode, int nodeVal) {
		try {
			LinkListNode ll = listNode;
			while (ll != null) {
				if (ll.getNodeData() == nodeVal) {
					return true;
				}
				ll = ll.getNextLink();
				return false;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	private LinkListNode intersectionList(LinkListNode listNode,
			LinkListNode listNode1) {
		try {
			LinkListNode tempNode = listNode;
			while (tempNode != null) {
				LinkListNode tempNode1 = listNode1;
				while (tempNode1 != null) {
					if (tempNode.getNodeData() == tempNode1.getNodeData()) {
						this.insertNodeForIntersection(tempNode.getNodeData());
					}
					tempNode1 = tempNode1.getNextLink();
				}
				tempNode = tempNode.getNextLink();
			}
			return interSectionList;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	private void createHalfLoopList(int nodeVal) {
		try {
			LinkListNode temp = new LinkListNode(nodeVal, null);
			boolean flag = false;
			if (nodeVal == 11) {
				flag = true;
			}
			if (circularListNode == null) {
				circularListNode = temp;
			} else {
				LinkListNode temp1 = circularListNode;
				while (temp1.getNextLink() != null) {
					temp1 = temp1.getNextLink();
				}
				temp1.setNextLink(temp);
				if (size == 4) {
					te = temp1;
				}
				if (flag == true) {
					temp.setNextLink(te);
				}
				size++;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private boolean detectCycleInLinkList(LinkListNode circularListNode) {
		try {
			int f = 0;
			int s = 0;
			LinkListNode slowPointer = circularListNode;
			LinkListNode fastPointer = circularListNode;
			LinkListNode slowPointer1 = slowPointer;
			boolean flag = false;
			int k = 0;
			while (true) {
				if (slowPointer == null && fastPointer == null) {
					flag = true;
					break;
				}
				fastPointer = fastPointer.getNextLink();
				if (fastPointer.getNextLink() != null || fastPointer != null) {
					fastPointer = fastPointer.getNextLink();
					f++;
				}
				slowPointer = slowPointer.getNextLink();
				if (slowPointer != null) {
					s++;
				}
				if (fastPointer == slowPointer) {
					System.out.println("Loop Exist at Node-->"
							+ slowPointer.getNodeData() + " |||| "
							+ fastPointer.getNodeData() + " > > > " + s
							+ "  < < " + f + " : : " + k);
					/*----------Algo for finding starting point in the loop of link list---------
					 * 
					 *   when both pointer meet at some node e.g say X then, we will initialise slow pointer 
					 *   to the head of the original link list and fast pointer would be initialise from node X.
					 *   Then we will increment both pointer i.e slow pointer and fast pointer. and suppose they 
					 *   again meet at some node say Y the that node (Y) will be initial node of the loop in the link list 
					 *    
					 */
					/**
					 * ******************************** CODE FOR GETTING INITIAL
					 * NODE IN THE LLOP***************************
					 */
					LinkListNode ll = null;
					slowPointer = circularListNode;
					while (slowPointer != fastPointer) {
						slowPointer = slowPointer.getNextLink();
						fastPointer = fastPointer.getNextLink();
					}
					/** *****************************************************FINISH***************************************** */
					/**
					 * *****************************************************CODE
					 * FOR REMOVING THE LOOOP*********************
					 */
					ll = fastPointer.getNextLink();
					while (ll.getNextLink() != slowPointer) {
						ll = ll.getNextLink();
					}
					ll.setNextLink(null);
					while (slowPointer1 != null) {
						System.out.print(slowPointer1.getNodeData() + "--->");
						slowPointer1 = slowPointer1.getNextLink();
					}
					/** *****************************************************FINISH***************************************** */
					System.out.println();
					System.out.println("Starting Node of the loop -->"
							+ slowPointer.getNodeData() + " |||| "
							+ fastPointer.getNodeData() + " > > > " + s
							+ "  < < " + f + " : : " + k + " :-) "
							+ ll.getNodeData());
					flag = true;
					break;
				}
				k++;
			}
			return flag;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	/*
	 * 
	 * Given a linked list, reverse alternate nodes and append at the end By
	 * Using Spliting of alternate node of link list and then reversing 2nd
	 * splited link list and then add first node from the head of the 2nd
	 * reversed list
	 * 
	 */
	private LinkListNode reverseAlternateNodeAndAppendAtTheEnd1(
			LinkListNode listNode) {
		try {
			LinkListNode tempNode = listNode;
			LinkListNode tempNode1 = listNode.getNextLink();
			LinkListNode temp = tempNode;
			LinkListNode temp1 = tempNode1;
			LinkListNode temp_1 = temp;
			while (tempNode != null && tempNode.getNextLink() != null) {
				tempNode.setNextLink(tempNode.getNextLink().getNextLink());
				if (tempNode1 != null && tempNode1.getNextLink() != null) {
					tempNode1
							.setNextLink(tempNode1.getNextLink().getNextLink());
					tempNode1 = tempNode1.getNextLink();
				}
				tempNode = tempNode.getNextLink();
			}
			while (temp.getNextLink() != null) {
				temp = temp.getNextLink();
			}
			LinkListNode ll = temp1.getNextLink();
			LinkListNode ll2 = null;
			while (ll != null) {
				ll = temp1.getNextLink();
				temp1.setNextLink(ll2);
				ll2 = temp1;
				temp1 = ll;
			}
			temp.setNextLink(ll2);
			return temp_1;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	/*
	 * Given a linked list, reverse alternate nodes and append at the end By
	 * Using geeksforgeeks algo
	 * 
	 */

	private LinkListNode reverseAlternateNodeAndAppendAtTheEnd(
			LinkListNode listNode) {
		try {
			LinkListNode tempNode = listNode;
			LinkListNode tempNode1 = tempNode.getNextLink();
			if (tempNode != null && tempNode.getNextLink() != null
					&& tempNode.getNextLink().getNextLink() != null) {
				tempNode.setNextLink(tempNode.getNextLink().getNextLink());
			}
			tempNode = tempNode.getNextLink();
			tempNode1.setNextLink(null);
			while (tempNode != null && tempNode.getNextLink() != null) {
				LinkListNode temp = tempNode.getNextLink().getNextLink();
				tempNode.getNextLink().setNextLink(tempNode1);
				tempNode1 = tempNode.getNextLink();
				tempNode.setNextLink(temp);
				if (temp != null) {
					tempNode = temp;
				}
			}
			tempNode.setNextLink(tempNode1);
			return listNode;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	private LinkListNode insertLastNodeIntoHead(LinkListNode listNode) {
		try {
			LinkListNode tempNode = listNode;
			LinkListNode temp = null;
			while (tempNode.getNextLink() != null) {
				temp = tempNode;
				tempNode = tempNode.getNextLink();
			}
			temp.setNextLink(null);
			tempNode.setNextLink(listNode);
			listNode = tempNode;
			return tempNode;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	// try this method again... We cant traverse back in singly link list so
	// that operation is not possible;

	private void deleteNBodeFromEndOfTheLinkList(LinkListNode listNode) {
		try {
			int count = 8;
			LinkListNode tempNode1 = listNode;
			LinkListNode tempNode = listNode;
			LinkListNode temp2 = tempNode1;
			LinkListNode temp1 = temp2;
			while (count >= 0) {
				temp1 = temp2;
				LinkListNode temp3 = temp2;
				LinkListNode delTempNode = null;
				while (temp2 != null) {
					delTempNode = temp2;
					System.out.print(temp2.getNodeData() + "-v->");
					temp2 = temp2.getNextLink();
				}
				System.out.println();
				System.out.print(delTempNode.getNodeData() + "-d->");
				System.out.println();
				delTempNode = null;
				count--;
				temp2 = temp3;
				// tempNode=temp2;
				// System.out.println(temp2.getNodeData());
			}
			// while()
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private LinkListNode deleteNodeNthNodeAfterMthNodeAlternatively(
			LinkListNode listNode, int mTh, int nTh) {
		try {
			LinkListNode tempNode = listNode;
			LinkListNode tempNode1 = null;
			LinkListNode tempNode11 = tempNode;
			int count = 0;
			while (tempNode != null) {
				count = 0;
				while (tempNode != null && count < mTh) {
					tempNode = tempNode.getNextLink();
					count++;
				}

				if (tempNode == null) {
					return listNode;
				}
				//

				tempNode1 = tempNode.getNextLink();

				int count1 = 0;
				while (tempNode1 != null && count1 < nTh) {
					LinkListNode temp = tempNode1;
					tempNode1 = tempNode1.getNextLink();
					temp = null;
					count1++;
				}
				tempNode.setNextLink(tempNode1);
				// tempNode=tempNode1;

				// ;
			}

			// tempNode2=tempNode;
			return tempNode11;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	/* This method will return the node from the beggning of the index n */

	private LinkListNode getNode(int nodeIndex) {
		try {
			/*
			 * This code will usefull when we r using to pointer for finding nth
			 * node from end ALGO : Initially both pointer Node (i.e indexNode1
			 * and indexNode2) will point the head node (i.e listNode).
			 * indexNode1 pointer will not move until nodeIndex-count<0 when
			 * above condition will satisfied, then both pointer move together
			 * when indexNode2 will reach to end then indexPointer1 will point
			 * to nth node from end.... for more clarification dry run in ur
			 * paper..
			 * 
			 * LinkListNode indexNode1=listNode; LinkListNode indexNode2=null;
			 * int count =0; for(indexNode2=listNode;indexNode2!=null;) {
			 * count++; if(nodeIndex-count<0) {
			 * indexNode1=indexNode1.getNextLink(); }
			 * indexNode2=indexNode2.getNextLink(); }
			 * 
			 * 
			 * 
			 * If we want find the node from end of the linkedList then we can
			 * find the node from beggning By using this formula :
			 * nodeIndex=size-nodeIndex;
			 * 
			 */
			LinkListNode indexNode1 = listNode;
			if (nodeIndex <= size) {
				for (int i = 0; i < nodeIndex; i++) {
					indexNode1 = indexNode1.getNextLink();
				}
			}
			return indexNode1;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	/* Add two link list when every node has a single digit */

	private LinkListNode addTwoLinkedListNumber(LinkListNode listNode,
			LinkListNode listNode1) {
		try {
			LinkListNode tempNode = listNode;
			LinkListNode tempNode1 = listNode1;
			int sum = 0;
			int carry = 0;
			int carry1 = 0;
			int x = 0;
			while (tempNode != null || tempNode1 != null) {
				if (tempNode == null) {
					sum = 0 + (tempNode1.getNodeData());
					tempNode1 = tempNode1.getNextLink();
				} else if (tempNode1 == null) {
					sum = (tempNode.getNodeData()) + 0;
					tempNode = tempNode.getNextLink();
				} else {
					sum = (tempNode.getNodeData()) + (tempNode1.getNodeData());
					tempNode = tempNode.getNextLink();
					tempNode1 = tempNode1.getNextLink();
				}
				sum = sum + carry;
				carry = sum / 10;
				carry1 = sum % 10;
				this.insertNode2(carry1);
			}

			return listNode2;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	/*
	 * 3-->13-->14-->21-->22-->23-->15 firstList-->3-->14-->22-->15
	 * secondList-->13-->21-->23
	 */

	private void splitAlternatNodeInList(LinkListNode listNode) {
		try {
			LinkListNode tempNode = listNode;
			LinkListNode temp = listNode.getNextLink();
			LinkListNode a1;
			LinkListNode a = tempNode;
			LinkListNode b1;
			LinkListNode b = temp;
			// System.out.println(b.getNodeData()+" > "+a.getNodeData());
			a1 = a;
			b1 = b;
			while (tempNode != null && tempNode.getNextLink() != null) {
				int i = 0;
				if (i == 0) {
					a.setNextLink(tempNode.getNextLink().getNextLink());
					a = a.getNextLink();
					tempNode = tempNode.getNextLink();
					i++;
				}
				if (i == 1) {
					if (temp != null && temp.getNextLink() != null) {
						b.setNextLink(temp.getNextLink().getNextLink());
						b = b.getNextLink();
						temp = temp.getNextLink();
					}

				}
			}

			/*
			 * This logic also work put the complete code inside the loop
			 * 
			 * tempNode.setNextLink(tempNode.getNextLink().getNextLink());
			 * if(temp!=null&&temp.getNextLink()!=null) {
			 * temp.setNextLink(temp.getNextLink().getNextLink());
			 * temp=temp.getNextLink(); } tempNode=tempNode.getNextLink();
			 */

			this.setFirstSplit(a1);
			this.setSecondSplit(b1);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private LinkListNode recursiveApproacForMergingTwoSortedList(
			LinkListNode listNode, LinkListNode listNode1) {
		try {
			LinkListNode result = null;
			if (listNode == null) {
				return listNode1;
			}
			if (listNode1 == null) {
				return listNode;
			}
			if (listNode.getNodeData() < listNode1.getNodeData()) {
				result = listNode;
				result.setNextLink(recursiveApproacForMergingTwoSortedList(
						listNode.getNextLink(), listNode1));
			} else if (listNode.getNodeData() > listNode1.getNodeData()) {
				result = listNode1;
				result.setNextLink(recursiveApproacForMergingTwoSortedList(
						listNode, listNode1.getNextLink()));
			}
			/* Handling for duplicate element from two sorted linkedList */
			else if (listNode.getNodeData() == listNode1.getNodeData()) {
				result = listNode;
				result.setNextLink(recursiveApproacForMergingTwoSortedList(
						listNode.getNextLink(), listNode1.getNextLink()));
			}
			return result;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	private LinkListNode mergSort(LinkListNode merge) {
		try {
			LinkListNode me = merge;
			LinkListNode firstDevi = null;
			LinkListNode secondDevi = null;
			if (me == null || me.getNextLink() == null) {
				return me;
			}
			listDevision(me, firstDevi, secondDevi);
			firstDevi = this.getFirstDev();
			secondDevi = this.getSecondDev();
			mergSort(firstDevi);
			mergSort(secondDevi);
			merge = this.recursiveApproacForMergingTwoSortedList(firstDevi,
					secondDevi);
			return merge;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	private LinkListNode firstSplit;
	private LinkListNode secondSplit;

	private LinkListNode firstDev;
	private LinkListNode secondDev;

	public LinkListNode getFirstDev() {
		return firstDev;
	}

	public void setFirstDev(LinkListNode firstDev) {
		this.firstDev = firstDev;
	}

	public LinkListNode getSecondDev() {
		return secondDev;
	}

	public void setSecondDev(LinkListNode secondDev) {
		this.secondDev = secondDev;
	}

	private void listDevision(LinkListNode listNode, LinkListNode firstDevi,
			LinkListNode secondDevi) {
		try {
			LinkListNode slow;
			LinkListNode fast;
			if (listNode == null || listNode.getNextLink() == null) {
				firstDevi = listNode;
				secondDevi = null;
			} else {
				slow = listNode;
				fast = listNode.getNextLink();
				while (fast != null) {
					fast = fast.getNextLink();
					if (fast != null) {
						fast = fast.getNextLink();
						slow = slow.getNextLink();
					}
				}
				firstDevi = listNode;
				secondDevi = slow.getNextLink();
				slow.setNextLink(null);

				this.setFirstDev(firstDevi);
				this.setSecondDev(secondDevi);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// Try this program again... It includes In-place algoritham

	private LinkListNode mergeTwoSortedLinkListNode(LinkListNode listNode,
			LinkListNode listNode1) {
		try {
			LinkListNode tempListNode = listNode;
			LinkListNode tempListNode1 = listNode1;
			LinkListNode mergerList1;
			LinkListNode mergerList;

			// These two condition handling IN-PLACE ALGO for link list
			/**
			 * *****************************************************IMPORTANT
			 * CONCEPT--> IN-PLACE ALGO IN LINKED LIST************
			 */
			if (tempListNode.getNodeData() > tempListNode1.getNodeData()) {
				mergerList1 = tempListNode1;
				mergerList = mergerList1;
				tempListNode1 = tempListNode1.getNextLink();
				// tempListNode = tempListNode.getNextLink();
			} else {
				mergerList1 = tempListNode;
				mergerList = mergerList1;
				tempListNode = tempListNode.getNextLink();
				// tempListNode1 = tempListNode1.getNextLink();

			}
			/** ****************************************************************************************************************** */
			while (true) {
				if (tempListNode.getNodeData() < tempListNode1.getNodeData()) {
					mergerList.setNextLink(tempListNode);
					tempListNode = tempListNode.getNextLink();
					mergerList = mergerList.getNextLink();
				} else if (tempListNode.getNodeData() > tempListNode1
						.getNodeData()) {
					mergerList.setNextLink(tempListNode1);
					tempListNode1 = tempListNode1.getNextLink();
					mergerList = mergerList.getNextLink();
				}

				/*
				 * This else condition handling duplication in sorted list if u
				 * will remove this condition and duplicate element exist then
				 * loop will go to infinite becz that loop(initial while loop)
				 * will try to find condition for equals data which is not here
				 * so it will go infinite
				 * 
				 */
				else if (tempListNode.getNodeData() == tempListNode1
						.getNodeData()) {

					mergerList.setNextLink(tempListNode);
					tempListNode = tempListNode.getNextLink();
					tempListNode1 = tempListNode1.getNextLink();
					mergerList = mergerList.getNextLink();
				}

				if (tempListNode == null) {
					while (tempListNode1 != null) {
						mergerList.setNextLink(tempListNode1);
						tempListNode1 = tempListNode1.getNextLink();
						mergerList = mergerList.getNextLink();
					}
					break;
				} else if (tempListNode1 == null) {
					while (tempListNode != null) {
						mergerList.setNextLink(tempListNode);
						tempListNode = tempListNode.getNextLink();
						mergerList = mergerList.getNextLink();
					}
					break;
				}
			}

			return mergerList1;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	//  

	private LinkListNode mergeAlternateNode(LinkListNode listNode,
			LinkListNode listNode1) {
		try {
			LinkListNode tempNode = listNode;
			LinkListNode tempNode1 = listNode1;

			LinkListNode tempNode_1 = null;
			LinkListNode tempNode1_1 = null;

			while (tempNode != null && tempNode1 != null) {
				tempNode_1 = tempNode.getNextLink();
				tempNode1_1 = tempNode1.getNextLink();
				tempNode.setNextLink(tempNode1);
				tempNode1.setNextLink(tempNode_1);
				tempNode = tempNode_1;
				tempNode1 = tempNode1_1;
			}
			// System.out.println(tempNode_1.getNodeData()+" >
			// "+tempNode1_1.getNodeData());
			tempNode = listNode;
			/*
			 * 
			 * from this line we r assuming our list size is not equal i.e any
			 * list can terminate first, even this logic will work if list have
			 * equal size... :) and also we can not put || operator in place of &&
			 * operator in above loop
			 * 
			 */

			/** **************************************************************** */
			LinkListNode temp = tempNode;
			LinkListNode temp1 = temp;
			while (temp.getNextLink() != null) {
				temp = temp.getNextLink();
			}
			temp.setNextLink(tempNode1_1);
			tempNode1_1 = temp1;
			/** **************************************************************** */
			return tempNode1_1;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	private LinkListNode rotateLinkdList(LinkListNode listNode, int kTh) {
		try {
			LinkListNode tempNode = listNode;
			int count = 0;
			while (count < kTh - 1 && tempNode != null) {
				tempNode = tempNode.getNextLink();
				count++;
			}
			LinkListNode tempNode1 = tempNode;
			while (tempNode.getNextLink() != null) {
				tempNode = tempNode.getNextLink();
			}
			tempNode.setNextLink(listNode);

			/*
			 * NOTE--->Here we shifting old head pointer to the end of kTh node .
			 * Other wise we can traverse till the kTh node by using original
			 * head pointer i.e listNode but problem is that , we are not able
			 * to return the list after kTh Node. for avoiding this we need to
			 * store kTh pointer; Here we did this in tempNode1 variable
			 */

			listNode = tempNode1.getNextLink();
			tempNode1.setNextLink(null);
			return listNode;

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	private void replaceOneNodeFromAnotherNode(int olderNodeValOrNodeIndex,
			int newNodeVal) {
		try {
			LinkListNode tempNode1 = listNode;
			int i = 0;
			while (tempNode1 != null) {
				i++;
				if (tempNode1.getNextLink().getNodeData() == olderNodeValOrNodeIndex) {
					tempNode1.getNextLink().setNodeData(newNodeVal);
					break;
				}
				tempNode1 = tempNode1.getNextLink();
			}
		} catch (Exception ex) {

		}
	}

	private LinkListNode reverserKthAlternateNodeUsingLoop(
			LinkListNode listNode, int k) {
		try {
			LinkListNode tempNode = listNode;
			LinkListNode temp = tempNode;
			LinkListNode ll = temp;
			LinkListNode ll1 = ll;
			while (tempNode != null) {
				temp = null;
				int count = 0;
				LinkListNode tempNode1 = tempNode;
				while (tempNode1 != null && count < k) {
					tempNode1 = tempNode.getNextLink();
					tempNode.setNextLink(temp);
					temp = tempNode;
					tempNode = tempNode1;
					count++;
				}
				tempNode = tempNode1;

				while (temp != null) {
					System.out.print(temp.getNodeData() + "-->");
					// ll.setNextLink(temp.getNextLink());
					// ll=temp;
					temp = temp.getNextLink();
					// ll=ll.getNextLink();
				}

			}
			return ll1;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	private LinkListNode reverseKthAlternateNode(LinkListNode listNode, int k) {
		try {
			LinkListNode current = listNode;
			LinkListNode next = null;
			LinkListNode previous = null;
			int count = 0;
			while (current != null && count < 3) {
				next = current.getNextLink();
				current.setNextLink(previous);
				previous = current;
				current = next;
				count++;
			}
			if (listNode != null) {
				listNode.setNextLink(this.reverseKthAlternateNode(next, k));
			}

			return previous;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	private LinkListNode reverseInSomeSpecificPart(LinkListNode listNode,
			int nodeIndex) {
		try {
			LinkListNode tempNode = null;
			/*
			 * The two variable tempNode1 and tempNode11 have major role for
			 * this action tempNode1--> initially it pointing to the second node
			 * of the listNode. becz at the time of reversing the head will get
			 * to null so for avoiding this one we are using tempNode11 which is
			 * pointing to headNode; becz we have to take care for head node at
			 * the time of reversing some number of node. we can use tempNode1
			 * also problem is that we can miss head node also.
			 * 
			 * 
			 */

			LinkListNode tempNode1 = listNode.getNextLink();
			LinkListNode tempNode11 = listNode;
			int count = 1;
			/*
			 * This loop will reverse the linked list from 0 to nodeIndex and
			 * head of the reverse list will get store into tempNode after
			 * reversing the linkList to nodeIndex, the remaning linkList i.e
			 * from nodeIndex+1 to till the end of original linkList , the head
			 * of that linkList will get store in to tempNode1.
			 */
			while (count <= nodeIndex) {
				tempNode11 = tempNode11.getNextLink();
				count++;
			}
			count = 1;
			while (tempNode1 != null && count <= nodeIndex) {
				listNode.setNextLink(tempNode);
				tempNode = listNode;
				listNode = tempNode1;
				tempNode1 = tempNode1.getNextLink();
				count++;
			}
			LinkListNode ll = tempNode;
			/*
			 * This loop will go to end of reversed linkList and then end of
			 * this link part will connect with head part of the tempNode1 then
			 * ll1 which is denoting the head part of the tempNode, will get
			 * assign to temoNOde1...
			 */
			while (ll.getNextLink() != null) {
				ll = ll.getNextLink();
			}
			ll.setNextLink(tempNode11);
			tempNode11 = tempNode;
			tempNode = tempNode11;
			return tempNode;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	private LinkListNode reverseLinkListNode(LinkListNode listNode) {
		try {
			int i = 4;
			LinkListNode tempNode = null;
			LinkListNode tempNode1 = listNode.getNextLink();
			int count = 0;
			while (tempNode1 != null/* &&count<i */) // Here if u remove the
													// commented part then the
													// reversal of the node will
													// happen till the i'th from
													// the beggning of the List
			{
				listNode.setNextLink(tempNode);// Here we are making head node
												// as tail node so head node of
												// listNode is null becz
												// tempNode=null (initially)
				tempNode = listNode;
				listNode = tempNode1; // 
				tempNode1 = tempNode1.getNextLink();
				count++;
				// System.out.println();
			}
			while (tempNode1 != null) {
				tempNode1 = tempNode1.getNextLink();
			}

			listNode = tempNode;
			return listNode;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	private LinkListNode swapTwoDiffrentNodeFrom_Mth_and_Nth_Porsition(
			LinkListNode listNode, int node1Index, int node2Index) {
		try {
			LinkListNode tempNode = listNode;
			LinkListNode tempNode_pre = null;
			for (int i = 0; i < node1Index; i++) {
				tempNode_pre = tempNode;
				tempNode = tempNode.getNextLink();
			}

			LinkListNode tempNode1 = listNode;
			LinkListNode tempNode1_pre = null;

			for (int i = 0; i < (size - node2Index + 1) - 1; i++) {
				tempNode1_pre = tempNode1;
				tempNode1 = tempNode1.getNextLink();
			}

			tempNode_pre.setNextLink(tempNode1);
			tempNode1_pre.setNextLink(tempNode);
			LinkListNode temp = tempNode.getNextLink();
			tempNode.setNextLink(tempNode1.getNextLink());
			tempNode1.setNextLink(temp);
			tempNode1 = temp;
			return listNode;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	// This method will swap two different node by using Next or Address field
	// of the linked list;

	private LinkListNode swapTwoDiffrentNodeUsingNode_NextOrAddressField(
			LinkListNode listNode) {
		try {
			LinkListNode ll = listNode;
			LinkListNode temp1 = listNode.getNextLink();
			LinkListNode temp2 = temp1;
			boolean flag = true;
			while (flag) {
				LinkListNode ll1 = temp1.getNextLink();
				temp1.setNextLink(ll);
				if (ll1 == null || ll1.getNextLink() == null) {
					ll.setNextLink(ll1);
					flag = false;
					break;
				}
				ll.setNextLink(ll1.getNextLink());
				ll = ll1;
				temp1 = ll.getNextLink();

			}
			return temp2;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	// This method will swap two diffrent node by using data field of the linked
	// list;

	private LinkListNode swapTwoDiffrentNodeUsingNodeDataField(
			LinkListNode listNode) {
		try {
			LinkListNode ll = listNode;
			while (ll != null && ll.getNextLink() != null) {
				int temp = ll.getNodeData();
				ll.setNodeData(ll.getNextLink().getNodeData());
				ll.getNextLink().setNodeData(temp);
				ll = ll.getNextLink().getNextLink();
			}
			return listNode;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	/*
	 * This method will copy the complete link list if we remove the if body ,
	 * otherwise copy will be done before the nodeVal
	 * 
	 * 
	 * 
	 */
	private void printHalfNode(int nodeVal) {
		try {
			int i = 0;
			int j = 0;
			LinkListNode list = listNode;
			LinkListNode list2 = null;
			while (list.getNextLink() != null) {
				if (list.getNodeData() == nodeVal) {
					break;
				} else {
					LinkListNode ln = new LinkListNode(list.getNodeData(), null);
					if (list2 == null) {
						ln.setNextLink(list2);
						list2 = ln;
					} else {
						LinkListNode ln1 = list2;
						while (ln1.getNextLink() != null) {
							ln1 = ln1.getNextLink();
						}
						ln1.setNextLink(ln);
					}
				}
				list = list.getNextLink();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void print() {
		// if(this.detectCycleInLinkList(circularListNode))
		// {
		// System.out.println("Loop Exist");
		// }
		// else
		// {
		// System.out.println("Sooooooo....... Sorryyyyyyyyyyy.... ");
		// }
		// LinkListNode indexNode1=this.reverseInSomeSpecificPart(listNode,3);
		// LinkListNode indexNode1=this.reverseLinkListNode(listNode);
		// LinkListNode
		// indexNode1=this.reverserKthAlternateNodeUsingLoop(listNode,3);
		// LinkListNode
		// indexNode1=this.swapTwoDiffrentNodeFrom_Mth_and_Nth_Porsition(listNode,
		// 3,3);
		// LinkListNode
		// indexNode1=this.deleteNodeNthNodeAfterMthNodeAlternatively(listNode,2,2);
		// LinkListNode indexNode1=this.rotateLinkdList(listNode,4);
		// LinkListNode indexNode1=listNode;
		// LinkListNode
		// indexNode1=this.swapTwoDiffrentNodeUsingNodeDataField(listNode);
		// LinkListNode
		// indexNode1=this.swapTwoDiffrentNodeUsingNode_NextOrAddressField(listNode);
		// this.splitAlternatNodeInList(listNode);
		// LinkListNode indexNode1=this.unionOfLinkList(listNode,
		// listNode1);//(listNode,3); ;
		// this.idealLinkdList(listNode, listNode1);//(listNode,3); ;
		if (this.idealLinkdList(listNode, listNode1)) {
			System.out.println("Hi he is my bro");
		} else {
			System.out.println("FCUK");
		}
		// LinkListNode
		// indexNode1=this.deleteNextNodeOfMaxNode_usingDoubleLoop(listNode);//(listNode,3);
		// ;
		// while(indexNode1!=null)
		// {
		// System.out.print(indexNode1.getNodeData()+"-->");
		// indexNode1=indexNode1.getNextLink();
		// }
		// System.out.println();
		// this.deleteNBodeFromEndOfTheLinkList(listNode);

		// LinkListNode
		// indexNode=this.reverseAlternateNodeAndAppendAtTheEnd1(listNode);
		// LinkListNode indexNode=circularListNode;
		// int i=0;
		// // //LinkListNode indexNode1=this.reverseKthAlternateNode(listNode,
		// 3);//(listNode,3);
		// while(indexNode!=null)
		// {
		// if(indexNode.getNodeData()==5)
		// {
		// if(i>1)
		// {
		// break;
		// }
		// i++;
		//					
		// }
		// System.out.print(indexNode.getNodeData()+"-->");
		// indexNode=indexNode.getNextLink();
		// }
		// this.addTwoLinkedListNumber(listNode, listNode1);
		// System.out.println();
		//		
		// LinkListNode indexNode1=this.getSecondSplit();
		// //LinkListNode indexNode1=this.reverseKthAlternateNode(listNode,
		// 3);//(listNode,3);
		// while(indexNode1!=null)
		// {
		// System.out.print(indexNode1.getNodeData()+"-->");
		// indexNode1=indexNode1.getNextLink();
		// }
		// //this.addTwoLinkedListNumber(listNode, listNode1);
		// System.out.println();

	}

	private void print1() {
		LinkListNode indexNode1 = this.mergeAlternateNode(listNode, listNode1);
		// LinkListNode indexNode1=this.mergeTwoSortedLinkListNode(listNode,
		// listNode1);
		// LinkListNode
		// indexNode1=this.recursiveApproacForMergingTwoSortedList(listNode,
		// listNode1);
		System.out.println();
		while (indexNode1 != null) {
			System.out.print(indexNode1.getNodeData() + "-->");
			indexNode1 = indexNode1.getNextLink();
		}
		System.out.println();

	}

	public LinkListNode getFirstSplit() {
		return firstSplit;
	}

	public void setFirstSplit(LinkListNode firstSplit) {
		this.firstSplit = firstSplit;
	}

	public LinkListNode getSecondSplit() {
		return secondSplit;
	}

	public void setSecondSplit(LinkListNode secondSplit) {
		this.secondSplit = secondSplit;
	}
}