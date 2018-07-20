/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming;

/**
 *
 * @author hi fi
 */
public interface Interface {
    int X=10,Y=100;
    void meth();
    default void destuff()
    {
        System.out.println("deafult function");
    }
    static void ststuff()
    {
        System.out.println("static function");
    }
}
interface Interface2 extends Interface
{
    int A=1000,B=0;
    void meth2();
}