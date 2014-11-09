package com.mypractice.org.TreePractice;

public class TreeFromPreOrder {

    /**
     * @param args
     */
    static int ind=0;
    public static void main(String[] args) {
	
	try
	{
	    int[] pre={10, 30, 20, 5, 15};
	    char[] preChar = {'N', 'N', 'L', 'L', 'L'};
	    TreeFromPreOrder tn = new TreeFromPreOrder();
	    TreeOperation to = new TreeOperation();
	    TreeNode treeNode = tn.create(pre, preChar);
	    to.preOrderTree(treeNode);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private TreeNode create(int[] pre,char[] preChar)
    {
	try
	{
	    int ind1=ind;
	    if(ind==pre.length)
	    {
		return null;
	    }
	    TreeNode t = new TreeNode(pre[ind]);
	    ind=ind+1;
	    if(preChar[ind1]=='N')
	    { 
		t.setLeftChildNode(create(pre, preChar));
		t.setRightChildNode(create(pre, preChar));
	    }
	    return t;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    
}
