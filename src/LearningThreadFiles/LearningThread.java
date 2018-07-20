/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearningThreadFiles;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import programming.Programming;

/**
 *
 * @author hi fi
 */
public class LearningThread {
    public static void main(String args[])
    {
        /*
        System.out.println("YES");
        
        Thread t= Thread.currentThread();
        System.out.println(t);
        System.out.println(t.getName());
        t.setName("Ashole Ta");
        System.out.println(t);
        
        
        mythread cholo = new mythread("one");
        
        try {
            sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Programming.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(cholo.isAlive()) System.out.println("Cholo is Alive");
        else System.out.println("Cholo is dead");
        
        myrunthread oka = new myrunthread("two");
        
        System.out.println("oka is alive? :"+oka.t.isAlive()); ///notice the use of .t
        
        try {
            oka.t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Programming.class.getName()).log(Level.SEVERE, null, ex);
        }
        //waits for oka to finish
        
        System.out.println("oka is alive? :"+oka.t.isAlive()); ///notice the use of .t
        
        try {
            cholo.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Programming.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
         
        /*
        mythread a=new mythread("a");
        mythread b=new mythread("b",a);
        
        try {
            a.join();
            b.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Programming.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        a=new mythread("a");
        b=new mythread("b");
        
        a.setPriority(10);
        b.setPriority(1);
        System.out.println("Priority : a="+a.getPriority()+" b="+b.getPriority());///this shit doesnt work though
        
        try {
            a.join();
            b.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Programming.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        /*
        Callme common=new Callme();
        syncthread A=new syncthread(common,"Aysha",0);
        syncthread B=new syncthread(common,"KAMAL",0);
        syncthread C=new syncthread(common,"tanny",0);
        
         try {
            A.join();
            B.join();
            C.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Programming.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        A=new syncthread(common,"Hello",1);
        B=new syncthread(common,"It's me",1);
        C=new syncthread(common,"Adele",1);
        
        try {
            A.join();
            B.join();
            C.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Programming.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        /*
        Q q=new Q();
        Producer Pro=new Producer(q);
        Consumer Con=new Consumer(q);
        */
        
        /*
        Checksync po=new Checksync();
        mythread a=new mythread("one",po);
        mythread b=new mythread("two",po);
        ///this means multiple synchronized methods in a class are all unitedly synchronized
        */
        
        /*deadlock*//*
        Dead a=new Dead();
        Dead b=new Dead();
        mydeadthread ekta=new mydeadthread("one",a,b);
        mydeadthread duita=new mydeadthread("two",b,a);*/
        
        /*suspend resume*//*
        Thread_sus_res a=new Thread_sus_res("one");
        Thread_sus_res b=new Thread_sus_res("two");
        try {
            sleep(5000);
            a.dosuspend();
            sleep(5000);
            b.dosuspend();
            sleep(10000);
            a.doresume();
            b.doresume();
        } catch (InterruptedException ex) {
            Logger.getLogger(Programming.class.getName()).log(Level.SEVERE, null, ex);
        }*/

    }
}
