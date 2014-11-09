package com.mypractice.org.TreePractice;

public class TreeFromInOrder {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	try
	{
	    int[] in = {5, 10, 40, 30, 28};
	    TreeFromInOrder tin = new TreeFromInOrder();
	    TreeOperation to = new TreeOperation();
	    TreeNode treeNode = tin.create(in,0,in.length-1);
	    to.printInorderTree(treeNode);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private TreeNode create(int[] in,int min,int max)
    {
	try
	{
	    if(min>max)
	    {
		return null;
	    }
	    int i=getMaxPoint(in, min, max);
	    TreeNode tn = new TreeNode(in[i]);
	    if(min==max)
	    {
		return tn;
	    }
	    tn.setLeftChildNode(create(in,min,i-1));
	    tn.setRightChildNode(create(in,i+1,max));
	    return tn;
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    private int getMaxPoint(int[] a,int min,int max)
    {
	try
	{
	    int max1=Integer.MIN_VALUE;
	    int i1=0;
	    for(int i=min;i<=max;i++)
	    {
		if(max1<a[i])
		{
		    max1=a[i];
		    i1=i;
		}
	    }
	    return i1;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
}
