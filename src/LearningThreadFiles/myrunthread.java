/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearningThreadFiles;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hi fi
 */
public class myrunthread implements Runnable{

    String name;
    int n=10;
    Thread t;
    myrunthread(String name)
    {
        this.name=name;
        //new Thread(this,name).start();
        t=new Thread(this,name);
        t.start();
    }
    @Override
    public void run() {
        for(int i=0;i<n;i++)
        {
            try {
                sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(myrunthread.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(name+"  "+i);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
