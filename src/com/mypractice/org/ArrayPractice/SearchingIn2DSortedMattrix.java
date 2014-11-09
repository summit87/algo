package com.mypractice.org.ArrayPractice;

public class SearchingIn2DSortedMattrix {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try
	{
    	    int[][]m =  new int[][] { 	      {10, 20, 30, 40}, 
                        		      {15, 25, 35, 45},
                        		      {27, 29, 37, 48},
                        		      {32, 33, 39, 50}
                    		    };
    	    
    	    int key = 37;
//    	    for(int i=0;i<4;i++)
//    	    {
//    		for(int j=0;j<4;j++)
//    		{
    		    new SearchingIn2DSortedMattrix().search(m,0,4,0,4, key);
//    		}
//    	    }
    	    
    	    
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}

    }

    
    private void search(int[][] m,int fromRow,int toRow,int fromCol,int toCol,int key)
    {
	try
	{
	    int i = fromRow+(toRow-fromRow)/2;
	    int j = fromCol+(toCol-fromCol)/2;
	    if(m[i][j] == key)
	    {
		System.out.println("Value is found at key : "+i+" > "+j+" <> "+key);
	    }
	    else
	    {
		if(i!=toRow&&j!=toCol)
		{
		    search(m, fromRow,i,j, toCol, key);
		}
		if(fromRow == toRow&&fromCol+1==toCol)
		{
		    if(m[fromRow][fromCol]==key)
		    {
			System.out.println("Value is found at key : "+fromRow+" > "+fromCol+" <> "+key);
		    }
		}
		if(m[i][j]>key)
		{
		    if(j-1>=fromCol)
		    {
			search(m, fromRow, toRow, fromCol,j-1, key);
		    }
		}
		else if(m[i][j]<key)
		{
		    if(i+1<=toRow)
		    {
			search(m,i+1,toRow, fromCol,toCol, key);
		    }
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    
}
