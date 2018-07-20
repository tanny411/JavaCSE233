
package ClassTime.questions;

public class Scope {
    static int x;
    public static void main(String args[])
    {
        int x=10;
        System.out.println("x = "+x);
        for(x=0;x < 3;x++)
        {
            int y=-1;
            System.out.println("x="+x+" y="+y);
            y=100;
            System.out.println("x="+x+" y="+y);
        }
        x=20; int y=50;
        System.out.println("x="+x+" y="+y);
        Scope scm=new Scope();
        scm.show();
    }
        class AnotherScope
        {
            AnotherScope()
            {
                int y=8000;
                x=3000;
                System.out.println("x="+x+" y="+y);
            }
        }
    void show()
        {
            x=1000;
            int y=2000;
            System.out.println("x="+x+" y="+y);
            new AnotherScope();
        }
}
