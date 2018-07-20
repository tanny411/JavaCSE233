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
public class Checksync {

    synchronized void one() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Checksync.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("one");
        }
    }

    synchronized void two() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Checksync.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("two");
        }
    }
}
