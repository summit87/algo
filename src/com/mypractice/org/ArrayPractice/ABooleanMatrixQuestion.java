package com.mypractice.org.ArrayPractice;

public class ABooleanMatrixQuestion {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try
	{
	    		int[][] ma={{1 ,0, 0, 1},
        		    	{0 ,0, 1, 0},
        		    	{0 ,0, 0, 0},
		       };
	    		
	    		new ABooleanMatrixQuestion().aBooleanMattrix(ma);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }
//    private void aBooleanMattrix1(int[][] ma)
//    {
//	try
//	{
//	    boolean rowFlag = false;
//	    boolean colFlag = false;
//	    for(int i=0;i<ma.length;i++)
//	    {
//		
//		for(int j=0;j<ma[0].length;j++)
//		{
//		    if(ma[i][j]==1)
//		    {
//			rowFlag=true;
//			colFlag=true;
//		    }
//		    if(rowFlag||colFlag)
//		    {
//			ma[i][j]=1;
//		    }
//		}
//	    }
//	    
//	    for(int i=0;i<ma.length;i++)
//	    {
//		for(int j=0;j<ma[0].length;j++)
//		{
//		    System.out.print(ma[i][j]+",");
//		}
//		System.out.println();
//	    }
//	}
//	catch(Exception ex)
//	{
//	    ex.printStackTrace();
//	}
//    }
    private void aBooleanMattrix(int[][] ma)
    {
	try
	{
	    int[] row = new int[ma.length];
	    int[] col = new int[ma[0].length];
	    for(int i=0;i<ma.length;i++)
	    {
		row[i]=0;
	    }
	    for(int i=0;i<ma[0].length;i++)
	    {
		col[i]=0;
	    }
	    for(int i=0;i<ma.length;i++)
	    {
		for(int j=0;j<ma[0].length;j++)
		{
		    if(ma[i][j]==1)
		    {
			row[i]=1;
			col[j]=1;
		    }
		}
	    }
	    for(int i=0;i<ma.length;i++)
	    {
		for(int j=0;j<ma[0].length;j++)
		{
		    if(row[i]==1||col[j]==1)
		    {
			ma[i][j]=1;
		    }
		}
	    }
	    for(int i=0;i<ma.length;i++)
	    {
		for(int j=0;j<ma[0].length;j++)
		{
		    System.out.print(ma[i][j]+",");
		}
		System.out.println();
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
}
