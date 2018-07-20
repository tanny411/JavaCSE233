
package ClassTime.questions;

public class BlockExam {
    {
        System.out.println("B1: Exam Started!");
    }
    int a;
    static int s=33;
    BlockExam(int a)
    {
        System.out.println("B2: insde constructor");
    }
    {
        a=11;
        s=22;
        System.out.println("B3: a="+a);
    }
    void m()
    {
        System.out.println("M1: a="+a);
    }
    static 
    {
        System.out.println("B4: s=" +s);
    }
    static void sm(int a,int s){
        System.out.println("M2 a="+a+" "+"s="+BlockExam.s);
        BlockExam.s=a+s;
    }
    {s=s+44;}
    static
    {
        System.out.println("B5: s="+s);
    }
    public static void main(String args[])
    {
        System.out.println("Main Started!");
        BlockExam.sm(20,10);
        BlockExam b=new BlockExam(30);
        b.m();
        b.sm(50,40);
    }
    {
        System.out.println("B6: Exam Ended!");
    }
}
