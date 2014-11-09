package com.mypractice.org.ArrayPractice;

public class MaximumSizeSquareSubMatrixWithAll1s {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	int[][] ma = { {1,  1,  1,  0,  1}, 
		       {1,  1,  1,  1,  1}, 
		       {1,  1,  1,  1,  1},
		       {1,  1,  1,  1,  1},
		       {1,  1,  1,  1,  1},
		       {0,  0,  0,  0,  0}
		     };
	new MaximumSizeSquareSubMatrixWithAll1s().getMaxOnes(ma);

    }

    
    private void getMaxOnes(int[][] ma)
    {
	try
	{
	    int[][] s = new int[ma.length][ma[0].length];
	    for(int i=1;i<ma.length;i++)
	    {
		for(int j=1;j<ma[i].length;j++)
		{
		    if(ma[i][j]==1)
		    {
			s[i][j]=getMin(s[i][j-1],s[i-1][j],s[i-1][j-1])+1;
		    }
		    else
		    {
			s[i][j]=0;
		    }
		}
	    }
	    int max = 0;
	    max=s[0][0];
	    int max_i=0;
	    int max_j=0;
	    for(int i=0;i<s.length;i++)
	    {
		for(int j=0;j<s[0].length;j++)
		{
		    if(max<=s[i][j])
		    {
			max=s[i][j];
			max_i=i;
			max_j=j;
		    }
		}
		System.out.println();
	    }
	    for(int i=0;i<s.length;i++)
	    {
		for(int j=0;j<s[0].length;j++)
		{
		    System.out.print(s[i][j]+",");
		}
		System.out.println();
	    }
	    System.out.println();
	    System.out.println("max_i > "+max_i+" max_j > "+max_j+" max> "+max);
	    for(int k=max_i;k>max_i-max;k--)
	    {
		for(int l=max_j;l>max_j-max;l--)
		{
		    System.out.print(ma[k][l]+",");
		}
		System.out.println();
	    }
	    
	  
	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    private int getMin(int a,int b,int c)
	{
	    return getM(a,b)>c?c:getM(a,b);
	}
	
	private int getM(int a,int b)
	{
	    return a>b?b:a;
	}
	
    
    
}
