/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mypractice.org.shorting;

/**
 *
 * @author SUMMITM
 */
public class MinMax {
    
    public String minMax(int[] array)
    {
        String s=new String();
        int min=0;
        int max=0;
        for(int i=0;i<array.length;i++)
        {
            //max=array[i];
            if(array[i]>max)
            {
                max=array[i];
            }
            else if(min>array[i])
            {
                min=array[i];
            }
        }
        return min+","+max;
    }
    
    
}
