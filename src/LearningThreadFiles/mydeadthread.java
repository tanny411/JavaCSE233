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
public class mydeadthread extends Thread{
    Dead a,b;
    mydeadthread(String name,Dead a,Dead b)
    {
        setName(name);
        this.a=a;
        this.b=b;
        start();
    }

    @Override
    public void run()
    {
        a.foo(b);
    }
}
