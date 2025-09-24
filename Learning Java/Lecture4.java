
import java.util.Scanner;

// // for loop
// public class Lecture4{
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



//print the table of a number input by the user.
public class Lecture4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(n * i);
        }
    }
}

