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
public class StackX2 {
    
    private int top;
    int maxSize ;
    int[] items ;
    
    public StackX2()
    {
        top=-1;
        items= new int[10];
        maxSize=10;
    }
    
    public int popItem() throws Exception
    {
        try
        {
             return items[top--];
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
    public void pushItem(int item) throws Exception
    {
        try
        {
            items[++top] = item;
        }
        catch(Exception ex)
        {
            throw ex;
        }
        
    }
    
    
    
    public boolean isEmpty()
    {
        return (top == -1);
    }
    
    
    
}
