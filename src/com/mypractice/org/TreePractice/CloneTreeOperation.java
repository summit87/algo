package com.mypractice.org.TreePractice;

public class CloneTreeOperation {

    
    TreeNode ot;
    TreeNode oc;
    
    public TreeNode copyLeftLinkAndRightLink(TreeNode ot)
    {
	try
	{
	   if(ot==null) 
	   {
	       return null;
	   }
	   TreeNode ot1 = ot.getLeftChildNode();
	   ot.setLeftChildNode(new TreeNode(null,null,ot.getNodeData()));
	   ot.getLeftChildNode().setLeftChildNode(ot1);
	   if(ot1!=null)
	   {
	       ot1.setLeftChildNode(copyLeftLinkAndRightLink(ot1));
	   }
	   ot.getLeftChildNode().setRightChildNode(ot.getRightChildNode());
	   return ot.getLeftChildNode();
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    public void copyRandomPointer(TreeNode ot,TreeNode oc)
    {
	try
	{
	    if(ot==null)
	    {
		return;
	    }
	    if(ot.getRandomT()!=null)
	    {
		oc.setRandomT(ot.getRandomT().getLeftChildNode());
	    }
	    else
	    {
		oc.setRandomT(null);
	    }
	    if(ot.getLeftChildNode()!=null&&oc.getLeftChildNode()!=null)
	    {
		copyRandomPointer(ot.getLeftChildNode().getLeftChildNode(), oc.getLeftChildNode().getLeftChildNode());
	    }
	    copyRandomPointer(ot.getRightChildNode(), oc.getRightChildNode());
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    public void restorePointer(TreeNode ot,TreeNode oc)
    {
	try
	{
	    if(ot==null)
	    {
		return;
	    }
	    if(oc.getLeftChildNode()!=null)
	    {
		TreeNode oc1 = oc.getLeftChildNode().getLeftChildNode();
		ot.setLeftChildNode(ot.getLeftChildNode().getLeftChildNode());
		oc.setLeftChildNode(oc1);
	    }
	    else
	    {
		ot.setLeftChildNode(null);
	    }
	    restorePointer(ot.getLeftChildNode(), oc.getLeftChildNode());
	    restorePointer(ot.getRightChildNode(), oc.getRightChildNode());
	}
	catch(Exception e)
	{
	    e.printStackTrace();
	}
    }
    
    
    public TreeNode getClone(TreeNode tn)
    {
	try
	{
	    TreeNode oc1 = copyLeftLinkAndRightLink(tn);
	    copyRandomPointer(tn, oc1);
	    restorePointer(tn, oc1);
	    return oc1;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    
    public void print(TreeNode tn)
    {
	try
	{
	    if(tn==null)
	    {
		return;
	    }
	    print(tn.getLeftChildNode());
	    System.out.print("{ "+tn.getNodeData()+",");
	    if(tn.getRandomT()==null)
	    {
		System.out.print("NULL }");
	    }
	    else
	    {
		System.out.print(""+tn.getRandomT().getNodeData()+" }");
	    }
	    print(tn.getRightChildNode());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
}
