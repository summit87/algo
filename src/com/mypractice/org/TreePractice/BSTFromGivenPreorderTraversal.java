package com.mypractice.org.TreePractice;

public class BSTFromGivenPreorderTraversal {

    /**
     * @param args
     */
    static int ind=0;
    public static void main(String[] args) {
	
	
	try
	{
	    int[] a = {10, 5, 1, 7, 40, 50};
	    TreeOperation to = new TreeOperation();
	    int max=Integer.MAX_VALUE;
	    int min = Integer.MIN_VALUE;
	    BSTFromGivenPreorderTraversal bst = new BSTFromGivenPreorderTraversal();
	    TreeNode t1 = bst.createTree1(a,max,min,a[0]);
	    to.printInorderTree(t1);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private TreeNode createTree(int[] a,int low,int high)
    {
	try
	{
	    if(low>high||ind>=a.length)
	    {
		return null;
	    }
	    TreeNode t = new TreeNode(null,null,a[ind]);
	    ind=ind+1;
	    if(low==high)
	    {
		return t;
	    }
	    
	    int i=0;
	    for(i=low;i<=high;i++)
	    {
		if(a[i]>t.getNodeData())
		    break;
	    }
	    t.setLeftChildNode(createTree(a,low,i-1));
	    t.setRightChildNode(createTree(a,i, high));
	    return t;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    
    
    private TreeNode createTree1(int[] a,int max,int min,int key)
    {
	try
	{
	    if(min>=max||ind>=a.length)
	    {
		return null;
	    }
	    TreeNode tn = null;
	    if(key>min&&key<max)
	    {
		tn = new TreeNode(null,null,key);
		ind=ind+1;
		if(ind<a.length)
		{
		    tn.setLeftChildNode(createTree1(a,min,key,a[ind]));
		    tn.setRightChildNode(createTree1(a,key,max,a[ind]));
		}
	    }
	    return tn;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    
    
    
    
}
