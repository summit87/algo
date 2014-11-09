/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyStack;

/**
 *
 * @author SUMIT
 */
public class StackMain {
    
    public static void main(String[] args)
    {
        try
        {
        StackX s = new StackX();
        s.pushItem(90);
        s.pushItem(45);
        s.pushItem(80);
        s.pushItem(23);
        s.pushItem(97);
        
        while(!s.isEmpty())
        {
            System.out.println("Val > "+s.popItem());
        }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    
}
