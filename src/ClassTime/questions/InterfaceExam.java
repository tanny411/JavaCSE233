/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassTime.questions;

interface Aa
{
    int a=10;
    final  int b=20;
    void am();
}
interface Bb extends Aa{
    static int b=30;
    int c=50;
    interface Cc
    {
        final static int c=40;
        void bm();
        void am();
    }
    void bm();
}

public class InterfaceExam implements Bb,Bb.Cc{
    int a=60;
    public static void main(String args[])
    {
        InterfaceExam inf=new InterfaceExam();
        inf.am();
        Aa a=inf;
        Bb b=inf;
        Cc c=inf;
        a.am();
        b.am();
        b.bm();
        c.bm();
    }
    public void am()
    {
        System.out.println("AM = "+Cc.c);
    }
    public void bm()
    {
        System.out.println("BM ="+a);
    }
}
