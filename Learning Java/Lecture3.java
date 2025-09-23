import java.util.Scanner;

public class Lecture3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a :");
        double a = sc.nextDouble();

        System.out.println("Enter b :");
        double b = sc.nextDouble(); 

        System.out.println("Choose Operation");
        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo)");
        System.out.print("Enter operation number: ");
        int operation = sc.nextInt();

        double result;

        switch(operation) {
            case 1: result = a + b;
            System.out.println("Result: "+result); break;
            case 2: result = a - b;
            System.out.println("Result: "+result); break;
            case 3: result = a * b;
            System.out.println("Result: "result); break;

        }

    }
}

// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows :
//  1 : + (Addition) a + b 2 : - (Subtraction) a - b 3 : * (Multiplication) a * b 
//  4 : / (Division) a / b 5 : % (Modulo or remainder) a % b Calculate the result 
//  according to the operation given and display it to the user.