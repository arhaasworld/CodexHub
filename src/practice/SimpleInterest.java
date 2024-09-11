package practice;

public class SimpleInterest {
    float cal(int p, int t, int r) {
        float res = (p * r * t) / 100;
        System.out.println("result is " + res);
        return res;

    }


    public static void main(String args[]) {
        SimpleInterest si = new SimpleInterest();
        si.cal(10000,5,5);

    }
}