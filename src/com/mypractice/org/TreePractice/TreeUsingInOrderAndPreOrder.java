package com.mypractice.org.TreePractice;

public class TreeUsingInOrderAndPreOrder {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	try
	{
	    char[] in = {'D', 'B', 'E', 'A', 'F', 'C'};
	    char[] pre = {'A', 'B', 'D', 'E', 'C', 'F'};
	    TreeUsingInOrderAndPreOrder tree = new TreeUsingInOrderAndPreOrder();
	    TreeNode tn = tree.buildTree(in, pre,0,in.length-1,0);
	    tree.inOrder(tn);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    
    private TreeNode buildTree(char[] in,char[] pre,int st,int end,int preInd)
    {
	try
	{
	    if(in==null||pre==null)
	    {
		return null;
	    }
	    else if(preInd<in.length&&st<end)
	    {
		TreeNode tn = new TreeNode(null,null,pre[preInd]);
		preInd++;
		    if(st==end)
		    {
			return tn;
		    } 
		    int ind = getRootIndex(in, st, end,(char)tn.getNodeData());
		    tn.setLeftChildNode(buildTree(in, pre, st,ind-1, preInd));
		    tn.setRightChildNode(buildTree(in, pre, ind+1, end, preInd));
		    return tn;
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    
    private void inOrder(TreeNode tn)
    {
	if(tn!=null)
	{
	    inOrder(tn.getLeftChildNode());
	    System.out.print((char)tn.getNodeData()+",");
	    inOrder(tn.getRightChildNode());
	}
    }
    
    
    
    private int getRootIndex(char[] in,int st,int end,char val)
    {
	try
	{
	    for(int i=st;i<=end;i++)
	    {
		if(in[i]==val)
		{
		    return i;
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
}
