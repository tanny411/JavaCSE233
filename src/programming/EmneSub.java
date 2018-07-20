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
public class EmneSub extends Emne{
    
    EmneSub()
    {
        this(10);
    }
    EmneSub(int x)
    {
        System.out.println("This constructor called");
    }

    @Override
    void ohno(int x,int y) {
        System.out.println("Implemented overriden method");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void subfun()
    {
        System.out.println("are mama");
    }
    
}
