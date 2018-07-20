/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearningThreadFiles;

/**
 *
 * @author hi fi
 */
public class syncthread extends Thread{

    Callme common;
    String msg;
    int f;
    public syncthread(Callme common, String msg,int f) {
        this.common=common;
        this.msg=msg;
        this.f=f;
        start();
    }
    
    @Override
    public void run()
    {
        if(f==1) 
        {
            synchronized(common)
            {
                common.call2(msg);
            }
        }
        else common.call(msg);
    }
}
