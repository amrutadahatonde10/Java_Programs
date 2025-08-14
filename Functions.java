// import java.util.*;

// public class Functions {

//     //declaration of function
//     public static void printMyName(String name) {
//         System.out.println(name);
//         return;
//     } 

//     //Main Method
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();

//         printMyName(name); // forr call function
//     }
// }


// //Print a given name in a function





// import java.util.*;

// public class Functions {

//     //declaration of function
//     public static int calculateSum(int a, int b) {
//        int sum = a + b;
//        return sum;
//     } 

//     //Main Method
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum = calculateSum(a, b);  // for call function
//         System.out.println("Sum of 2 numbers is : "+ sum);
//     }
// }

// // Make a function to add 2 numbers and return the sum.





// import java.util.*;

// public class Functions {

//     //declaration of function
//     public static void printFactorial(int n) {
//       if(n < 0) {
//         System.out.println("Invalid Number");
//         return;
//       }
        
//        int factorial = 1;

//        for(int i=n; i>=1; i--){
//         factorial = factorial * i;
//        }

//        System.out.println(factorial);
//        return;
//     } 

//     //Main Method
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         printFactorial(n);
//     }
// }

// // Print Factrial of a number






// import java.util.*;

// public class Functions {

//     //declaration of function
//     public static void number(int n) {
//      if (n % 2 == 0){
//         System.out.println("no. is even");
//      } else{
//         System.out.println("no. is odd");
//      }
      
//     } 

//     //Main Method
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt();

//         number(n);
//     }
// }

// // write a function to check a number is even or odd.








// import java.util.*;

// public class Functions {

//     //declaration of function
//     public static boolean isPrime(int n) {
//      if (n <= 1) {
//         return false;
//      }
//      for(int i = 2; i <= Math.sqrt(n); i++){
//         if (n % i == 0) {
//             return false;
//         }
//      }
//       return true;
//     } 

//     //Main Method
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt();

//         if (isPrime(n)) {
//             System.out.println(n + " is a prime number");
//         } else {
//             System.out.println(n + " is not a prime number");
//         }
//     }
// }

// // write a function to check a number is prime or not.








import java.util.*;

public class Functions {

    //declaration of function
    public static void printTable(int n) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    //Main Method
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its table: ");
        int num = sc.nextInt();

        printTable(num);
    }
}

// Make a function to print the table of a given number n.