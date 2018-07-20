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
public class GenImproved<T,T2>{
    private T ob;
    private T2 ob1;
    GenImproved(T o,T2 n)
    {
        ob1=n;
        ob=o;
    }
    T getval1()
    {
        return ob;
    }
    T2 getval2()
    {
        return ob1;
    }
    void showType()
    {
        System.out.println("Type of ob: "+ob.getClass().toString()+"  Type of ob1: "+ob1.getClass());
    }
}
