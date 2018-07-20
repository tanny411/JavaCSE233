/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearningThreadFiles;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Q {
    
    int n;
    boolean oka=false;
    synchronized void get()
    {
        while(!oka)
        {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Q.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        System.out.println("Got : "+n);
        oka=false;
        notify();
    }
    
    synchronized void put(int n)
    {
        while(oka)
        {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Q.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        this.n=n;
        System.out.println("Put : "+n);
        oka=true;
        notify();
    }
}

class Producer implements Runnable
{
    Q q;
    Producer(Q q)
    {
        this.q=q;
        new Thread(this).start();
    }

    @Override
    public void run() {
        int i=0;
        while(true)
        {
            q.put(i);
            i++;
        }
        //throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}

class Consumer implements Runnable
{
    Q q;
    Consumer(Q q)
    {
        this.q=q;
        new Thread(this).start();
    }
    
    @Override
    public void run() {
        while(true)
        {
            q.get();
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}