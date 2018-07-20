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
public class mythread extends Thread{
    String name;
    int n=10;
    mythread(String name)
    {
        this.name=name;
        this.start();
    }
    mythread(String name,Thread a)
    {
        this.name=name;
        try {
            a.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(mythread.class.getName()).log(Level.SEVERE, null, ex);
        }
        start();
        ///waits for a to finish, then starts
    }
    Checksync a;
    mythread(String name,Checksync a)
    {
        this.name=name;
        this.a=a;
        start();
    }
    @Override
    public void run()
    {
        if(name=="one")  a.one();
        else if(name=="two") a.two();
        /*for(int i=0;i<n;i++)
        {
            try {
                sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(mythread.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(name+"  "+i);
        }
        */
    }
}
