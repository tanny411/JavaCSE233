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
public class MyException extends Exception{
    String name;
    MyException(String name)
    {
        super(name);
        this.name=name;
    }
    @Override
    public String toString()
    {
        return name;
    }
}
