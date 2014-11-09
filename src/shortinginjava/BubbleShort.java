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
public class BubbleShort {
    
    
    public void bubbleShort(int[] a)
    {
       
            boolean flag=true;
            int temp;
            int j=0;
            while(j<a.length)
            {
                //flag = false;
                for(int i=0;i<a.length-1;i++)
                {
                    if(a[i]>a[i+1])
                    {
                        temp = a[i+1];
                        a[i+1] = a[i];
                        a[i] = temp;
                       // flag = true;
                    }
                }
                j++;
            }
            for(int l=0;l<a.length;l++)
            {
                System.out.print(a[l]+","); 
            }
        
    }
    
    
}
