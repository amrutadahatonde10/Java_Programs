// //Enter 3 numbers from the user & make a function to print their average.
// import java.util.Scanner;

// public class Solutions{
//     public static int avgof3numbers(int a, int b, int c){
//         return(a + b +c) / 3;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//          System.out.print("Enter First number:");
//          int a = sc.nextInt();

//          System.out.print("Enter Second number:");
//          int b = sc.nextInt();

//          System.out.print("Enter Third number:");
//          int c = sc.nextInt();

//          int avg = avgof3numbers(a ,b ,c);
//          System.out.println("average of 3 numbers is: " +avg);
//     }
// }



// Write a function to print the sum of all odd numbers from 1 to n.


import java.util.Scanner;

public class Solutions {
    public static void printSum(int n){
    int sum = 0;
    
    for(int i = 1; i <= n; i++){
        if(i % 2 != 0) {
            sum += i;
        }
    }

    System.out.println("Sum of odd numbers from 1 to " + n + " is: " + sum);
}

public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    printSum(n);
}
}