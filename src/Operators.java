public class Operators {
//    Java provides various types of operators that can be used to perform different kinds of operations.
//    Here is an overview of the main categories of operators in Java:

//    Arithmetic Operators
//    Unary Operators
//    Assignment Operator
//    Relational Operators
//    Logical Operators


//              Arithmetic Operators
//           Operator	Description	            Example
//                +	Addition	              a + b
//                -	Subtraction	              a - b
//                *	Multiplication	          a * b
//                /	Division	              a / b
//                %	Modulus (remainder)       a % b

    public static void main(String args[]){
        int a = 10;
        int b = 20;
        int c = 5;
        System.out.println("a+b = " + (a+b));
        System.out.println("a-b = " + (a-b));
        System.out.println("a*b = " + (a*b));
        System.out.println("a/b = " + (a/b));
        System.out.println("a%b = " + (a%b));


        //    Unary Operators

//            Operator	    Description	                    Example
//                +     	Unary plus (no effect)	            +a
//                -	        Unary minus (negation)	            -a
//                ++	    Increment by 1	                    ++a (pre) / a++ (post)
//                --	    Decrement by 1	                     --a (pre) / a-- (post)
//                !	        Logical complement (NOT)	        !true

        System.out.println("postincrement: " + (a++));
        System.out.println("preincrement: " + (++a));
        System.out.println("postdecrement: " + (b--));
        System.out.println("predecrement: " + (--b));

        //Assignment Operator

//        Used to assign values to variables.

//             Operator	    Description	            Example
//                =	    Simple assignment	         a = 10
//                +=	    Add and assign	         a += 5
//                -=	    Subtract and assign	     a -= 3
//                *=	    Multiply and assign	     a *= 2
//                /=	    Divide and assign	     a /= 4
//                %=	    Modulus and assign	     a %= 2

        System.out.println("simple assignment = " + (a=10));
        System.out.println("Add and assign  " + (a+=5));
        System.out.println("Subtract and assign " + (a -=3));
        System.out.println("Multiply and assign " + (a *=2));
        System.out.println("Divide and assign " + (a /=2));
        System.out.println("Modulus and assign " + (a%=2));


//        Relational/Comparison Operators
//        Used to compare two values.

//            Operator	        Description	                Example
//                ==	              Equal to	                a == b
//                !=	              Not equal to	            a != b
//                >	              Greater than	            a > b
//                <	              Less than	                a < b
//                >=	              Greater than or equal to	a >= b
//                <=	                Less than or equal to	a <= b

        System.out.println("a==b: " + (a==b));
        System.out.println("a!=b: " + (a!=b));
        System.out.println("a > c: " + (a > c));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a>=b));
        System.out.println("a<=c: " + (a<=c));


//         Logical Operators
//        Used to perform logical operations, usually with boolean values.

//             Operator	        Description	            Example
//                &&	        Logical AND	              a && b
//`		`        ||             Logincal OR               a || b
//                !	             Logical NOT	             !a

            boolean x= true;
            boolean y = false;

        System.out.println("x && y : " + (x &&y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x : " + (!x));
    }
}
