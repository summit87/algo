package com.mypractice.org.StringAlgo;

public class PrintAllPermutationsInSortedLexicographicOrder {

    /**
     * @param args
     */
    
    
    static char[] str = "ABCD".toCharArray();
    public static void main(String[] args) {
	try
	{
	    PrintAllPermutationsInSortedLexicographicOrder p = new PrintAllPermutationsInSortedLexicographicOrder();
	    p.prinPermutationInLaxi();
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }

    
    private int getCellingCharecter(char[] str,char fc,int fcI,int ri)
    {
	try
	{
	    int c=fcI;
	    for(int i=fcI+1;i<=ri;i++)
	    {
		if(str[i]>fc&&str[i]<str[c])
		{
		    c=i;
		}
	    }
	    return c;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return -1;
    }
    
    
    
    
    private void prinPermutationInLaxi()
    {
	try
	{
	    int len = str.length-1;
	    quickSort(0,len);
	    boolean flag = false;
	    while(!flag)
	    {
		System.out.println(String.valueOf(str));
		int k=0;
		for(k=len-1;k>=0;k--)
		{
		    if(str[k]<str[k+1])
		    {
			break;
		    }
		}
		if(k==-1)
		{
		    flag=true;
		}
		else
		{
		    int c = getCellingCharecter(str, str[k],k+1,len);
		    char temp = str[k];
		    str[k]=str[c];
		    str[c]=temp;
		    reverse(k+1,len);
		    
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    private void reverse(int l,int r)
    {
	try
	{
	    while(l<r)
	    {
		char temp = str[l];
		str[l]=str[r];
		str[r]=temp;
		l++;r--;
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    private void quickSort(int l,int r)
    {
	try
	{
	    char p = str[(l+r)/2];
	    int i=l;
	    int j=r;
	    while(i<=j)
	    {
		while(p>str[i])
		    i++;
		while(p<str[j])
		    j--;
		if(i<=j)
		{
		    char temp = str[i];
		    str[i] = str[j];
		    str[j]=temp;
		    i++;
		    j--;
		}
		if(i<r)
		{
		    quickSort(i, r);
		}
		else if(j>l)
		{
		    quickSort(l, j);
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
}
