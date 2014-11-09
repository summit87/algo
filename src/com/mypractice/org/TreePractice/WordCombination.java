package com.mypractice.org.TreePractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WordCombination {

    /**
     * @param args
     */
    public static void main(String[] args) {
	
	try
	{
	    int[] a = {1, 1, 3, 4};
	    WordCombination w = new WordCombination();
	    Node n = w.getAlphabetTree(a,new String(),0);
	    w.print(n);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    
    private Node getAlphabetTree(int[] a,String dataString,int data)
    {
	try
	{
	    if(data>26)
	    {
		return null;
	    }
	    String s=new String();
	    if(data!=0)
	    {
		s = dataString+String.valueOf(data)+",";
	    }
	    Node n = new Node(s);
	    if(a.length!=0)
	    {
		data=a[0];
		int[] newa = Arrays.copyOfRange(a,1,a.length);
		n.setLeft(getAlphabetTree(newa,s,data));
		if(a.length>1)
		{
		    data=a[0]*10+a[1];
		    newa = Arrays.copyOfRange(a,2,a.length);
		    n.setRight(getAlphabetTree(newa,s, data));
		}
	    }
	    return n;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }
    private void print(Node n)
    {
	try
	{
	    if(n==null)
	    {
		return;
	    }
	    if(n.getLeft()==null&&n.getRight()==null)
	    {
		System.out.println(n.getCh());
	    }
	    print(n.getLeft());
	    print(n.getRight());
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
}


class Node
{
    Node left;
    Node right;
    String ch;
    public Node getLeft() {
        return left;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public Node getRight() {
        return right;
    }
    public void setRight(Node right) {
        this.right = right;
    }
    public String getCh() {
        return ch;
    }
    public void setCh(String ch) {
        this.ch = ch;
    }
    public Node(String ch) {
	super();
	this.ch = ch;
    }
    
}