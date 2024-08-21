package OOP;

 class Student {
     String name;
     int age;
     int id;

     void studying() {
         System.out.println("student is studying ");
     }

     void playing() {
         System.out.println("student is playing ");
     }
 }


     public class Main {
         public static void main(String[] args) {

             Student st = new Student();
             st.studying();
             st.playing();

             Animal an = new Animal();
             an.eat();
             an.sleep();

             Calc c = new Calc();
             c.add();

         }
 }

