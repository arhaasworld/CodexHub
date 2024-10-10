package multithreading;

class MyCar1 implements Runnable{
    public void run(){
        try {

            System.out.println(Thread.currentThread().getName() + " has entered the parking lot");
            Thread.sleep(4000);
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " has entered in to the car");
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + " has started to drive the car");
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + " has came back and parked the car");

            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
public class LaunchMultiThreading6 {

    public static void main(String[] args){

        MyCar1 c1 = new MyCar1();

        Thread thread1 = new Thread(c1);
        Thread thread2 = new Thread(c1);
        Thread thread3 = new Thread(c1);

        thread1.setName("Alpha");
        thread2.setName("Beta");
        thread3.setName("Gama");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
