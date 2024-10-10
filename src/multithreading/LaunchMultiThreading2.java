package multithreading;

import java.util.Scanner;

public class LaunchMultiThreading2 {

    public static void main(String[] args) throws InterruptedException {


        System.out.println("Application started ...");
        System.out.println("Banking activity started .....");
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your user number..");
        int user = sc.nextInt();
        System.out.println("please enter your password ...");
        int pass = sc.nextInt();
        System.out.println("Please collect your cash");
        System.out.println("Banking activity terminated....");

        System.out.println("Printing activity started ");
        for (int i=0; i<4; i++){
            System.out.println("**");
            Thread.sleep(5000);
        }
        System.out.println("Printing activity terminated ");
        System.out.println("Printing important message");
        for (int i=0; i<4; i++){
            System.out.println("Focus focus focus");
            Thread.sleep(3000);
        }
        System.out.println("printing activity terminated ");

        System.out.println("Application terminated ....");
    }
}
