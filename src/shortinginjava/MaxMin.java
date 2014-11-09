/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shortinginjava;

/**
 *
 * @author SUMIT
 */
public class MaxMin {
    
    public void maxMin(int[] a)
    {
        int max;
        int max2;
        int min;
        max=0;
        max2=0;
        for(int i=0;i<a.length;i++)
        {
             
            if(max < a[i])
            {
                max2 = max;
                max = a[i];
              
            }
            else if( max2 < a[i])
               {
                   max2 = a[i];
               }
        }
        System.out.println(max2+" : "+max);
        
    }
    public void maxmin(int[] a)
    {
        int max;
        //int //;
        int min=0;
        max=0;
       // max2=0;
        min = a[0];
        for(int i=0;i<a.length;i++)
        {
             
            if(max < a[i])
            {
               
               max = a[i];
              
            }
            else if(min >= a[i])
            {
                min = a[i];
            }
            
        }
        System.out.println(min+" : "+max);
        
    }
}
