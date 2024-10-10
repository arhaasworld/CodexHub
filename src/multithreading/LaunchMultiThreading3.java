package multithreading;

import java.util.Scanner;

class Alpha extends Thread{

    @Override
    public void run(){
        banking();

    }
    public void banking() {
        System.out.println("Banking activity started .....");
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your user number..");
        int user = sc.nextInt();
        System.out.println("please enter your password ...");
        int pass = sc.nextInt();
        System.out.println("Please collect your cash");
        System.out.println("Banking activity terminated....");
    }
}

class Beta extends Thread{

    @Override
    public void run(){
        try {
            printing();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void printing() throws InterruptedException {
        System.out.println("Printing activity started ");
        for (int i=0; i<4; i++){
            System.out.println("**");
            Thread.sleep(5000);
        }
        System.out.println("Printing activity terminated ");
    }
}

class Gama extends Thread{
    @Override
    public void run(){
        try {
            focus();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public void focus() throws InterruptedException {
        System.out.println("Printing important message");
        for (int i=0; i<4; i++){
            System.out.println("Focus focus focus");
            Thread.sleep(3000);
        }
        System.out.println("printing activity terminated ");
    }
}


public class LaunchMultiThreading3 {
    public static void main(String[] args){
        System.out.println("Application Started...");
        Alpha a = new Alpha();
        Beta b = new Beta();
        Gama g = new Gama();

        a.start();
        b.start();
        g.start();


        System.out.println("Application Terminated...");

    }
}
