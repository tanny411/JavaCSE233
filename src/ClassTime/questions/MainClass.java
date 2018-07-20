
package ClassTime.questions;

abstract class A {
    int i;
    {
        System.out.println("Welcome 100");
    }
    A(int a)
    {
        System.out.println("A is 3rd");
        i=a;
    }
    void show(){
        System.out.println("i : "+i);
    }
    static
    {
        System.out.println("static 2");
    }
    
}

class B extends A
{
    int j;
    {
        System.out.println("Welcome 2");
    }
    B(int a,int b)
    {
        super(a);
        System.out.println("B is 2nd");
        j=b;super.i=20;
    }
    void show()
    {
        System.out.println("j : "+j);
    }
    static{
        System.out.println("Static 3");
    }
}

class C extends B
{
    C()
    {
        super(2,1);
        System.out.println("C is 1st");
    }
    static void show (int a,int b,int c)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
    void show(String msg)
    {
        System.out.println(msg+" i and j:"+i+" "+super.j );
    }
    static 
    {
        System.out.println("Static 1");
    }
}
class MainClass
{
    public static void main(String args[])
    {
        /*
        byte b;
        short s;
        int i=259;
        double d=321.123;
        b=(byte)i;
        System.out.println(b);*/
        /*
        byte v=(byte)((-1)>>>24);
        System.out.println(v);
        */
        
        C.show(1,2,3);
        System.out.println("omg");
        C c=new C();
        c.show();
        c.show("ERROR!");
        A a=c;
        a.show();
        
        /*int i=0;
        First: while(i<=8)
        {
            int sum=0;
            i++;
            Second: for(int j=1;j<=i;j++)
            {
                sum=sum+j++;
                for(int k=1;k<=j;k++)
                {
                    if(k%2!=0) continue;
                    sum=sum+k;
                    if(sum>88) break Second;
                }
                if(i==3) continue First;
            }
            System.out.println(sum + " ");
        }*/
    }
}