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
public class Programming {

    /*static 
    {
        System.out.println("wut?");
    }
    {
        System.out.println("polar bear");
    }*/
    public static void main(String args[]) throws Exception
    {
        System.out.println(args.length);
        //Emne pop=new Emne();
        
        //Emne.Inner poppy=pop.new Inner();
        //poppy.po();
        
        
        Emne.x=90;
        System.out.println("OMAMAMAMA");
        Emne a=new Emne();
        System.out.println("OPAPAPAPA");
        Emne.Inner b=a.new Inner();
        b.ohno(0, 0);
        Interface.ststuff();
        a.destuff();
        
        try{
            throw new MyException("CustomException");
        }
        catch(NullPointerException p){
            System.out.println("Nulled");
        }
        catch(ArrayIndexOutOfBoundsException x)
        {
            System.out.println("Exed");
        }
        catch(Exception e)
        {
            System.out.println(e);
            //throw e;
            //System.out.println("After throw");
        }
        finally
        {
            System.out.println("First Finally");
        }
        
    }
    
}