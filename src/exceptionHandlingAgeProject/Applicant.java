package exceptionHandlingAgeProject;

import java.util.Scanner;

public class Applicant {
    int age;

    public void input(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please kindly enter your age");
        age= sc.nextInt();

    }

    public void verify() throws UnderAgeException, OverAgedException{
        
        if(age >= 18 && age>=60){
            System.out.println("you are eligible to apply for the licence");
            
        } else if (age<18) {

            UnderAgeException uae = new UnderAgeException("You cannot apply for licence because of age restrictions");
            System.out.println(uae.getMessage());
            throw uae;
            
        }
        else{

            OverAgedException oae = new OverAgedException("You are overaged. It's good to take rest ");
            System.out.println(oae.getMessage());
            throw oae;
        }

    }

}
