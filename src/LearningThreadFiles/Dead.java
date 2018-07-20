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
public class Dead {
    Dead b;
    synchronized void foo (Dead b)
    {
        System.out.println(Thread.currentThread().getName()+" entered Dead");
        this.b=b;
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(mydeadthread.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(Thread.currentThread().getName()+" trying to call last");
        b.last();
    }
    synchronized void last()
    {
        System.out.println("Last printed");
    }
}
