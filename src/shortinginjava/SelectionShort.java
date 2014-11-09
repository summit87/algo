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
public class SelectionShort {
    
    
    public void selectionShort(int[] a)
    {
       int min;
       min = a[0];
       int pos=0;
       int temp=0;
       for(int i=0;i<a.length-1;i++)
       {
           temp = 0;
           min = a[i];
           for(int j=i+1;j<a.length;j++)
           {
               if(min > a[j])
               {
                   min = a[j];
                   pos = j;
               }
           }
           if(pos!=i)
           {
               temp = a[pos];
               a[pos] = a[i];
               a[i] = temp;
           }
           
       }
       
       for(int l=0;l<a.length;l++)
            {
                System.out.print(a[l]+","); 
            }
    }
    
    
}
