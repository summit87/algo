/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyQueue;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SUMIT
 */
public class MyQueue {
    
    private static String msg = "HCL ";
        static
        {
            Thread t = new Thread(new Runnable(){
            public void run(){
            msg = "Technologies ";
                try { 
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MyQueue.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            });
            t.start();
           System.out.println("HJJH > "+msg);
        }
public static void main(String[] args){
    
System.out.print("Main Thread > "+msg);
}
    
}
