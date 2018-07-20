
package ClassTime.questions;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadExam implements Runnable{
    public ThreadExam()
    {
        Thread t=Thread.currentThread();
        System.out.println("CurrentThread: "+t);
        t.setName("ExamThread");
        t.setPriority(3);
        System.out.println("Current Tread: "+t);
        printer();
    }
    synchronized public void printer()
    {
        Thread t=Thread.currentThread();
        System.out.println("Printer: "+t);
    }
    public void run()
    {
        Thread t=Thread.currentThread();
        System.out.println("Current Thread: "+t);
        try {
            sleep(1000);
            printer();
        } catch (InterruptedException ex) {
            System.out.println("Thread Exam Exiting.");
            //Logger.getLogger(ThreadExam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String args[])
    {
        Thread t=new Thread(new ThreadExam(),"MainThread");
        System.out.println("Current Thread: "+t);
        t.setPriority(7);
        t.start();
        try {
            t.join();
        } catch (InterruptedException ex) {
            System.out.println("ThreadMain Exiting");
            //Logger.getLogger(ThreadExam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
