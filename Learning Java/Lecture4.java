
import java.util.Scanner;


//     public static void main(String[] args){
//         for(int i = 0; i < 11; i++){
//             System.out.println(i+ " ");
//         }
//     }
// }

// // while loop
// public class Lecture4{
//     public static void main(String[] args) {
//         int i = 0;
//         while (i < 11){
//             System.out.println(i);
//             i++;
//         }
//     }
// }


// // do while loop
// public class Lecture4{
//     public static void main(String[] args) {
//         int i = 0;
//         do { 
//             System.out.println(i);
//             i = i + 1;
//         } while (i < 11);
//     }
// }


// //print sum of first n natural numbers.
// public class Lecture4{
//     public static void main(String[] args) {
//         int sum = 0;
//         for(int i = 1; i <= 5; i++){
//             sum += i;
//         }
//         System.out.println(sum);
//     }
// }



// //print the table of a number input by the user.
// public class Lecture4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         for(int i = 1; i <= 10; i++){
//             System.out.println(n * i);
//         }
//     }
// }



// // print all even numbers till n
// public class Lecture4 {
//     public static void main(String[] args) {
//         int n = 10;

//         for(int i = 2; i < n; i++){
//             if(i % 2 == 0){
//                 System.out.println(i);
//             }
//         }

//         // for(int i = 2; i < n; i += 2){
//         //     System.out.println(i);
//         // }

//     }
// }


// // infinte loop
// public class Lecture4 {
//     public static void main(String[] args) {
//         for(; ;){
//             System.out.println("Apna College");
//         }
//     }
// }


// do-while loop
public class Lecture4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do { 
             System.out.println("Enter 1 to continue or 0 to stop: ");
             choice = sc.nextInt();

             if(choice == 1) {
                System.out.print("Enter student marks: ");
                int marks = sc.nextInt();

                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60) {
                    System.out.println("This is also Good");
                } else if (marks >= 0) {
                    System.out.println("This is Good as well \nBecause marks don't matter but our effort does.");
                } else {
                    System.out.println("Invalid marks");
                }
             } else if (choice != 0) {
                System.out.println("Invalid choice! Enter 1 or 0.");
            }
            
        } while (choice != 0);
        System.out.println("Program ended.");
        sc.close();
    }
}