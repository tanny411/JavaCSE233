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
public class Gen<T>{
    private T ob;
    Gen(T o)
    {
        ob=o;
    }
    T getval()
    {
        return ob;
    }
    
    void showType()
    {
        System.out.println("Type of ob: "+ob.getClass());
    }
}
