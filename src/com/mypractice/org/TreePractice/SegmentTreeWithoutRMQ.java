package com.mypractice.org.TreePractice;

public class SegmentTreeWithoutRMQ {

    /**
     * @param args
     */
    static int[] st=null;
    int size=0;
    public static void main(String[] args) {
	
	
	try
	{
	    int[] arr= {1, 3, 5, 7, 9, 11};
	    SegmentTreeWithoutRMQ seg = new SegmentTreeWithoutRMQ();
	    st=seg.constructSegmentTree(arr);
	    int sum = seg.getSum(0,arr.length-1,1,3,0);
	    System.out.println(sum);
	    
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private int getSumUtil(int ss,int se,int qs,int qe,int in)
    {
	try
	{
	    if(qs>=ss&&qe<=se)
	    {
		return st[in];
	    }
	    if(qs>se||qe<ss)
	    {
		return 0;
	    }
	    int mid = getMid(ss, se);
	    int sum = getSumUtil(ss,mid, qs, qe,((2*in)+1))+getSumUtil(mid+1,se, qs, qe,((2*in)+2));
	    return sum;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    private int getSum(int ss,int se,int qs,int qe,int ind)
    {
	try
	{
	    if(qs>se||qe<ss)
	    {
		return 0;
	    }
	    int sum = getSumUtil(0,se, qs, qe, ind);
	    return sum;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    private int getMid(int ss,int se)
    {
	try
	{
	    return (ss+se)/2;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    private void updateUtil(int ss,int se,int i,int diff,int ind)
    {
	if(i>se||i<ss)
	{
	    return;
	}
	st[ind] = diff+st[ind];
	int mid = getMid(ss, se);
	updateUtil(ss, mid, i, diff,(2*ind)+1);
	updateUtil(mid+1, se, i, diff,(2*ind)+2);
    }
    
    private void update(int[] a,int ss,int se,int i,int newVal)
    {
	try
	{
	    if(i<ss||i>se)
	    {
		return;
	    }
	    int diff = newVal-a[i];
	    updateUtil(ss, se, i, diff,0);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    private int constructSegmentTreeUtil(int ss,int se,int[] a,int in)
    {
	try
	{
	    if(ss==se)
	    {
		st[ss]=a[se];
		return st[ss];
	    }
	    int mid = getMid(ss, se);
	    st[in] = constructSegmentTreeUtil(ss,mid,a,(2*in)+1)+constructSegmentTreeUtil(mid+1,se, a,(2*in)+2); 
	    return st[in];
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    private int[] constructSegmentTree(int[] a)
    {
	try
	{
	    int stSize = (2*a.length)-1;
	    st = new int[stSize];
	    constructSegmentTreeUtil(0,a.length-1, a,0);
	    return st;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
}
