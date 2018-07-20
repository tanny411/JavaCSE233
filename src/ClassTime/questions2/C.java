/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassTime.questions2;

interface A{
    int i=10;
    int j=20;
    interface B
    {
        void s();
    }
    void show(String msg);
}

public class C implements A{
    int k=30;
    class D implements B
    {
        public void s()
        {
            System.out.println("i="+i+" j="+j+" k="+k);
        }
    }
    static class E
    {
        static void s()
        {
            System.out.println("i="+i+" j="+j);
        }
        void s(String msg)
        {
            System.out.println(msg);
        }
    }
    public void show(String msg)
    {
        System.out.println(msg+" "+k);
    }
    public static void main(String args[])
    {
        C c=new C();
        c.show("Error!");
        D d=c.new D();
        d.s();
        E.s();
        E e=new E();
        e.s("Hello!");
    }
}
