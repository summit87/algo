package com.mypractice.org.TreePractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class TreeOperation {

    /**
     * @param args
     */
    
    TreeNode tree;
    TreeNode maxSumSubTree;
    public void addNodeValue(int data)
    {
	try
	{
	    TreeNode newTreeNode = new TreeNode(null,null,data,false);
	    if(tree==null)
	    {
		tree = newTreeNode;
	    }
	    else
	    {
		TreeNode currentTree = tree;
		TreeNode parent;
		while(true)
		{
		    parent=currentTree;
		    if(data<currentTree.getNodeData())
		    {
			currentTree = currentTree.getLeftChildNode();
			if(currentTree==null)
			{
			    parent.setLeftChildNode(newTreeNode);
			    newTreeNode.setParent(parent);
			    return;
			}
		    }
		    else
		    {
			currentTree = currentTree.getRightChildNode();
			if(currentTree==null)
			{
			    parent.setRightChildNode(newTreeNode);
			    newTreeNode.setParent(parent);
			    return;
			}
		    }
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    public void printInorderTree(TreeNode treeNode)
    {
	try
	{
	    if(treeNode!=null)
	    {
		printInorderTree(treeNode.getLeftChildNode());
		System.out.print(treeNode.getNodeData()+"-->");
		printInorderTree(treeNode.getRightChildNode());
	    }
	}
	catch(Exception ex)                                                  
	{
	    ex.printStackTrace();
	}
    }

    public void preOrderTree(TreeNode treeNode)
    {
	try
	{
	    if(treeNode!=null)
	    {
		System.out.print(treeNode.getNodeData()+"-->");
		preOrderTree(treeNode.getLeftChildNode());
		preOrderTree(treeNode.getRightChildNode());
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    public void postOrderTree(TreeNode treeNode)
    {
	try
	{
	    if(treeNode!=null)
	    {
		postOrderTree(treeNode.getLeftChildNode());
		postOrderTree(treeNode.getRightChildNode());
		System.out.print(treeNode.getNodeData()+"-->");
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    public TreeNode find(int val)
    {
	try
	{
	    TreeNode currentTree = tree;
	    while(currentTree.getNodeData()!=val)
	    {
		if(val<currentTree.getNodeData())
		{
		    currentTree = currentTree.getLeftChildNode();
		}
		else if(val>currentTree.getNodeData())
		{
		    currentTree = currentTree.getRightChildNode();
		}
		else if(currentTree==null)
		{
		    return null;
		}
	    }
	    return currentTree;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    
    private TreeNode findMin(TreeNode tree)
    {
	try
	{
	    while(tree.getLeftChildNode()!=null)
	    {
		 tree = tree.getLeftChildNode();
	    }
	    return tree;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    
    //Not Working check once;
    
    

    public void iterativeTreeTraversal(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    MyStackImpl st = new MyStackImpl();
	    boolean flag = true;
	    TreeNode current = tn;
	    while(flag)
	    {
		if(current!=null)
		{
		    st.pushIn(current);
		    current = current.getLeftChildNode();
		}
		else
		{
		    if(!st.isEmpty())
		    {
			System.out.print(st.popFromTop().getNodeData()+",");
			st.pushIn(current.getRightChildNode());
		    }
		    else
		    {
			flag=!flag;
		    }
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    // Height Of the tree using recursion
    
    
    public int getHeight(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return 0;
	    }
	    int lh = getHeight(tn.getLeftChildNode());
	    int rh = getHeight(tn.getRightChildNode());
	    if(lh>=rh)
	    {
		return (lh+1);
	    }
	    return (rh+1);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    //Height of the tree using iterative concept
    
    public int getHeight1(TreeNode tn)
    {
	try
	{
	    int h=0;
	    Queue<TreeNode> q= new LinkedList<TreeNode>();
	    q.add(tn);
	    while(true)
	    {
		int nodeSize = q.size();
		if(nodeSize==0)
		{
		    return h;
		}
		h++;
		while(nodeSize>0)
		{
		    TreeNode tn1 = q.peek();
		    q.poll();
		    if(tn1.getLeftChildNode()!=null)
		    {
			q.add(tn1.getLeftChildNode());
		    }
		    if(tn1.getRightChildNode()!=null)
		    {
			q.add(tn1.getRightChildNode());
		    }
		    nodeSize--;
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    /*Sibling means both node belongs to same parent but in case of cousin node 
    should not be sibling thats why here we r returning false */
    public boolean isSibling(TreeNode root,TreeNode node1,TreeNode node2)
    {
	try
	{
	    if(root==null)
	    {
		return false;
	    }
	    return ((root.getLeftChildNode()==node1&&root.getRightChildNode()==node2)
		    ||(root.getLeftChildNode()==node2&&root.getRightChildNode()==node1)
		    || isSibling(root.getLeftChildNode(), node1, node2)
		    ||isSibling(root.getRightChildNode(), node1, node2)); 
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    public int level(TreeNode root,TreeNode node1,int lev)
    {
	try
	{
	    if(root==null)
	    {
		return 0;
	    }
	    if(root==node1)
	    {
		return lev;
	    }
	    int l = level(root.getLeftChildNode(), node1, lev+1);
	    if(l!=0)
	    {
		return l;
	    }
	    return level(root.getRightChildNode(), node1, lev+1);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    public boolean isCousin(TreeNode root,TreeNode node1,TreeNode node2)
    {
	try
	{
	    if(level(root, node1,1)==level(root, node2,1)&&!isSibling(root, node1, node2))
	    {
		return true;
	    }
	    return false;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    /*For finding subTree We need to traverse in pre Order Manner in orginal tree i.e root,left and then right
     * like that we are calling recusrcive function i.e isIdentical*/
    
    public boolean isIdentical(TreeNode root,TreeNode subTree)
    {
	try
	{
	    if(root==null&&subTree==null)
	    {
		return true;
	    }
	    if(root==null||subTree==null)
	    {
		return false;
	    }
	    /*This is the pre order traversal of original tree*/
	    return (root.getNodeData()==subTree.getNodeData()
		    &&isIdentical(root.getLeftChildNode(), subTree)
		    &&isIdentical(root.getRightChildNode(), subTree));
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    public boolean isSubTree(TreeNode root,TreeNode subTree)
    {
	try
	{
	    if(subTree==null)
	    {
		return true;
	    }
	    if(root==null)
	    {
		return true;
	    }
	    if(isIdentical(root, subTree))
	    {
		return true;
	    }
	    return (isSubTree(root.getLeftChildNode(), subTree)
		    ||isSubTree(root.getRightChildNode(), subTree));
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    
    public boolean delete(int key)
    {
	try
	{
	    TreeNode parent = tree;
	    TreeNode current = tree;
	    boolean isLeftChild=true;
	    while(current.getNodeData()!=key) //2-->12-->23-->45-->123-->
	    {
		parent = current;
		
		if(key<current.getNodeData())
		{
		    System.out.println("Root > "+parent.getNodeData());
		    System.out.println("current > "+current.getNodeData());
		    isLeftChild = true;
		    current = current.getLeftChildNode();
		}
		else
		{
		    System.out.println("Root > "+parent.getNodeData());
		    System.out.println("current > "+current.getNodeData());
		    isLeftChild = false;
		    current = current.getRightChildNode();
		}
		if(current==null)
		{
		    return false;
		}
	    }
	    if(current.getLeftChildNode()==null&&current.getRightChildNode()==null)
	    {
		if(current==tree)
		{
		    tree=null;
		}
		else if(isLeftChild)
		{
		    parent.setLeftChildNode(null);
		}
		else
		{
		    parent.setRightChildNode(null);
		}
	    }
	    else if(current.getRightChildNode()==null)
	    {
		if(current==tree)
		{
		    tree=current.getLeftChildNode();
		}
		else if(isLeftChild)
		{
		    parent.setLeftChildNode(current.getLeftChildNode());
		}
		else
		{
		    parent.setRightChildNode(current.getLeftChildNode());
		}
	    }
	    else if(current.getLeftChildNode()==null)
	    {
		if(current==tree)
		{
		    tree=current.getRightChildNode();
		}
		else if(isLeftChild)
		{
		    parent.setLeftChildNode(current.getRightChildNode());
		}
		else
		{
		    parent.setRightChildNode(current.getRightChildNode());
		    
		}
	    }
	    else
	    {
		System.out.println("Current > "+current.getNodeData());
		TreeNode tn = getSuccessor(current);
		System.out.println("TN > "+tn.getNodeData());
		if(current==tree)
		{
		    tree=tn;
		}
		else if(isLeftChild)
		{
		    System.out.println("TN > "+parent.getNodeData());
		    parent.setLeftChildNode(tn);
		}
		else
		{
		    parent.setRightChildNode(tn);
		}
		tn.setLeftChildNode(current.getLeftChildNode());
		System.out.println("TN > "+tn.getLeftChildNode().getNodeData());
	    }
	    return true;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    private TreeNode getSuccessor(TreeNode delNode)
    {
	try
	{
	    TreeNode successorParent = delNode;
	    TreeNode successor = delNode;
	    TreeNode current = delNode.getRightChildNode();
	    while(current!=null)
	    {
		 System.out.println("successorParent > "+successorParent.getNodeData());
		 System.out.println("successor > "+successor.getNodeData());
		 System.out.println("current > "+current.getNodeData());
		successorParent=successor;
		successor = current;
		current = current.getLeftChildNode();
	    }
	    System.out.println("delNode > "+delNode.getRightChildNode().getNodeData());
	    System.out.println("successorParent >delNode "+successorParent.getNodeData());
		 System.out.println("successor >delNode "+successor.getNodeData());
	    if(successor!=delNode.getRightChildNode())
	    {
		successorParent.setLeftChildNode(successor.getRightChildNode());
		successor.setRightChildNode(delNode.getLeftChildNode());
	    }
	    return successor;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    
    /*Given a binary tree, print all root-to-leaf paths*/
    
    int m=0;
    public void printRootToLeaf(TreeNode tn,int[] path)
    {
	try
	{
	    
	    getLeafToNode(tn,0,path,Integer.MIN_VALUE,0);
	    System.out.println("Max Sum-->"+m);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    private void printLeafToNode(int[] node,int len)
    {
	try
	{
	    System.out.println("\n------------------------");
	    for(int i=0;i<len;i++)
	    {
		System.out.print(node[i]+",");
	    }
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    /*Here we are taking first left leaf and then right leaf for printing root to left modst leaf for every node*/
    
  
    
    private void getLeafToNode(TreeNode tn,int len,int[] path,int max,int m2)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    m2+=tn.getNodeData();
	    len++;
	    if(tn.getLeftChildNode()==null&&tn.getRightChildNode()==null)
	    {
		/*for printing sub tree which have highest max sum from root to leaf falow these steps
		 * 
		 *  create another global array of size len i.e create it above the class and initialise it inside the below
		 *  if condition and assign the path array to that vaiable after that u can print that global array 
		 * */
		if(max<=m2)
		{
		    max=m2;
		    m=max;
		    this.setMaxSumSubTree(tn);
		}
//		printLeafToNode(path,len);
//		len=0;
	    }
	    getLeafToNode(tn.getLeftChildNode(), len, path,max,m2);
	    getLeafToNode(tn.getRightChildNode(), len, path,max,m2);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    /*Find the maximum path sum between two leaves of a binary tree*/
    
    
    private int max(int a,int b)
    {
	try
	{
	    return a>b?a:b;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    public int getMaxSumBetweenTwoLeaf(TreeNode tn,int sum)
    {
	try
	{
	    if(tn==null)
	    {
		return -1;
	    }
	    int l = getMaxSumBetweenTwoLeaf(tn.getLeftChildNode(),m);
	    int r = getMaxSumBetweenTwoLeaf(tn.getRightChildNode(),m);
	    int x = tn.getNodeData();
	    if(x<0)
	    {
		x=0;
	    }
	    int currentSum = max(l+r+x,max(l, r));
	    if(currentSum>sum)
	    {
		m= currentSum;
	    }
	    return max(l, r)+x;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
	
    }
    
    
    /*Diameter of a Binary Tree*/
    int lh=0;
    int rh=0;
    int h=0;
    public int diameter(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return 0;
	    }
	    
	    int leftHight = getHeight(tn.getLeftChildNode());
	    int rightHight = getHeight(tn.getRightChildNode());
	    int leftTreeDiameter = diameter(tn.getLeftChildNode());
	    int rightTreeDiameter = diameter(tn.getRightChildNode());
	    return max((leftHight+rightHight+1),max(leftTreeDiameter, rightTreeDiameter));
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    /*Reverse alternate levels of a perfect binary tree*/
    
    int[] a = new int[6];
    int k=0;
    int l=0;
    private void reverseArray()
    {
	try
	{
	    int i=0;int j=a.length-1;
	    while(i<=j)
	    {
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;j--;
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    private void storingNodeByLevel(TreeNode tn,int le)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    storingNodeByLevel(tn.getLeftChildNode(),le+1);
	    if(le%2!=0)
	    {
		a[k] = tn.getNodeData();
		k++;
	    }
	    storingNodeByLevel(tn.getRightChildNode(), le+1);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    private void reverseNode(TreeNode tn,int len)
    {
	if(tn==null)
	{
	    return;
	}
	reverseNode(tn.getLeftChildNode(),len+1);
	if(len%2!=0&&l<6)
	{
	    tn.setNodeData(a[l]);
	    l++;
	}
	reverseNode(tn.getRightChildNode(), len+1);
    }
    
    
    public void reverseAlternateNode(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    storingNodeByLevel(tn,0);
	    reverseArray();
	    reverseNode(tn,1);
	    printInorderTree(tn);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    public void reverseNode(int lev)
    {
	if(tree==null)
	{
	    return;
	}
	reverseAlterNateNode(tree.getRightChildNode(),tree.getLeftChildNode(), lev);
    }
    
    
    private void reverseAlterNateNode(TreeNode tn,TreeNode tn1,int lev)
    {
	try
	{
	    if(tn1==null||tn==null)
	    {
		return;
	    }
	    reverseAlterNateNode(tn.getRightChildNode(), tn1.getLeftChildNode(), lev+1);
	    if(lev%2!=0)
	    {
		int temp=tn.getNodeData();
		tn.setNodeData(tn1.getNodeData());
		tn1.setNodeData(temp);
		reverseAlterNateNode(tn.getRightChildNode(), tn1.getLeftChildNode(), lev+1);
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    /*Transform a BST to greater sum tree*/
    
    int gSum=0;
    public void genrateSum()
    {
	try
	{
	    greaterSumOfTree(tree,gSum);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    public void greaterSumOfTree(TreeNode tn,int sum)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    greaterSumOfTree(tn.getRightChildNode(), sum);
	    sum+=tn.getNodeData();
	    tn.setNodeData((sum-tn.getNodeData()));
	    greaterSumOfTree(tn.getLeftChildNode(), sum);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    /*Print a Binary Tree in Vertical Order*/
    
    /* get the minimum and maximum horizontal distance with respect to root
     * A short algo :
     * For printing tree in vertical order.
     * 1. we need to find the min and max distance between vertical lines and the we have to
     * trverse each vertical line in a given level.. by using this concept we can print tree in vertical order
     *  
     * 
     * 
     * 
     */
    int hd=0;
    int minHd=0;
    int maxHd=0;
    private void finMinAndMaxDistance(TreeNode tn,int hd)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    if(hd<=minHd)
	    {
		minHd=hd;
	    }
	    if(hd>=maxHd)
	    {
		maxHd=hd;
	    }
	    finMinAndMaxDistance(tn.getLeftChildNode(),hd-1);
	    finMinAndMaxDistance(tn.getRightChildNode(), hd+1);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    private void printTreeInV(TreeNode tn,int lev,int hd)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    if(hd==lev)
	    {
		System.out.print(tn.getNodeData()+",");
	    }
	    
		printTreeInV(tn.getLeftChildNode(), lev, hd-1);
		printTreeInV(tn.getRightChildNode(), lev, hd+1);
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    public void printTreeInVerticalOrder(TreeNode tn)
    {
	try
	{
	    finMinAndMaxDistance(tn, hd);
	    System.out.println("Min > "+minHd+" > max > "+maxHd+" > "+hd);
	    for(int lev = minHd;lev<=maxHd;lev++)
	    {
		printTreeInV(tn, lev,0);
		System.out.println();
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    /*Level Order Tree Traversal*/
    
    
    /*For level order traversing we have to find hight of the tree so that we can put some boundation while traversing the tree
     * then we will travel the tree in level in a given hight we can achive this by using loop
     * we will start traversing the tree from hight 1 to final hight let say its nth hight*/
    
    
    private void printLevelOrder(TreeNode tn,int lev)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    if(lev==1)
	    {
		System.out.print(tn.getNodeData()+",");
	    }
	    else if(lev>1)
	    {
		/*If we want print the right view or left view only of the tree then we can comment according to view
		 * e.g if we want the right view then we can comment left traversal of the tree.. 
		 * 
		 * */
		printLevelOrder(tn.getLeftChildNode(), lev-1);
		printLevelOrder(tn.getRightChildNode(), lev-1);
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    int maxLev=0;
    private void printRightView(TreeNode tn,int max,int lev)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    if(maxLev<lev)
	    {
		maxLev = lev;
		System.out.print(tn.getNodeData()+",");
	    }
	    //printRightView(tn.getLeftChildNode(), max, lev+1);
	    printRightView(tn.getRightChildNode(), max, lev+1);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    public void printRight(TreeNode tn)
    {
	try
	{
	    printRightView(tn, maxLev,0);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    
    
    
    
    public void printLevTree(TreeNode tn)
    {
	try
	{
	    for(int lev=1;lev<=getHeight(tn);lev++)
	    {
		printLevelOrder(tn, lev);
		System.out.println();
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    public void printAllNodeFromAGivenDistance(TreeNode tn,TreeNode targetNode,int kth)
    {
	try
	{
	    printNodeFromKthDistanceIfAncesotryOfNodeExist(tn,targetNode,kth);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    /*This function will work when root node itself is the target node i.e 
     * it can be root node or root of the subtree
     * 
     * */
    private void printNodeFromKthDistance(TreeNode tn,int kth)
    {
	try
	{
	    if(tn==null||kth<0)
	    {
		return;
	    }
	    if(kth==0)
	    {
		System.out.print(tn.getNodeData()+"-->,");
	    }
	    printNodeFromKthDistance(tn.getLeftChildNode(), kth-1);
	    printNodeFromKthDistance(tn.getRightChildNode(), kth-1);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    /*This function will work when root node is not the target node i.e root may be subtree of the given tree
     * because some time we have to traverse towards the ancestor from root of the subtree is its target node
     *,for finding the node value in a given distance
     *
     * Note that the right child is 2 edges away from left child
     * 
     * 
     * */
    
    
    private int printNodeFromKthDistanceIfAncesotryOfNodeExist(TreeNode tn,TreeNode targetNode,int kth)
    {
	try
	{
	    if(tn==null)
	    {
		return -1;
	    }
	    if(tn==targetNode)
	    {
		//System.out.println("Printing..");
		printNodeFromKthDistance(targetNode,kth);
		return -1;
	    }
	    int dl = printNodeFromKthDistanceIfAncesotryOfNodeExist(tn.getLeftChildNode(),targetNode,kth);
	    if(dl>0)
	    {
		if(dl+1==kth)
		{
		    System.out.print(tn.getNodeData()+",");
		}
		else
		{
		    printNodeFromKthDistance(tn.getLeftChildNode(),kth-dl-2);
		}
		return dl+1;
	    }
	    
	    int dr = printNodeFromKthDistanceIfAncesotryOfNodeExist(tn.getRightChildNode(),targetNode,kth);
	    if(dr>0)
	    {
		if(dr+1==kth)
		{
		    System.out.print(tn.getNodeData()+",");
		}
		else
		{
		    printNodeFromKthDistance(tn.getRightChildNode(),kth-dr-2);
		}
		return dr+1;
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    /*This is the case when we are assuming both key are present in tree
     * 
     * if suppose any key from one of them is not in the tree for that we are handling in finNode() method
     * and by taking two boolean b1 and b2
     * 
     * */
    
    private TreeNode findLCA(TreeNode tn,int key1,int key2,boolean b1,boolean b2)
    {
	try
	{
	    if(tn==null)
	    {
		return null;
	    }
	    if(tn.getNodeData()==key1) 
	    {
		b1 = true;
		return tn;
	    }
	    if(tn.getNodeData()==key2)
	    {
		b2=true;
		return tn;
	    }
	    TreeNode lLCA = findLCA(tn.getLeftChildNode(), key1, key2,b1,b2);
	    TreeNode rLCA = findLCA(tn.getRightChildNode(), key1, key2,b1,b2);
	    
	    if(lLCA!=null&&rLCA!=null)
	    {
		return tn;
	    }
	    return lLCA!=null?lLCA:rLCA;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    
    
    private boolean findNode(TreeNode tn,int key)
    {
	try
	{
	    if(tn==null)
	    {
		return false;
	    }
	    if(tn.getNodeData()==key||findNode(tn.getLeftChildNode(),key)||findNode(tn.getRightChildNode(),key))
	    {
		return true;
	    }
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    public int findLCA1(TreeNode tn,int key1,int key2)
    {
	try
	{
	    boolean b1=false;
	    boolean b2=false;
	    TreeNode treeNode = findLCA(tn, key1, key2, b1, b2);
	    if(b1&&b2||findNode(tn,key1)||findNode(tn,key2))
	    {
		return treeNode.getNodeData();
	    }
	    return 0;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    
    
    
    
    
    public int getGSum() {
        return gSum;
    }


    public void setGSum(int sum) {
        gSum = sum;
    }


    public int getM() {
        return m;
    }


    public void setM(int m) {
        this.m = m;
    }


    public TreeNode getMaxSumSubTree() {
        return maxSumSubTree;
    }


    public void setMaxSumSubTree(TreeNode maxSumSubTree) {
        this.maxSumSubTree = maxSumSubTree;
    }


    public TreeNode getTree() {
        return tree;
    }


    public void setTree(TreeNode tree) {
        this.tree = tree;
    }
    
    
}
