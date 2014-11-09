package com.mypractice.org.TreePractice;

public class PrintPostOrder {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

	try
	{
	    int[] in = {4, 2, 5, 1, 3, 6};
	    int[] pre={1, 2, 4, 5, 3, 6};
	    PrintPostOrder po = new PrintPostOrder();
	    po.inPrePost(in, pre, 0,in.length-1,0);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }

    
    private void inPrePost(int[] in,int[] pre,int st,int end,int ind)
    {
	try
	{
	    if(in==null|pre==null)
	    {
		return;
	    }
	    else if(ind<in.length&&st<end)
	    {
		    int val = pre[ind++];
		    int index = search(in, st, end, val);
		    inPrePost(in, pre, st,index-1, ind);
		    inPrePost(in, pre, index+1,end, ind);
		    System.out.print(in[index]+",");
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    private int search(int[] in,int st,int end,int val)
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
