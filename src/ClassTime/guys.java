/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassTime;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author hi fi
 */
class myframe extends JFrame{
    
}

public class guys extends JFrame implements Runnable{
    int x,y,right;
    String name;
    JButton jb;
    guys(int x,int y,int right,String name)
    {
        this.name=name;
        this.x=x;
        this.y=y;
        this.right=right;
        
        new Thread(this).start();
    }   
    @Override
    public void run() {
        int count=0,p=15;
        if(right==1){
        while(p>0)
        {
            p--;
            System.out.println(name+" : "+x+" "+y);
            if(count%2==1) x--;
            else x++;
            if(x==10 || x==0) count++;
            count%=2;
            try {
                sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(guys.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
        else
        {
            while(p>0)
            {
                p--;
            System.out.println(name+" : "+x+" "+y);
            if(count%2==1) x++;
            else x--;
            if(x==10 || x==0) count++;
            count%=2;
            try {
                sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(guys.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
