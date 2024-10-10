package multithreading;

public class LaunchMultiThreading {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Application Started...");
//        Thread.sleep(5000);
       Thread thread= Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        Thread.sleep(5000);
        thread.setName("MyName");
        thread.setPriority(4);
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println("Application Terminated...");

    }


}

