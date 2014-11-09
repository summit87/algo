/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shortinginjava.ShortingUsingComaprable;

/**
 *
 * @author SUMIT
 */
public class StringSHorting {
    
    
    public static void main(String[] args)
    {
        String a = "AABBCCCDDBBBAAGGGG"; //A2B2C3D2B3A2G4
        int j=0;
        int count = 0;
        boolean flag;
        int k=0;
        for(int i=0;i<a.length();)
        {
           //j=i;
           //k=i;
           count = 1;
           if(j == a.length())
           {
               j=j-1;
           }
           while(a.charAt(j) == a.charAt(i))
           {
               System.out.println("i > "+i+" j > "+j+" > "+a.charAt(j));
               count++;
               j++;
               k=i;
           }
           
           //j=;
           i=j;
           
           //j=j-1;
           count = count-1;
           //System.out.print(a.charAt(k)+""+count);
        }
    }
}
