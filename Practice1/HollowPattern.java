// // Solid Reactangle
// public class HollowPattern {
//     public static void main(String[] args) {
//         int m = 5; //rows
//         int n = 5; //columns

//         for(int i = 0; i < m; i++){
//             for(int j = 0; j < n; j++){
//                System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// // *****
// // *****
// // *****
// // *****




// // Hollow Rectangle
public class HollowPattern{
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
    }
}
// // *****
// // *   *
// // *   *
// // *****



// // Half Pyramid
// public class HollowPattern{
//     public static void main(String[] args) {
//         int n = 4;

//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         } 
//     }
// }

// // *
// // **
// // ***
// // ****



// // Inverted Hald Pyramid
// public class HollowPattern{
//     public static void main(String[] args) {
//         int n = 4;

//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         } 
//     }
// }

// // ****
// // ***
// // **
// // *



// // Inverted and rotated half pyramid 
// public class HollowPattern{
//     public static void main(String[] args) {
//         int n = 4;

//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }

//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         } 
//     }
// } 

// //     *
// //    **
// //   ***
// //  ****



// // Half pyramid with numbers
// public class HollowPattern{
//     public static void main(String[] args) {
//         int n = 5;

//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         } 
//     }
// }

// // 1
// // 1 2
// // 1 2 3
// // 1 2 3 4 
// // 1 2 3 4 5



// // Inverted half pyramid with numbers
// public class HollowPattern{
//     public static void main(String[] args) {
//         int n = 5;

//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         } 
//     }
// }

// // 1 2 3 4 5
// // 1 2 3 4 
// // 1 2 3 
// // 1 2 
// // 1 



// // Floyd's Triangle
// public class HollowPattern{
//     public static void main(String[] args) {
//         int n = 5;
//         int number = 1;

//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(number+ " ");
//                 number++;
//             }
//             System.out.println();
//         } 
//     }
// }

// //  1
// //  2  3
// //  4  5  6
// //  7  8  9 10
// // 11 12 13 14 15



// // 0-1 Triangle
// public class HollowPattern{
//     public static void main(String[] args) {
//         int n = 5;

//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 int sum = i + j;
//                 if (sum % 2 == 0){
//                     System.out.print("1 ");
//                 } else {
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         } 
//     }
// }
 
// // 1
// // 0 1
// // 1 0 1
// // 0 1 0 1
// // 1 0 1 0 1



// public class HollowPattern{
//     public static void main(String[] args) {
//         int n = 5;

//         // upper half
//         for(int i=1; i<=n; i++){
//             // 1st part
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }

//             // spaces
//             int spaces = 2 * (n-i);
//             for(int j=1; j<=spaces; j++){
//                 System.out.print(" ");
//             }

//             // 2nd part
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         } 


//         // lower half
//         for(int i=n; i>=1; i--){
//             // 1st part
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }

//             // spaces
//             int spaces = 2 * (n-i);
//             for(int j=1; j<=spaces; j++){
//                 System.out.print(" ");
//             }

//             // 2nd part
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         } 
//     }
// }

// // *        *
// // **      **
// // ***    ***
// // ****  ****
// // **********
// // **********
// // ****  ****
// // ***    ***
// // **      **
// // *        *




// // Solid Rhombus
// public class HollowPattern{
//     public static void main(String[] args) {
//         int n = 5;

//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }

//             for(int j=1; j<=5; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// //     *****
// //    *****
// //   *****
// //  *****
// // *****



// // number Pyramid
// public class HollowPattern{
//     public static void main(String[] args) {
//         int n = 5;

//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }

//             for(int j=1; j<=i; j++) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// //     1
// //    2 2
// //   3 3 3
// //  4 4 4 4
// // 5 5 5 5 5



// // Palindromic Pattern
// public class HollowPattern{
//     public static void main(String[] args) {
//         int n = 5;

//         for(int i=1; i<=n; i++){
//             //spaces
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }

//             //1st half numbers
//             for(int j=i; j>=1; j--) {
//                 System.out.print(j);
//             }

//             //2nd half numbers
//             for(int j=2; j<=i; j++){
//                 System.out.print(j);
//             }

//             System.out.println();
//         }
//     }
// }
// //     1
// //    212
// //   32123
// //  4321234
// // 543212345




// // Diamond Pattern
// public class HollowPattern{
//     public static void main(String[] args) {
//         int n = 5;

//         // upper half
//         for(int i=1; i<=n; i++){
//             //spaces
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }

//             //stars
//             for(int j=1; j<=2*i-1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         //lower half
//         for(int i=n; i>=1; i--){
//             //spaces
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }

//             //stars
//             for(int j=1; j<=2*i-1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// //     *
// //    ***
// //   *****
// //  *******
// // *********
// // *********
// //  *******
// //   *****
// //    ***
// //     *

