/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import static java.lang.Math.abs;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aysha Kamal
 */
class th implements Runnable
{
    Thread t;
    String name;
    th (String name)
    {
        this.name=name;
        t=new Thread(this,name);
        t.setPriority(9);
        t.start();
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        for(int i=0;i<20;i++) 
        {
            System.out.println(i);
        }
        
    }
    
}

public class Main {
    
    public static void jao()
    {
        PrintWriter write= null;
        try {
            write = new PrintWriter("ooutfile.txt","utf-8");
            for(int i=0;i<100;i++)
            write.println(randomString(10,i%3));
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            write.close();
        }
        
        
        
        try {
            String s;
            BufferedReader br=new BufferedReader(new FileReader("ooutfile.txt"));
            while((s=br.readLine())!=null) System.out.println(s);
            
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String args[])
    {
        //jao();
        
        th thread = new th("One");
        System.out.println(Thread.currentThread());
        
    }
    
    public static String randomString(int length,int caseStatus)
    {
        String s="";
        Random rand= new Random();
        for(int i=0;i<length;i++)
        {
            int x=abs(rand.nextInt())%26;
            int y=abs(rand.nextInt())%2;
            char ch;
            if(caseStatus==1) ch=(char) (x+'a');
            else if(caseStatus==2) ch=(char) (x+'A');
            else if(y==0)ch=(char) (x+'a');
            else ch=(char) (x+'A');
            s=s+ch;
        }
        return s;
    }
    
}
