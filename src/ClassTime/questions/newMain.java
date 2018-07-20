
package ClassTime.questions;

public class newMain {
    public static void main(String args[])
    {
        System.out.println("Exam Started");
        int a=args.length;
        if(a==0) a=42/a;
        System.out.println("a="+a);
        try{
            if(a==1) a=a/(a-a);
            try
            {
                if(a==2)
                {
                    int c[] ={1};
                    c[42] =99;
                    System.out.println("c[42]="+c[42]);
                }
                else if(a==3) throw new NullPointerException("Null");
                else { System.out.println("Exam Ended Fast"); return; }
            }
            catch(ArrayIndexOutOfBoundsException e){
                   System.out.println("Divided by 0");
            }
            finally{
                System.out.println("Un-reachable code");
            }
        }
        catch(ArithmeticException e){
            System.out.println("Array index out of bounds");
        }
        catch(Exception e){
            System.out.println("No exception");
        }
        finally{
            System.out.println("Program Completed");
        }
        System.out.println("Exam Ended");
    }
}
