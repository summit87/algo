package com.mypractice.org.StringAlgo;

import com.mypractice.org.TreePractice.TreeNode;
import com.mypractice.org.TreePractice.TreeOperation;

public class BSTFromPrePost {

    /**
     * @param args
     */
    static int ind=0;
    public static void main(String[] args) {
	
	try
	{
	    int[] pre ={1, 2, 4, 8, 9, 5, 3, 6, 7};
	    int[] post ={8, 9, 4, 5, 2, 6, 7, 3, 1};
	    BSTFromPrePost bst = new BSTFromPrePost();
	    TreeOperation to = new TreeOperation();
	    TreeNode tn = bst.createBST(pre, post,0,post.length-1,ind);
	    to.printInorderTree(tn);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	

    }

    
    private TreeNode createBST(int[] pre,int[] post,int l,int h,int ind)
    {
	try
	{
	    if(l>h||ind>=pre.length)
	    {
		return null;
	    }
	    TreeNode tn = new TreeNode(pre[ind]);
	    ind=ind+1;
	    if(l==h)
	    {
		return tn;
	    }
	    int i=0;
	    for(i=l;i<=h;i++)
	    {
		if(pre[i]==post[i])
		{
		    break;
		}
	    }
	    if(i<=h)
	    {
		//System.out.println("j");
		tn.setLeftChildNode(createBST(pre, post,l,i,ind));
		tn.setRightChildNode(createBST(pre, post,i+1,h,ind));
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
