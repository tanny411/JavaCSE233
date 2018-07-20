/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearningThreadFiles;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hi fi
 */
public class Callme {
    
    synchronized public void call(String msg)
    {
        System.out.print("["+msg);
        
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Callme.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("]");
    }
    
    public void call2(String msg)
    {
        System.out.print("["+msg);
        
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Callme.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("]");
    }
}
