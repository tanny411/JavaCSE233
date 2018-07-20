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
public class Main {
    public static void main(String[] args) {
        /*
        //shared resource khali ekjon at a time use korte pare.
        //synchronize korle shared object ek jon kore kore multiple thread er 
        //kaaj shesh korbe.
        ///originally synchronized na thakle synchronize block
        //e call dile kaaj korbe as synchronize.
        
        th obj1=new th("one");
        obj1.oka();
        th obj2=new th("two");
        obj2.oka();
        th obj3=new th("three");
        obj3.oka();
        Thread t=Thread.currentThread();
        
        System.out.println("isAlive 1 "+obj1.t.isAlive());
        System.out.println("isAlive 2 "+obj2.t.isAlive());
        System.out.println("isAlive 3 "+obj3.t.isAlive());
        System.out.println("isAlive main "+t.isAlive());
        ///joined main and obj2 (now main thread will wait here for obj2 to end)
        try {
            obj2.t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Programming.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("isAlive 1 "+obj1.t.isAlive());
        System.out.println("isAlive 2 "+obj2.t.isAlive());
        System.out.println("isAlive 3 "+obj3.t.isAlive());
        System.out.println("isAlive main "+t.isAlive());
        /*
            while(true)
            {
            try {
            sleep(10);
            } catch (InterruptedException ex) {
            Logger.getLogger(Programming.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(!obj1.t.isAlive() && !obj2.t.isAlive() && !obj2.t.isAlive())
            {
            System.out.println("Finish");
            break;
            }
            else System.out.println("Not Yet");
            }*/ 
        /**
        Gen<Integer> ob=new Gen<Integer>(new Integer(10));//cant send primitive data type, have to send class
        Gen<String> ob2=new Gen<String>("Aysha");
        
        System.out.println(ob.getval());
        ob.showType();
        
        NonGen ngob=new NonGen(20);
        NonGen ngob2=new NonGen("CSE2015");
        
        System.out.println(ngob2.getval());
        ngob2.showType();
        
        GenImproved<Integer,String> polo=new GenImproved<Integer,String>(10,"Ben");
        //polo.showType();
        
        GenImproved<String,Integer> lol=new GenImproved<String,Integer> ("Flash",2);
        //lol.showType();
        
        //polo=lol;--->doesnt allow
        
        NonGenImproved aysha=new NonGenImproved(10,"Ben");
        //polo.showType();
        
        NonGenImproved tanny=new NonGenImproved ("sjkds",2);
        //lol.showType();

        Integer x=(Integer) aysha.getval1();///wont work without typecasting
        ///-->lets compile, but RE
        aysha=tanny;
        //uncomment to get problems -__-//x=(Integer) aysha.getval1();
        //<--
        
        ///cant send anything but number in it because we extended with number
        Integer[] ara={1,2,3,4};
        GenAvgClass<Integer> avgob=new GenAvgClass<Integer>(ara);
        double ans=avgob.getavg();
        System.out.println("Average : "+ans);
        */
        /*
        guys guy1=new guys(0,10,1,"guy1");
        guys guy2=new guys(10,10,0,"guy2");
        */
        
    }
}
