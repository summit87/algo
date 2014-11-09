package com.mypractice.org.TreePractice;

public class MyStackImpl {

    
    
    MyStack stack;
    
    public void pushIn(TreeNode tree)
    {
	try
	{
	    MyStack ms = new MyStack(tree);
	    ms.setNext(stack);
	    stack = ms;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    public TreeNode popFromTop()
    {
	try
	{
	    if(stack==null)
	    {
		return null;
	    }
	    MyStack st = stack;
	    TreeNode tn =  st.getTreeNOde();
	    stack = stack.getNext();
	    st=null;
	    return tn;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }

    
    public boolean isEmpty()
    {
	try
	{
	    return (getStack()==null ?true:false);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    
    public MyStack getStack() {
        return stack;
    }

    public void setStack(MyStack stack) {
        this.stack = stack;
    }
    
    
}
