package com.mypractice.org.shorting;

public class MinimumLengthOfShorting {

	public static void main(String[] args)
    {
        int[] a = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        System.out.println(new MinimumLengthOfShorting().getMinimumLength(a,a.length-1)); 
    }
    
    public String getMinimumLength(int[] a,int n)
    {
        int i1=0,j1=0;
        int min,max;
        for(int i=0;i<=n;i++)
        {
            if(a[i]>a[i+1])
            {
                i1=i;
                break;
            }
        }
        for(int j=n;j>=0;j--)
        {
            if(a[j]<a[j-1])
            {
                j1=j;
                break;
            }
        }
        min=a[i1];max=a[j1];
        for(int i=i1;i<=j1;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            else if(min>a[i])
            {
                min=a[i];
            }
        }
        for(int i=0;i<=i1;i++)
        {
            if(a[i]>min)
            {
                i1=i;
                break;
            }
        }
        for(int i=j1+1;i<=n;i++)
        {
            if(a[i]<max)
            {
                j1=i;
                break;
            }
        }
        return i1+","+j1;
    }

}
