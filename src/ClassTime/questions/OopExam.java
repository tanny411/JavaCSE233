package ClassTime.questions;

abstract class AA
{
    abstract void show();
    void showToo() {
        System.out.println("1000");
    }
}

class BB extends AA
{
    void show(){
            System.out.println("4000");
    }
    void showToo(){
        System.out.println("3000");
    }
    void showAlso(){
        System.out.println("7000");
    }
}

class CC extends BB
{
    void show(){
            System.out.println("6000");
    }
    void showToo(){
        System.out.println("2000");
    }
    void showAlso(){
        System.out.println("5000");
    }
}

 class OopExam {
    public static void main(String args[])
    {
        BB b=new BB();
        AA a=b;
        a.show();
        a.showToo();
        b.showToo();
        b=new CC();
        b.show();
        b.showToo();
        b.showAlso();
    }
}
