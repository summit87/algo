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
public class Shorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	QuickShort q = new QuickShort();
    	MergeShortAlgo m = new MergeShortAlgo();
        int[] array = {223,34,43,43,5,89,4,9,-1,2,78};
//        q.setArray(array);
//        q.quickShort(0,array.length-1);
       // m.setArray(array);
        
        //int[] l =m.getArray();
        	int[] l=new BubbleShort().bubbleShort(array);
                //new SelectionShort().selectionShort(array);
                //new  InShorting().inShort(array);
        for(int k=0;k<l.length;k++)
        {
            System.out.print(l[k]+",");
        }
        //System.out.println(new MinMax().minMax(array)); 
                
    }
    
}
