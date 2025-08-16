// public class Recursion {
//     public static void printNumb(int n) {
//         if(n == 0) {
//             return;
//         }
//         System.out.println(n);
//         printNumb(n-1); // Recursion

//     public static void main(String args[]) {
//         int n = 5;
//         printNumb(n); // n = 5
//     }
// }
// // Print Numbers 5 to 1




// public class Recursion {
//     public static void printNumb(int n) {
//         if(n == 6) {
//             return;
//         }
//         System.out.println(n);
//         printNumb(n+1); // Recursion
//     }
//     public static void main(String args[]) {
//         int n = 1;
//         printNumb(n); // n = 5
//     }
// }
// // print Numbers from 1 to 5



public class Recursion{
    public static void printSum(int i, int n, int sum){
        if(i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);
    }
    public static void main(String args[]) {
        printSum(1, 5, 0);
    }
}
// //Print sum of first n natural numbers.