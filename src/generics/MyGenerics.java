package generics;

class MyGenericsClass<T>{
    private T ref;

    public MyGenericsClass(T ref){

        this.ref = ref;

    }
    public void disp(){
        System.out.println("The type of T is :" + ref.getClass().getName());
    }

    public T getRef() {
        return ref;
    }
}

public class MyGenerics {
    public static void main(String[] args){

        MyGenericsClass<Integer> g = new MyGenericsClass<>(42);
        g.disp();

        System.out.println(g.getRef());


    }
}
