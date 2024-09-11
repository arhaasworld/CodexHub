package launchStatic;

public class LaunchStatic {
    static int a, b, c;

    int x, y, z;


    static {
         a= 10;
         b=20;
         c=30;
        System.out.println("static initialization block");

    }
    static void disp(){
        System.out.println("a  : "+ a);
        System.out.println("b  : " + b);
        System.out.println("c  : " + c);

    }

    {
        x= 24;
        y= 42;
        z= 33;
        System.out.println("java initilization block");
    }

    LaunchStatic(){
        System.out.println("constructor");

    }
    void demo(){
        System.out.println("a   : " + a);
        System.out.println("b   : " + b);
        System.out.println("c   : " + c);
        System.out.println("x   : " + x);
        System.out.println("y   : " + y);
        System.out.println("z   : " + z);

    }

    public static void main(String args[]){
        LaunchStatic.disp();
        LaunchStatic ls = new LaunchStatic();
        ls.demo();
    }
}
