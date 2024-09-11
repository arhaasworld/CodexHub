package constructor;

public class LaunchConstructor {

    int num1;
    int num2;

    LaunchConstructor(){
        super();
        System.out.println("zero parameterized constructor");

    }

    LaunchConstructor(int num1, int num2){
        this(num1);
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("2 parameterized constructor");
    }

    LaunchConstructor(int num1){
        this();
        this.num1= num1;
        num2=40;

        System.out.println("one parameterized constructor");

    }

    void disp(){
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }

    public static void main(String args[]){

        LaunchConstructor lc = new LaunchConstructor(4);
        lc.disp();

        LaunchConstructor lc1 = new LaunchConstructor(4, 40);
        lc1.disp();


    }
}
