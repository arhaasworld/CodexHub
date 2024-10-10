package multithreading;

import java.util.Scanner;

    class Alpha1 extends Thread{

        @Override
        public void run() {

            String threadName = Thread.currentThread().getName();
            if(threadName.equals("HDFC")){
                banking();
            } else if (threadName.equals("Paper")) {
                try {
                    printing();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else {
                try {
                    focus();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

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

        public void printing() throws InterruptedException {
            System.out.println("Printing activity started ");
            for (int i=0; i<4; i++){
                System.out.println("**");
                Thread.sleep(5000);
            }
            System.out.println("Printing activity terminated ");
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




    public class LaunchMultiThreading4 {
        public static void main(String[] args){
            System.out.println("Application Started...");
            Alpha1 a = new Alpha1();

            Thread t1 = new Thread(a);
            Thread t2 = new Thread(a);
            Thread t3 = new Thread(a);

            t1.start();
            t2.start();
            t3.start();

            t1.setName("HDFC");
            t2.setName("Paper");
            t3.setName("Intelligent");

            t1.setPriority(1);
            t2.setPriority(2);
            t3.setPriority(3);

            System.out.println("Application Terminated...");

        }
    }

