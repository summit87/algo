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
public class SelectionShort {
    
    public int[] selectionShort(int[] array)
    {
        int min=0;
        for(int i=0;i<array.length-1;i++)
        {
            min=i;
            int temp=0;
            for(int j=i+1;j<array.length;j++)
            {
                if(array[min]>array[j])
                {
                    min=j;
                }
            }
            temp=array[i];
            array[i] = array[min];
            array[min]=temp;
        }
        return array;
    }
    
    
}
