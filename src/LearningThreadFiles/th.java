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

public class th implements Runnable{

    String name;
    Thread t;
    th(String name)
    {
        this.name=name;
        t=new Thread(this);
    }
    public void oka()
    {
        t.start();
    }
    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(int i=0;i<100;i++) {
            try {
                t.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(th.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(name+" "+i);
        }
    }
    
    
}
