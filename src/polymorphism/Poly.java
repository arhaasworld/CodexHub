package polymorphism;

class Animal{

    public void eat(){
        System.out.println("Animal eat food");

    }
    public void sleep(){
        System.out.println("Animal wants to sleep");
    }
}
class Monkey extends Animal{

    public void eat(){
        System.out.println("monkey wants to eat bananas");
    }
    public void sleep(){
        System.out.println("monkey wants to sleep");
    }

}

class Dog extends  Animal{
    public void eat(){
        System.out.println("Dog likes to eat meat");
    }

    public void sleep(){
        System.out.println("Dog likes to sleep");
    }

}

/**
 * My java project
 */
class Accept{
    public void permit(Animal animal){
        animal.eat();
        animal.sleep();
    }
}


public class Poly {
    public static void main(String args[]){

        Dog dg = new Dog();
        Monkey mk = new Monkey();

        Accept ac = new Accept();

        ac.permit(dg);
        System.out.println("*************");
        ac.permit(mk);

    }
}
