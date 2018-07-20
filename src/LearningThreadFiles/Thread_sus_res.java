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
public class Thread_sus_res extends Thread{
    String name;
    boolean suspended=false;
    Thread_sus_res(String name)
    {
        this.name=name;
        start();
    }
    @Override
    public void run()
    {
        
        for(int i=0;i<100;i++)
        {
            System.out.println(name+" "+i);
            try {
                sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread_sus_res.class.getName()).log(Level.SEVERE, null, ex);
            }
            synchronized (this)
            {
                while(suspended)
                {
                    try {
                        wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread_sus_res.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
    synchronized void dosuspend()
    {
        suspended=true;
    }
    synchronized void doresume()
    {
        suspended=false;
        notify();
    }
    
}
