// import java.util.Scanner;

// public class Lecture3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input two numbers
//         System.out.print("Enter a: ");
//         double a = sc.nextDouble();

//         System.out.print("Enter b: ");
//         double b = sc.nextDouble(); 

//         System.out.println("\nChoose Operation:");
//         System.out.println("1 : + (Addition)");
//         System.out.println("2 : - (Subtraction)");
//         System.out.println("3 : * (Multiplication)");
//         System.out.println("4 : / (Division)");
//         System.out.println("5 : % (Modulo)");

//         System.out.print("Enter operation number: ");

//         int operation = sc.nextInt();

//         double result;

//         switch(operation) {
//             case 1: 
//                 result = a + b;
//                 System.out.println("Result: " + result); 
//                 break;
//             case 2: 
//                 result = a - b;
//                 System.out.println("Result: " + result); 
//                 break;
//             case 3: 
//                 result = a * b;
//                 System.out.println("Result: " + result); 
//                 break;
//             case 4: 
//                 if(b != 0) {
//                     result = a / b;
//                     System.out.println("Result: " + result); 
//                 } else {
//                     System.out.println("Division by zero is not allowed!"); 
//                 }
//                 break;
//             case 5: 
//                 if(b != 0) {
//                     result = a % b;
//                     System.out.println("Result: " + result);
//                 } else {
//                     System.out.println("Modulo by zero is not allowed!"); 
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid operation! Please enter 1–5.");
//         }

//         sc.close();
//     }
// }

// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows :
//  1 : + (Addition) a + b 2 : - (Subtraction) a - b 3 : * (Multiplication) a * b 
//  4 : / (Division) a / b 5 : % (Modulo or remainder) a % b Calculate the result 
//  according to the operation given and display it to the user.



import java.util.Scanner;

public class Lecture3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of the month (1-12): ");
        int month = sc.nextInt();

        String monthName;

        switch(month) {
            case 1: monthName = "January";
            break;
            case 2: monthName = "February";
            break;
            case 3: monthName = "March";
            break;
            case 4: monthName = "April";
            break;
            case 5: monthName = "May";
            break;
            case 6: monthName = "June";
            break;
            case 7: monthName = "July";
            break;
            case 8: monthName = "August";
            break;
            case 9: monthName = "September";
            break;
            case 10: monthName = "October";
            break;
            case 11: monthName = "November";
            break;
            case 12: monthName = "December";
            break;
            default: monthName = "Invalid month number! Please enter 1–12.";
        }

        System.out.println("Month: " + monthName);

        sc.close();
    }
}

// Ask the user to enter the number of the month & print the name of the month. 
// For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.