package com.mypractice.org.ArrayPractice;

public class SearchIn2DSortedMattrix {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int[][] m = {	{10,20,30,40},
			{15,25,35,45},
			{27,29,37,48},
			{32,33,38,50}};
	int key = 29;
	
	if(new SearchIn2DSortedMattrix().getNumber(m, key))
	{
	    System.out.println("Its There");
	}
	else
	{
	    System.out.println("Iys Not There");
	}

    }

    
    
    private boolean getNumber(int[][] m,int key)
    {
	try
	{
	    boolean flag=false;
	    int j=m[0].length-1;
	    int i=0;
	    int i1=0;
	    int j1=0;
	    while(i<m.length&&j>=0)
	    {
		if(m[i][j]==key)
		{
		    flag=true;
		    i1=i;
		    j1=j;
		    break;
		}
		else if(m[i][j]>key)
		{
		    j--;
		}
		else if(m[i][j]<key)
		{
		    i++;
		}
	    }
	    System.out.println("Index > "+i1+" > "+j1);
	    return flag;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    
    
}
