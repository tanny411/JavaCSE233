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
public class NonGenImproved{
    private Object ob,ob1;
    NonGenImproved(Object o,Object n)
    {
        ob1=n;
        ob=o;
    }
    Object getval1()
    {
        return ob;
    }
    Object getval2()
    {
        return ob1;
    }
    void showType()
    {
        System.out.println("Type of ob: "+ob.getClass()+"  Type of ob1: "+ob1.getClass());
    }
}
