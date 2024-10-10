package multithreading;

class MyCar implements Runnable{
    synchronized public void run(){
        try{

            System.out.println(Thread.currentThread().getName()+ " has entered the parking lot");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName()+ " has entered in to the car");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName()+ " has started to drive the car");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + " has came back and parked the car");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
public class LaunchMultiThreading5 {

    public static void main(String[] args){

        MyCar c = new MyCar();

        Thread thread1 = new Thread(c);
        Thread thread2 = new Thread(c);
        Thread thread3 = new Thread(c);

        thread1.setName("Alpha");
        thread2.setName("Beta");
        thread3.setName("Gama");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
