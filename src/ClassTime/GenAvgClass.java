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
public class GenAvgClass<T extends Number>{
    T[] ara;
    GenAvgClass(T[] a){
        ara=a;
    }
    Double getavg()
    {
        ///because we only want to work with numbers, T type declaration is biased
        ///we need to <T extends Number>
        double avg=0.0;
        for(int i=0;i<ara.length;i++)
        {
            avg+=ara[i].doubleValue();
        }
        return avg/ara.length;
    }
}
