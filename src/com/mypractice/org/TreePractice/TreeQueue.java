package com.mypractice.org.TreePractice;

public class TreeQueue {

    
    
    int front;
    int rear;
    public TreeQueue()
    {
	front=rear;
    }
    TreeNode[] tq = new TreeNode[10];
    public void enQueue(TreeNode tn)
    {
	  tq[rear] = tn;
	  rear++;
    }
    
    public TreeNode deQueue()
    {
	if(front==rear)
	{
	    return null;
	}
	TreeNode t = tq[front];
	front++;
	rear--;
	return t;
    }
    
    
    
    
    
    
    
}
