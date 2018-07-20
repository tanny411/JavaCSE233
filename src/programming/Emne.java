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
public class Emne implements Interface2{
    
    public int pub=100;
    private int pri=90;
    protected int pro=80;
    int aysha=10,kamal=100;
    final int X=10;
    {
        System.out.println("orerererrere");
    }
    static{
        System.out.println("ki ar koitam?");
    }
    public Emne()
    {
        System.out.println("superclass constructr called");
    }
    static int x=10;
    {
        System.out.println("lalalalala");
    }
    static {
        System.out.println("djsd");
    }
    
    void ohno(int x,int y){
        System.out.println("Outerclass ohno");
    }

    @Override
    public void meth2() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void meth() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    class Inner   
    {
        Inner()
        {
            System.out.println("Inner Constructor called");
        }
        void po(){
            System.out.println("inner printing "+aysha+" "+kamal+" "+tanny);
        }
        void ohno(int x,int y)
        {
            System.out.println("innerclass ohno");
        }
    }
    int tanny=90;
}
