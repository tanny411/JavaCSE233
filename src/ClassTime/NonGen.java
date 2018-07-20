/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassTime;

/**
 *
 * @author hi fi
 */
public class NonGen {
    private Object a;
    NonGen(Object x)
    {
        a=x;
    }
    Object getval()
    {
        return a;
    }
    
    void showType()
    {
        System.out.println("Type of ob: "+a.getClass().getName());
        //getclass() & getclass().getName() & getClass().toString()
    }
}
