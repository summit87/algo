/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mypractice.org.shorting;

/**
 *
 * @author SUMMITM
 * 
 * 
 * 
 * 
 * 
 * 
 */



public class InShorting {
    
        public int[] inShort(int[] array)
        {
            //int[] s = new int[array.length];
            int key=0;
            for(int i=1;i<array.length;i++)
            {
                key=array[i];
                int j=i-1;
                while(j>=0&&key>array[j])
                {
                    array[j+1]=array[j];
                    j--;
                }
                array[j+1]=key;
            }
            return array;
        }
    
    
    
    
}
