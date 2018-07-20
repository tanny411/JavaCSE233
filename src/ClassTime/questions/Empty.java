/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassTime.questions;

/**
 *
 * @author hi fi
 */
interface Interface
{
    abstract void meth();
}
class sup {
    int x;
    static 
    {
        System.out.println("sup static");
    }
    sup()
    {
        
        System.out.println("sup constructor -- " + x);
    //    throw new ArithmeticException();
    }
    void norm()
    {
        System.out.println("normal method");
    }
    {
        x=5;
        System.out.println("sup block");
        norm();
    }
    void meth(int a) throws ArithmeticException
    {
        throw new ArithmeticException();
    }
}
class sub extends sup
{
    sub()
    {
        System.out.println("sub constructor");
    }
    {
        System.out.println("sub Block");
    }
    static
    {
        System.out.println("sub static");
    }
}
public class Empty
{
    public static void main(String args[])
    {
        sub a=new sub();
        System.out.println("");
        System.out.println("");
        sub b=new sub();
    }
}