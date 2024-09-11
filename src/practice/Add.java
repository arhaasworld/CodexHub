package practice;

public class Add {
    int num1 = 2;
    int num2 = 3;

    int  add(){
      int res=  num1 + num2;
      return res;

    }

    public static void main(String args[]){
        Add add = new Add();
        int res = add.add();
        System.out.println("result is " + res);
    }
}
