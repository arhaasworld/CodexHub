package practice;

public class Swap {

     void swapNumbers(int num1, int num2){
        int temp= num1;
        num1=num2;
        num2=temp;
        System.out.println("value of num1 is " + num1 + " value of num2 is " + num2);

    }
    public static void main(String args[]){
        Swap s = new Swap();
        s.swapNumbers(9,5);
    }

}

