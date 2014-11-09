package com.mypractice.org.ArrayPractice;

public class FindAtripletThatSumToAGivenValue {

    /**
     * @param args
     */
    static int[] a={1, 4, 45, 6, 10, 8};
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	try
	{
	    FindAtripletThatSumToAGivenValue f = new FindAtripletThatSumToAGivenValue();
	    f.quickSort(0,a.length-1);
	    f.getSum(22);
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }

    
    private void getSum(int sum)
    {
	try
	{
	    int l=0;
	    int r=0;
	    for(int i=0;i<a.length;i++)
	    {
		l=i+1;
		r=a.length-1;
		while(l<r)
		{
		    if((a[i]+a[l]+a[r])==sum)
		    {
			System.out.println(i+"    > "+l+"    > "+r);
			System.out.println(a[i]+" > "+a[l]+" > "+a[r]);
			break;
		    }
		    else if((a[i]+a[l]+a[r])<sum)
		    {
			l++;
		    }
		    else
		    {
			r--;
		    }
		}
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    
    
    private void quickSort(int left,int right)
    {
	try
	{
	   int i=left;
	   int j=right;
	   int p=a[(left+right)/2];
	   while(i<=j)
	   {
	       while(p>a[i])
		   i++;
	       while(p<a[j])
		   j--;
	       if(i<=j)
	       {
		   int temp=a[i];
		   a[i]= a[j];
		   a[j]=temp;
		   i++;
		   j--;
	       }
	       if(j>left)
	       {
		   quickSort(left,j);
	       }
	       else if(i<right)
	       {
		   quickSort(i, right);
	       }
	   }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
}
