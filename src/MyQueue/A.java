/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author SUMIT
 */
public class A {
    static Integer k = 9;
   public static void main(String[] args) 
   {
       
       //new A().test(k); 
       //System.out.println(k);
       
       List<String> list = new ArrayList<String>();
       String s = "how to sort list of strings";
       StringTokenizer st = new StringTokenizer(s," ");
       while(st.hasMoreElements())
       {
           list.add((String)st.nextElement()); 
       }
       
       Collections.sort(list); 
       
       for(String l : list)
       {
           System.out.println(l);
       }
       
   }
   public static void test(Integer k)
   {
       k = k+2;
       
   }
}
