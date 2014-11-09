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
public class BubbleShort {
    
    public int[] bubbleShort(int[] array)
    {
    	boolean flag = true;
        for(int i=0;i<array.length&&flag;i++)
        {
        	flag=false;
           for(int j=1;j<array.length;j++)
           {
               if(array[j-1]>array[j])
               {
                   int temp = array[j];
                   array[j] = array[j-1];
                   array[j-1]= temp;
                   flag=true;
               }
           }
        }
        return array;
    }
}
