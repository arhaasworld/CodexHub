package multithreading;


class Library implements Runnable{
    String res1 = new String("Java");
    String res2 = new String("Phyton");
    String res3 = new String("Microservices");


    @Override
   synchronized public void run() {
        String name = Thread.currentThread().getName();
        if(name.equals("student1")){
            try{
                Thread.sleep(3000);
                synchronized (res1)
                {
                    System.out.println("student 1 has entered in to the library");
                    System.out.println("student1 has acquired " + res1);
                    Thread.sleep(4000);
                    synchronized (res2)
                    {
                        System.out.println("student1 has acquired " + res2);
                        Thread.sleep(4000);
                        synchronized (res3)
                        {
                            System.out.println("student1 has acquired " + res3);
                            Thread.sleep(4000);
                        }
                    }
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }

        }else {
            try{
                Thread.sleep(3000);
                synchronized (res1)
                {
                    System.out.println("student 2 has entered in to the library");
                    System.out.println("student2 has acquired " + res1);
                    Thread.sleep(4000);
                    synchronized (res2)
                    {
                        System.out.println("student2 has acquired " + res2);
                        Thread.sleep(4000);
                        synchronized (res3)
                        {
                            System.out.println("student2 has acquired " + res3);
                            Thread.sleep(4000);
                        }
                    }
                }

            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
public class LaunchMultiThreading7 {
    public static void main(String[] args){

        Library lib = new Library();

        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib);

        t1.setName("student1");
        t2.setName("student2");

        t1.start();
        t2.start();

    }
}
