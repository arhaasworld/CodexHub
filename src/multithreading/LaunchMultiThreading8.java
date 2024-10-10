package multithreading;
//deadlock project in multithreading
//due to cyclic dependency of the resources they are permanently stuck in blocked state

//solution: proper usage of synchronized keyword
class Library1 implements Runnable{
    String res1 = new String("Java");
    String res2 = new String("Phyton");
    String res3 = new String("Microservices");


    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if(name.equals("student1")){
            try{
                System.out.println("student 1 has entered in to the library");
                Thread.sleep(3000);
                synchronized (res1)
                {
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
                System.out.println("student 2 has entered in to the library");
                Thread.sleep(3000);
                synchronized (res3)
                {
                    System.out.println("student2 has acquired " + res3);
                    Thread.sleep(4000);
                    synchronized (res2)
                    {
                        System.out.println("student2 has acquired " + res2);
                        Thread.sleep(4000);
                        synchronized (res1)
                        {
                            System.out.println("student2 has acquired " + res1);
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
public class LaunchMultiThreading8 {
    public static void main(String[] args){

        Library1 lib = new Library1();

        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib);

        t1.setName("student1");
        t2.setName("student2");

        t1.start();
        t2.start();

    }
}
