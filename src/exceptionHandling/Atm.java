package exceptionHandling;

import java.util.Scanner;


public class Atm {

    private int accountNum = 4996;
    private int password = 1234;

    int accNum;
    int pw;

    public void input() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter the account number");
        accNum = sc.nextInt();
        System.out.println("Kindly enter the password");
        pw = sc.nextInt();

    }

    public void verify() throws InvalidCustomerException {

        if (accountNum == accNum && password == pw) {
            System.out.println("proceed to withdraw the cash");
        } else {

            InvalidCustomerException ice = new InvalidCustomerException("Invalid credentials! ");
            System.out.println(ice.getMessage());
            throw ice;
//          throw new InvalidCustomerException();
        }
    }
}
    class Bank {
        public void initiate() {
            Atm atm = new Atm();
            try {
                atm.input();
                atm.verify();
            }
            catch(InvalidCustomerException ice){
               System.out.println("you still have two more attempts");
                try {
                    atm.input();
                    atm.verify();
                }
                catch(InvalidCustomerException ice1){
                   System.out.println("you got one more attempt! please enter the input correctly");
                    try {
                        atm.input();
                        atm.verify();
                    }
                    catch(InvalidCustomerException ice2){
                        System.out.println("Sorry try again later. You are exceeded maximum attempts");
                    }
                }
            }
        }

    }

